public class DiceRoller
{
  public static void main(String[] args)
  {
    //Look in Java's Math API to find the method you need. We need Random method
    double r = Math.random(); //Dice 1
    double r1 = Math.random(); //Dice 2
    
    //Case the random double from N to N-1 as a integer
    int n1 = (6 - (int)(6*r));
    int n2 = (6 - (int)(6*r1));
    int sum = n1+n2;
    
    System.out.println(n1 + " + " + n2 + " = " + sum);
  }
}