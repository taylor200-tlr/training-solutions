package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
    @Test
    public void testCharacter() {
        Character winner;
        Point archerPoint = new Point(1, 1);
        Point axeWarriorPoint = new Point(2, 2);
        Random random = new Random();

        Character archer = new Archer(archerPoint, random);
        Character warrior = new AxeWarrior(axeWarriorPoint, random);

        //winner = new BattleField().fight(archer, warrior);
        System.out.println(archer.getHitPoint());
        System.out.println(warrior.getHitPoint());

    }

}