public class Quadratic
{
  public static void main(String[] args)
  {
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);
    if(a == 0){
      System.out.println("Cannot Solve: a = 0");
    }
    double discriminant = b*b - 4.0*a*c;
    if(discriminant < 0)
    {
      System.out.println("Discriminant is nonzero!");
    }
    if(discriminant >= 0){
    double d = Math.sqrt(discriminant);
    System.out.println((-b + d) / (2.0*a));
    System.out.println((-b - d) / (2.0*a));
    }
  }
}