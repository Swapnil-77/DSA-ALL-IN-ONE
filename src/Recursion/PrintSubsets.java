package Recursion;

import java.util.ArrayList;
import java.util.List;
//// add comments to explain the code
public class PrintSubsets {
    public static void main(String[] args) {
        String s = "abc"; // input string
        List<String> list = new ArrayList<>();
        subsets("",s,0,list); // generate subsets
        System.out.println(list); // print the list of subsets
    }

    private static void subsets(String ans, String s, int idx, List<String> list) {
        if(idx==s.length()){ // base case: if index reaches the length of string
            if(ans.length()!=0) list.add(ans); // add non-empty subset to the list
            return;
        }
        char ch = s.charAt(idx); // current character
        subsets(ans+ch,s,idx+1,list); // pick the character
        subsets(ans,s,idx+1,list); // skip the character
    }
}
