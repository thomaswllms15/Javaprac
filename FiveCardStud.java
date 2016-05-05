public class FiveCardStud
{
  public static void main(String[] args)
  {
    int Ncard = Integer.parseInt(args[0]);
    String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades" };
    String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
      "Jack", "Queen", "King", "Ace"} ;
    
    //Setting array value at Runtime
    //initialize array of size N
    String[] deck = new String[suit.length * rank.length];
    
    //Computing the values of the array to be stored
      for (int i = 0; i < suit.length; i++){
        for (int j = 0; j < rank.length; j++){
          deck[rank.length*i+j] = rank[j] + " of " + suit[i];
        }
      }
      
    //Shuffling the deck of cards
    int N = deck.length;
    for (int i = 0; i < N; i++){
      
      //Pick a random card
      int r = i + (int) (Math.random() * (N-i));
      
      // Swap the values for position i in the Array for this random number
      String t  = deck[i];
      deck[i] = deck[r];
      deck[r] = t;
    }
    for (int k = 0; k < Ncard; k++){
      System.out.println(deck[k]);
      System.out.println();
    }
  }
}