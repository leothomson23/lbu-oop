public class Main {
    public static void main(String[] args) {
        System.out.println("Your 5 random cards are...\n");
        for (int i = 0; i < 5; i++) {
            Card randomCard = Card.generateRandomCard();
            System.out.println("Card Number " + (i+1) + ": " + randomCard.getCardNumber() + " of " + randomCard.getSuit());
        }
    }
}