public class Neuron
{
  private double[] input;
  
  public Neuron(In in)
  {
    for (int i = 0; i < input.length; i++)
    {
      input[i] = in.readDouble();
    }
  }
  
  public double z()
  {
    double[] w = new double[input.length];
    double z = 0.0;
    for(int i = 0; i < input.length; i++)
    {
      z += w[i]*input[i];
    }
    return z;
  }
  
  public int trigger()
  {
    if (this.z() >= 0)
    {
      return 1;
    }
    else 
      return -1;
  }
}
