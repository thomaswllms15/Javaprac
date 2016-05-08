public class Matrix
{
  public static double dot(double[]a, double[]b)
  {
    if( a.length == b.length){
      System.out.println("Vectors of Unequal Length!");
    }
    double sum = 0.0;
    for (int i = 0; i < a.length; i++)
    {
      sum += a[i]*b[i];
    }
    return sum;
  }
  
  public static double norm(double[] a)
  {
    double sum = 0.0;
    for(int i = 0; i < a.length; i++)
    {
      sum += a[i]*a[i];
    }
    return Math.sqrt(sum);
  }
  
  public static double dotAngle(double[]a, double[]b)
  {
    return Math.acos(dot(a, b)/(norm(a)*norm(b)));
  }
  
  public static double[][] transpose(double[][] a)
  {
    for (int i = 0; i < a.length; i++){
      for (int j = 0; j < a[0].length; j++)
      {
        a[i][j] = a[j][i];
      }
    }
    return a;
  }
  
  public static double[] multiply(double[][]a, double[] x)
  {
    double[] b = new double[a.length];
    for (int i = 0; i < a.length; i++)
    {
      for (int j = 0; j < x.length; j++)
      {
        b[i] = a[i][j]*x[j];
      }
    }
    return b;
  }
  
  public static double[] multiply(double[] x, double[][] a)
  {
    double[]b = new double[x.length];
    for (int i = 0; i < x.length; i++)
    {
      for (int j = 0; j < a.length; j++)
      {
        b[i] = x[i]*a[i][j];
      }
    }
    return b;
  }
  
  public static void main(String[] args)
  {}
}