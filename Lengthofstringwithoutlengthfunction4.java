public class Lengthofstringwithoutlengthfunction4 {
    public static void main(String[] args) {
        int length=0;
        String s="raju biradar";
        // for(char i=0;i<s.length();i++){
        //     length++;
        // }
        for(char c:s.toCharArray()){
            length++;
        }
        System.out.println(length);

    }
}
