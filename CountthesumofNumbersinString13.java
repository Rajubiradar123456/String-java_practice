// sum of individual digit in a string

public class CountthesumofNumbersinString13 {
    // public static void main(String[] args) {
    //     String s="1raju44utd6";
    //     // 44 taken as 4 + 4 not as 44(indiviual digit)
    //     int sum=0;
    //     for(int i=0;i<s.length();i++){
    //         char c=s.charAt(i);
    //         if(c>='0' && c<='9'){
    //             sum+=(c-'0');
    //         }
    //     }
    //     System.out.println(sum);
    // }



    // sum of a number a44b54bn means add the 44 +54 =98 not individually like 4+4+5+4=17
   public static void main(String[] args) {
    String s="a44b55vidj8";
    String num="";
    int sum=0;
    for(int i=0;i<s.length();i++){
        if(Character.isDigit(s.charAt(i))){
          num+=s.charAt(i);  
        }
        else{
            if(!num.equals("")){  // it means num has not empty so the num has some value
                sum=sum+Integer.parseInt(num); // convert that num into integer 
                num="";   // again the num make empty
            }

        }
    }
    if(!num.equals("")){ // this is for last digit having the number
        sum+=Integer.parseInt(num);
    }
    System.out.println(sum);
}
}
