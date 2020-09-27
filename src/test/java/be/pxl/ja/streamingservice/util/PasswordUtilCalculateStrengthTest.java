package be.pxl.ja.streamingservice.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordUtilCalculateStrengthTest {
    @Test
    public void passwordStrengthShouldBe0() {
        String password = "tt3$T";

        assertEquals(0, PasswordUtil.calculateStrength(password));
    }

    @Test
    public void lowerCasePasswordStrengthShouldBe3() {
        String password = "return";

        assertEquals(3, PasswordUtil.calculateStrength(password));
    }

    @Test
    public void upperCasePasswordStrengthShouldBe3() {
        String password = "RETURN";

        assertEquals(3, PasswordUtil.calculateStrength(password));
    }

    @Test
    public void digitPasswordStrengthShouldBe3() {
        String password = "222222";

        assertEquals(3, PasswordUtil.calculateStrength(password));
    }

    @Test
    public void specialCharacterPasswordStrengthShouldBe3() {
        String password = "______";

        assertEquals(3, PasswordUtil.calculateStrength(password));
    }

    @Test
    public void passwordStrengthShouldBe4() {
        String password = "characterss";

        assertEquals(4, PasswordUtil.calculateStrength(password));
    }

    @Test
    public void lowerCaseAndUpperCasePasswordStrengthShouldBe5() {
        String password = "ReTuRn";

        assertEquals(5, PasswordUtil.calculateStrength(password));
    }

    @Test
    public void passwordStrengthShouldBe6() {
        String password = "Characterss";

        assertEquals(6, PasswordUtil.calculateStrength(password));
    }

    @Test
    public void passwordStrengthShouldBe7() {
        String password = "ReTuRn5";

        assertEquals(7, PasswordUtil.calculateStrength(password));
    }

    @Test
    public void passwordStrengthShouldBe8() {
        String password = "Charact3rss";

        assertEquals(8, PasswordUtil.calculateStrength(password));
    }

    @Test
    public void passwordStrengthShouldBe9() {
        String password = "Charact3r$";

        assertEquals(9, PasswordUtil.calculateStrength(password));
    }

    @Test
    public void passwordStrengthShouldBe10() {
        String password = "Charact3r$s";

        assertEquals(10, PasswordUtil.calculateStrength(password));
    }
}
