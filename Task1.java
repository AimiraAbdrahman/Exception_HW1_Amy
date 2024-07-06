import java.io.IOException;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class Task1 {

    public static void main(String[] args) {
        
        int x = 3;
        int y = 3;
        int limit = 5;
        int sum = calculateSum(x, y, limit);
        System.out.println("Sum equals = " + sum);
        System.out.println(isSumEven(sum));

        try {
            isSumPrime(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static int calculateSum(int x, int y, int limit) {
        int result = x + y;
        if (result < limit) {
            System.out.println("Sum is less than the specified limit");
            throw new RuntimeException("Sum revision is needed");
        }
        else {
            System.out.println("Sum is more than the specified limit = " + limit);
        }
        return result;
    }

    public static boolean isSumEven(int sum) {
        if (sum % 2 == 0) {
            return true;
        }
        else {
            throw new RuntimeException("sum is not even");
        }
    }

    public static void isSumPrime(int sum) throws Exception {
        if (sum <= 1) {
            // return false;
            throw new RuntimeException("sum is less than or equal to 1");
        }
        for (int i = 2; i <= Math.sqrt(sum); i++) {
            if (sum % i == 0) {
                // return false;
                throw new RuntimeException("sum is not a prime number");
            }
        }
        // return true;
    }

}