public class Client implements buyCoffee {
    private double wallet;
    Client client1 = new Client(25);
    Client client2 = new Client(35);
    double giveChange;

    @Override
    public double buyCoffee(Coffee coffee) {
        if (client1.getWallet() < coffee.getPrice()) {
            coffee.setAmount(coffee.getAmount() - 1);
            giveChange = client1.setWallet(client1.getWallet() - coffee.getPrice());
            System.out.println("client has bought small white coffee");
            return giveChange;
        } else {
            System.out.println("You're poor! You suck!");
        }
        return giveChange;
    }

    public Client(double wallet, double giveChange) {
        this.wallet = wallet;
        this.giveChange = giveChange;
    }

    public Client(double wallet) {
        this.wallet = wallet;
    }

    public double getWallet() {
        return wallet;
    }

    public double getGiveChange() {
        return giveChange;
    }

    public void setGiveChange(double giveChange) {
        this.giveChange = giveChange;
    }

    public double setWallet(double wallet) {
        this.wallet = wallet;
        return wallet;
    }

    public Client getClient1() {
        return client1;
    }

    public void setClient1(Client client1) {
        this.client1 = client1;
    }

    public Client getClient2() {
        return client2;
    }

    public void setClient2(Client client2) {
        this.client2 = client2;
    }
}