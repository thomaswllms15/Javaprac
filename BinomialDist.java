public class BinomialDist
{
  public static int Factorial(int N)
  {
    int returnfactor = 1;
    for (int i = 1; i <= N; i++){
      returnfactor *= i;
    }
    return returnfactor;
  }
  
  public static double binomial(int N, int k, double p)
  {
    double x = Math.log(((Math.pow(p,k))*Math.pow(1-p,(N-k))*Factorial(N))/(Factorial(k)*Factorial(N-k)));
    return Math.exp(x);
  }
  
  public static void main(String[] args)
  {
    int N = Integer.parseInt(args[0]);
    double p = Double.parseDouble(args[1]);
    double sum = 0.0;
    
    //Validate that for all k values from (0,N) sum to 1
    for (int k = 0; k <= N; k++){
      sum += binomial(N,k,p);
      StdOut.println("Sum of all K values is = " + sum);      
    }        
  }
}

                   