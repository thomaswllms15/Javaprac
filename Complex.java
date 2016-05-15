public class Complex
{
  private final double re;
  private final double im;
  
  public Complex(double real, double imag)
  { //Constructor for my new data type for imaginary numbers, instead of just real numbers ive been working with.
    re = real;
    im = imag;
  }
  
  public Complex plus(Complex b)
  { //return the sum of your complex number plus a second one.
    double real = re + b.re;
    double imag = im + b.im;
    return new Complex(real, imag);
  }
  
  public Complex times(Complex b)
  {
    double real = re * b.re - im * b.im;
    double imag = re * b.im + im * b.re;
    return new Complex(real, imag);
  }
  
  public double abs()
  {
    return Math.sqrt(re*re + im*im);
  }
  
  public double re()
  {
    return re;
  }
  
  public double im()
  {
    return im;
  }
  
  public String toString()
  {
    return re + " + " + im + "i";
  }
  
  public static void main(String[] args)
  {}
}