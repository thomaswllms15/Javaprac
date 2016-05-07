public class StdStats
{
  public static double max(double[] a)
  {
    double max = Double.NEGATIVE_INFINITY;
    for (int i = 0; i < a.length; i++)
    {
      if (a[i] > max){
        max = a[i];
      }
    }
    return max;
  }
  
  public static double min(double[] a)
  {
    double min = Double.POSITIVE_INFINITY;
    for (int i = 0; i < a.length; i++)
    {
      if (a[i] < min)
      {
        min = a[i];
      }
    }
    return min;
  }
  
  public static double mean(double[] a)
  {
    double sum = 0.0;
    for (int i = 0; i < a.length; i++){
      sum += a[i];
    }
    return sum / a.length;
  }
  
  public static double var(double[] a)
  {
    double avg = mean(a);
    double sum = 0.0;
    for (int i = 0; i < a.length; i++)
    {
      sum += (a[i] - avg) * (a[i] - avg);
    }
    return sum / (a.length - 1);
  }
  
  public static double stddev(double[] a)
  {
    return Math.sqrt(var(a));
  }
  
  public static void plotPoints(double[] a)
  {
    int N = a.length; 
    StdDraw.setXscale(0, N-1);
    StdDraw.setPenRadius(1/(3.0*N));
    for (int i = 0; i < a.length; i++)
    {
      StdDraw.point(i, a[i]);
    }
  }
  
  public static void plotLines(double[] a)
  {
    int N = a.length; 
    StdDraw.setXscale(0, N-1);
    StdDraw.setPenRadius();
    for (int i = 1; i < a.length; i++)
    {
      StdDraw.line(i-1, a[i-1], i, a[i]);
    }
  }
  
  public static void plotBars(double[] a)
  {
    int N = a.length; 
    StdDraw.setXscale(0, N-1);
    StdDraw.setPenRadius(0.5/N);
    for (int i = 0; i < a.length; i++)
    {
      StdDraw.line(i, 0, i , a[i]);
    }
  }
  
  public static void main(String[] args)
  {
  }
}