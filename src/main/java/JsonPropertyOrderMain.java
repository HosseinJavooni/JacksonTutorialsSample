import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import repositoryAndEntity.Person_With_JsonPropertyOrder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class JsonPropertyOrderMain {
    public static void main(String[] args) throws ParseException, JsonProcessingException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        Date birthDate = formatter.parse("2022/01/09 10:08:00");

        Set<Person_With_JsonPropertyOrder.EntityExtraData> entityExtraDataSet = new HashSet<>();
        entityExtraDataSet.add(new Person_With_JsonPropertyOrder.EntityExtraData(1, 1234L, 2.3, 6.1, "Tehran"));

        Person_With_JsonPropertyOrder person_with_jsonPropertyOrder_ = new Person_With_JsonPropertyOrder(
                "Mahan",
                "Javooni",
                1,
                birthDate,
                entityExtraDataSet
        );

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        String person_with_jsonPropertyOrder = mapper.writeValueAsString(person_with_jsonPropertyOrder_);

        System.out.println(person_with_jsonPropertyOrder);
    }
}
