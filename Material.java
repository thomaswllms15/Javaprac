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
  
  public double G()
  { // return the shear modulus G
    return (E / (2 * (1 + mu)));
  }
  
  public double K()
  { //return the bulk modulus K
    return (E / (3 * (1 - 2 * mu)));
  }
  
  public double[][] StressTensorIsotropic3D()
  {//Generate Stress Tensor for isotropic material, 3 directional (cartesian)
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
  
  public double[] sigma(double[] strain)
  {
    if(strain.length != 6)
    {
      throw new RuntimeException("Stress Vector not long enough!");
    }
    
    double[][] tensor = this.StressTensorIsotropic3D();
    double[] sigma = new double[6];
    double sum = 0.0;
    
    for (int i = 0; i < 3; i++)
    {
      for(int j = 0; j < 6; j++)
      {
        sum += tensor[i][j]*strain[j];
      }
      sigma[i] = sum;
    }

    for (int i = 3; i < 6; i++)
    {
      for(int j = 0; j < 6; j++)
      {
        sum += tensor[i][j]*strain[j];
      }
      sigma[i] = 0.5 * sum;
    }
    return strain;
  }
}