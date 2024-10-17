package sandbox.sample.training.sample.zukei;

/**
 * 長方形を表すクラス
 */
public record Rectangle(double height, double width) implements Shape {

    public Rectangle(double height, double width) {
        if (height < 0 || width < 0) {
            throw new IllegalArgumentException("0以上の値を設定してください。");
        }
        this.height = height;
        this.width = width;
    }

    public double area() {
        return this.height * this.width;
    }

    public String formula() {
        return String.format("%s × %s = %s", this.height, this.width, area());
    }
}
