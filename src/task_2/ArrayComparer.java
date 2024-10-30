package task_2;

public class ArrayComparer {
    public <T> boolean compareArrays(T[] array1, T[] array2) {

        if (array1 == null || array2 == null) {
            return false;
        }

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayComparer arrayComparer = new ArrayComparer();

        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        Integer[] array3 = {1, 3, 6};
        Double[] array4 = {1.0, 3.0, 6.0};

        String[] array5 = {"red", "black", "yellow"};
        String[] array6 = {"red", "black", "yellow"};
        String[] array7 = {"dog", "cat", "hamster"};

        System.out.println("1 и 2 массивы равны: " + arrayComparer.compareArrays(array1, array2));
        System.out.println("1 и 3 массивы равны: " + arrayComparer.compareArrays(array1, array3));
        System.out.println("3 и 4 массивы равны: " + arrayComparer.compareArrays(array3, array4));
        System.out.println("6 и 7 массивы равны: " + arrayComparer.compareArrays(array5, array6));
        System.out.println("6 и 8 массивы равны: " + arrayComparer.compareArrays(array5, array7));
        System.out.println("1 и 8 массивы равны: " + arrayComparer.compareArrays(array1, array7));
        System.out.println("_____________________________________");
    }
}
