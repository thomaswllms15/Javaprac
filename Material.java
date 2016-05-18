public class Material
{
  //Put in as many equations as you can using these sole properties of the material
  private final double E; // Youngs Modulus (stress to strain ratio)
  private final double mu; // Poisson Ratio (axial to traverse strain ratio)
  
  public Material(double young_mod, double mu_ratio)
  {
    E = young_mod;
    mu = mu_ratio;
  }
  
  public double[][] StressTensorIsotropic3D()
  {
    //read in an input a stress vector sigma, generate stress tensor,
    //output the strain matrix.
    double[][] s = new double[6][6];
    
    for (int i = 0; i < 3; i++)
    {
      for (int j = 0; j < 3; j++)
      {
        if (i == j)
        {
          s[i][j] = (E / ((1 + mu) * (1 - 2 * mu))) * (1 - mu);
        }
        else
        {
          s[i][j] = (E / ((1 + mu) * (1 - 2 * mu))) * mu;
        }
      }
      for (int j = 3; j < 6; j++)
      {
        s[i][j] = 0;
      }
    }
    
    for (int i = 3; i < 6; i++)
    {
      for (int j = 0; j < 3; j++)
      {
        s[i][j] = 0;
      }
      for (int j = 3; j < 6; j++)
      {        
        if (i == j)
        {
          s[i][j] = (E / ((1 + mu) * (1 - 2 * mu))) * ((1 - 2*mu) / 2);
        }
        else
        {
          s[i][j] = 0;
        }
      }
    }
    
    return s;
  }
}
  