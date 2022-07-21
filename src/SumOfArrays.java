public class SumOfArrays {

    public static void main(String[] args) {
        int[] numbers = {20, 18, 16, 14, 12};
        int total = 0;

            for (int number : numbers) {
                total += number;
            }

            System.out.printf("Total of numbers element; %d%n", total);

    }
}