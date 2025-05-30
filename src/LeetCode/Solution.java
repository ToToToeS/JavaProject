package LeetCode;

import javax.swing.*;
import java.util.*;

import static java.lang.Math.abs;

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

    public int[] twoSum2(int[] numbers, int target) {
        int r = numbers.length - 1;
        int l = 0;
        while(r > l){
            int sum = numbers[l] + numbers[r];

            if (sum == target) return new int[]{l + 1, r + 1};
            else if (sum > target) r--;
            else l++;
        }
        return null;
    }

    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        char[] chars = str.toCharArray();

        int l = 0;
        int r = chars.length - 1;

        while (r > l) {
            if (chars[l] != chars[r]) return false;
            l++;
            r--;
        }
        return true;
    }

    public boolean isPalindromev2(int x) {
        int rev = 0;
        int temp = x;

        while (x > 0) {
            rev = rev*10 + x%10;
            x /= 10;
        }

        return rev == temp;
    }

    public String intToRoman(int num) {
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] sym = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int i = 0;
        StringBuilder s = new StringBuilder();
        while (num > 0) {
            if (num >= value[i]) {
                s.append(sym[i]);
                num -= value[i];
            }else i++;
        }
        return s.toString();
    }

    public List<String> letterCombinations(String digits) {
        Map<String, String[]> letters = new HashMap<>();
        List<String> letterCombination = new ArrayList<>();
        letterCombination.add("");

      letters.put("2", new String[]{"a", "b", "c"});
      letters.put("3", new String[]{"d", "e", "f"});
      letters.put("4", new String[]{"g", "h", "i"});
      letters.put("5", new String[]{"j", "k", "l"});
      letters.put("6", new String[]{"m", "n", "o"});
      letters.put("7", new String[]{"p", "q", "r", "s"});
      letters.put("8", new String[]{"t", "u", "v"});
      letters.put("9", new String[]{"w", "x", "y", "z"});

      String[] digitsArray  = digits.split("");

      for (int i = 0;i < digitsArray.length; i++) {
          letterCombination = combine(letterCombination, letters.get(digitsArray[i]));
      }


      return letterCombination;
    }

    private List<String> combine (List<String> list, String[] stringsArray) {
        List<String> nList = new ArrayList<>();

        for (String l : list){
            for (int i = 0; i < stringsArray.length; i++) {
                nList.add(l + stringsArray[i]);
            }
        }

        return nList;
    }

    public List<List<Integer>> MyThreeSum(int[] nums) {
        if (nums.length % 3 != 0) return null;
        int multiplicity = nums.length / 3;

        Arrays.sort(nums);
        List<Integer> elements = new ArrayList<>();

        List<List<Integer>> threeSum = new ArrayList<>();

        for(int num : nums) {
            elements.add(num);
        }

        for (int x = 0; x < multiplicity; x++){
            int last = elements.get(elements.size() - 1);
            int first = elements.get(0);
            for (int  i = 1; i < elements.size() - 1; i++) {
                if ( last + first == -1 * elements.get(i)){
                    List<Integer> list = new ArrayList<>();
                    list.add(first);
                    list.add(last);
                    list.add(elements.get(i));
                    elements.remove(i);
                    elements.remove(0);
                    elements.remove(elements.size() - 1);
                    threeSum.add(list);
                }
            }
        }
        return threeSum;
    }

    public List<List<Integer>> threeSumv1(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> elements = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int f = j + 1; f < nums.length; f++) {
                    if (nums[i] + nums[j] + nums[f] == 0) {
                        List<Integer> tmp = Arrays.asList();
                        elements.add(tmp);
                    }
                }
            }
        }
        return new ArrayList<>(elements);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            int l = 0;
            int r = nums.length-1;
            while (l < r) {
                if (i == l) l++;
                if (i == r) r--;
                if (r == l) l++;
                if (nums[i] + nums[r] + nums[l] == 0) {
                    int[] arr = {nums[i], nums[l], nums[r]};
                    Arrays.sort(arr);
                    Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);

                    List<Integer> list = new ArrayList<>(Arrays.asList(integerArray));
                    res.add(list);
                }
                if (nums[r] + nums [l] + nums[i] > 0) r--;
                else l++;
            }
        }
        return new ArrayList<>(res);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int size = 1;

        while(node.next != null) {
            node = node.next;
            size++;
        }

        if (size - n == 0) return head.next;

        int indexForDel = size - n;
        node = head;

        for (int i = 0; i < indexForDel; i++) {
            if (i == indexForDel - 1) {
                ListNode backNode = node;
                node = node.next.next;
                backNode.next = node;
            }else node = node.next;
        }

        return head;
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        res.add("(");

        for(int i = 1; i < n; i++) {
            int length = res.size();
            for (int j = 0; j < length; j++) {
                String def = res.get(j);

                res.set(j, def + "(");
                res.add(def + ")");

            }
        }

        for (int i = 0; i < res.size(); i++) {
            String s = res.get(i);
            res.set(i, mirror(s));
        }
        return res;
    }

    String mirror(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') sb.append(')');
            else sb.append('(');
        }
        return sb.toString();
    }

    public int threeSumClosest(int[] nums, int target) {
        int closestSum = Integer.MAX_VALUE;
        int closestNum = Integer.MAX_VALUE;
        int indexClosestNum = -1;

        for (int i = 0; i < nums.length; i++) {
            if (distanceNum(nums[i], target) < distanceNum(closestNum, target)) {
                indexClosestNum = i;
                closestNum = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == indexClosestNum) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (j == indexClosestNum) continue;
                if(Math.abs(nums[i] + nums[j] + closestNum - target) <= Math.abs(closestSum - target))
                    closestSum = nums[i] + nums[j] + closestNum;
            }
        }

        return closestSum;

    }

    private int distanceNum(int a, int b) {
        if (a < b) return Math.abs(b - a);
        else return Math.abs(a - b);
    }
}

















class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }