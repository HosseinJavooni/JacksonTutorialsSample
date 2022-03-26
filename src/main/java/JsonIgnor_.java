import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person_JsonIgor{
    @JsonIgnore
    String firstName;
    String lastName;
    @JsonIgnore
    int age;
}
//==================Main Calss==================
public class JsonIgnor_ {
    public static void main(String[] args) throws JsonProcessingException {
        Person_JsonIgor person_jsonIgor = new Person_JsonIgor("Mahan", "Javooni", 1);
        ObjectMapper mapper = new ObjectMapper();
        String person = mapper.enable(SerializationFeature.INDENT_OUTPUT).writeValueAsString(person_jsonIgor);

        System.out.println(person);
    }
}
