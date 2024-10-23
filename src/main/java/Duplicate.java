import java.util.HashMap;
public class Duplicate {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7};
        HashMap<Integer, Integer> numCountMap = new HashMap<>();
        for (int number : numbers) {
            numCountMap.put(number, numCountMap.getOrDefault(number, 0) + 1);
        }
        System.out.print("Unique numbers: ");
        boolean isFirst = true;
        for (int number : numCountMap.keySet()) {
            if (numCountMap.get(number) == 1) {
                if (!isFirst) {
                    System.out.print(", ");
                }
                System.out.print(number);
                isFirst = false;
            }
        }
    }
}
