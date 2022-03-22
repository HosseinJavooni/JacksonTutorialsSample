import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import repositoryAndEntity.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

public class ConvertingJavaObjectToJson {
    public static void main(String[] args) throws ParseException, JsonProcessingException, FileNotFoundException {
        Set<Person.EntityExtraData> entityExtraDataSet = new HashSet<>();

        entityExtraDataSet.add(new Person.EntityExtraData(20,1234567890L, 1.5, 75D, "Tehran"));
        entityExtraDataSet.add(new Person.EntityExtraData(37,1234567891L, 1.6, 85D, "Tehran"));

        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Person person = new Person(
                "Hossein",
                "Javooni",
                37,
                format.parse("1984/08/11"),
                entityExtraDataSet);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        String personJson = mapper.writeValueAsString(person);

        System.out.println(personJson);
        OutputStream outputStream = new FileOutputStream("src/main/projectResources/person.json");
        try {
            mapper.writeValue(outputStream, person);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
