public class Punctuation {
    public static void main(String[] args) {
        String sentence = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";
        int[] punctuationCount = new int[256];

        for (char character : sentence.toCharArray())
            if (!Character.isLetterOrDigit(character))
                punctuationCount[character]++;

        System.out.println("Punctuation Mark\tOccurrences");
        System.out.println("----------------\t------------");
        for (int i = 0; i < punctuationCount.length; i++)
            if (punctuationCount[i] > 0 && !Character.isLetterOrDigit((char) i))
                System.out.println((char) i + "\t\t\t\t\t" + punctuationCount[i]);
            }
        }


