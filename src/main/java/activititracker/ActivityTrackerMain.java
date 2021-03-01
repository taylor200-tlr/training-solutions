package activititracker;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ActivityTrackerMain {

    public static void main(String[] args) {
        MariaDbDataSource dataSource;

        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");

        } catch (SQLException se){
            throw new IllegalStateException("Can not connect", se);
        }

        Activity activity = new Activity(LocalDateTime.of(2021, 02, 23, 10, 11), "Biking in Zemplén", ActivityType.BIKING);
        Activity activity2 = new Activity(LocalDateTime.of(2021, 02, 23, 10, 11), "Hiking in Zemplén", ActivityType.HIKING);
        Activity activity3 = new Activity(LocalDateTime.of(2021, 02, 23, 10, 11), "Running in Zemplén", ActivityType.RUNNING);

        try(
                Connection connection = dataSource.getConnection();
                PreparedStatement statement = connection.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values (?,?,?)")){
                statement.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
                statement.setString(2, activity.getDesc());
                statement.setString(3, activity.getType().toString());
                statement.executeUpdate();

        }catch (SQLException se){
            throw new IllegalStateException("Can not insert");
        }

    }
}
