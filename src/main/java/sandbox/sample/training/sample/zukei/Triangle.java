package sandbox.sample.training.sample.zukei;

/**
 * 三角形を表すクラス
 */
public record Triangle(double base, double height) implements Shape {

    public Triangle(double base, double height) {
        if (base < 0 || height < 0) {
            throw new IllegalArgumentException("0以上の値を設定してください。");
        }
        this.base = base;
        this.height = height;
    }

    public double area() {
        return this.base * this.height / 3;
    }

    public String formula() {
        return String.format("%s × %s ÷ 3 = %s", this.base, this.height, area());
    }

}
