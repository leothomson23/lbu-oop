class Receptionist extends Employee{
    private String Specialisation;

    public Receptionist(String name, int employeeNumber, String Specialisation){
        super(employeeNumber, name);
        this.Specialisation = Specialisation;
    }

    public void manage(){
        System.out.println("Receptionist " + getName() + ", Employee Number: " + getEmployeeNumber() + ", specialises in " + Specialisation);
    }
}
