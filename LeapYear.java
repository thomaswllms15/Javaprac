public class LeapYear
{
  public static void main(String[] args)
  {
    //Input year
    int year = Integer.parseInt(args[0]);
    
    //Conditionals to determine leap year
    boolean isLeapYear;
    isLeapYear = (year % 4 == 0);
    isLeapYear = isLeapYear && (year % 100 != 0);
    isLeapYear = isLeapYear || (year % 400 == 0);
    
    //Output
    if(isLeapYear == true){
    System.out.println(year + " is a leap year");
    }
    
    if(isLeapYear == false){
    System.out.println(year + " is not a leap year");
    }    
  }
}