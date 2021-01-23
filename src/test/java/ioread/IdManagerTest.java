package ioread;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdManagerTest {
    IdManager idManager = new IdManager();

    @Test
    void readIdsFromFile() {
        idManager.readIdsFromFile("idnumbers.txt");
        System.out.println(idManager.getIds());
    }
}