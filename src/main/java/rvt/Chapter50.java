package rvt;

public class Chapter50 {
    private double width;
    private double height;
    private double length;

    public Chapter50(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Chapter50(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    public Chapter50(Chapter50 oldBox){
        this.width = oldBox.width;
        this.height = oldBox.height;
        this.length = oldBox.length;
    }

    public double width() {
        return width;
    }

    public double height() {
        return height;
    }

    public double length() {
        return length;
    }

    public double volume() {
        return width * height * length;
    }

    private double faceArea() {
        return width * height;
    }

    private double topArea() {
        return width * length;
    }

    private double sideArea() {
        return height * length;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    public Chapter50 biggerBox(Chapter50 oldBox) {
        return new Chapter50(oldBox.width * 1.25, oldBox.height * 1.25, oldBox.length * 1.25);
    }

    public Chapter50 smallerBox(Chapter50 oldBox) {
        return new Chapter50(oldBox.width * 0.75, oldBox.height *0.75 , oldBox.length * 0.75);
    }

    public boolean nests(Chapter50 outsideBox) {
        return this.width < outsideBox.width && this.height < outsideBox.height && this.length < outsideBox.length;
    }

    public static class MainProgram {
        public static void main(String[] args) {

            Chapter50 box = new Chapter50(2.5, 5.0, 6.0);
            System.out.println("Original Box:");
            System.out.println("Dimensions: " + box.width() + " x " + box.height() + " x " + box.length());
            System.out.println("Volume: " + box.volume());
            System.out.println("Area: " + box.area());

            Chapter50 bigger = box.biggerBox(box);
            System.out.println("Bigger Box (+25% each dimension):");
            System.out.println("Dimensions: " + bigger.width() + " x " + bigger.height() + " x " + bigger.length());

            Chapter50 smaller = box.smallerBox(box);
            System.out.println("Smaller Box (-25% each dimension):");
            System.out.println("Dimensions: " + smaller.width() + " x " + smaller.height() + " x " + smaller.length());

            System.out.println("Does smaller fit inside original? " + smaller.nests(box));
            System.out.println("Does original fit inside smaller? " + box.nests(smaller));

            Chapter50 copy = new Chapter50(box);
            System.out.println("Copy of original box dimensions: " + copy.width() + " x " + copy.height() + " x " + copy.length());
        }
    }
}


