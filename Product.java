public class Product {
    private String name;
    private double price;
    private String productCode;
    private int numberOfPieses;

    public Product(String name, double price, String productCode, int numberOfPiases) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfPieses = numberOfPiases;
    }


    public Product(String name, double price, String productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfPieses = 0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int getNumberOfPiases() {
        return numberOfPieses;
    }

    public void setNumberOfPiases(int numberOfPiases) {
        if (numberOfPiases >= 0) {
            this.numberOfPieses = numberOfPiases;
        }
    }

    public String getName() {
        return name;
    }

    public String getProductCode() {
        return productCode;
    }
}
