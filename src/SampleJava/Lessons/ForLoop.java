package SampleJava.Lessons;

public class ForLoop {
    public static void main(String[] args){
        for (int i = 0;i<10;i++){                 // i++ == i = i+1 //Инициализируем переменную; Условие выполнения цикла; Что будет происходить с переменной за цикл
            System.out.println("Hello world");
        }
        piramida(100);

        int i = 0;
        first:
        while (i == 0) {
            while (true) {
                System.out.println("Hello");
                i = 1;
                break first;
            }
        }
    }

    //Пирамидка
    public static void piramida(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
