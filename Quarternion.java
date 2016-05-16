public class Quarternion
{
  private double a0;
  private double a1;
  private double a2;
  private double a3;
  
  public Quarternion(double a_0, double a_1, double a_2, double a_3)
  {
    a0 = a_0;
    a1 = a_1;
    a2 = a_2;
    a3 = a_3;
  }
  
  public double Magnitude()
  {
    return Math.sqrt(Math.pow(a0,2) + Math.pow(a1,2) + Math.pow(a2,2) + Math.pow(a3,2));
  }
  
  public Quarternion Conjugate()
  {
    return new Quarternion(-1*a0, -1*a1, -1*a2, -1*a3);
  }
  
  public Quarternion Inverse()
  {
    double mag = Math.sqrt(Math.pow(a0,2) + Math.pow(a1,2) + Math.pow(a2,2) + Math.pow(a3,2));
    return new Quarternion(a0/mag, -1*a1/mag, -1*a2/mag, -1*a3/mag);
  }
  
  public Quarternion Sum(Quarternion b)
  {
    return new Quarternion(a0 + b.a0, a1 + b.a1, a2 + b.a2, a3 + b.a3);
  }
  
  public Quarternion Product(Quarternion b)
  {
    return new Quarternion(a0 * b.a0 - a1 * b.a1 - a2 * b.a2 - a3 * b.a3,
                           a0 * b.a1 - a1 * b.a0 + a2 * b.a3 - a3 * b.a2,
                           a0 * b.a2 - a1 * b.a3 + a2 * b.a0 + a3 * b.a1,
                           a0 * b.a3 + a1 * b.a2 - a2 * b.a1 + a3 * b.a0);
  }
  
  public Quarternion Quotient(Quarternion b)
  {
    Quarternion flipped = b.Inverse();
    return Product(flipped);
  }
  
  
  public static void main(String[] args)
  {
    Quarternion a = new Quarternion(1,1,1,1);
    Quarternion b = new Quarternion(1,1,1,1);
    
    Quarternion c = a.Product(b);

  }
}
