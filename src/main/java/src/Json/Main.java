package src.Json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        URL resource = Main.class.getResource("/simple.json");
        JsonNode jsonNode = objectMapper.readTree(resource);
        System.out.println(jsonNode.get("isPopular").asBoolean());
    }
}
