package lect5;

public class string {
    public static void main(String[] args){
//        StringBuilder str =new StringBuilder("hello");
//        1.
//        str.append("byee");
//        2.
//        str.insert(1,"hello");
//        3.
//        str.replace(2,3,"k");
//         4.
//           str.delete(2,4);
//        5.
//          str.reverse();
//          6. length
//           str.length();
////           7.capacity-it tells about the capacity of the
//           str.capacity();
//        String str =new String("i love java");
//        String []ch=str.split(" ");
//        StringBuilder result=new StringBuilder();
//        for(String c:ch){
//            StringBuilder rev=new StringBuilder(c);
//            result.append(rev.reverse()).append(" ");
//        }
//        System.out.println(result);
        String str="bbhhnn";
        StringBuilder result=new StringBuilder();
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                result.append(str.charAt(i-1)).append(count);
                count=1;
            }

        }
        result.append(str.charAt(str.length() - 1)).append(count);
        System.out.println(result);








    }
}
