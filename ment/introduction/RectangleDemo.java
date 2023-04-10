package ment.introduction;

public class RectangleDemo {
    public static void main(String[] args) {
        // Create a Rectangle Object and assign its
        // address to the box variable.
        Rectangle box = new Rectangle(20.0, 10.0);

        // Call the box object's setLength method.
        box.setLength(10.0);

        // Call the box object's setWidth method.
        box.setWidth(20.0);

        // Display the object's length and width.
        System.out.println("The box's length is " + box.getLength());
        System.out.println("The box's width is " + box.getWidth());

        // Calculate the area of the box
        System.out.println("The area of the Box is " + box.getArea());

        // Calculate the Perimeter of the box
        System.out.println("The Perimeter of the Box is " + box.getPerimeter());

        // Check if the box is Square
        System.out.println("Is the box is Square " + box.isSquare());

    }
}
