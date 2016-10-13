public class StringToInt
{
  public static int caster(String t)
  {
    int r = 0;
    //throw exception if t > 1 length
    if (t.equals("1")){r = 1;}
    else if (t.equals("2")){r = 2;}
    else if (t.equals("3")){r = 3;}
    else if (t.equals("4")){r = 4;}
    else if (t.equals("5")){r = 5;}
    else if (t.equals("6")){r = 6;}
    else if (t.equals("7")){r = 7;}
    else if (t.equals("8")){r = 8;}
    else if (t.equals("9")){r = 9;}
    
    return r;
  }
  
  public static int converter(String t)
  {
    int sum = 0;
    int digitval = 0;
    int powerplace = 0;
    int j = 0;
    //throw exception here for when it's not digits.
    while(j < t.length())
    {
      for(int i = (t.length() - 1); i >= 0; i--)
      {
        digitval = caster(t.substring(i,i+1));
        powerplace = (int) Math.pow(10, j);
        sum += digitval * powerplace;
        j++;
      }
    }
    return sum;
  }
  
  public static void main(String[] args)
  {
    String t = "1023";
    int R = converter(t);
    System.out.println(R + 1);
  }
}
