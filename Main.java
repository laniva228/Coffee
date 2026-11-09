public class Main {
    public static void main(String[] args) {

        Coffee coffee1 = new SimpleCoffee();
        System.out.println(coffee1.getDescription() + " : Цена: " + coffee1.getCost() + " тг");

        Coffee coffeeWithMilk = new Milk(coffee1);
        System.out.println(coffeeWithMilk.getDescription() + " : Цена: " + coffeeWithMilk.getCost() + " тг");

        Coffee fullCoffee = new Sugar(coffeeWithMilk);
        System.out.println(fullCoffee.getDescription() + " : Цена: " + fullCoffee.getCost() + " тг");
    }
}