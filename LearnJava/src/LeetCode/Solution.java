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
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j + i < nums.length; j++) {
                if (nums[j] + nums[j + i] == target) {
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
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        for (int j = 0; j < digits.length; j++) {
            newDigits[j + 1] = digits[j];
        }
        return newDigits;

    }

    static public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        int s = digits.length;
        do {
            digits[i]++;
            if (digits[i] == 10) digits[i] = 0;
            i--;
        } while (digits[i + 1] == 0 && i >= 0);

        if (digits[i + 1] != 0) {
            return digits;
        } else {
            int[] newDigits = new int[s + 1];
            newDigits[0] = 1;
            for (int j = 0; j < digits.length; j++) {
                newDigits[j + 1] = digits[j];
            }
            return newDigits;
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int ch_m = m - 1;
        int ch_n = n - 1;

        for (int i = n + m - 1; i >= 0; i--) {
            if (ch_m >= 0 && ch_n >= 0 && nums1[ch_m] > nums2[ch_n]) {
                nums1[i] = nums1[ch_m--];
            } else if (ch_n >= 0) {
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

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> exist = new HashMap<>();
        int array[] = new int[k];

        for (int num : nums) {
            if (!exist.containsKey(num)) exist.put(num, 1);
            else exist.put(num, exist.get(num) + 1);
        }

        for (int i = 0; i < k; i++) {
            int key = 0;
            for (int j = 1; j < nums.length; j++) {
                if (exist.get(nums[j]) > exist.get(nums[key])) key = j;
            }
            array[i] = nums[key];
            exist.put(array[i], 0);
        }
        return array;
    }

    public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = strs.size() - 1; i <= 0; i--) {

        }
        stringBuilder.delete(0, 2);
        return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        String[] arr = str.split(",");
        for (String s : arr) {
            list.add(s);
        }
        return list;
    }

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int product = 1;
        int check = 0;
        for (int num : nums) {
            if (num != 0) product *= num;
            else check++;
        }

        switch (check) {
            case (0):
                for (int i = 0; i < nums.length; i++) {
                    res[i] = product / nums[i];
                }
                break;

            case (1):
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] != 0) res[i] = 0;
                    else res[i] = product;
                }
                break;

            default:
                for (int num : res) {
                    num = 0;
                }
        }
        return res;
    }

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> setI = new HashSet<>();
            Set<Character> setJ = new HashSet<>();
            for (int j = 0; j < 9; j++) {

                if (setI.contains(board[i][j])) return false;
                else if (board[i][j] != '.') setI.add(board[i][j]);

                if (setJ.contains(board[j][i])) return false;
                else if (board[j][i] != '.') setJ.add(board[j][i]);

            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                Set<Character> set = new HashSet<>();
                for (int nI = i; nI < i + 3; nI++) {
                    for (int nJ = j; nJ < j + 3; nJ++) {
                        if (set.contains(board[nI][nJ])) return false;
                        else if (board[nI][nJ] != '.') set.add(board[nI][nJ]);
                    }
                }
            }
        }
        return true;
    }

    public boolean isValidSudokuV2(char[][] board) {
        Set set = new HashSet();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char number = board[i][j];
                if (number != '.') {
                    if (!set.add(number + "row" + i) ||
                            !set.add(number + "colum" + j) ||
                            !set.add(number + "block" + i + j)
                    ) return false;
                }
            }
        }
        return true;
    }

    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        int maxQue = 0;
        int buffQue = 1;

        for (int i = 0; i + 1< nums.length; i++) {
            if (nums[i] == nums[i + 1]) continue;
            if (nums[i] + 1 == nums[i + 1]){
                buffQue++;
                if (maxQue < buffQue) maxQue = buffQue;
            }
            else buffQue = 1;
        }
        return maxQue;
    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("(?U)[\\pP\\s]", "");
        s = s.replaceAll("`", "");
        System.out.println(s);
        StringBuilder revers = new StringBuilder(s);
        String r = revers.reverse().toString();
        return r.equalsIgnoreCase(s);
    }
}
