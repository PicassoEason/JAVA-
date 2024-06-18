public class M106 {
    public static void main(String[] args) {
        System.out.println(gcd(48, 18)); 
    }
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
