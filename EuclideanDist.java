public class EuclideanDist
{
  public static void main(String[] args)
  {
    int N = Integer.parseInt(args[0]);
    double[] a = new double[N];
    double[] b = new double[N];
    double[] c = new double[N];
    double sum = 0.0;
    
    
    //I'm just going to calculate a distance between two random variables
    for (int i = 0; i < a.length; i++){
      a[i] = Math.random();
      b[i] = Math.random();
      c[i] = 0.0;
      c[i] += (a[i] - b[i])*(a[i] - b[i]);
      sum += c[i];
      }
    double distance = Math.sqrt(sum);
    System.out.println("Distance = " + distance);
  }
}
        