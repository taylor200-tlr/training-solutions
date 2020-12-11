package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {
    private Point position;
    private int hitPoint = 100;
    private Random random;

    public boolean isAlive() {
        return hitPoint > 0;
    }

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRandom() {
        return random;
    }

    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
    }

    protected int getActualPrimaryDamage() {
        return random.nextInt(10) + 1;
    }
    private int getActualDefence(){
        return random.nextInt(6);
    }
    protected void hit(Character enemy, int damage){

    }
    private void decreaseHitPoint(int diff){
        hitPoint -= diff;
    }
    public void primaryAttack(Character enemy){
        hit(enemy, getActualPrimaryDamage());
    }
    abstract public void secondaryAttack(Character enemy);
}
