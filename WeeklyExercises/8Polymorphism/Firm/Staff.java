public class Staff{
    private Employee[] employees;
    private int count;

    public Staff(int size) {
        employees = new Employee[size];
        count = 0;
    }

    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count] = emp;
            count++;
        } else {
            System.out.println("Cannot add more employees. Staff is full.");
        }
    }

    public Employee getEmployee(int index) {
        if (index >= 0 && index < count) {
            return employees[index];
        } else {
            System.out.println("Invalid employee index.");
            return null;
        }
    }

    public void payday() {
        System.out.println("Paying employees:");
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].getSalary());
        }
    }
}