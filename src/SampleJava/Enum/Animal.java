package SampleJava.Enum;

public enum Animal {
    DOG(1), CAT(2), FROG(0), BOBER(20);

    private int weight;
    Animal(int weight) {
        this.weight = weight;
    }
}
