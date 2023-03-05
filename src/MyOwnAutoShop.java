public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(105,65000,"matte black",27);
        Ford ford1st = new Ford(90,40000,"grey", 2012,20);
        Ford ford2nd = new Ford(65,20000,"tan",2009,25);
        Car car = new Car(75,50000,"white");
        
        System.out.println("The Sedan costs "+ sedan.getSalePrice());
        System.out.println("The first ford costs "+ ford1st.getSalePrice());
        System.out.println("The second ford costs "+ ford2nd.getSalePrice());
        System.out.println("The average cost of a car is "+ car.getSalePrice());
        


    }


}
