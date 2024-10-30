package task_3;

public class Pair<T, U> {
    private final T first;
    private final U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(13, "Привет");
        System.out.println("Первое значение: " + pair1.getFirst());
        System.out.println("Второе значение: " + pair1.getSecond());
        System.out.println("Первая пара: " + pair1);
        System.out.println();

        Pair<Double, Boolean> pair2 = new Pair<>(3.14, false);
        System.out.println("Первое значение: " + pair2.getFirst());
        System.out.println("Второе значение: " + pair2.getSecond());
        System.out.println("Вторая пара: " + pair2);
        System.out.println("_____________________________________");
    }
}
