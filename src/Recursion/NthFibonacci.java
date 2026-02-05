package Recursion;

public class NthFibonacci {
    public static void main(String[] args) {
        int n = 6;
        NthFibonacci obj = new NthFibonacci();
        System.out.println(obj.nthFibonacci(n));
    }
    public int nthFibonacci(int n) {
        if(n<=1) return n;
        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
}
