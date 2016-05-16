public class Vector3D
  
  //Add cross product to api
{
  private final double[] coords;
  
  public Vector3D(double[] a)
  {
    coords = new double[a.length];
    if (a.length != 3){
      throw new RuntimeException("Vector is not of length 3!");
    }
    for(int i = 0; i < a.length; i++)
    {
      coords[i] = a[i];
    }
  }
  
  public Vector3D plus(Vector3D b)
  {
    if(coords.length != b.coords.length)
    {
      throw new RuntimeException("Vector lengths are not of equal dimensions.");
    }
    double[] c = new double[coords.length];
    for (int i = 0; i < coords.length; i++){
      c[i] = coords[i] + b.coords[i];
    }
    return new Vector3D(c);
  }
  
  public Vector3D times(double t)
  {
    double[] c = new double[coords.length];
    for (int i = 0; i < coords.length; i++)
    {
      c[i] = t * coords[i];
    }
    return new Vector3D(c);
  }
  
  public double dot(Vector3D b)
  {
    double sum = 0.0;
    for(int i =0; i < coords.length; i++)
    {
      sum = sum + (coords [i] * b.coords[i]);
    }
    return sum;
  }
  
  public double magnitude()
  {
    return Math.sqrt(this.dot(this));
  }
  
  public Vector3D direction()
  {
    return this.times(1/this.magnitude());
  }
  
  public double cartesian(int i)
  {
    return coords[i];
  }
}