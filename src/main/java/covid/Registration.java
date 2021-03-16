package covid;

import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Registration {

    Scanner scanner = new Scanner(System.in);

    public String readName(){
        System.out.println("Kérem adja meg a nevét:");
        String name = scanner.nextLine();
        return name;
    }

    public String readZip(){
        System.out.println("Kérem adja meg az irányítószámát:");
        String zipCode = scanner.nextLine();
        return zipCode;
    }

    public int readAge(){
        System.out.println("Kérem adja meg a korát:");
        int age = scanner.nextInt();
        scanner.nextLine();
        return age;
    }
    public String readEmail(){
        System.out.println("Kérem adja meg az email címét:");
        String email = scanner.nextLine();
        return email;
    }

    public String readSSN(){
        System.out.println("Kérem adja meg a TAJ számát:");
        String ssn = scanner.nextLine();
        return ssn;
    }
    public String readFileName(){
        System.out.println("Melyik file-ból olvassuk be az adatokat:");
        String file = scanner.nextLine();
        return file;
    }

    public void massRegistration(BufferedReader reader, DataSource dataSource) throws IOException{
            String line;
            reader.readLine();
            while ((line = reader.readLine())  != null) {
                String[] splittedLine = line.split(",");
                Person person = new Person(splittedLine[0],splittedLine[1],Integer.parseInt(splittedLine[2]),splittedLine[3],splittedLine[4]);
                new CovidDao(dataSource).registerNewPerson(person);
            }

    }

}
