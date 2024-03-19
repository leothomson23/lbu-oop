class Cleaner extends Employee{
    private String Specialisation;

    public Cleaner(String name, int employeeNumber, String Specialisation){
        super(employeeNumber, name);
        this.Specialisation = Specialisation;
    }

    public void mopping(){
        System.out.println("Cleaner " + getName() + ", Employee Number: " + getEmployeeNumber() + ", specialises in " + Specialisation);
    }
}
