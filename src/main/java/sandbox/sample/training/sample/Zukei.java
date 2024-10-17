package sandbox.sample.training.sample;

import sandbox.sample.training.sample.zukei.Circle;
import sandbox.sample.training.sample.zukei.Rectangle;
import sandbox.sample.training.sample.zukei.Shape;

public class Zukei {
    public static void main(String[] args) {
        var circle = new Circle(3);
        showFormula(circle);
        showArea(circle);

        var rectangle = new Rectangle(0.2, -4);
        showFormula(rectangle);
        showArea(rectangle);

    }

    /**
     * 面積を表示する
     * 
     * @param shape
     */
    private static void showArea(Shape shape) {
        System.out.println(shape.area());
    }

    /**
     * 式を表示する
     * 
     * @param shape
     */
    private static void showFormula(Shape shape) {
        System.out.println(shape.formula());
    }
}
