public class StdRandom
{
  public static int uniform(int N)
  {
    return (int) (Math.random()*N);
  }
  
  public static double uniform(double lo, double hi)
  { // return a double of Low + (random) * (High - Low)
    return lo + Math.random()*(hi-lo);
  }
  
  public static boolean bernoulli(double p)
  {//Return T/F with probability less than p
    return Math.random() < p;
  }
  
  public static double gaussian()
  { //normal, mean = 0, stdev = 1
    double r,x,y;
    do
    {
      x = uniform(-1.0, 1.0);
      y = uniform(-1.0, 1.0);
      r = x*x + y*y;
    }
    while (r >= 1 || r ==0);
    return x * Math.sqrt(-2 * Math.log(r) / r);
  }
  
  public static double gaussian(double m, double s)
  { //random number with mean m and standard dev s
    return m + s * gaussian();
  }
  
  public static int discrete(double[] a)
  {
    double r = uniform(0.0, 1.0);
    double sum = 0.0;
    for (int i = 0; i < a.length; i++)
    {
      sum += a[i];
      if (sum > r)
      {
        return i;
      }
    }
    return a.length - 1;
  }
  
  public static double[] shuffle(double[] a)
  {
    for (int i = 0; i < a.length; i++)
    {
      a[i] = StdIn.readInt();
    }
    for(int i = 0; i < a.length; i++){
      int r = i + (int) (Math.random() * (a.length-i));
      a[i] = a[r];
    }
    return a;
  }
  public static void main(String[] args)
  {}
}
    