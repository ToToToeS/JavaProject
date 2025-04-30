package SampleJava.Enum;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.valueOf("FROG");
        animal.ordinal();
    }
}
