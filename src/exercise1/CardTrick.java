
package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Sujal Rabari 6/2/2024
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }

        System.out.println("Pick a card (value 1-13, suit 1-4):");
        int userValue = scanner.nextInt();
        int userSuit = scanner.nextInt();

        boolean found = false;
        for (Card card : hand) {
            if (card.getValue() == userValue && card.getSuit().equals(Card.SUITS[userSuit - 1])) {
                found = true;
                printInfo();
                break;
            }
        }

        if (!found) {
            System.out.println("Sorry, your card is not in the hand.");
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Sujal Rabari 6/2/2024
     */
    private static void printInfo() {
        // I'm done!
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Sujal Rabari.");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Become a proficient software developer");
        System.out.println("-- Contribute to open-source projects");
        System.out.println("-- Pursue higher education in computer science");

        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Reading");
        System.out.println("-- Playing guitar");
        System.out.println("-- Hiking");
        System.out.println("-- Cooking");

        System.out.println();
    }
}

