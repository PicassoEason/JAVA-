public class E105 {
    public static void main(String[] args) {
        String word="6879";
        System.out.println(reverse(word));
    }
    public static String reverse(String word){
        String result="";
        for(int i=0;i<word.length();i++){
            result+=word.charAt(word.length()-i-1);
        }
        return result;
    }
}
