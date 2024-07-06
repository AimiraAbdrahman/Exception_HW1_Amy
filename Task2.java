public class Task2 {

    // Посмотрите на код и подумайте сколько разных типов исключений вы тут 
    // сможете получить?

    public static void main(String[] args) {
        
        String [][] arr = {
            {"1", "2", "3", "4", "5"},
            {"6", "7", "8", "9", "10"},
            {"11", "12", "13", "14", "15"}
        };

        int sum = sum2d(arr);
        System.out.println(sum);
        // 1. Количество столбцов должно равняться 5, иначе выходит ArrayIndexOutOfBoundsException
        // 2. Если заменить некоторые элементы null или строкой: NumberFormatException
        // 3. Unresolved compilation problems: если поменять тип string на int
        // 4. NumberFormatException - если один из элементов будет типа float 

    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                sum += Integer.parseInt(arr[i][j]);
            }
        }
        return sum;
    }
}
