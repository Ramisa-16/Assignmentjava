import java.util.Arrays;
import java.util.Scanner;
public class FindCGPAUsingBinarySearch {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        Arrays.sort(cgpa);
        reverseArray(cgpa);
        System.out.println("Sorted CGPA array (descending): " + Arrays.toString(cgpa));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the required CGPA:");
        double target = scanner.nextDouble();
        int left = 0;
        int right = cgpa.length - 1;
        boolean found = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (cgpa[mid] == target) {
                found = true;
                break;
            }
            if (cgpa[mid] > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (found) {
            System.out.println("CGPA found in the array.");
        } else {
            System.out.println("CGPA not found in the array.");
        }
        scanner.close();
    }
    private static void reverseArray(double[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            double temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
