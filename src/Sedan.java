public class Sedan extends Car {
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public double getSalePrice() {
        // for this method implement this: If length>20 feet, 5%discount, Otherwise, 10%discount
        return super.getSalePrice() * (length < 20 ? 0.95 : 0.90);
    }
}