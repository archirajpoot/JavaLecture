package lect2;
import java.util.Scanner;

public class string1 {
     public static void main(String args[]){
//         String s;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the name");
//         s=sc.nextLine();
//         System.out.println("your name is "+s);
         String str="madam";
//         for(int i=0;i<str.length();i++){
//             System.out.println(str.charAt(i));
//         }
        int n=str.length();
        int count=0;
         for(int i=0;i<n;i++){
             if(str.charAt(i)!=str.charAt(n-i-1)){
               count=1;
               break;
             }
         }
         if(count==0){
             System.out.print("palindrome");
         }
         else{
             System.out.println("non palindrome");
         }
         char []arr= str.toCharArray();
         int i=0,j=n-1;
         while(i<j){
             char temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             i++;
             j--;
         }

     }
}
