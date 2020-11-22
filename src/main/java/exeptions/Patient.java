package exeptions;

public class Patient {
    private String name, socialSecutityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecutityNumber, int yearOfBirth) {
        if (name != null){
            this.name = name;}
        else throw new IllegalArgumentException("Kötelező megadni a nevet!");
        this.socialSecutityNumber = socialSecutityNumber;
        if (yearOfBirth >= 1900){
            this.yearOfBirth = yearOfBirth;}
        else throw new IllegalArgumentException("A születési év nem megfelelő!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecutityNumber() {
        return socialSecutityNumber;
    }

    public void setSocialSecutityNumber(String socialSecutityNumber) {
        this.socialSecutityNumber = socialSecutityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", socialSecutityNumber='" + socialSecutityNumber + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
