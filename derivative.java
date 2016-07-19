public class derivative
{
  public static double[] differentiate(double x[], double y[])
  {
    int N = x.length;
    double[] dydx = new double[N];
    
    for(int i = 0; i < (N-1); i++)
    {
      dydx[i] = (y[i+1] - y[i]) / (x[i+1] - x[i]); 
    }
    //populate the last digit with some bullshit
    
    return dydx;
  }
}