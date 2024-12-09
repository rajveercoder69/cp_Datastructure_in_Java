import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class civi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> powers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            powers.add(scanner.nextInt());
        }

        Collections.sort(powers);

        long teamAPower = 0;
        long teamBPower = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                teamAPower += powers.get(i);
            } else {
                teamBPower += powers.get(i);
            }
        }

        long powerDifference = Math.abs(teamAPower - teamBPower);
        System.out.println(powerDifference);
    }
}
