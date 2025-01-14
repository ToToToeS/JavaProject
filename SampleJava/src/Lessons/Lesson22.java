package Lessons;

public class Lesson22 {
    public static void main(String args[]){
        String s = " eqw";

        System.out.println(s.toUpperCase());

        StringBuilder str = new StringBuilder("Hello string builder");
        System.out.println();

        System.out.printf("This is printf example %s \n", str);  //Вставляемт вместо %s Строку после запятой
        System.out.printf("This is printf example %d \n", 3 );// Вставяет вметсто %d Чимло после запятой
        System.out.printf("This is printf example %10d \n", 3 );// Перед типом данных после процента можно выделить кол-во пустых символов перед число
        System.out.printf("This is printf example %-10d \n", 3 ); // Число идет с лево на право
        System.out.printf("This is printf example %.2f \n", 3.423424234234234 ); // Округляет число до n цифор послел запятой
    }
}
