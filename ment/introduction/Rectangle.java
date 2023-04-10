package ment.introduction;

/**
 * Description: Rectangle class will be able to hold data about rectangle.
 */
public class Rectangle {
    private double length;
    private double width;

    /**
     * Constructor with no args
     */
    public Rectangle() {
        this.length = 1.0;
        this. width = 1.0;
    }

    /**
     * Constructor
     * @param length
     * @param width
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this. width = width;
    }

    /**
     * The setLength method stores a value in the length field.
     * @param length the value to store in length
     */

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * The setWidth method store a value in the width field.
     * @para width the value to store in width;
     */

    public void setWidth(double width) {
        this.width =  width;
    }

    /**
     * The getLength method returns a Rectangle Object's length
     * @return the value in the length field
     */
    public double getLength(){
        return length;
    }

    /**
     * The getWidth method returns a Rectangle Object's width
     * @return the value in the width field
     */
    public double getWidth(){
        return width;
    }

    /**
     * The getArea method returns a Rectangle Object's Area
     * @return The product of length times width
     */

    public double getArea(){
        return width * length;
    }

    /**
     * The getPerimeter method returns a Rectangle Object's Perimeter
     * @return The Perimeter of rectangle
     */

    public double getPerimeter(){
        return 2 * (width + length);
    }

    /**
     * The isSquare method returns boolean to check if Rectangle object is Square
     * @return boolean
     */
    public boolean isSquare(){
        return length == width;
    }

}


