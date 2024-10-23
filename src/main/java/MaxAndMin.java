import java.util.Random;
public class MaxAndMin {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        numbers[0] = random.nextInt(50);
        int max = numbers[0];
        int min = numbers[0];
        System.out.println("Random Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if (i != 0) {
                numbers[i] = random.nextInt(50);
            }
            System.out.print(numbers[i] + " ");
            max = Math.max(max, numbers[i]);
            min = Math.min(min, numbers[i]);
        }
        System.out.println("\nMax: " + max);
        System.out.println("Min: " + min);
    }

}
