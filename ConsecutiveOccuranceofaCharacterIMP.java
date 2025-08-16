// Input:  
// aaaabbccdee  

// Output:  
// a4b2c2d1e2

public class ConsecutiveOccuranceofaCharacterIMP {
    public static void main(String[] args) {
       String s="aaaabbccdee" ;

       int count=1;
       int n=s.length();
       StringBuilder sb=new StringBuilder();
       for(int i=1;i<=s.length();i++){
        if( i<n && s.charAt(i)==s.charAt(i-1)){
            count++;
        }
        else{
            sb.append(s.charAt(i-1)).append(count);
            count=1;
        }
       }
       System.out.println(sb);
    }
}
