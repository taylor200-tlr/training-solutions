package week08d01;

public class Robot {
    int x = 0, y = 0;
    Position position = new Position(x, y);

    public Position move(String directions) {
        String direction;
        for (int i = 0; i < directions.length(); i++) {
            direction = directions.toUpperCase().substring(i, i + 1);
            switch (direction) {
                case "J":
                    position.setX(position.getX() + 1);
                    break;
                case "B":
                    position.setX(position.getX() - 1);
                    break;
                case "L":
                    position.setY(position.getY() - 1);
                    break;
                case "F":
                    position.setY(position.getY() + 1);
                    break;
                default:
                    throw new IllegalArgumentException("Nem megfelelő irány");
            }
        }
        return position;
    }
}
