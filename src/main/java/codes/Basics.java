package codes;

public class Basics {

    public static void main(String[] args) {
//		String str="This is a pen";
//		String res="nepa si s ihT";

        // String str="This is my pen";
//		String res="nepy ms is ihT";

        // String str = "This is a pen";
        // String str ="Hi my pen is This";
        // si hT nep si ymiH

//		String s[] = str.split(" ");
//
//		Map<Integer,String> map=new LinkedHashMap<>();
//
//		for(int i=0;i<s.length;i++) {
//			map.put(i, s[i]);
//		}
//
//		System.out.println(map);
//
//		for(int key:map.keySet()) {
//
//		}

//		//pen a is This
//		String s[] = str.split(" ");
//
//		for (int i = 0, j = s.length - 1; i < j; i++, j--) {
//			swap(i, j, s);
//		}
//
//		for(String t:s) {
//			System.out.print(t+" ");
//		}

        String s = "This is a pen";

        int i = 0, j = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);

        while (i < j) {
            if (sb.charAt(j) == ' ') {
                j++;
            }
            if (sb.charAt(i) == ' ') {
                i++;
            }
            sb.setCharAt(i, sb.charAt(j));
        }

        System.out.println(sb);

    }

    private static void swap(int i, int j, String[] s) {
        String temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

//		String s[] = str.split(" ");
//		String newString[] = new String[s.length];
//		int j = 0;
//
//		for (int i = s.length - 1; i >= 0; i--) {
//			StringBuilder sb = new StringBuilder(s[i]);
//			newString[j] = sb.reverse().toString();
//			j++;
//		}

    // System.out.println(newString);
    // System.out.println(newString[0]+newString[1]+" "+newString[2].charAt(0)+"
    // "+newString[3].substring(1));
//		for(String t:newString) {
//			System.out.println(t);
//		}

}
