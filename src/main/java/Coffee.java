public class Coffee {
    private String name;
    private int size;
    private boolean milk;
    private double price;
    private int amount;

    public Coffee(String name, int size, boolean milk, double price, int amount) {
        this.name = name;
        this.size = size;
        this.milk = milk;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public int setAmount(int amount) {
        this.amount = amount;
        return amount;
    }
}
