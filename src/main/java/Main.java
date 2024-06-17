import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        LocalDateTime date = LocalDateTime.of(2014, 12, 20, 2, 30);
        SortedLocalDateTime sortedLocalDateTime = new SortedLocalDateTime(date);
        ObjectMapper objectMapper=new ObjectMapper();
        String result = objectMapper.writeValueAsString(sortedLocalDateTime);
        System.out.println(result);
    }


}
