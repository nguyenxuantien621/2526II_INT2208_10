import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoanApprovalTest {

    LoanApproval system = new LoanApproval();

    @Test
    public void testTC01() {
        assertEquals("Invalid Input", system.evaluateLoan(5, 450.0, 350, "C"));
    }

    @Test
    public void testTC02() {
        assertEquals("Invalid Input", system.evaluateLoan(70, 445.0, 400, "C"));
    }

    @Test
    public void testTC03() {
        assertEquals("Invalid Input", system.evaluateLoan(50, 4.0, 450, "C"));
    }

    @Test
    public void testTC04() {
        assertEquals("Invalid Input", system.evaluateLoan(45, 505.0, 500, "C"));
    }

    @Test
    public void testTC05() {
        assertEquals("Invalid Input", system.evaluateLoan(44, 25.0, 250, "C"));
    }

    @Test
    public void testTC06() {
        assertEquals("Invalid Input", system.evaluateLoan(43, 333.0, 900, "C"));
    }

    @Test
    public void testTC07() {
        assertEquals("REJECT", system.evaluateLoan(30, 200.0, 350, "C"));
    }

    @Test
    public void testTC08() {
        assertEquals("REJECT", system.evaluateLoan(30, 10.0, 550, "F"));
    }

    @Test
    public void testTC09() {
        assertEquals("APPROVE", system.evaluateLoan(30, 20.0, 600, "C"));
    }

    @Test
    public void testTC10() {
        assertEquals("MANUAL REVIEW", system.evaluateLoan(30, 50.0, 720, "F"));
    }

    @Test
    public void testTC11() {
        assertEquals("MANUAL REVIEW", system.evaluateLoan(30, 10.0, 750, "C"));
    }

    @Test
    public void testTC12() {
        assertEquals("REJECT", system.evaluateLoan(30, 9.0, 800, "F"));
    }
}