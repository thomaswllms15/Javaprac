public class QuickStats
{
  public static double mean(double[] a)
  { //Calculates mean
    double sum = 0.0;
    for (int i = 0; i < a.length; i++)
    {
      sum = sum + a[i];
    }
    return sum / a.length;
  }
  
  public static double StdDev(double[] a)
  { //calculates population standard deviation
    double sum = 0.0;
    double avg = mean(a);
    for (int i = 0; i < a.length; i++){
      double value = Math.pow((a[i] - avg), 2);
      sum = sum + value;
    }
    return Math.sqrt(sum/a.length);
  }
  
  public static double SampleVar(double[] a)
  { //Calculates sample variance
    double sum = 0.0;
    double avg = mean(a);
    for (int i = 0; i < a.length; i++){
      double value = Math.pow((a[i] - avg), 2);
      sum = sum + value;
    }
    return Math.sqrt(sum/a.length);
  }
  
  public static void main(String[] args)
  { 
    int N = Integer.parseInt(args[0]);
    double[] a = new double[N];
    StdOut.println("Read In Values For Mean");
    for (int i = 0; i < N; i++){
      a[i] = StdIn.readDouble();
    }
    
    double avg = mean(a);
    StdOut.println("Mean = " + avg);
    
    double stddev = StdDev(a);
    StdOut.println("Standard Dev (population) = " + stddev);
  }
}