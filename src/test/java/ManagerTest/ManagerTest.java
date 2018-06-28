package ManagerTest;

import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("Ed", "GN10983", 1000.00, "Development");
    }

    @Test
    public void hasName() {
        assertEquals("Ed", manager.getName());
    }



}
