public class Cpf {
    public static void main(String[] args) {
        String str = "874.092.172-93";
        System.out.println(removeNonDigits("Primera Formar " + removeNonDigits(str)));
        System.out.println(removeNonDigits("Secunda Formar " + removeNonDigits2(str)));
    }

    public static String removeNonDigits(String str) {
        return str.replaceAll("[.-]", "");
    }

    public static String removeNonDigits2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

}
