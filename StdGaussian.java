public class StdGaussian
{
  public static double main(String[] args)
  {
    double u = Math.random();
    double v = Math.random();
    double w = Math.sin(2*(Math.PI)*v)*Math.pow((-2*Math.log(u)),.5);
    return w;
  }
}
    