package Management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String number, double salary, String deptName) {
        super(name, number, salary);
        this.deptName = deptName;
    }


    public String getDeptName() {
        return this.deptName;
    }
}
