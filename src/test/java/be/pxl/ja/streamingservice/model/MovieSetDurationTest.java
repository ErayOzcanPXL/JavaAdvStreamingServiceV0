package be.pxl.ja.opdracht1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieSetDurationTest {
    @Test
    public void negativeDurationBecomesPositive() {
        Movie movie = new Movie("Titanic", Rating.OLDER_KIDS);

        movie.setDuration(-125);

        assertEquals(125, movie.getDuration());
    }

    @Test
    public void positiveDurationStaysUnchanged() {
        Movie movie = new Movie("Titanic", Rating.OLDER_KIDS);

        movie.setDuration(125);

        assertEquals(125, movie.getDuration());
    }
}
