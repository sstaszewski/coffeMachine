import java.util.Scanner;

public class Machine implements GiveChange {
    double change;

    @Override
    public void giveChange(Coffee coffee) {
        final double[] NOMINALY = {200.0, 100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        String wynik = "Change is: \n";

        Scanner scanner = new Scanner(System.in);
        double puttedMoney = scanner.nextDouble();
        for (int i = 0; ((i < NOMINALY.length) && (puttedMoney > 0.00)); i++) {
            if (puttedMoney >= NOMINALY[i]) {
                int temp = (int) Math.floor(puttedMoney / NOMINALY[i]);
                wynik += NOMINALY[i] + " PLN x " + temp + "\n";
                puttedMoney = (double) Math.round(100 * (puttedMoney - (temp * NOMINALY[i]))) / 100;
            }
        }
        System.out.println(wynik);
    }

}