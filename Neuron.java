public class Neuron
{
  private double[] input;
  
  public Neuron(In in)
  { //is there a better way to read input vector?
    for (int i = 0; i < input.length; i++)
    {
      input[i] = in.readDouble();
    }
  }
  
  public double z(double[] w)
  { //generate the input via weight vector dot input vector
    double z = 0.0;
    for(int i = 0; i < input.length; i++)
    {
      z += w[i]*input[i];
    }
    return z;
  }
  
  public int threshold(double z_est)
  { //threshold function - says if neuron fired or not
    if (z_est >= 0)
    {
      return 1;
    }
    else 
      return -1;
  }
  
  public double[] rosenblatt(double y_true, double nu, double iter)
  {
    //initialize weights to 0
    //for each training sample []x, compute the output value (-1 or 1)
    //then update the weights. compare to ground truth []y
    //return weights for the input function.
    
    double[] w = new double[input.length];
    for(int i = 0; i < input.length; i++)
    {
      w[i] = 0.0;
    }
    
    double z_hat =  z(w);
    int y_hat = threshold(z_hat);
    
    for(int no = 1; no <= iter; no++)
    {
      
      for(int i = 0; i < input.length; i++)
      {
        if(y_true == y_hat)
        { //if you get the true value = to your calculated, no change for weights
          w[i] = w[i];
        }
        else
          //adjust weight according to the learning rate, the delta, and the input
          w[i] = w[i] + (nu * (y_true - y_hat) * input[i]);
      }
      //update values, iterate again
      z_hat = z(w);
      y_hat = threshold(z_hat);
    }
    
    //return weights
    return w;
  }
}
