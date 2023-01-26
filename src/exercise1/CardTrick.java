package exercise1;
import java.util.*;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * editied by Alfin J
 * This is a branch
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++)
        {
            Card Randomcard = new Card();
            Randomcard.setValue((int)(1+Math.random()*13));
            //card.setValue(insert call to random number generator here)
            
            Randomcard.setSuit(Card.SUITS[(int)(0+Math.random()*3)]);
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            hand[i] = Randomcard;
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            System.out.println(hand[i].getValue()+" "+hand[i].getSuit());
            //       Don't worry about duplicates at this point
        }
        
        Card UserCard = new Card();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number from 1-13(11 for Jack,12 for Queen, 13 for King) : ");
        UserCard.setValue(inp.nextInt());
        
        Scanner inp2 = new Scanner(System.in);
        System.out.println("Enter a for Card Suit (Hearts, Diamonds, Spades, Clubs) !Caution:Enter the names as given in the line! : ");
        UserCard.setSuit(inp2.nextLine());
        
        System.out.println(UserCard.getValue()+ " " +UserCard.getSuit());//this line print the users card
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        // 1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        
        boolean a = false;
        for(int i = 0; i< hand.length; i++)// this for loop checks the user inputed card to the random generated card 
        {
            if(UserCard.getValue()== hand[i].getValue() && UserCard.getSuit().equals(hand[i].getSuit())){
                a = true;
            }
            else continue;
        }
        
        if(a)// if a match  is found it will do this validation
        {
            System.out.println("Match found");
            printInfo();
        }
        else
        {
            System.out.println("No Match");//no match is found this validation is used
        }
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}


