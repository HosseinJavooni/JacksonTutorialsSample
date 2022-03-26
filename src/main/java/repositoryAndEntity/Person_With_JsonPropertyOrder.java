package repositoryAndEntity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor

@JsonPropertyOrder({
        //Change the order of these properties to see change in output json property order!
        "entityExtraDataSet",
        "firstName",
        "lastName",
        "age",
        "birthDate"
})
public class Person_With_JsonPropertyOrder {
    String firstName;
    String lastName;
    Integer age;
    Date birthDate;
    Set<EntityExtraData> entityExtraDataSet = new HashSet<>();

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class EntityExtraData{
        Integer inAge;
        Long nationalId;
        Double tall;
        Double weight;
        String address;
    }
}
