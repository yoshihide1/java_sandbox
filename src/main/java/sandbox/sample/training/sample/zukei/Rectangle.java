package sandbox.sample.training.sample.zukei;

/**
 * 長方形を表すクラス
 */
public record Rectangle(double height, double width) implements Shape {

    public double area() {
        return this.height * this.width;
    }

    public String formula() {
        return String.format("%s × %s = %s", this.height, this.width, area());
    }
}
