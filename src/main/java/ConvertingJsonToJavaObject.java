import com.fasterxml.jackson.databind.ObjectMapper;
import repositoryAndEntity.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ConvertingJsonToJavaObject {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = new FileInputStream("src/main/projectResources/person.json");

        ObjectMapper mapper = new ObjectMapper();

        Person person = mapper.readValue(inputStream, Person.class);

        System.out.println(person.toString());
    }
}
