public class RemoveBrackets12 {
    public static void main(String[] args) {
        String s="[(a+b)=c]";
        // String s2=s.replaceAll("[\\(\\)\\[\\]\\{\\}]", "");// this for all brakets
        String s3=s.replaceAll("[(){}]", "");// replace only () and {}
        // System.out.println(s2);
        System.out.println(s3);


    }
}
