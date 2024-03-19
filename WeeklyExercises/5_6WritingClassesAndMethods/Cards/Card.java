import java.util.Random;

public class Card {
    private static final String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private static final String[] cardNumbers = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private final String suit;
    private final String cardNumber;

    public Card(String suit, String cardNumber){
        this.suit = suit;
        this.cardNumber = cardNumber;
    }

    public String getSuit(){
        return suit;
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public static Card generateRandomCard(){
        Random random = new Random();
        String randomSuit = suits[random.nextInt(suits.length)];
        String randomCardNumber = cardNumbers[random.nextInt(cardNumbers.length)];
        return new Card(randomSuit, randomCardNumber);
    }
}