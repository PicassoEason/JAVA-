public class M104 {
    public static void main(String[] args) {
        String W = "GaG";
        System.out.println(isPalindrome(W));
    }

    public static boolean isPalindrome(String word) {
        int i1 = 0;
        int i2 = word.length() - 1; // Correct initialization
        while (i1 < i2) { // Correct condition
            if (word.charAt(i1) != word.charAt(i2)) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}
