//        A `getName` method that returns a string
//        A `getDescription` method that returns a string
//        A `getPrice` method that returns a double

public interface AdoptableAnimal {
    private String name;
    private String description;
    private double price;


    public AdoptableAnimal() {
        this.name = "No Name";
        this.description = "No Description";
        this.price = 0.00;
    }

    public AdoptableAnimal(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public String getName() {
        return this.name;
    }


}
