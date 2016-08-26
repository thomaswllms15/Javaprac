public class ArrayIns
{
  private long[] a;
  private int nElems;
  
  public ArrayIns(int max)
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
  
  public void insertionSort()
  {
    int out;
    int in;
    
    for(out = 1; out < nElems; out++)
    {
      long temp = a[out];
      in = out;
      while(in > 0 && a[in-1] >= temp)
      {
        a[in] = a[in-1];
        --in;
      }
      a[in] = temp;
    }
  }
  
  public long median()
  {
    insertionSort();
    int middle;
    if(nElems % 2 == 0)
    {
      middle = (nElems / 2);
      return (a[middle-1] + a[middle]) / 2;
    }
    else
    {
      middle = (nElems + 1) / 2;
      return a[middle-1];
    }
  }
  
  public void noDups()
  {
    insertionSort();
    for(int j = 0; j < nElems; j++)
    {
      for(int k = j+1; k < nElems; k++)
      {
        if(a[j] == a[k])
        {
          delete(a[k]);
          k--;
        }
      }
    }
  }
    
    public boolean delete(long value)
    {
    int j;
    for(j = 0; j < nElems; j++)
    {
      if(value == a[j])
      {
        break;
      }
    }
    if(j == nElems)
      {
        return false;
      }
    else 
    {
      for(int k = j; k < nElems; k++)
      {
        a[k] = a[k+1];
      }
      nElems = nElems - 1;
      return true;
    }
    }
    
    
  public void swap(int one, int two)
  {
    long temp = a[one];
    a[one] = a[two];
    a[two] = temp;
  }
}