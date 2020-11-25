package week05d02;

public class ChangeLetter {
    char [] vowelLetters = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
    public String changeVowels(String text){
        for (Character letter: vowelLetters){
            text = text.replace(letter, '*');
        }
        return text;
    }
}
