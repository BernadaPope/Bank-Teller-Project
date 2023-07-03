package banking.project;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankingTest {
   private Account account;
   import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class BankTest {
    private Account account;
    private Account account2;
    private Account account3;
    private Bank bank;
    @BeforeEach void setUp() {
        account = new Account();
        account2 = new Account("1234", "Checking", 500.00);
        account3 = new Account("5678", "Savings", 1000.00);
        bank = new Bank();
    }
    @Test void canAddAccount() {
        bank.addAccount(account2);
        assertEquals(account2, bank.accounts.get(account2));
    }
}

