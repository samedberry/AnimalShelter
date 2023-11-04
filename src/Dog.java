public abstract class Dog implements AdoptableAnimal {
    protected String name;
    protected String description;
    protected double price;

    public Dog() {
        this.name = "No Name";
        this.description = "No Description";
        this.price = 0.00;
    }

    public Dog(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    abstract String getBreed();
}
