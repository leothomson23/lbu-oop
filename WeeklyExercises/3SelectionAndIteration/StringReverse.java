import java.util.Scanner;
import java.util.ArrayList;

public class StringReverse {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scan.nextLine();

        String words[] = sentence.split(" ");
        ArrayList<String> reversedWords = new ArrayList<>();

        for (int i = 0; i < words.length; i++)
            reversedWords.add(new StringBuilder(words[i]).reverse().toString());

        System.out.println("Reversed Sentence: " + String.join(" ", reversedWords));

        }
    }