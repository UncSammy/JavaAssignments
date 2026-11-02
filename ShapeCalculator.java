public class ShapeCalculator {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5, "Red"),
                new Rectangle(4, 6, "Blue"),
                new Triangle(3, 8, "Green")
        };

        System.out.println("Shape Calculator");

        for (Shape shape : shapes) {
            System.out.println(
                    shape.getClass().getSimpleName()
                            + " | Color: " + shape.getColor()
                            + " | Area: " + shape.calculateArea()
            );
        }
    }
}