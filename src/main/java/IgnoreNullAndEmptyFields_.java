import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person_IgnoreNullAndEmptyFields{
    String firstName;
    //Using Include.NON_NULL and Include.NON_EMPTY at the Property level
    @JsonInclude(Include.NON_EMPTY)
    String lastName;
    Integer id;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
//Using Include.NON_NULL and Include.NON_EMPTY at the Class level
@JsonInclude(Include.NON_EMPTY)
class Person_IgnoreNullAndEmptyFields_2{
    String firstName;
    String lastName;
    Integer id;
}


public class IgnoreNullAndEmptyFields_ {
    public static void main(String[] args) throws JsonProcessingException {
        Person_IgnoreNullAndEmptyFields person_ignoreNullAndEmptyFields =
                new Person_IgnoreNullAndEmptyFields(null, "",null);

        ObjectMapper mapper = new ObjectMapper();
        String person = mapper.enable(SerializationFeature.INDENT_OUTPUT).writeValueAsString(person_ignoreNullAndEmptyFields);
        System.out.println(person);

        ObjectMapper mapper1 = new ObjectMapper();
        //Using Include.NON_NULL and Include.NON_EMPTY globally with ObjectMapper
        mapper1.setSerializationInclusion(Include.NON_NULL);
        person = mapper1.writeValueAsString(person_ignoreNullAndEmptyFields);
        System.out.println(person);

        Person_IgnoreNullAndEmptyFields_2 person_ignoreNullAndEmptyFields_2 =
                new Person_IgnoreNullAndEmptyFields_2(null,"",null);
        ObjectMapper mapper2 = new ObjectMapper();
        person = mapper.writeValueAsString(person_ignoreNullAndEmptyFields_2);
        System.out.println(person);
    }
}
