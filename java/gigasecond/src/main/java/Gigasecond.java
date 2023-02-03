import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private static final long GIGASECOND = (long)Math.pow(10, 9);
    private LocalDateTime date;

    public Gigasecond(LocalDate moment) {
        this.date = moment.atTime(0, 0).plusSeconds(GIGASECOND);
    }

    public Gigasecond(LocalDateTime moment) {
        this.date = moment.plusSeconds(GIGASECOND);
    }

    public LocalDateTime getDateTime() {
        return this.date;
    }
}
