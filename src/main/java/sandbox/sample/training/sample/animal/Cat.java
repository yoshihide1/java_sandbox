package sandbox.sample.training.sample.animal;

public class Cat implements Animal {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void bark() {
        System.out.println("にゃー！");
    }

    @Override
    public void name() {
        System.out.println(this.name);
    }

}
