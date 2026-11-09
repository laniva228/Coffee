public class Milk implements Coffee {
    private Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Молоко";
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 300; // +300 тг
    }
}