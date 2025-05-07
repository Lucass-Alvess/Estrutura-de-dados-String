public class Senha {
    public static void main(String[] args) {
        String senha = "Amerca1@";
        boolean verifica = validatePassword(senha);

        System.out.println(verifica ? "Valido" : "INVALIDA");
    }

    public static boolean validatePassword(String str) {
        boolean tamanho = str.length() >= 8;
        boolean especias = false;
        boolean temMaiuscula = false;
        boolean temMinuscula = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '@' || c == '#' || c == '&') {
                especias = true;
            }
            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            }
            if (Character.isLowerCase(c)) {
                temMinuscula = true;
            }

            if (tamanho && especias && temMaiuscula && temMinuscula) {
                return true;
            }
        }

        return tamanho && especias && temMaiuscula && temMinuscula;
    }

    public static boolean validatePassword2(String senha) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#&]).{8,}$";
        return senha.matches(regex);
    }
}
