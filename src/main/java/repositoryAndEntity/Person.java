package repositoryAndEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
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
