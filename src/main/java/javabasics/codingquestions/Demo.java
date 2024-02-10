package javabasics.codingquestions;

public class Demo {
    public static void main(String[] args) {
        //abcdefghi,k=2
        //badcfe
        String s = "abcdefghijk";
        String newString = "";

        int k = 3;

        for (int i = 0; i < s.length(); i += k) { //O(k)*(s.length-k)
            if (i + k < s.length()) {
                String st = s.substring(i, i + k);
                newString = newString + new StringBuilder(st).reverse().toString();
            } else {
                for (int z = i; z < s.length(); z++)
                    newString = newString + s.charAt(z);
            }
        }
        System.out.println(newString);
    }
}
