public class Driver {
    public static void main(String[] args){
        Doctor doctor = new Doctor("Nicola Stephenson", 325, "Physiology");
        Nurse nurse = new Nurse("Lisa Davies", 127, "Assisting Patients");
        Receptionist receptionist = new Receptionist ("Susan Brown", 654, "Managing Appointments");
        Cleaner cleaner = new Cleaner("Kath Scott", 742, "Mopping");

        doctor.diagnose();
        nurse.assist();
        receptionist.manage();
        cleaner.mopping();

    }
}
