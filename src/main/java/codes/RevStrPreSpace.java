package codes;

public class RevStrPreSpace {
    public static void main(String[] args) {

        String s="This is my pen";
        //        nepy ms is ihT

        StringBuilder sb=new StringBuilder(s);
       // System.out.println(sb);

//        int i=0,j=s.length()-1;
//
//        while(i<j){
//
//           if(sb.charAt(i)==' '){
//               i++;
//           }
//
//            if(sb.charAt(j)==' '){
//                j--;
//            }
//
//            if(sb.charAt(i)!=' ' && sb.charAt(j)!=' '){
//                char a=sb.charAt(i);//T
//                char b=sb.charAt(j);//n
//
//                sb.setCharAt(i,b);//0,n
//                sb.setCharAt(j,a);//13,T
//                i++;
//                j--;
//            }

        for(int i=0,j=s.length()-1;i<j; ){

            if(sb.charAt(i)==' '){
                i++;
            }

            if(sb.charAt(j)==' '){
                j--;
            }

            if(sb.charAt(i)!=' ' && sb.charAt(j)!=' '){
                char a=sb.charAt(i);//T
                char b=sb.charAt(j);//n

                sb.setCharAt(i,b);//0,n
                sb.setCharAt(j,a);//13,T
                i++;
                j--;
            }
        }
        System.out.println(sb);
    }
}
