public class Person {
    private String firstName;
    private String lastName;
    private String postcode;

    public Person(String firstName, String lastName, String postcode){
        this.firstName = firstName;
        this.lastName = lastName;
        this.postcode = postcode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPostcode() {
        return postcode;
    }
}
