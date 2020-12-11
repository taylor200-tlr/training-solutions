package abstractclass.gamecharacter;

public class Point {
    private long x, y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long distance(Point otherPoint){
        return (long) Math.sqrt(Math.pow(x - otherPoint.getX(), 2) +
                Math.pow(y - otherPoint.getY(), 2));
    }
}
