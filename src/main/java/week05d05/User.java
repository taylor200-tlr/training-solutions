package week05d05;

public class User {
    private String firstName, lastName, email;

    public User(String firstName, String lastName, String email) {
        if (!email.contains("@") && !email.contains(".")){
            throw new IllegalArgumentException("Nem megfelelő email cím");
        }else this.email = email;
        if (firstName == null || firstName == ""){
            throw new IllegalArgumentException("A név nem lehet üres");
        }else this.firstName = firstName;
        if (lastName == null || lastName == "") {
            throw new IllegalArgumentException("A név nem lehet üres!");
        }else this.lastName = lastName;

    }
    public String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
