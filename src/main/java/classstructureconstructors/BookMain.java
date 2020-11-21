package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {
        Book book1 = new Book("Viczián István", "Légy igazán pro java programozó");
        book1.register("1100220033");

        System.out.println(book1.getAuthor() + " - " +
                book1.getTitle() + " - regisztrációs szám: "+
                book1.getRegNumber());
    }
}
