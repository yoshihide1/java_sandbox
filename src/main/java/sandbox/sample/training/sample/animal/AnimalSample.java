package sandbox.sample.training.sample.animal;

public class AnimalSample {
    public static void main(String[] args) {
        var dog = new Dog("ポチ"); // Animal
        var cat = new Cat("ミケ"); // Dog

        move(dog);
        move(cat);
    }

    /**
     * 鳴かす
     * 
     * @param animal
     */
    private static void move(Animal animal) {
        animal.bark();
        animal.name();

    }
}
