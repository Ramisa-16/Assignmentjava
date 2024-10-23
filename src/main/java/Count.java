import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        int wordCount = words.length;
        int charCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        for (char ch : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                charCount++;
                if ("aeiou".indexOf(ch) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Words: " + wordCount);
        System.out.println("Characters: " + charCount);
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        scanner.close();
    }
}
