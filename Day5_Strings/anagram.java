//Write a program to check whether the given two strings are an anagram.

//An anagram of a string is another string that contains the same characters, only the order of characters can be different.



import java.util.Scanner;
public class anagram{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str1=sc.next();
    String str2=sc.next();
    char[]ch1=str1.toCharArray();
    char[]ch2=str2.toCharArray();
    int flag=0;
    for(int i=0;i<str1.length();i++){
     for(int j=0;j<str2.length();j++){
      if(ch1[i]==ch2[j])
      flag=1;
     }
     if(flag==0){
      System.out.print("Not a Anagram");
      break;
     }
    }
    if(flag==1)
    System.out.print("Anagram");
    
  }
}
