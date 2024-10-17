package sandbox.sample.training.sample.zukei;

/**
 * 三角形を表すクラス
 */
public record Triangle(double base, double height) implements Shape {

    public double area() {
        return this.base * this.height / 3;
    }

    public String formula() {
        return String.format("%s × %s ÷ 3 = %s", this.base, this.height, area());
    }

}
