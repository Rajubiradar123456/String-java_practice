public class Removespace11 {
    public static void main(String[] args) {
        String  s="raju    biradar";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' ' && ch!='\t'){
                sb.append(ch);
            }
        }
        System.out.println(sb);

    }
}
