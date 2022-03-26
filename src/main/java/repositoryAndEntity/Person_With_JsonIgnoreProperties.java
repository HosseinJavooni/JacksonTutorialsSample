package repositoryAndEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor

@JsonIgnoreProperties({
        //Just show firstName in json output!
        "entityExtraDataSet",
        //"firstName",
        "lastName",
        "age",
        "birthDate"
})
public class Person_With_JsonIgnoreProperties {
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
