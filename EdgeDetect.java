import java.awt.Color;

public class EdgeDetect
{
  public static void main(String[] args)
  {
    Picture pic = new Picture(args[0]);
    
    for (int x = 0; x < pic.width(); x++){
      for (int y = 0; y < pic.height(); y++){
        Color a = pic.get(x,y);
        Color b = pic.get(Math.abs(x-1),Math.abs(y-1));
        Color edge = Luminance.EdgeDetect(a,b);
        pic.set(x,y,edge);
      }
    }
    pic.show();
  }
}