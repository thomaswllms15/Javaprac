public class FourierSpikes
{
  public static void DrawGraph(double[] t, double[] x)
  {
    StdDraw.setXscale(0, Math.PI);
    StdDraw.setYscale(-1, 1);
    for (int i = 1; i <= 499; i++){
      StdDraw.line(t[i-1], x[i-1], t[i], x[i]);
    }
  }
  
  public static void main(String[] args){
    int N = Integer.parseInt(args[0]);
    double[] t = new double[500];
    double tval = -10;
    
    //generate time array
    for(int i = 0; i <= 499; i++){
      t[i] = tval;
      tval += .04;
    }
    
    //generate cosine data for fourier series
    double[]x = new double[500];
    for (int i = 0; i <= 499; i++){
      for(int j = 1; j <= N; j++){
        double value =+ Math.cos(j*t[i]);
        x[i] = value;
      }
      x[i] = x[i] / N;
    }
    
    DrawGraph(t,x);
  }
}
      
  