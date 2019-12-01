import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {


        Coffee sWCoffee = new Coffee("Small, white coffe", 200, true, 5.0, 50);
        Coffee bWCoffee = new Coffee("Big, white coffe", 400, true, 8, 50);
        Coffee sBCoffee = new Coffee("Small, black coffe", 200, false, 4, 50);
        Coffee bBCoffee = new Coffee("Big, black coffe", 400, false, 7, 50);

        Client client1 = new Client(25);

        client1.buyCoffee(sBCoffee);


    }
}
