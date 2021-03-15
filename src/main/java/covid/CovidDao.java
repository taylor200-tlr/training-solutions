package covid;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CovidDao {
    private DataSource dataSource;

    public CovidDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void registerNewPerson(Person person){
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("insert into employees(emp_name) values (?,?,?,?,?)")) {
            stmt.setString(1, person.getName());
            stmt.setString(1, person.getZipCode());
            stmt.setInt(1, person.getAge());
            stmt.setString(1, person.getEmail());
            stmt.setString(1, person.getTaj());
            stmt.executeUpdate();
        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot insert", se);
        }
    }

}
