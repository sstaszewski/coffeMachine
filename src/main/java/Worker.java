public class Worker implements RestoreAmounts {

    @Override
    public int restoreAmount(Coffee coffee) {
        return coffee.setAmount(50);
    }

}