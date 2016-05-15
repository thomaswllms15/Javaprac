public class Quarternion
{
  private double a_0;
  private double a_1;
  private double a_2;
  private double a_3;
  
  public Quarternion(double a0, double a1, double a2, double a3)
  {
    a_0 = a0;
    a_1 = a1;
    a_2 = a2;
    a_3 = a3;
  }
  
  public double Magnitude()
  {
    return Math.sqrt(Math.pow(a0,2) + Math.pow(a1,2) + Math.pow(a2,2) + Math.pow(a3,2));
  }