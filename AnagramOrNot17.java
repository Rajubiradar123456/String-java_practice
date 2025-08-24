import java.lang.reflect.Array;
import java.util.*;

public class AnagramOrNot17 {
    public static void main(String[] args) {
        String s1="prep";
        String s2="repp";
        if(s1.length()!=s2.length()){
            System.out.println("not anagram");
            return;
        }
        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not an anagram");
        }
    }
}
