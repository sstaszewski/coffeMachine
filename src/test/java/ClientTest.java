import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void buyCoffee() {
        double wallet;
        for (wallet = -1; wallet < 10; wallet++) {
            Client testClient = new Client(wallet);

        }
    }

    @Test
    public void buyCoffee2() {
        double wallet2;
        double coffeePrice;
        double change;
        for (wallet2 = -4; wallet2 < 10; wallet2++) {
            for (coffeePrice = -1; coffeePrice < 5; coffeePrice++) {
                change = wallet2 - coffeePrice;
            if(change<0){
                System.out.println("ok");
            }
            else {
                System.out.println("not ok");
            }
            }
        }
    }
}