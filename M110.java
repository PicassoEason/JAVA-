public class M110 {
    public static void main(String[] args) {
        
    }
    public String decode(String code) {
        String decoded = "";
        int lastCharValue = 'z';
        int alphabetLength = 'z' - 'a' + 1;
        for (char character: code.toCharArray()) {
            int charNoRotation = character + 5;
            int charValue = charNoRotation < lastCharValue ? charNoRotation : charNoRotation - alphabetLength;
            decoded += (char) charValue;
        }
        return decoded;
    }
}
