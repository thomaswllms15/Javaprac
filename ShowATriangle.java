public class ShowATriangle
{
  public static void drawTriangle(double x0, double y0,
                                  double x1, double y1,
                                  double x2, double y2)
  { //function to calculate square root
    StdDraw.line(x0, y0, x1, y1);
    StdDraw.line(x1, y1, x2, y2);
    StdDraw.line(x2, y2, x0, y0);
  }
  
  public static void main(String[] args)
  { //Read in coordinates
    double[] Xcoordinates = new double[3];
    double[] Ycoordinates = new double[3];
    for (int i = 0; i < 3; i++){
      //Write in the double values you want roots for an assign them to their respective array.
      StdOut.println("Register the x coodinate: " + i);
      Xcoordinates[i] = StdIn.readDouble();
      StdOut.println("Register the y coodinate: " + i);
      Ycoordinates[i] = StdIn.readDouble(); 
    }
    //pull doubles
    double X0 = Xcoordinates[0];
    double X1 = Xcoordinates[1];
    double X2 = Xcoordinates[2];
    double Y0 = Ycoordinates[0];
    double Y1 = Ycoordinates[1];
    double Y2 = Ycoordinates[2];
    
    //draw triangle
    drawTriangle(X0, Y0, X1, Y1, X2, Y2);
  }
}