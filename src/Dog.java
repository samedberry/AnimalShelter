//It should implement the `AdoptableAnimal` interface.
//Unlike Cat, you can choose to not `@Override` the underlying methods here and instead do that in the concrete child classes.
//An abstract `getBreed` method that returns a string.
//A constructor allowing me to provide a name, description, and price.

public abstract class Dog implements AdoptableAnimal {
    abstract void getBreed();
}
