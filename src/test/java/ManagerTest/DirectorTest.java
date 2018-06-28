package ManagerTest;

import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() {
        director = new Director("Ed", "GN1098D", 1000.00, "HR", 20.00);
    }

    @Test
    public void hasName() {
        assertEquals("Ed", director.getName());
    }

    @Test
    public void hasNumber() {
        assertEquals("GN1098D", director.getNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(1000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDeptName() {
        assertEquals("HR", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(100);
        assertEquals(1100.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        double bonus = director.payBonus();
        assertEquals(10.00, bonus, 0.01);
    }

    @Test
    public void hasBudget() {
        assertEquals(20.00, director.getBudget(),0.01);
    }

}
