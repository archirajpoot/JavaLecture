package lect4;
import java.util.Arrays;


public class string3 {
    public static void main(String[] args){
//        String str="madam";
//        String newstr="";
//        for(char ch:str.toCharArray()){
//            if(newstr.indexOf(ch)==-1){
//                newstr+=ch;
//            }
//        }
//        System.out.println(newstr);
//        int freq[]=new int[256];
//        for(char ch:str.toCharArray()){
//            freq[ch]++;
//        }
//        for(int i=0;i<256;i++){
//            if(freq[i]>0){
//                System.out.println((char)i+"->"+freq[i]);
//            }
//        }

//        String str="java is a programmingg language";
//        String []ch=str.split(" ");
//        String largest="";
//        int count=0;
//        for(String a:ch){
//            count++;
//        }
//        System.out.print(count);
//        for(String a:ch){
//            if(a.length()>largest.length()){
//                largest=a;
//            }
//        }
//        System.out.println(largest);
//        String str="slient";
//        String str1="listen";
//        int freq[]=new int[256];
//        int freq1[]=new int[256];
//        if(str.length()!=str1.length()){
//            System.out.println("false");
//        }
//        for(char ch:str.toCharArray()){
//            freq[ch]++;
//            freq1[ch]++;
//        }
//        for(int i=0;i<256;i++){
//            if(freq[i]!=freq1[i]){
//                System.out.println("false");
//                (freq[i]==freq1[i]){
//                    System.out.println("true");
//                }
//
//            }
//        }
        String a="archi";
        String b="ircah";
        char []ch=a.toCharArray();
        char []ch1=b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch);
        String str1=new String(ch1);
        String str2=new String(ch);
        if(str1.equals(str2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }






    }
}
