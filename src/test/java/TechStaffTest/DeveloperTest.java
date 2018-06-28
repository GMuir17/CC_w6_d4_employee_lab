package TechStaffTest;

import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Ed", "GN1098D", 1000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Ed", developer.getName());
    }

    @Test
    public void hasNumber() {
        assertEquals("GN1098D", developer.getNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(1000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(100);
        assertEquals(1100.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        double bonus = developer.payBonus();
        assertEquals(10.00, bonus, 0.01);
    }




}
