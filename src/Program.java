public class Program {
    public static void main(String[] args) {
        Beverage order1 = new Esspresso();
        order1 = new Milk(order1);
        order1 = new Soy(order1);

        System.out.println(order1.GetCost());
    }
}
