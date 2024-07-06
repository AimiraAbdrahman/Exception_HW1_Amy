import java.util.Arrays;

public class Task3 {

    // Реализуйте метод, принимающий в качестве аргументов два целочисленных 
    // массива и возвращающий новый массив, каждый элемент которого равен разности 
    // элементов двух входящих массивов в той же ячейке.
    // Если длины массивов не равны, необходимо как-то оповестить пользователя.

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] result = arrayDifference(arr1, arr2);
        try {
            result = arrayDifference(arr1, arr2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println((Arrays.toString(result)));
    }

    public static int[] arrayDifference(int[] arr1, int[] arr2) {
        if (arr1.length!=arr2.length) {
            throw new ArrayIndexOutOfBoundsException("Arrays have different lengths. Difference calculation is impossible.");
        }
        int[] result = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}
