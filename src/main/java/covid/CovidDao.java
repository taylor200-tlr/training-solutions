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

    public void registerNewPerson(Person person) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("insert into citizens(citizen_name, zip, age, email, taj) values (?,?,?,?,?)")) {
            stmt.setString(1, person.getName());
            stmt.setString(2, person.getZipCode());
            stmt.setInt(3, person.getAge());
            stmt.setString(4, person.getEmail());
            stmt.setString(5, person.getTaj());
            stmt.executeUpdate();
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot insert", se);
        }
    }

}
