public class Milk extends Decorator {

    private Beverage beverage;

    public Milk(Beverage bev) {
        beverage = bev;
    }


    @Override
    public double GetCost() {
        return beverage.GetCost() + 0.15;
    }
}
