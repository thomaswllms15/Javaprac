public class StdArrayIO
{
  public static double[] readDouble1D()
  {
    int N = StdIn.readInt();
    double[] a = new double[N];
    for (int i = 0; i < N; i++){
      a[i] = StdIn.readDouble();
    }
    return a;
  }
  
  public static double[][] readDouble2D()
  {
    int M = StdIn.readInt();
    int N = StdIn.readInt();
    double[][] a = new double[M][N];
    for(int i = 0; i < M; i++){
      for(int j = 0; j < N; j++){
        a[i][j] = StdIn.readDouble();
      }
    }
    return a;
  }
  
  public static void print(double[] a)
  {
    int N = a.length;
    System.out.println(N);
    for (int i = 0; i < N; i++)
    {
      StdOut.println(a[i] + " ");
    }
  }
  
  public static void print(double[][] a)
  {
    int M = a.length;
    int N = a[0].length;
    System.out.println(M + " " + N);
    for (int i = 0; i < M; i++)
    {
      for (int j = 0; j < N; j++)
      {
        StdOut.println(a[i][j] + " ");
      }
      StdOut.println();
    }
    StdOut.println();
  }

    public static int[] readInteger1D()
  {
    int N = StdIn.readInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++){
      a[i] = StdIn.readInt();
    }
    return a;
  }
  
  public static int[][] readInteger2D()
  {
    int M = StdIn.readInt();
    int N = StdIn.readInt();
    int[][] a = new int[M][N];
    for(int i = 0; i < M; i++){
      for(int j = 0; j < N; j++){
        a[i][j] = StdIn.readInt();
      }
    }
    return a;
  }
  
  public static void print(int[] a)
  {
    int N = a.length;
    System.out.println(N);
    for (int i = 0; i < N; i++)
    {
      StdOut.println(a[i] + " ");
    }
  }
  
  public static void print(int[][] a)
  {
    int M = a.length;
    int N = a[0].length;
    System.out.println(M + " " + N);
    for (int i = 0; i < M; i++)
    {
      for (int j = 0; j < N; j++)
      {
        StdOut.println(a[i][j] + " ");
      }
      StdOut.println();
    }
    StdOut.println();
  }
  
    public static boolean[] readBoolean1D()
  {
    int N = StdIn.readInt();
    boolean[] a = new boolean[N];
    for (int i = 0; i < N; i++){
      a[i] = StdIn.readBoolean();
    }
    return a;
  }
  
  public static boolean[][] readBoolean2D()
  {
    int M = StdIn.readInt();
    int N = StdIn.readInt();
    boolean[][] a = new boolean[M][N];
    for(int i = 0; i < M; i++){
      for(int j = 0; j < N; j++){
        a[i][j] = StdIn.readBoolean();
      }
    }
    return a;
  }
  
  public static void print(boolean[] a)
  {
    int N = a.length;
    System.out.println(N);
    for (int i = 0; i < N; i++)
    {
      StdOut.println(a[i] + " ");
    }
  }
  
  public static void print(boolean[][] a)
  {
    int M = a.length;
    int N = a[0].length;
    System.out.println(M + " " + N);
    for (int i = 0; i < M; i++)
    {
      for (int j = 0; j < N; j++)
      {
        StdOut.println(a[i][j] + " ");
      }
      StdOut.println();
    }
    StdOut.println();
  }
  
  public static void main(String[] args)
  { print(readDouble2D()); }
}
    
    