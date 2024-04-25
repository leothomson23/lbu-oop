public class Employee {
    private String name;
    private int vacationDays;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
        this.vacationDays = 0;
    }

    public void setVacationDays(int days) {
        this.vacationDays = days;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void takeVacation() {
        System.out.println(name + " is taking " + vacationDays + " days of vacation.");
    }


}