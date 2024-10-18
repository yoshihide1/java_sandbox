package sandbox.sample.training.sample.animal;

public class Dog implements Animal {

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void bark() {
        System.out.println("ワン！");
    }

    @Override
    public void name() {
        System.out.println(this.name);
    }

    public void sit() {
        System.out.println("お座りした");
    }

}
