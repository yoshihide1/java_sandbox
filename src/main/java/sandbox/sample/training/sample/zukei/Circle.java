package sandbox.sample.training.sample.zukei;

/**
 * 円を表すクラス
 */
public record Circle(double radius) implements Shape {

    public double area() {
        return this.radius * this.radius * Math.PI;
    }

    public String formula() {
        return String.format("%s × %s × %s = %s", this.radius, this.radius, Math.PI, area());
    }
}