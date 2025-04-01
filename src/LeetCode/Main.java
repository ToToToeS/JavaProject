package LeetCode;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println(new Solution().threeSum(new int[]{-1,0,1,2,-1,-4}));
        int[] array = {1, 2, 3};

        Integer[] integerArray = Arrays.stream(array).boxed().toArray(Integer[]::new);

        // Преобразование массива в изменяемый список
        List<Integer> list = new ArrayList<>(Arrays.asList(integerArray));
    }
}
