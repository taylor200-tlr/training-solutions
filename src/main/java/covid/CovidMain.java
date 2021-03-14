package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Scanner;

public class CovidMain {

    private MariaDbDataSource dataSource;

    public CovidMain(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void printMenuToConsole(){
        System.out.println("1. Regisztráció\n" +
                            "2. Tömeges regisztráció\n" +
                            "3. Generálás\n" +
                            "4. Oltás\n" +
                            "5. Oltás meghiúsulás\n" +
                            "6. Riport\n");
    }

    public static void main(String[] args) {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/covid?useUnicode=true");
            dataSource.setUser("covid");
            dataSource.setPassword("covid");
        }
        catch (SQLException se) {
            throw new IllegalStateException("Can not create data source!", se);
        }

        CovidMain covidMain = new CovidMain(dataSource);
        Scanner scanner = new Scanner(System.in);

        covidMain.printMenuToConsole();
        System.out.println("Kérem válasszon: ");
        int chosen = scanner.nextInt();

        switch (chosen){
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
        }

    }
}
