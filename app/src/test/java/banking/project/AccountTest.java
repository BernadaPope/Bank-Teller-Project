package banking.project;

public class AccountTest {
    import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class AccountTest {
    private Account account;
    private Account account2;
    private Account account3;
    @BeforeEach void setUp() {
        account = new Account();
        account2 = new Account("1234", "Checking", 500.00);
        account3 = new Account("5678", "Savings", 1000.00);
    }
    @Test void shouldCreateAccount() {
        assertNotNull(account, "Unable to create account");
    }
    @Test void canRetrieveAccountNumber() {
        assertEquals("1234", account2.getAccountNumber());
    }
    @Test void canRetrieveCheckingAccount() {
        assertTrue(account2.getAccountType().equals("Checking"));
    }
    @Test void canRetrieveSavingsAccount() {
        assertTrue(account3.getAccountType().equals("Savings"));
    }
    @Test void canRetrieveCheckingBalance() {
        assertEquals(500.00, account2.getAccountBalance());
    }
    @Test void canRetrieveSavingsBalance() {
        assertEquals(1000.00, account3.getAccountBalance());
    }
    @Test void canMakeDepositChecking() {
        assertEquals(1000.00, account2.sum(500.00, 500.00));
    }
    @Test void canMakeDepositSavings() {
        assertEquals(1500.00, account3.sum(1000.00, 500.00));
    }
    @Test void canMakeWithdrawalChecking() {
        assertEquals(250.00, account2.subtract(500.00, 250.00));
    }
    @Test void canMakeWithdrawalSavings() {
        assertEquals(750.00, account2.subtract(1000.00, 250.00));
    }
}
}
