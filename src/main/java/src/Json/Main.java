package src.Json;



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
