package repositoryAndEntity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonWithJsonPropertyAnnotation {
    @JsonProperty("first_name")
    String firstName;
    @JsonProperty("last_name")
    String lastName;
    Integer age;
    @JsonProperty("birth_date")
    Date birthDate;
    @JsonProperty("entity_extra_data_set")
    Set<PersonWithJsonPropertyAnnotation.EntityExtraData> entityExtraDataSet = new HashSet<>();

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class EntityExtraData{
        Integer inAge;
        @JsonProperty("national_id")
        Long nationalId;
        Double tall;
        Double weight;
        String address;
    }
}
