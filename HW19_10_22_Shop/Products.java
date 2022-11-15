package HW_Java.HW19_10_22_Shop;

public class Products {
    private String name;
    private double price;
    private double additionalPrice;

    public Products(String name, double price, double additionalPrice) {
        this.name = name;
        this.price = price;
        this.additionalPrice = additionalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAdditionalPrice() {
        return additionalPrice;
    }

    public void setAdditionalPrice(double additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    @Override
    public String toString() {
        return "Products " + " name='" + name + '\'' +
                ", price=" + price +
                ", additionalPrice=" + additionalPrice + "\n" + "For urgent delivery there is a surcharge of $18";
    }
}


