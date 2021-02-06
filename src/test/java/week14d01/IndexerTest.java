package week14d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IndexerTest {

    @Test
    void index() {
        List<String> names = Arrays.asList("Alajos", "Annamari", "Áron", "Imre", "Szabina", "Attila");
        Indexer indexer = new Indexer();
        System.out.println(indexer.index(names));
    }
}