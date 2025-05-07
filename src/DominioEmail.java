public class DominioEmail {
    public static void main(String[] args) {
        String email = "joao.silva23@yahoo.com.br";
        emailInfoextractEmailInformation(email);
    }

    public static void emailInfoextractEmailInformation(String email) {
        String[] user = email.split("@");
        System.out.println("Usuario: " + user[0]);
        System.out.println("Dominio:: " + user[1]);
        Boolean dominio = user[1].endsWith("br");
        System.out.println("Brasileiro: " + (dominio? "sim":"nao"));

    }


}


