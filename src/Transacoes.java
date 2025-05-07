import java.util.*;

public class Transacoes {
    public static List<String> invalidTransactions(List<String> transactions) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < transactions.size(); i++) {
            String[] parts1 = transactions.get(i).split(",");
            String name1 = parts1[0];
            int time1 = Integer.parseInt(parts1[1]);
            int amount1 = Integer.parseInt(parts1[2]);
            String city1 = parts1[3];

            boolean isInvalid = false;

            if (amount1 > 1000) {
                isInvalid = true;
            }

            for (int j = 0; j < transactions.size(); j++) {
                if (i == j) continue;

                String[] parts2 = transactions.get(j).split(",");
                String name2 = parts2[0];
                int time2 = Integer.parseInt(parts2[1]);
                String city2 = parts2[3];

                if (name1.equals(name2) && !city1.equals(city2) && Math.abs(time1 - time2) <= 60) {
                    isInvalid = true;
                    break;
                }
            }

            if (isInvalid) {
                result.add(transactions.get(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> transactions = Arrays.asList(
                "alice,20,800,mtv",
                "alice,50,1200,mtv"
        );
        System.out.println(invalidTransactions(transactions));
    }
}
