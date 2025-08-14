import java.util.Scanner;

public class Alphanumeric_character_count {
   

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.isEmpty()){
            System.out.println("-1");
            return;
        }
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='a' && ch<='z') ||
              (ch>='A' && ch<='Z') ||
              (ch>='0' && ch<='9')){
                count++;
            }
        }
        System.out.print(count);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

