package activity;

public class ActivityWithTrack implements Activity{
    private Track track;
    private ActivityType activityType;


    public ActivityWithTrack(Track track, ActivityType activityType) {
        this.activityType = activityType;
    }

    @Override
    public double getDistance() {
        return track.getDistance();
    }

    @Override
    public ActivityType getType() {
        return activityType;
    }

    public Track getTrack() {
        return track;
    }

    public ActivityType getActivityType() {
        return activityType;
    }
}
