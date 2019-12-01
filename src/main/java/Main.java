import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Coffee sWCoffee = new Coffee("Small, white coffe", 200, true, 5.0, 50);
        Coffee bWCoffee = new Coffee("Big, white coffe", 400, true, 8, 50);
        Coffee sBCoffee = new Coffee("Small, black coffe", 200, false, 4, 50);
        Coffee bBCoffee = new Coffee("Big, black coffe", 400, false, 7, 50);

        Client client1 = new Client(25);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your options: ");
        System.out.println("1- " + sWCoffee.getName());
        System.out.println("2- " + bWCoffee.getName());
        System.out.println("3- " + sBCoffee.getName());
        System.out.println("4- " + bBCoffee.getName());

        int choosenOption = scanner.nextInt();
        Machine machine = new Machine();
        switch (choosenOption) {
            case (1):
                client1.buyCoffee(machine,sWCoffee);
                machine.giveChange();
                break;
            case (2):
                client1.buyCoffee(machine, bWCoffee);
                machine.giveChange();
                break;
            case (3):
                client1.buyCoffee(machine, sBCoffee);
                machine.giveChange();
                break;
            case (4):
                client1.buyCoffee(machine, bBCoffee);
                machine.giveChange();
                break;
            default:
                System.out.println("you choose poorly");
                break;
        }

        Worker worker = new Worker();
        worker.restoreAmount(sBCoffee);

    }
}
