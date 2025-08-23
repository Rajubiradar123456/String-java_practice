public class RemoveWordFromSentence19 {
    public static void main(String[] args) {
        // String sc=new String("Raju is good boy");
        String str="raju is good boy";
        String nw="is";
        str=str.replaceAll("\\b"+nw+"\\b", " ");
        str=str.replaceAll("\\s+", " ").trim();
        System.out.println(str);


        // using string builder

    //     String str="Raju is good boy";
    //     String msg[]=str.split( " ");
    //     StringBuilder sb=new StringBuilder();
    //     String remove="is";
    //     boolean flag=false;
    //     for(int i=0;i<msg.length;i++){
    //         if(!msg[i].equals(remove)){
    //             sb.append(msg[i]).append(" ");
    //         }
    //         else{
    //             flag=true;
    //         }
    //     }
    //     if(flag){
    //         System.out.println(sb.toString());
    //     }else{
    //         System.out.println(-1);
    //     }
    // }
}}
