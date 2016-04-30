public class MatrixProductBool
{
  public static void main(String[] args)
  {
    int N = Integer.parseInt(args[0]);
    boolean[][] a = new boolean[N][N];
    boolean[][] b = new boolean[N][N];
    boolean[][] c = new boolean[N][N];
    
    
    //populate arrays to test
    for (int i = 0; i < N; i++){
      for (int j = 0; j < N; j++){
        double r = Math.random();
        System.out.println(r);
        //generate random matrix to test
        if (r > 0.5)
        {
          a[i][j] = true;
        }
        if (r > 0.5){
          b[i][j] = true;
        }
      }
    }
    
    //Compute the product of the two; return answer in boolean form
    //use || instead of + and && operation instead of *
    boolean Value;
    for (int i = 0; i < N; i++){
      for (int j = 0; j < N; j++){
        for (int k = 0; k < N; k++){
          Value = a[i][k] && b[k][j];
          c[i][j] = c[i][j] || Value;
        }
        System.out.print(c[i][j]);
      }
      System.out.println();
    }
  }
}
    