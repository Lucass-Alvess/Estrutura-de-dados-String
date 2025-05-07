public class PrefixoComum {

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

        public static void main (String[]args){
            String[] p1 = {"flowers", "flow", "flight"};
            String[] p2 = {"dog", "racecar", "car"};
            System.out.println(longestCommonPrefix(p1));
            System.out.println(longestCommonPrefix(p2));
        }

    }
