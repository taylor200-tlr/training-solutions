package ioreadstring;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {
    @Test
    public void testFilemanager(){
        FileManager fileManager = new FileManager();
        List<Human> humans = fileManager.readFromFile();
        assertEquals("TóthZsazsa", humans.get(0).getFirstName() + humans.get(1).getLastName());
    }

}