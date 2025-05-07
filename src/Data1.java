public class Data1 {
    public static void main(String[] args) {
        int[] data = extractDateData("21/07/2010");
        System.out.println("Dia: " + data[0]);
        System.out.println("Mês: " + data[1]);
        System.out.println("Ano: " + data[2]);
    }

    public static int[] extractDateData(String date) {
        String[] data = date.split("/");

        int dia = Integer.parseInt(data[0]);
        int mes = Integer.parseInt(data[1]);
        int ano = Integer.parseInt(data[2]);

        return new int[]{dia, mes, ano};
    }
}
