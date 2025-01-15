package LeetCode;

import java.util.*;

class Solution {

    static public int removeDuplicates(int[] nums) {
        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static int[] twoSum(int[] nums, int target) {
        int newNums[] = new int[2];
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j + i < nums.length;j++){
                if(nums[j] + nums[j + i] == target) {
                    newNums[0] = j;
                    newNums[1] = j + i;
                    return newNums;
                }
            }
        }
        return newNums;
    }

    static public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public int searchInsert(int[] nums, int target) {
        int min = 0, search = 0;
        int max = nums.length - 1;

        while (min <= max) {
            search = (min + max) / 2;

            if (nums[search] == target) return search;
            else if (nums[search] < target) min = search + 1;
            else max = search - 1;

        }
        return min;
    }

    public int[] plusOneV2(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        for(int j = 0; j < digits.length;j++){
            newDigits[j + 1] = digits[j];
        }
        return newDigits;

    }

    static public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int s = digits.length;
        do{
            digits[i]++;
            if (digits[i] == 10) digits[i] = 0;
            i--;
        }while(digits[i + 1] == 0 && i >= 0);

        if(digits[i + 1] != 0){
            return digits;
        }else {
            int[] newDigits = new int[s + 1];
            newDigits[0] = 1;
            for(int j = 0; j < digits.length;j++){
                newDigits[j + 1] = digits[j];
            }
            return newDigits;
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int ch_m = m - 1;
        int ch_n = n - 1;

        for(int i = n + m - 1; i >= 0;i--){
            if(ch_m >= 0 && ch_n >= 0 && nums1[ch_m] > nums2[ch_n]) {
                nums1[i] = nums1[ch_m--];
            }else if (ch_n >= 0){
                nums1[i] = nums2[ch_n--];
            }
        }
    }

    public boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        Arrays.sort(ch1);

        char[] ch2 = t.toCharArray();
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);

    }
}
