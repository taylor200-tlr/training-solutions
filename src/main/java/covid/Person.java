package covid;

public class Person {

    private String name;
    private String zipCode;
    private int age;
    private String email;
    private String taj;

    public Person(String name, String zipCode, int age, String email, String taj) {
        if (isNameValid(name)) {
            this.name = name;
        } else throw new IllegalArgumentException("Name must be not empty");

        if (isZipCodeValid(zipCode)){
            this.zipCode = zipCode;
        }else throw new IllegalArgumentException("Invalid postal code");


        if (isAgeValid(age)) {
            this.age = age;
        } else throw new IllegalArgumentException("Age must be between 10 and 150");

        if (isEmailValid(email)) {
            if (isEmailValid(email)){
                this.email = email;
            }else throw new IllegalArgumentException("Invalid email");

        }

        if (isSsnValid(taj)) {
            this.taj = taj;
        } else throw new IllegalArgumentException("Invalid Social Secutity Number");

    }

    private boolean isZipCodeValid(String zipCode) {
        if (zipCode.length() == 4){
            return true;
        }else {
            return false;
        }

    }

    private boolean isSsnValid(String taj) {
        Character actualChar;
        int sum = 0;
        if (taj.length() == 10) {
            for (int i = 0; i < taj.length() - 1; i++) {
                actualChar = taj.charAt(i);
                if (Character.isDigit(actualChar)) {
                    sum += Integer.parseInt((i + 1) % 2 == 1 ? String.valueOf(actualChar * 3) : String.valueOf(actualChar * 7));
                }
            }
        }else return false;
        return (sum == Integer.parseInt(taj.substring(9))%10);

    }

    private boolean isEmailValid(String email) {
        if (email.contains("@") & email.length() > 3) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isAgeValid(int age) {
        if (age > 10 & age < 150) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isNameValid(String name) {
        if (name != null) {
            return true;
        } else {
            return false;
        }

    }

    public String getName() {
        return name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getTaj() {
        return taj;
    }

    public void registration() {

    }
}
