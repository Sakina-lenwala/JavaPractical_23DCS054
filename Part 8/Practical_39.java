import java.util.Arrays;

public class Practical_39 {

    public static <T extends Comparable<T>> void sort(T[] array) {
        Arrays.sort(array);
    }

    static class Product implements Comparable<Product> {
        private String name;
        private double price;
        private double rating;

        public Product(String name, double price, double rating) {
            this.name = name;
            this.price = price;
            this.rating = rating;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public double getRating() {
            return rating;
        }

        public int compareTo(Product other) {
            // Default sorting by name, can be changed as per requirements
            return this.name.compareTo(other.name);
        }

        public String toString() {
            return "Product{name='" + name + "', price=" + price + ", rating=" + rating + "}";
        }
    }

    public static void main(String[] args) {
        Product[] products = {

                new Product("Smartphone", 800.00, 4.7),
                new Product("Laptop", 1200.00, 4.5),
                new Product("Tablet", 400.00, 4.3)
        };

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(products));

        sort(products);

        System.out.println("After sorting by name:");
        System.out.println(Arrays.toString(products));
    }
}
