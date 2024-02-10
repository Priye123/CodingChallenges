package javabasics;

import java.util.ArrayList;
import java.util.List;

public class PanagramSamsung {
    public static void main(String[] args) {
        String s="Th quick brown fox jumps over the lay dog";//String is immutable
        String t=s.toLowerCase();
       // System.out.println(s);
       //StringBuilder sb=new StringBuilder(s);
//
//        for(int i=0;i<sb.length();i++){
//            sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
//        }
//        System.out.println(sb);

        List<Character> a=new ArrayList<>();
        for(char c='a';c<='z';c++){
            a.add(c);
        }
       // System.out.println(a);

        for(int i=0;i<a.size();i++){
            char ch=a.get(i);
            if(!t.contains(ch+"")){
                System.out.println("Not a Panagram");
                return;
            }
        }
        System.out.println("Panagram");
    }
}
