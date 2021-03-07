package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;

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

            try (
                    Connection conn = dataSource.getConnection();
                    Statement stmt = conn.createStatement();
                    ResultSet resultSet = stmt.executeQuery("")
            ) {
                System.out.println(resultSet.getString(""));
            }
        }
        catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }

        CovidMain covidMain = new CovidMain(dataSource);

        covidMain.printMenuToConsole();
    }
}
