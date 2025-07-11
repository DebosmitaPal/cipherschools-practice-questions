public class Laptop {
    String brand;
    String model;
    double price;
    public Laptop(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: Rs " + price);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Dell", "Inspiron 15", 55000.0);
        Laptop laptop2 = new Laptop("HP", "Pavilion x360", 62000.0);
        System.out.println("Laptop 1 Details:");
        laptop1.displayDetails();

        System.out.println("Laptop 2 Details:");
        laptop2.displayDetails();
        if (laptop1.price > laptop2.price) {
            System.out.println("Laptop 1 is more expensive.");
        } else if (laptop1.price < laptop2.price) {
            System.out.println("Laptop 2 is more expensive.");
        } else {
            System.out.println("Both laptops have the same price.");
        }
    }
}

