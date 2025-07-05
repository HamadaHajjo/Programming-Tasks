/*
Haar Wavelet
https://en.wikipedia.org/wiki/Haar_wavelet

The Haar wavelet mother function is defined by
     psi(t) = 1 if 0 ≤ t < 1/2,
     psi(t) = -1 if 1/2 ≤ t < 1,
     and psi(t) = 0 otherwise.

For integers n and k, the Haar function is defined by
     phi n k (t) = 2^(n/2) * psi(2^n * t - k).

Complete the two methods below for psi and phi
and complete the program that takes two integer inputs M and N,
and one real input x from the command line and prints phi m n (x).
*/

public class E1{

  public static double psi(double t){
    double psi = 0;
    if((0 <=t) && (t < 0.5)){
      psi = 1;
    }
    else if((0.5 <= t) && (t < 1)){
      psi = -1;
    }
    else {
      psi = 0;
    }
    return psi;
  }

  public static double phi(int n, int k, double t){
    double phi = 0;
    phi = (Math.pow(2,(n/2)))* psi(Math.pow(2,n) * t - k);
    return phi;
  }

  public static void main(String[] args) {
    int m = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);
    double x = Double.parseDouble(args[2]);
    System.out.println("phi " + m + " " + n + " " + x + " (t) = " + phi(m,n,x));
  }

}
