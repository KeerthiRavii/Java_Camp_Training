//Write a program to remove the occurrence of “the” word from entered string.
//Input:remove the occurrence of the word from entered string
//Output:Result string is remove occurrence of word from entered string



package Day6_Strings;
import java.util.Scanner;

public class remove_the {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    
    char []ch=str.toCharArray();
    int flag=0;
    System.out.println("Result string is ");
    for(int i=0;i<str.length();i++){
        if(ch[i]=='t' &&ch[i+1]=='h' 
           && ch[i+2]=='e')
           {
               flag=5;
          //  System.out.print('6');
        }
        if(flag>1){
            flag--;
            continue;
        }
        else{
            System.out.print(ch[i]);
        }
        
    }
    
}
  
}
