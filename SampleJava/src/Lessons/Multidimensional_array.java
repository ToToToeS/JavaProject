package Lessons;

import java.util.Scanner;

public class Multidimensional_array {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 4},
                          {1, 7, 5},
                          {1, 0, 5}};
        System.out.println(matrix[2][1]);

        String[][] strings = new String[2][3];
        strings[0][0] = "Hello";
        System.out.println(strings[0][0]);

        Scanner a = new Scanner(System.in);
        System.out.println("Enter number");
        int[][] matrice = new int[2][2];

        for(int i = 0; i < matrice.length; i++) {
            for(int j = 0; j < matrice[i].length; j++){
                matrice[i][j] = a.nextInt();
            }
        }

        for(int i = 0; i < matrice.length; i++) {
            for(int j = 0; j < matrice[0].length; j++) {
                System.out.print(matrice[i][j]+" ");
            }
            System.out.println();
        }
    }
}


