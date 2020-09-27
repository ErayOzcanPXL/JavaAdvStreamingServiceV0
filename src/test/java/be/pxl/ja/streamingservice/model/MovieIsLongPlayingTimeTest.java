package be.pxl.ja.streamingservice.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MovieIsLongPlayingTimeTest {
    private Movie movie;

    @BeforeEach
    public void init() {
        movie = new Movie("Titanic", Rating.TEENS);
    }

    @Test
    public void movieWithDurationLessThenLongPlayingTimeReturnsFalse() {
        movie.setDuration(Movie.LONG_PLAYING_TIME - 1);

        assertFalse(movie.isLongPlayingTime());
    }

    @Test
    public void movieWithDurationEquallyToLongPlayingTimeReturnsTrue() {
        movie.setDuration(Movie.LONG_PLAYING_TIME);

        assertTrue(movie.isLongPlayingTime());
    }

    @Test
    public void movieWithDurationLongerThenLongPlayingTimeReturnsTrue() {
        movie.setDuration(Movie.LONG_PLAYING_TIME + 1);

        assertTrue(movie.isLongPlayingTime());
    }
}
