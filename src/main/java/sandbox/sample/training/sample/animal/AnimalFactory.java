package sandbox.sample.training.sample.animal;

/**
 * 仮想動物を生成するファクトリークラス
 */
public class AnimalFactory {

    public static Animal createDog(String name) {
        return new Dog(name);
    }

    public static Animal createCat(String name) {
        return new Cat(name);
    }
}
