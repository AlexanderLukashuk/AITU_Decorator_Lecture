public class Soy extends Beverage {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double GetCost() {
        return beverage.GetCost() + 0.11;
    }
}
