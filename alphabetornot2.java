// These characters are differentiated on the basis of ASCII values :

// between 65 and 90 for upper case(A, B, C…)
// between 97 and 122 for lower case(a, b, c…)

public class alphabetornot2 {
    public static void main(String[] args) {
        char ch;
        ch='i';
        // ch=99;
        if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z')){
            System.out.println("Alphabet");
        }
        
        else{
            System.out.println("not an alphabet");
        }
    }
}


   // or
        // if((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90))
        //     System.out.println("The " + ch + " is an Alphabet");