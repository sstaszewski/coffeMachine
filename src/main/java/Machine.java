public class Machine {
    public String giveChange() {
        final double[] NOMINALY = {200.0, 100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        double change = 0;

        String wynik = "Change is: \n";

        for (int i = 0; ((i < NOMINALY.length) && (change > 0.00)); i++) {
            if (change >= NOMINALY[i]) {
                int temp = (int) Math.floor(change / NOMINALY[i]);
                wynik += NOMINALY[i] + " PLN x " + temp + "\n";
                change = (double) Math.round(100 * (change - (temp * NOMINALY[i]))) / 100;
            }
        }
     return wynik;
    }

}