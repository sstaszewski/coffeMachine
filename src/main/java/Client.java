public class Client implements buyCoffee {
    private double wallet;

    @Override
    public void buyCoffee(Machine machine, Coffee coffee) {
        if (wallet >= coffee.getPrice()) {
            coffee.setAmount(coffee.getAmount() - 1);
            setWallet(getWallet() - coffee.getPrice());
            System.out.println("Client bought: " + coffee.getName());
            machine.giveChange(coffee);
        } else {
            System.out.println("You're poor! You suck!");
        }
         machine.giveChange(coffee);
    }


    public Client(double wallet) {
        this.wallet = wallet;
    }

    public double getWallet() {
        return wallet;
    }

    public double setWallet(double wallet) {
        this.wallet = wallet;
        return wallet;
    }


}