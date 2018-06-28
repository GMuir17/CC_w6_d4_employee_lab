package Staff;

public abstract class Employee {

    private String name;
    private String number;
    private double salary;

    public Employee(String name, String number, double salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNumber(){
        return this.number;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double increment){
        if (increment > 0) {
        this.salary += increment;
        }
    }

    public void changeName(String newName){
        if(newName != null) {
            this.name = newName;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }

}
