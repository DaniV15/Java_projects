package lookAndSay;
public class lookAndSay{

     public static void main(String []args){
         String num = "1";
        for(int i = 0; i < 20; i++)
        {
        System.out.println(num);
        num = lookAndSay(num);
        }
     }
     
     public static String lookAndSay(String num) {
    int temp=0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
           if(num.charAt(temp) != num.charAt(i))
           {
               result.append(i-temp).append(num.charAt(temp));
               temp=i;
           }
        }
        result.append(num.length()-temp).append(num.charAt(temp));
        return(result.toString());

}
}