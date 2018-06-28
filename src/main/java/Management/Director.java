package Management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String number, double salary, String deptName, double budget) {
        super(name, number, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }
}
