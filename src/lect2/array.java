package lect2;
import java.util.Scanner;

public class array {
    public static void main(String args[]){
      //  Ek array lo user se input me, aur uske sare elements ka sum nikaalo.
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size of array");
//        int n=sc.nextInt();
//        System.out.println("enter the element");
//        int  []arr=new int [n];
//        int sum=0;
//        for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//             sum+=arr[i];
//        }
//        System.out.println("sum of the array  "+sum);

        //Array me sabse bada element kaunsa hai, wo print karo
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int []arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int max=arr[0];
//        for(int i=0;i<n;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);
        // User se ek number lo, aur check karo wo number array me hai ya nahi.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int s=sc.nextInt();
        int count=0;

        for(int i=0;i<n;i++){
            if(arr[i]==s){
                count=1;
            }
        }
        if(count==1)
            System.out.print("HAve");
        else
            System.out.print("not");
    }
}
