package HW_Java.HW19_10_22_Shop;

public class Mobil {
    private String name;
    private double price;
    private String productWarranty;
    private double additionalPrice;

    public Mobil(String name, double price, String productWarranty, double additionalPrice) {
        this.name = name;
        this.price = price;
        this.productWarranty = productWarranty;
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

    public String getProductWarranty() {
        return productWarranty;
    }

    public void setProductWarranty(String productWarranty) {
        this.productWarranty = productWarranty;
    }

    public double getAdditionalPrice() {
        return additionalPrice;
    }

    public void setAdditionalPrice(double additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    @Override
    public String toString() {
        return "Mobil " + "name='" + name + '\'' +
                ", price=" + price +
                ", productWarranty='" + productWarranty + '\'' +
                ", additionalPrice=" + additionalPrice + "\n" + "Issue a warranty on the product ";
    }
}
