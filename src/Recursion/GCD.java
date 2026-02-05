package Recursion;

public class GCD {
    public static void main(String[] args) {
        int a = 56;
        int b = 98;
        int result = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + result);
    }
    public static int gcd(int a, int b) {
        if(a==0) return b;
        return gcd(b%a,a);
    }
}
