package be.pxl.ja.streamingservice.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.Period;

public class ProfileTest {
    private Profile profile;

    @BeforeEach
    public void init() {
        profile = new Profile("Eray Özcan");
    }

    @Test
    public void getAgeShouldReturnCorrectAge() {
        LocalDate birthDay = LocalDate.of(2000, 1, 1);
        Period period = Period.between(birthDay, LocalDate.now());
        profile.setDateOfBirth(birthDay);

        int age = period.getYears();

        assertEquals(age, profile.getAge());
    }

    @Test
    public void contentForLittleKidsShouldBeAllowedToWatch() {
        profile.setDateOfBirth(LocalDate.now().minusYears(10));

        boolean allowedToWatch = profile.allowedToWatch(new Movie("Test", Rating.LITTLE_KIDS));

        assertTrue(allowedToWatch);
    }

    @Test
    public void contentForOlderKidsShouldBeAllowedToWatch() {
        profile.setDateOfBirth(LocalDate.now().minusYears(Rating.OLDER_KIDS.getAge()));

        boolean allowedToWatch = profile.allowedToWatch(new Movie("Test", Rating.OLDER_KIDS));

        assertTrue(allowedToWatch);
    }

    @Test
    public void contentForOlderKidsShouldNotBeAllowedToWatch() {
        profile.setDateOfBirth(LocalDate.now().minusYears(Rating.OLDER_KIDS.getAge() - 1));

        boolean allowedToWatch = profile.allowedToWatch(new Movie("Test", Rating.OLDER_KIDS));

        assertFalse(allowedToWatch);
    }

    @Test
    public void contentForTeensShouldBeAllowedToWatch() {
        profile.setDateOfBirth(LocalDate.now().minusYears(Rating.TEENS.getAge()));

        boolean allowedToWatch = profile.allowedToWatch(new Movie("Test", Rating.TEENS));

        assertTrue(allowedToWatch);
    }

    @Test
    public void contentForTeensShouldNotBeAllowedToWatch() {
        profile.setDateOfBirth(LocalDate.now().minusYears(Rating.TEENS.getAge() - 1));

        boolean allowedToWatch = profile.allowedToWatch(new Movie("Test", Rating.TEENS));

        assertFalse(allowedToWatch);
    }

    @Test
    public void contentForMatureShouldBeAllowedToWatch() {
        profile.setDateOfBirth(LocalDate.now().minusYears(Rating.MATURE.getAge() + 1));

        boolean allowedToWatch = profile.allowedToWatch(new Movie("Test", Rating.MATURE));

        assertTrue(allowedToWatch);
    }

    @Test
    public void contentForMatureShouldNotBeAllowedToWatch() {
        profile.setDateOfBirth(LocalDate.now().minusYears(Rating.MATURE.getAge() - 1));

        boolean allowedToWatch = profile.allowedToWatch(new Movie("Test", Rating.MATURE));

        assertFalse(allowedToWatch);
    }

    @Test
    public void contentForSomeoneWithoutDateOfBirthShouldNotBeAllowedToWatch() {
        profile.setDateOfBirth(null);

        boolean allowedToWatch = profile.allowedToWatch(new Movie("Test", Rating.LITTLE_KIDS));

        assertFalse(allowedToWatch);
    }
}
