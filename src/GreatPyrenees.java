public class GreatPyrenees extends Dog {


    public GreatPyrenees(String name, String description, double price) {
        super(name, description, price);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    String getBreed() {
        return "Great Pyrenees";
    }
}