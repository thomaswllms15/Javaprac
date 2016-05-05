public class Harmonic
{
  public static void main(String[] args)
  {
    int N = Integer.parseInt(args[0]);
    double sum = 0.0;
    double[] H = new double[N];
    for (int i = 1; i <= N; i++)
    {
      sum += 1.0/i;
      H[i-1] = H[i-1] + 1.0/i;
      System.out.println("Array Value at " + (i-1) + " " + H[(i-1)]);
    }
    System.out.println("Sum = " + sum);
  }
}