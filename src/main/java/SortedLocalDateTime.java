import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;

public class SortedLocalDateTime {
    @JsonSerialize(using = CustomLocalDateTimeSerializer.class)
    private LocalDateTime localDateTime;

    public SortedLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "SortedLocalDateTime{" +
                "localDateTime=" + localDateTime +
                '}';
    }
}
