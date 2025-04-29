package edu.zuj.oop.product;

public class Product {

    private String pName;
    private String pCategory;
    private double price;
    private int quantityInStock;

    public Product() {
        this("Not Defined", null, 1, 0);
    }

    public Product(String pName, String pCategory, double price, int quantityInStock) {
        setpName(pName);
        setpCategory(pCategory);
        setPrice(price);
        setQuantityInStock(quantityInStock);
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        if (pName != null) {
            this.pName = pName;
        }
    }

    public String getpCategory() {
        return pCategory;
    }

    public void setpCategory(String pCategory) {
        this.pCategory = pCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock > 0) {
            this.quantityInStock = quantityInStock;
        }
    }

    public double calculateStockValue() {
        return this.price * this.quantityInStock;
    }

    public void sellProduct(int q) {
        if (q <= this.quantityInStock) {
            this.quantityInStock -= q;
        } else {
            System.out.println("Insufficient stock");
        }

    }

    @Override
    public String toString() {
        return "Product{" + "pName=" + pName + ", pCategory=" + pCategory + ", price=" + price + ", quantityInStock=" + quantityInStock + '}';
    }
}
