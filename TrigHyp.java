public class TrigHyp
{
  public static double sinh(double x)
  {
    return (Math.exp(x) - Math.exp(-x)) / 2;
  }
  
  public static double cosh(double x)
  {
    return (Math.exp(x) + Math.exp(-x)) / 2;
  }
  
  public static double tanh(double x)
  {
    return sinh(x) / cosh(x);
  }
  
  public static double csch(double x)
  {
    return 1 / sinh(x);
  }
  
  public static double sech(double x)
  {
    return 1 / cosh(x);
  }
  
  public static double coth(double x)
  {
    return 1 / coth(x);
  }
  
  public static void main(String[] args)
  {}
}
  