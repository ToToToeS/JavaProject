package Grokaem;

import java.util.HashMap;

public class Test {
    public static void main(String[] args){
        int[] ints = { 1, 2, 3};
        for(int i = 0; i < ints.length; i++){
            if( i - 1 >= 0 && ints[i - 1] > 0){
                System.out.println(ints[i - 1]);
            }
        }
    }
}
