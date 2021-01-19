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
        diary.newMark(file, 5);


    }
}