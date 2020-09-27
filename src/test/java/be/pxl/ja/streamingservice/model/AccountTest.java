package be.pxl.ja.streamingservice.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {
    private Account account;

    @BeforeEach
    public void init() {
        account = new Account("test@test.com", "test123");
    }

    @Test
    public void constructorShouldCreateProfile() {
        assertNotNull(account.getFirstProfile());
    }

    @Test
    public void dateOfBirthOfProfileShouldBeNull() {
        assertEquals(null, account.getFirstProfile().getDateOfBirth());
    }
}
