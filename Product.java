public class Product {
  private String name;
  private double price;
  private int quantity;

  public static void main(String[] args) {

    Product product = new Product("Example Product", 10.99, 100);

    System.out.println("Product Name: " + product.getName());
    System.out.println("Price: $" + product.getPrice());
    System.out.println("Quantity: " + product.getQuantity());
  }

  public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }
}
