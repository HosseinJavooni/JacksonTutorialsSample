import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class JacksonJsonToMap_ {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{" +
                "\"Hossein\" : 1," +
                "\"Mahnoosh\" : 2," +
                "\"Mahan\" : 3" +
                "}";
        ObjectMapper mapper = new ObjectMapper();

        @SuppressWarnings("unchecked")
        Map<String, Integer> map = mapper.readValue(json, Map.class);

        System.out.println(map.toString());
    }

}
