import java.awt.Color;

public class RotationFilter
{
  public static void main(String[] args)
  {
    Picture pic = new Picture(args[0]);
    int angle = Integer.parseInt(args[1]);
    double angle_radians = Math.toRadians(angle);
    int cx = pic.width() / 2 ;
    int cy = pic.height() / 2 ;
    
    Picture pic_rotated = new Picture(2*pic.width(), 2*pic.height());
    for (int x = 0; x < pic.width(); x++){
      for (int y = 0; y < pic.height(); y++){
        int tx = (int) ((x - cx) * Math.cos(angle_radians) - (y - cy) * Math.sin(angle_radians) + cx
                       + pic.width()/2);
        int ty = (int) ((x - cx) * Math.sin(angle_radians) + (y - cy) * Math.cos(angle_radians) + cy 
                       + pic.height()/2);
        
        pic_rotated.set(tx,ty,pic.get(x,y));
      }
    }
    pic_rotated.show();
  }
}