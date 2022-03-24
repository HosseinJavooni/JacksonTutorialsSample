import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import repositoryAndEntity.PersonWithJsonPropertyAnnotation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ChangingFieldNameWithJsonpropertyAnnotation {
    public static void main(String[] args) throws ParseException, JsonProcessingException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        PersonWithJsonPropertyAnnotation.EntityExtraData entityExtraData =
                new PersonWithJsonPropertyAnnotation.EntityExtraData(1,12345L, 1.3, 6D, "Tehran");
        Set<PersonWithJsonPropertyAnnotation.EntityExtraData> entityExtraDataSet = new HashSet<>();
        entityExtraDataSet.add(entityExtraData);

        PersonWithJsonPropertyAnnotation personWithJsonPropertyAnnotation =
                new PersonWithJsonPropertyAnnotation(
                        "Mahan",
                        "Javooni",
                        1,
                        formatter.parse("2022/01/09 10:08:00"),
                        entityExtraDataSet
                );

        ObjectMapper mapper = new ObjectMapper();

        String personJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(personWithJsonPropertyAnnotation);

        System.out.println(personJson);
    }
}
