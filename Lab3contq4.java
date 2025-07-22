public class Lab3contq4 {
    public static void main(String[] args) {

    int[] numbers = {1, 5, 6, 2, 4};
        int n = numbers.length + 1; // Since one number is missing
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int number : numbers) {
            actualSum += number;
        }
        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}