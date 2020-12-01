package methodstructure;

public class BodyMass {
    private int weight, height;

    public BodyMass(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public double bodyMassIndex() {
        return weight / (Math.pow(height, 2));
    }

    public boolean isThinnerThan(BodyMass bodymass) {
        return bodyMassIndex() < bodymass.bodyMassIndex();
    }

    public BmiCategory body() {
        if (bodyMassIndex() < 18.5) {
            return BmiCategory.UNDERWEIGHT;
        }else if (bodyMassIndex() > 25) {
            return BmiCategory.OVERWEIGHT;
        }
        return BmiCategory.NORMAL;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
