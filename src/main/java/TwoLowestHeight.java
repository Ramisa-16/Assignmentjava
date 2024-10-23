import java.util.Arrays;
public class TwoLowestHeight {
    public static void main(String[] args) {
        int[] heights = {45, 54, 43, 62, 48, 32, 30, 60, 36, 55};
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int height : heights) {
            if (height < min1) {
                min2 = min1;
                min1 = height;
            } else if (height < min2 && height != min1) {
                min2 = height;
            }
        }
        int[] twoLowest = {min1, min2};
        System.out.println("Two lowest heights: " + Arrays.toString(twoLowest));
    }
}
