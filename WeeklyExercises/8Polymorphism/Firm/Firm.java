//********************************************************************
//  Firm.java       Java Foundations
//
//  Demonstrates polymorphism via inheritance.
//********************************************************************

public class Firm
{
    //-----------------------------------------------------------------
    //  Creates a staff of employees for a firm and pays them.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        Staff personnel = new Staff();

        personnel.addEmployee(new FullTimeEmployee("Leo Thomson", 92250));
        personnel.addEmployee(new PartTimeEmployee("Steve Fisher-Brown", 42500));

        FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) personnel.getEmployee(0);
        fullTimeEmployee.setVacationDays(20);

        PartTimeEmployee partTimeEmployee = (PartTimeEmployee) personnel.getEmployee(1);
        partTimeEmployee.setVacationDays(10);

        fullTimeEmployee.takeVacation();
        partTimeEmployee.takeVacation();

        personnel.payday();
    }
}
