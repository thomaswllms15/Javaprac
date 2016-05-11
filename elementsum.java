public class elementsum
{
  
  public static int[] convertTxtToArray(String s, String d)
  {
    // read in input file
    In inputfile = new In(s + d);
    
    //create an array of values to solve from.
    int[] a = new int[10]; 
    
    //collect values from spreadsheet, populate array
    while(!inputfile.isEmpty()){
        for(int i = 0; i < a.length; i++){
          a[i] = inputfile.readInt();
        }
    }
    
    return a;
  }
  
  public static void main(String[] args)
  {
    //define your own directory and filename here
    String directory = "C:/dev/javaprac/";
    String inputfile = "triangletest2.txt";   
    int[] a = convertTxtToArray(directory, inputfile);
    
    
    //Now that the array is built, here's the fun part where I get the sum.
    //My logic here relies on line 1 having 1 integer, line 2 having 2 integers..6.
    //to line 100 having 100 integers. The equation I think works is j*(j+2)/2.
    int sum = a[0];
    for(int j = 1; (j*(j+2)/2) + 1 < a.length; j++)
    {
      int elementno = (j*(j+1))/2;
      int elementno2 = (j*(j+1))/2 + 1;
      if (elementno > elementno2){
        sum += a[elementno];
        j = elementno;
      }
      else{
        sum += a[elementno2];
        j = elementno2;
      }
      StdOut.println(a[elementno] + " " + a[elementno2]);
      
    }
    
    //Print the sum
//    StdOut.println(sum);
  }
}