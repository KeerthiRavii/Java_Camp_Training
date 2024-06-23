// Input 1 :Sample Data for analysis Output 1 :
// a Frequency of a = 5
package Day6_Strings;
import java.util.Scanner;

public class frequency_of_letter {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
   // System.out.print(str);
    char ele=sc.next().charAt(0);
   // System.out.print(ele);
   
   char []ch=str.toCharArray();
   int count=0;
   for(int i=0;i<str.length();i++){
       if(ch[i]==ele)
       count++;
   }
   
   System.out.print("Frequency of "+ele+" = "+count);
}
  
}
