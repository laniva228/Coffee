public class Sugar implements Coffee {
    private Coffee coffee;

    public Sugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Сахар";
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 100; // +100 тг
    }
}