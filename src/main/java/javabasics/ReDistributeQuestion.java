package javabasics;

public class ReDistributeQuestion {
    public static void main(String[] args) {
        String words[]={"abc","aabc","bc"};
        int count=0;
        for(String word:words){
            count+=word.length();
        }
        System.out.println(count+" "+count/ words.length);
        if(count% words.length!=0){
            System.out.println("Not possible to distribute");
        }
    }
}
