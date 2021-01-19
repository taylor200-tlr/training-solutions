package iowritestring.school;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    private Diary diary = new Diary();
    Path file = Path.of("src", "main", "resources");

    @Test
    void newMark() {
        diary.newMark("Lajos", 4);
        diary.newMark("Zoli", 5);
        diary.newMark("Tamás", 3);
        diary.newMark("Norbi", 2);
        diary.newMark("Norbi", 3);
        diary.newMark("Norbi", 1);
        diary.newMark("Norbi", 4);
        diary.newMark("Norbi", 3);

        diary.average("Norbi");


    }
}