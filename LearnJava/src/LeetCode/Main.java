package LeetCode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        for(String s : new Solution().letterCombinations("2345")){
            System.out.printf(s + " ");
        }
    }
}
