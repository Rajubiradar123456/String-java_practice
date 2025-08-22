// frequency of a particular character here example char 'a' taken

public class FrequencyOfPerticularCharacterIMP15 {
    public static void main(String[] args) {
    String a="raju biradar and he is a good am";
    int length=a.length();
    int newlength=a.replace("a", "").length();
    int res=length-newlength;
    System.out.println("the occurance of a character is:"+res);        
    }
}
