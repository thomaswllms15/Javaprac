import java.awt.Color;

public class ColorChannelPlots
{
  public static void main(String[] args)
  {
    Picture pic = new Picture(args[0]);
    Picture pic_red = new Picture(pic.width(), pic.height());
    Picture pic_green = new Picture(pic.width(), pic.height());
    Picture pic_blue = new Picture(pic.width(), pic.height());
    for (int x = 0; x < pic.width(); x++){
      for (int y = 0; y < pic.height(); y++){
        Color color = pic.get(x,y);
        Color green = Luminance.toGreen(color);
        Color red = Luminance.toRed(color);
        Color blue = Luminance.toBlue(color);
        
        pic_red.set(x,y,red);
        pic_green.set(x,y,green);
        pic_blue.set(x,y,blue);

      }
    }
    
    pic_red.show();
    pic_green.show();
    pic_blue.show();
  }
}