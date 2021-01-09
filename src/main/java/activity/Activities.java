package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {
    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Report> distancesByTypes() {
        List<Report> reports = new ArrayList<>();
        for (ActivityType i : ActivityType.values()) {
            reports.add(new Report(i, getActivityDistanceByType(i)));
        }
        return reports;
    }

    public int numberOfTrackActivities() {
        int result = 0;
        for (Activity i : activities) {
            if (!i.getType().equals(ActivityType.BASKETBALL)) {
                result++;
            }
        }
        return result;
    }

    public int numberOfWithoutTrackActivities() {
        int result = 0;
        for (Activity i : activities) {
            if (i.getType().equals(ActivityType.BASKETBALL)) {
                result++;
            }
        }
        return result;
    }

    private double getActivityDistanceByType(ActivityType activityType) {
        double result = 0.0;
        for (Activity i : activities) {
            if (i.getType().equals(activityType)) {
                result += i.getDistance();
            }
        }
        return result;
    }

}
