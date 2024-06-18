public class M202 {
    public static void main(String[] args) {
        
    }
    public static  Boolean isPrime(Integer n){
        boolean isPrime=n>1&&java.math.BigInteger.valueOf(n).isProbablePrime(50);
        return isPrime;
    }
}
