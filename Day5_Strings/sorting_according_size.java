/*  calculate the length of each word and arrange them in ascending order of their lengths
 Input 1 :4
Vellore                             Output 1 :
I                              I am from Vellore 
from
am          */

import java.util.Scanner;
public class sorting_according_size{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  String[] str=new String[size];
  int i;

  for(i=0;i<size;i++){
    str[i]=sc.next();

  }
  sc.close();
  int len1,temp=0;

  for(i=0;i<str.length();i++){
    len1=str[i].length();

    for(int j=1;j<str.length();i++){
      
      temp=len1;
    }
   
  }
 
  for(i=0;i<size;i++){
    System.out.print(str[i]);
  }
  }
}