import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.*;

public class ConvertingListSetMapToJsonAndViceVersa {
    public static void main(String[] args) throws JsonProcessingException {

        String set = "[\"a\", \"b\", \"c\"]";
        String list = "[\"aL\", \"bL\", \"cL\"]";
        String map = "{\"a\":1, \"b\":2, \"c\":3}";

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        @SuppressWarnings("unchecked")
        Set<String> setObject = mapper.readValue(set, Set.class);
        @SuppressWarnings("unchecked")
        List<String> listObject = mapper.readValue(list, List.class);
        @SuppressWarnings("unchecked")
        Map<String, Integer> mapObject = mapper.readValue(map, Map.class);

        System.out.println("Convert strings to objects:");

        System.out.println(setObject);
        System.out.println(listObject);
        System.out.println(mapObject);

        System.out.println("Convert objects to json string:");

        String setJson = mapper.writeValueAsString(setObject);
        String listJson = mapper.writeValueAsString(listObject);
        String mapJson = mapper.writeValueAsString(mapObject);

        System.out.println(setJson);
        System.out.println(listJson);
        System.out.println(mapJson);

    }
}
