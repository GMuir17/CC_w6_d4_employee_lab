package ManagerTest;

import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("Ed", "GN1098D", 1000.00, "Development");
    }

    @Test
    public void hasName() {
        assertEquals("Ed", manager.getName());
    }

    @Test
    public void hasNumber() {
        assertEquals("GN1098D", manager.getNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(1000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Development", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(100);
        assertEquals(1100.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        double bonus = manager.payBonus();
        assertEquals(10.00, bonus, 0.01);
    }

}
