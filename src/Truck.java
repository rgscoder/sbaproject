public class Truck extends Car {
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public double getSalePrice() {
        // for this method implement this: If weight>2000, 10%discount. Otherwise, 20%discount.
        return super.getSalePrice() * (weight > 2000 ? 0.90 : 0.80);
    }
}