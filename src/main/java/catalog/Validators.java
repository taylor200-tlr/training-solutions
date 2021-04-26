package catalog;

import java.util.List;

public class Validators {
    private static final String ERROR_MESSAGE = "Argument must not be empty!";

    public static boolean isBlank(String text) {
        return (text.isBlank() || text == null);
    }

    public static boolean isEmpty(List<String> list) {
        return (list.isEmpty() || list == null);
    }
}
