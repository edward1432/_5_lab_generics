package _2_todo;

public class Main {
    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("Pair 1", 10);
        Pair<Integer, String> pair2 = new Pair<>(10, "Pair 2");
        Pair<String, String> pair3 = new Pair<>("Pair 3", "Pair 3 v");

        System.out.println("Key 1: " + pair1.getK());
        System.out.println("Key 2: " + pair2.getK());
        System.out.println("Key 3: " + pair3.getK());

        System.out.println("Value 1: " + pair1.getK());
        System.out.println("Value 2: " + pair2.getK());
        System.out.println("Value 3: " + pair3.getK());
    }
}
