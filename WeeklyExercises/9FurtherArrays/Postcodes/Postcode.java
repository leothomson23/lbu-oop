public class Postcode {
    private Person[] people;
    private int numPeople;

    public Postcode() {
        people = new Person[25];
        numPeople = 0;
    }

    public void addPerson(Person person) {
        if (numPeople < 25) {
            people[numPeople] = person;
            numPeople++;
        } else {
            System.out.println("Capacity has been reached.");
        }
    }

    public void printList() {
        for (int i = 0; i < numPeople; i++) {
            System.out.println("Name: " + people[i].getFirstName() + " " + people[i].getLastName() +
                    ", Postcode: " + people[i].getPostcode());
        }

    }
}