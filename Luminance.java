import java.awt.Color;

public class Luminance
{
  public static double lum(Color color)
  { //compute luminiance of color
    int r = color.getRed();
    int g = color.getGreen();
    int b = color.getBlue();
    
    return .299*r + .587*g + .114*b;
  }
  
  public static Color toRed(Color color)
  {
    int r = color.getRed();
    Color red = new Color (r, 0, 0);
    return red;
  }
  
  public static Color toGreen(Color color)
  {
    int g = color.getGreen();
    Color green = new Color (0, g, 0);
    return green;
  }
  
  
  public static Color toBlue(Color color)
  {
    int b = color.getBlue();
    Color blue = new Color (0, 0, b);
    return blue;
  }
  
  public static Color toGray(Color color)
  {
    int y = (int) Math.round(lum(color));
    Color gray = new Color(y, y, y);
    return gray;
  }
  
  public static int GrayScaleValue(Color color){
    //return the integer of the grayscale value.
    int y = (int) Math.round(lum(color));
    return y;
  }
  
  public static boolean compatible(Color a, Color b)
  {
    return Math.abs(lum(a) - lum(b)) >= 128;
  }
  
  public static void main(String[] args)
  {
    int[] a = new int[6];
    for(int i = 0; i <6; i++){
      a[i] = Integer.parseInt(args[i]);
    }
    Color c1 = new Color(a[0], a[1], a[2]);
    Color c2 = new Color(a[3], a[4], a[5]);
    
    StdOut.println(compatible(c1,c2));
  }
}
    