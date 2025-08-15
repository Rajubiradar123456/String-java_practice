import java.util.Scanner;

public class Removecharexceptalphabet10 {
    public static void main(String[] args) {
    String s = "$P*r;e..pi, ns'ta^?";
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if((ch>='a'&& ch<='z')||(ch>='A' && ch<='Z')){
            sb.append(ch);
        }
    }      
    System.out.println(sb.toString());  
    }
}
