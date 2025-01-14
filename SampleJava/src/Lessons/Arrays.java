package Lessons;

public class Arrays {
    public static void main(String args[]){
        int MyInt = 10; //Примитивный тип данных   [10]
        int[] numbers = new int[5];            // numbers -> [массив]  Ссылочный тип данных
        for(int i = 0;i<numbers.length; i++){
            numbers[i] = i*10;
            System.out.println(numbers[i]);
        }
        int[] numbers1 = {1,2,3,4};
        for (int i = 0; i<numbers1.length; i++ ) System.out.println(numbers1[i]);
        System.out.println("Sucsus");
    }
}
