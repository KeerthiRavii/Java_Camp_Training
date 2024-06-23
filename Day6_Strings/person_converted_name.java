//Input: Gangadher  S  Pavani
//Output:G. S. Pavani



package Day6_Strings;
import java.util.Scanner;

public class person_converted_name {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str1=sc.next();
   char[] ch1=str1.toCharArray();
   
    String str2=sc.next();    
    char[] ch2=str2.toCharArray();
    String str3=sc.next();
    char[] ch3=str3.toCharArray();
    
    int i;
    
    for(i=0;i<str1.length();i++){
        System.out.print(ch1[i]+". ");
        break;
    }
    
    for(i=0;i<str2.length();i++){
        System.out.print(ch2[i]+". ");
        break;
    }
    
    for(i=0;i<str3.length();i++){
        System.out.print(ch3[i]);
    }
    
}
  
}
