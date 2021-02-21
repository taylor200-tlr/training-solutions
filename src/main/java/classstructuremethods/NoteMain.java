package classstructuremethods;

public class NoteMain {

    public static void main(String[] args) {
        Note note = new Note();
        note.setName("Jane");
        note.setTopic("SQL lekérdezés");
        note.setText("SELECT Capital_City, CC_Population FROM Countries");

        System.out.println(note.getNoteText());
    }
}
