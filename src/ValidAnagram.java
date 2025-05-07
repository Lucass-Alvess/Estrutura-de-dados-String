import java.util.Arrays;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        String[] s2 = s.split("");
        String[] t2 = t.split("");

        Arrays.sort(s2);
        Arrays.sort(t2);

        return Arrays.equals(s2, t2);
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }



    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        String s2 = "car";
        String t2 = "rat";

        isAnagram(s, t);
        System.out.println(isAnagram(s, t));
        System.out.println(isAnagram(s2, t2));
        System.out.println(isAnagram2(s, t));
        System.out.println(isAnagram2(s2, t2));
    }
}
