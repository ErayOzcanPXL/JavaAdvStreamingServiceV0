package be.pxl.ja.streamingservice.util;

public class PasswordUtil {

	private static final String SPECIAL_CHARACTERS = "~!@#$%^&*()_-";
    private static final String DIGITS = "0123456789";
    private static final String LOWER_CASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER_CASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static int calculateStrength(String password) {
        int passwordLength = password.length();
        int score = 0;

        if (passwordLength <= 5) {
            return score;
        } else {
            score++;

            if (passwordLength > 10) {
                score++;
            }
            if (hasChar(SPECIAL_CHARACTERS, password, passwordLength)) {
                score += 2;
            }
            if (hasChar(DIGITS, password, passwordLength)) {
                score += 2;
            }
            if (hasChar(LOWER_CASE_CHARACTERS, password, passwordLength)) {
                score += 2;
            }
            if (hasChar(UPPER_CASE_CHARACTERS, password, passwordLength)) {
                score += 2;
            }

            return score;
        }
	}

    private static boolean hasChar(String charKind, String password, int passwordLength) {
        boolean found = false;

        for (int i = 0; i < passwordLength && !found; i++) {
            found = charKind.contains(password.substring(i, i + 1));
        }

        return found;
    }
}
