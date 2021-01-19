package ioreadstring.names;

public class Human {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Human(String fullName){
        String[] names = fullName.split(" ");
        firstName = names[0];
        lastName = names[1];
    }
}
