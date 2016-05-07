public class StdDevUnitTests
{
  public static void main(String[] args)
  {
    StdOut.println(StdRandom.uniform(100));
    StdOut.println(StdRandom.uniform(10.0, 99.0));
    StdOut.println(StdRandom.bernoulli(0.5));
    StdOut.println(StdRandom.gaussian(9.0, 0.2));
    
    //Plot data as another test
    int N = Integer.parseInt(args[0]);
    for(int i = 0; i < N; i++){
      double x = StdRandom.gaussian(0.5, 0.2);
      double y = StdRandom.gaussian(0.5, 0.2);
      StdDraw.point(x,y);
    }
  }
}
      