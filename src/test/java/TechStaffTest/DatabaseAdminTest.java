package TechStaffTest;

import TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin admin;

    @Before
    public void setUp() {
        admin = new DatabaseAdmin("Ed", "GN1098D", 1000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Ed", admin.getName());
    }

    @Test
    public void hasNumber() {
        assertEquals("GN1098D", admin.getNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(1000.00, admin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        admin.raiseSalary(100);
        assertEquals(1100.00, admin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        double bonus = admin.payBonus();
        assertEquals(10.00, bonus, 0.01);
    }




}
