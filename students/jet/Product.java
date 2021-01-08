public class Product {

    private String name;
    private double price;
    private double discount;
    private String ProductInfo;

    public Product(String name, double price, double discount)
    {
        setName(name);
        setPrice(price);
        setDiscount(discount);
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setDiscount(double discount)
    {
        this.discount = discount;
    }
    public String getProductInfo() {
        double discountedPrice = 1-discount;
        double totalPrice= discountedPrice * price;

        System.out.println ("Product Name: " + name);
        System.out.println("Discount: " + discount +"%");
        System.out.println("Full Price: " + price);
        System.out.println("Discounted Price: " + totalPrice);

        return getProductInfo();
    }
}
