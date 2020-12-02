package week06day03;

public class WordEraser {
    public String eraseWord(String text, String word){
        StringBuilder erasedText = new StringBuilder();
        String[] splittedText = text.split(" ");
        for (String i: splittedText){
            if (!i.equals(word)) {
                erasedText = erasedText.append(i).append(" ");
            }
        }
        return erasedText.toString().trim();
    }

}
