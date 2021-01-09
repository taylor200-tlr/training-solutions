package activity;

public class ActivityWithTrack implements Activity{
    private Track track;
    private ActivityType activityType;


    public ActivityWithTrack(Track track, ActivityType activityType) {
        this.activityType = activityType;
    }

    @Override
    public double getDistance() {
        return 0;
    }

    @Override
    public ActivityType getType() {
        return activityType;
    }
}
