package be.pxl.ja.streamingservice.model;
import java.time.LocalDate;

public class Movie extends Content implements Playable {
    public static final int LONG_PLAYING_TIME = 60 * 2 + 15;
    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;

    public Movie(String title, Rating maturityRating) {
        super(title, maturityRating);
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        if (duration < 0) {
            duration = Math.abs(duration);
        }

        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }

    public boolean isLongPlayingTime() {
        return this.duration >= LONG_PLAYING_TIME;
    }

    public String getPlayingTime() {
        StringBuilder time = new StringBuilder();

        if (duration == 0) {
            time.append("?");
        } else if (duration < 60) {
            time.append(duration);
            time.append(" min");
        } else {
            time.append(duration / 60);
            time.append(" h");

            if (duration % 60 != 0) {
                time.append(" ");
                time.append(duration % 60);
                time.append(" min");
            }
        }

        return time.toString();
    }

    public Genre getGenre() {
        return this.genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return String.format("%s%s", super.toString(), this.releaseDate != null ? " (" + this.releaseDate.getYear() + ")" : "");
    }
}
