import java.util.*;
public class VowelcountinaString6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        // int count=0;
        // char[] c=s.toCharArray();
        // for(int i=0;i<s.length();i++){
        //     if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){
        //         count++;
        //     }

        // }
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }

        System.out.println(count);
    }
    
}
