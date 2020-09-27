package be.pxl.ja.opdracht1;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieToStringTest {
    private Movie movie;

    @BeforeEach
    public void init() {
        movie = new Movie("Titanic", Rating.OLDER_KIDS);
    }

    @Test
    public void toStringShouldReturnTitleAndReleaseDate() {
        movie.setReleaseDate(LocalDate.of(1997, 5, 10));

        assertEquals("Titanic (1997)", movie.toString());
    }

    @Test
    public void toStringShouldOnlyReturnTitle() {
        assertEquals("Titanic", movie.toString());
    }
}
