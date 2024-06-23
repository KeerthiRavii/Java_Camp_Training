//write a program to accept a string and convert all letters to uppercase without using String Functions.

import java.util.*;
class upper_without_fn{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char ch=' ';
       // char[] ch=str.toCharArray();
        
        for(int i=0;i<str.length();i++){
          if(str.charAt(i)>='a' && str.charAt(i)<='z')
          ch=(char)(str.charAt(i)-32);
                System.out.print(ch);
            
        }
    
}
}