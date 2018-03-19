package ExtraTask;

import java.util.*;
public class Solution {

    public static Set<String> set = new LinkedHashSet();

    public static void SearchForCombinations(String prefix, String str){
        set.add(prefix);
        for (char ch : str.toCharArray())
            SearchForCombinations(prefix + ch, str.replaceFirst(ch + "", ""));
    }

       public static void main(String[] args){
           SearchForCombinations("", "apple");
        for (String j : set) System.out.println(j);

    }
}