public class UnitPotential
{
  public static Charge[] ChargeArray(int N){
    //N is number of charges
    Charge[] a = new Charge[N];
    for(int i = 0; i < N; i++){
      StdOut.println("Read in rx for Charge" + i);
      double rx = StdIn.readDouble();
      StdOut.println("Read in ry for Charge" + i);
      double ry = StdIn.readDouble();
      StdOut.println("Read in q0 for Charge" + i);
      double q0 = StdIn.readDouble();
      if (q0 < 0){
        System.out.println("Positive charges only you moron");
      }
      Charge c = new Charge(rx, ry, q0);
      a[i] = c;
    }
    return a;
  }
  
  public static Charge UnitCalculation(Charge[] c){
    //Returns minimum charge spot in a unit square
    double min = Double.POSITIVE_INFINITY;
    double x = 0;
    double y = 0;
    double x_location = 0.0;
    double y_location = 0.0;
    for (int i = 0; i < c.length; i++){
      while (x < 1){
        while (y < 1){
          double p = c[i].potentialAt(x,y);
          y = y + 0.01;
          if(p < min){
            min = p;
            x_location = x;
            y_location = y;
          }
          x = x + 0.01;
        }
      }
    }
    StdOut.println("Min: " + min);
    StdOut.println("X: " + x_location);
    StdOut.println("Y : " + y_location);
    Charge c_min = new Charge(x_location, y_location, min);
    return c_min;
  }
  public static void main(String[] args)
  {
    int N = Integer.parseInt(args[0]);
    Charge[] c = ChargeArray(N);
    Charge r = UnitCalculation(c);
  }
}