import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreType()

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person_Name{
    String firstName;
    String lastName;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person_JsonIgnoreType{
    Person_Name person_name;
    int age;
}

public class JsonIgnorType_ {
    public static void main(String[] args) throws JsonProcessingException {
        Person_JsonIgnoreType person_jsonIgnoreType = new Person_JsonIgnoreType();
        ObjectMapper mapper = new ObjectMapper();
        String person = mapper.writeValueAsString(person_jsonIgnoreType);
        System.out.println(person);
    }
}
