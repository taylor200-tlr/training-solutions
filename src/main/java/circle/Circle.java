package circle;

public class Circle {
    private int diameter;
    private final double PI = 3.14;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public double perimeter(){
        return diameter * PI;
    }

    public double area(){
        return (PI * (Math.pow((double) (diameter / 2), 2)));
    }

}
