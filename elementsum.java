public class elementsum
{
  public static void main(String[] args)
  {
    //define your own directory and filename here. See function at bottom for extraction
    String directory = "C:/dev/javaprac/";
    String inputfile = "triangle.txt";   
    int[] a = convertTxtToArray(directory, inputfile);
    
    
    //My logic here relies on line 1 having 1 integer, line 2 having 2 integers..6.
    //to line 100 having 100 integers. The equation I think works is j*(j+2)/2.
    int sum = a[0];
    for(int j = 1; (j*(j+2)/2) < a.length; j++)
    {
      int elementno = (j*(j+2))/2;
      int elementno2 = (j*(j+2))/2 + 1;
      if (a[elementno] > a[elementno2]){
      sum += a[elementno];
      }
      else sum += a[elementno2];
    }

    //Print the sum
    StdOut.println(sum);
  }
  
  public static int[] convertTxtToArray(String s, String d)
  {
    // read in input file
    In inputfile = new In(s + d);
    
    //create an array of values to solve from.
    int[] a = new int[5050]; 
    
    //collect values from spreadsheet, populate array
    while(!inputfile.isEmpty()){
        for(int i = 0; i < a.length; i++){
          a[i] = inputfile.readInt();
        }
    }
    
    return a;
  }
}