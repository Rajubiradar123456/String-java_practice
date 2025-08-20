public class MakeFirstandLastCharacterofWordMakeCapital14 {
    public static void main(String[] args) {
        String s="raju is a good boy";
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i==0 || s.charAt(i-1)==' '){
                ch=Character.toUpperCase(ch);
            }
            else if(i==n-1 || s.charAt(i+1)==' '){
                ch=Character.toUpperCase(ch);
            }
            sb.append(ch);

        }
        System.out.println(sb);

    }
}
