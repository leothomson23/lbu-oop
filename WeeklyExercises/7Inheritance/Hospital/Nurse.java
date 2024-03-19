class Nurse extends Employee{
    private String Specialisation;

    public Nurse(String name, int employeeNumber, String Specialisation){
        super(employeeNumber, name);
        this.Specialisation = Specialisation;
    }

    public void assist(){
        System.out.println("Nurse " + getName() + ", Employee Number: " + getEmployeeNumber() + ", is " + Specialisation);
    }
}
