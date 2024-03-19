class Doctor extends Employee{
    private String Specialisation;

    public Doctor(String name, int employeeNumber, String Specialisation){
        super(employeeNumber, name);
        this.Specialisation = Specialisation;
    }


    public void diagnose(){
        System.out.println("Doctor " + getName() + ", Employee Number: " + getEmployeeNumber() + ", specialises in " + Specialisation);
    }
}
