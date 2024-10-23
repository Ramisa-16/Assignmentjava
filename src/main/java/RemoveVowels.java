public class RemoveVowels {
    public static void main(String[] args) {
        String input = "I am a SQA Engineer";
        String output = input.replaceAll("[aeiouAEIOU]", "");
        int vowelsRemoved = input.length() - output.length();
        System.out.println("String without vowels: " + output);
        System.out.println("Number of vowels removed: " + vowelsRemoved);
    }
}
