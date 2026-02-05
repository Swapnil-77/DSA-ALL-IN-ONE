package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// add comments to explain the code
public class PowerSet {


    public static void main(String[] args) {
        String s = "abc"; // input string
        PowerSet obj = new PowerSet(); // create an object of PowerSet class
        List<String> result = obj.AllPossibleStrings(s); // get all possible subsets
        System.out.println(result); // print the result
    }
    private void subsets(String ans, String s, int idx, List<String> list) {
        if(idx==s.length()){    // base case: if index reaches the end of the string
            if(ans.length()!=0) list.add(ans); // add non-empty subset to the list
            return;
        }
        char ch = s.charAt(idx); // current character
        subsets(ans+ch,s,idx+1,list); // pick the character
        subsets(ans,s,idx+1,list); // skip the character
    }
    public List<String> AllPossibleStrings(String s) {
        List<String> list = new ArrayList<>(); // list to store all subsets
        subsets("",s,0,list); // generate all subsets
        Collections.sort(list); // sort the list lexicographically
        return list; // return the list of subsets
    }
}
