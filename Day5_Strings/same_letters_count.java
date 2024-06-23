//Given an input string aaaabbBccdee. It can be written as a4b2B1c2d1e2.


import java.util.Scanner;
class same_letters_count{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        //System.out.print(str.length());
        
        char[] ch=str.toCharArray();
        int count=1;
     //   int temp=ch[0];
        for(int i=0;i<str.length();i++){
           // temp=ch[0];
            //System.out.print(ch[i]);
            if(i>=str.length()-1){
                System.out.print(ch[i]);
                if(ch[i]==ch[str.length()-1])
                count++;
                System.out.print(count-1);
                break;
            }
           
          if(ch[i]==ch[i+1]){
                count++;
                //Syste
            }
          else{
                System.out.print(ch[i]);
                System.out.print(count);
                count=1;
            }
            //System.out.print(ch[i]);
        }
    }
}

