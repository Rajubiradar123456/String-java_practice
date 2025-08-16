// Input1: zbk  
// Input2: zkb


import java.util.Arrays;

public class CheckTheCharactersareEqualAfterJumblingInStringIMP {
    public static void main(String[] args) {
        String s1="zbk";
        String s2="bkz";
        if(s1.length()!=s2.length()){
            System.out.println("no");
            return;
        }
        //  // Step 2: Convert to char arrays
        char arr1[]=s1.toCharArray();       // arr1 = ['z', 'b', 'k']  
        char arr2[]=s2.toCharArray();     // arr2 = ['z', 'k', 'b']

        // Step 3: Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 4: Compare sorted arrays
        if(Arrays.equals(arr1,arr2)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
