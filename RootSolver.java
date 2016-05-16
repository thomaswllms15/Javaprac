public class RootSolver
{
  public static double function(double x)
  { 
    //test function to solve roots for
    return -1*Math.pow(x,3) - 1;
  }
  
  
  public static double fprime(double x)
  { //test derivative
    return -3 * Math.pow(x,2);
  }
  
  public static double NewtonRaphson(double xi, double error)
  {
   double fx = function(xi);
   double dfx = fprime(xi);
   double x_new = xi - (fx / dfx);

   while(Math.abs((x_new - xi)/ x_new ) > error)
   {
     xi = x_new;
     fx = function(xi);
     dfx = fprime(xi);
     x_new = xi - (fx / dfx);
   }
   return x_new;
  }
  
  public static double Bisection(double xl, double xh, double error)
  {
    if (function(xl)*function(xh) >=0)
    {
      throw new RuntimeException("Roots do not change sign over the interval!");
    }
  
    double xr = (xl + xh) / 2;
    double a = function(xl);
    double b = function(xh);
    
    while(Math.abs(a*b) > error)
    {
      if (a*b < 0)
      {
        xh = xr;
        xr = (xl + xh) / 2;
      }
      else if (a*b > 0)
      {
        xl = xr;
        xr = (xl + xh) / 2;
      }
      a = function(xl);
      b = function(xh);
      StdOut.println(a*b);
    }
    
    return xr;
  }
  
  public static double FalsePosition(double xl, double xh)
  {
    return (xh - function(xh)*(xl - xh) / (function(xl) - function(xh)));
  }
  
  public static void main(String[] args)
  {    
    double root = NewtonRaphson(3.8, 0.1);
    StdOut.println(root);
  }
}