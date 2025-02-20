package Grokaem;

import java.util.HashMap;
import java.util.jar.JarEntry;

public class DinamicProgramic {
    public static void main(String[] args){
        String[] name = new String[]{"Вода", "Книга", "Еда", "Куртка", "Камера"};
        int[] mass = new int[]{3, 1, 2, 2, 1};
        int[] cost = new int[]{10, 3, 9, 5, 6};
        int maxMass = 6;

        String str1 = "solo";
        String str2 = "Polo";
        System.out.println(MostLongSubstring(str1, str2));
    }

    public static int TastOfBackpack(int[] mass, int[] cost, int maxMass){
        int[][] matrix = new int[cost.length][maxMass];

        for(int i = 0; i < cost.length; i++){
            for(int j = 0; j < maxMass; j++){
                if (i == 0) {if ( j + 1 >= mass[i] ) matrix[i][j] = cost[i];} // Созданно для заполнения первой строки
                else if (cost[i] > matrix[i-1][j] &&
                        j + 1 == mass[i]) // Для случаев когда масса равна
                {
                    matrix[i][j] = cost[i];
                }
                else if (j + 1 > mass[i] &&
                        cost[i] + matrix[i -1][j - mass[i]] > matrix[i-1][j]) // Для случаев когда масса больше
                {
                    matrix[i][j] = cost[i] + matrix[i - 1][j - mass[i]];
                }
                else matrix[i][j] = matrix[i-1][j]; // Дефолтный случай
            }
        }
        return matrix[cost.length - 1][maxMass - 1];
    }

    public static int MostLongSubstring(String str1, String str2){
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        int[][] matrix = new int[chars1.length][chars2.length];
        int maxint = 0;
        for(int i = 0; i < chars1.length; i++){
            for(int j = 0; j < chars2.length; j++){
                if((i-1 < 0 || j-1 < 0) && chars1[i] == chars2[j]) matrix[i][j] = 1;
                else if (chars1[i] == chars2[j]) matrix[i][j] = matrix[i - 1][j - 1] + 1;
                if(matrix[i][j] > maxint) maxint = matrix[i][j];
            }
        }

        return maxint;
    }
}
