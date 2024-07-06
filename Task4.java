import java.util.Arrays;

public class Task4 {

    // Реализуйте метод, принимающий в качестве аргументов два целочисленных массива 
    // и возвращающий новый массив, каждый элемент которого равен частному элементов 
    // двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо 
    // как-то оповестить пользователя.
    // Важно: При выполнении метода единственное исключение, которое пользователь может 
    // увидеть - RuntimeException

    public static void main(String[] args) {
        int[] arr1 = {9, 8, 10};
        int[] arr2 = {3, 4, 5};
        int[] result = arrayDivision(arr1, arr2);
        System.out.println((Arrays.toString(result)));
    }

    public static int[] arrayDivision(int[] arr1, int[] arr2) {
        if (arr1.length!=arr2.length) {
            throw new RuntimeException("Arrays have different lengths. Division calculation is impossible.");
        }
        int[] result = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }
}
