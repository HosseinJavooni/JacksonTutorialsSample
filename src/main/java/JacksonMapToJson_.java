import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class JacksonMapToJson_ {
    public static void main(String[] args) throws JsonProcessingException {
        Map<String , Integer> map = new HashMap<>();
        map.put("Hossein", 1);
        map.put("Mahnoosh", 2);
        map.put("Mahan", 3);

        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
        System.out.println(json);
    }
}
