/*
  The exercises are
    1) To modify the implementation of toString
    2) To add methods for the operations
          scale, minus, abs, conjugate and quotient
  The instructions are in comments before each task.

*/
public class Complex{

  private final double re;
  private final double im;

  public static final Complex I = new Complex(0,1);

  public Complex(double real, double imag){
    re = real;
    im = imag;
  }

  public Complex(double real){
    re = real;
    im = 0;
  }

  public Complex plus(Complex that){
    double real = this.re + that.re;
    double imag = this.im + that.im;
    return new Complex(real, imag);
  }

  public Complex times(Complex that){
    double real = this.re * that.re - this.im * that.im;
    double imag = this.re * that.im + this.im * that.re;
    return new Complex(real, imag);
  }

  public boolean equals(Complex that){
    return this.re == that.re && this.im == that.im;
  }

  /*
    Exercise:
     Modify the implementation so that if the imaginary part is a negative
     number im, the resulting string is
       re - |im| instead of re + im (where im has a leading -).
  */
  public String toString(){
    if (im == 0){return ""+re;}
    if (re == 0){return im + "i";}
    if (im < 0) {return re + " - "+ (-im) + "i";}
    return re + " + " + im + "i";
  }

  /*
    Exercise:
    Complete the definition of scale to be the operation that multiplies a
    real number by a complex number:
    See the lecture on 'komplexatal' in the course 'Algebra och diskret
    matematik', Räkneregler för komplexatal.
          xz = xa+ixb for z a complex number a + ib and x a real number
  */
  public Complex scale(double x){
    double real = x*this.re;
    double imag = x*this.im;
    return new Complex(real,imag) ;
  }

  /*
    Exercise:
    Complete the definition of minus according to
       z1 - z2 = z1 + (-1)z2
    (See the lecture on 'komplexatal' in the course 'Algebra och diskret
    matematik', Räkneregler för komplexatal)
  */
  public Complex minus(Complex that){
    double real = this.re + -that.re;
    double imag = this.im + -that.im;
    return new Complex(real, imag);
  }

  /*
    Exercise:
    Complete the definition of abs according to
     |z| = sqrt(a^2 + b^2) for z a complex number a + ib
     (See the lecture on 'komplexatal' in the course 'Algebra och diskret
     matematik', Absolutnelopp och konjugat)
  */
  public double abs(){
    double real = Math.abs(re*re);
    double imag = Math.abs(im*im);
    double absolute = (Math.sqrt(real+imag));
    return absolute;
  }

  /*
    Exercise:
    Complete the definition of conjugate according to
    z conjugate = a - ib for z a complex number a + ib
    (See the lecture on 'komplexatal' in the course 'Algebra och diskret
     matematik', Absolutnelopp och konjugat)
  */
  public Complex conjugate(){
    return new Complex(this.re,-this.im);
  }

  /*
    Exercise:
    Complete the definition of quotient according to
    z1/z2 = z1 (z2 conjugate)/|z2|^2
    (See the lecture on 'komplexatal' in the course 'Algebra och diskret
     matematik', Division)
  */
  public Complex quotient(Complex that){
   Complex x =((this.times(that.conjugate())).scale(1/Math.pow(that.abs(),2)));
   return new Complex((float)(x.re),(float)(x.im));
  }


  public static void main(String[] args) {
    System.out.println("i*i = " + I.times(I));

    Complex z1 = new Complex(2, 3);
    Complex z2 = new Complex(5, -4);
    System.out.println(z1 + " plus " + z2 + " = " + z1.plus(z2));

    Complex z3 = new Complex(5,15);
    Complex z4 = new Complex(1,-3);
    System.out.println(z3 + " quot " + z4 + " = " + z3.quotient(z4));
  }
}
