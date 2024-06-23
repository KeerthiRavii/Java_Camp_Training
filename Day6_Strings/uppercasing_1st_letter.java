//Input: a quick brown fox jumps over the lazy dog
//Output: A Quick Brown Fox Jumps Over The Lazy Dog 



package Day6_Strings;
import java.util.Scanner;

public class uppercasing_1st_letter {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char[] ch=s.toCharArray();
    int i;
    for(i=1;i<s.length();i++){
        ch[0]=Character.toUpperCase(ch[0]);
        if(i==s.length()-1){
          break;
        }
        if(ch[i]==' '){
            ch[i+1]=Character.toUpperCase(ch[i+1]);
        }
    }
    for(i=0;i<s.length();i++)
    System.out.print(ch[i]);

}
  
}
