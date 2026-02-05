package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 5;
        GenerateParentheses obj = new GenerateParentheses();
        obj.generateParenthesis(n);
    }
    public void generate(int n, int l, int r, String s, List<String> ans) {


        if (r == n) { // base case: if the number of right parentheses is equal to n
            ans.add(s); // add the current string to the answer list
            return; // return to the previous call
        }
        if (l < n) generate(n, l + 1, r, s + "(", ans); // if the number of left parentheses is less than n, add a left parenthesis
        if (r < l) generate(n, l, r + 1, s + ")", ans); // if the number of right parentheses is less than the number of left parentheses, add a right parenthesis
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(n, 0, 0, "", ans);
        System.out.println(ans);
        return ans;
    }
}
