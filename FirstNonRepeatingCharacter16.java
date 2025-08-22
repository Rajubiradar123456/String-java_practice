import java.util.*;;
public class FirstNonRepeatingCharacter16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="prepinsta";
        boolean flag=true;
        for(char i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.println("the first non repeating character is:"+c);
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("there is no repeating character");
        }
    }
}
