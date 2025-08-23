public class ReplaceSubstringInAString18 {
    public static void main(String[] args) {
        String s="hello world";
        String substringtoreplace="world";
        String replString="java";
        String newString=s.replaceAll(substringtoreplace,replString);
        System.out.println(newString);
    }
}
