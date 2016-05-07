public class Gaussian
{ //Implement normal Gaussian distribution functions
  public static double phi(double x)
  { //normal density function
    return Math.exp(-x*x/2) / Math.sqrt(2*Math.PI);
  }
  
  public static double phi(double x, double mu, double sigma)
  {
    return phi((x-mu)/sigma)/sigma;
    
  }
  
  public static double Phi(double z)
  { //cumulative density function
    if (z < -8.0) return 0.0;
    if (z > 8.0) return 1.0;
    double sum = 0.0;
    double term = z;
    for (int i = 3; sum != sum + term; i += 2)
    {
      sum = sum + term;
      term = term * z * z / i;
    }
    return (0.5 + phi(z) * sum);
  }
  
  public static double Phi(double z, double mu, double sigma)
  {
    return Phi((z - mu) / sigma);
  }
  
  public static void main(String[] args)
  {}
}
  