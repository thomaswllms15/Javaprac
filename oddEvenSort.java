public class oddEvenSort
{
  private long[] a;
  private int nElems;
  
  public oddEvenSort(int max)
  {
    a = new long[max];
    nElems = 0;
  }
  
  public void insert(long value)
  {
    a[nElems] = value;
    nElems++;
  }
  
  public void display()
  {
    for(int j = 0; j < nElems; j++)
    {
      System.out.print(a[j] + " ");
    }
    System.out.println(" ");
  }
  
  public void oddeven_Sort()
  {
    int out;
    int in;
    
    for(out = nElems - 1; out >1; out--)
    {
      //odd element sort
      for(in = 1; in < out; in++)
      {
        if(a[in] > a[in+2])
        {
          swap(in, in+2);
        }
        in++;
      }
      //even element sort
      for(in = 0; in < out; in++)
      {
        if(a[in] > a[in+2])
        {
          swap(in, in+2);
        }
        in++;
      }
    }
  }
  
  public void swap(int one, int two)
  {
    long temp = a[one];
    a[one] = a[two];
    a[two] = temp;
  }
}