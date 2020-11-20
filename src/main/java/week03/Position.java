package week03;

import java.util.ArrayList;
import java.util.List;

public class Position {
    private String name;
    private int bonus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", bonus=" + bonus +
                '}';
    }

    public static void main(String[] args) {
        List<Position> positions = new ArrayList<>();
        Position position1 = new Position("BigBoss", 500_000);
        positions.add(position1);
        Position position2 = new Position("SmallBoss", 300_000);
        positions.add(position2);
        Position position3 = new Position("SmallerBoss", 200_000);
        positions.add(position3);
        Position position4 = new Position("SmallestBoss", 100_000);
        positions.add(position4);

        for (Position position: positions) {
            if (position.bonus > 150_000){
//                System.out.println(position.getName());
                System.out.println(position);
            }
        }
    }
}
