package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;
import java.time.Period;

public class Profile {
    private String name;
    private LocalDate dateOfBirth;

    public Profile(String name) {
        this(name, null);
    }

    public Profile(String name, LocalDate dateOfBirth) {
        setName(name);
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        Period period = Period.between(dateOfBirth, LocalDate.now());
        return period.getYears();
    }

    public boolean allowedToWatch(Content content) {
        return this.dateOfBirth != null && this.getAge() >= content.getMaturityRating().getAge();
    }
}
