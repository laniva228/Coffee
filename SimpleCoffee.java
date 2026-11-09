public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Зерновой кофе";
    }

    @Override
    public int getCost() {
        return 1200; // Цена в тенге
    }
}