public class MaterialTester
{
  public static void main(String[] args)
  {
    Material Aluminium = new Material(69e12, .33);
    double[][] StressTensor = new double[6][6];
    StressTensor = Aluminium.StressTensorIsotropic3D();
    for(int i = 0; i < 6; i++)
    {
      for(int j = 0; j < 6; j++)
      {
        StdOut.print(StressTensor[i][j] + " ");
      }
      StdOut.println();
    }
  }
}