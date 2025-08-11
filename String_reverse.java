import java .util.*;
public class String_reverse{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String words[]=s.split(" ");
        
        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
            // if(i>0){
            //     System.out.print(" ");
            // }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}