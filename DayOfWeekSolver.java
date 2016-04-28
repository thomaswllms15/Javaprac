public class DayOfWeekSolver
{
  public static void main(String[] args)
  {
    int M = Integer.parseInt(args[0]);
    int D = Integer.parseInt(args[1]);
    int Y = Integer.parseInt(args[2]);
    int y0 = Y - (14 - M)/12;
    int x = y0 + y0/4 - y0/100 + y0/400;
    int m0 = M + 12 * ((14 - M)/12) - 2;
    int d0 = (D + x + (31*m0)/12) % 7;
    if (d0 == 1) { System.out.println("Monday");}
    if (d0 == 2) { System.out.println("Tuesday");}
    if (d0 == 3) { System.out.println("Wednesday");}
    if (d0 == 4) { System.out.println("Thursday");}
    if (d0 == 5) { System.out.println("Friday");}
    if (d0 == 6) { System.out.println("Saturday");}
    if (d0 == 7) { System.out.println("Sunday");}
  }
}