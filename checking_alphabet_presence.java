//Write a program to convert a String to an int.
//Note: If the string contains a character then print 0.
//Eg. a1b2 here the input contains character, so conversion is not possible.
//Input 1 :234      Output 1 :234



import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(!Character.isDigit(str.charAt(0)))
        System.out.print("0");
        else
        System.out.print(str);
    }}