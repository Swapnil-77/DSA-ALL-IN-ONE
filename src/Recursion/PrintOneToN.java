package Recursion;

public class PrintOneToN {

    public static void main(String[] args) {
        int n = 5;
        printOneToN(n);
    }

    public static void printOneToN(int n) {
        if (n == 0) {
            return;
        }
        printOneToN(n - 1);
        System.out.print(n + " ");
    }
}
