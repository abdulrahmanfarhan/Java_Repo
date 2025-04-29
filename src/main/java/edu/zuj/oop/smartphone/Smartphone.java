package edu.zuj.oop.smartphone;

public class Smartphone {

    private String brand;
    private int storage;

    public Smartphone() {
        this("Generic", 64);
    }

    public Smartphone(String brand, int storage) {
        setBrand(brand);
        setStorage(storage);
    }

    public void setBrand(String brand) {
        if (brand != null) {
            this.brand = brand;
        }
    }

    public void setStorage(int storage) {
        if (storage>=32 && storage<=1024) {
            this.storage = storage;
        }
    }

    public String getBrand() {
        return brand;
    }

    public int getStorage() {
        return storage;
    }

    public double getBrandCost() {
        double cost = 0;
        if (brand.equalsIgnoreCase("Apple")) {
            cost = 1000;
        } else if (brand.equalsIgnoreCase("Samsung")) {
            cost = 800;
        } else if (brand.equalsIgnoreCase("Generic")) {
            cost = 500;
        }
        return cost;
    }

    public double getStorageCost() {
        double cost = 0;
        if (storage >= 32 && storage <= 128) {
            cost = (storage * 4);
        } else if (storage > 128 && storage <= 512) {
            cost = (storage * 3);
        } else if (storage > 512 && storage <= 1024) {
            cost = (storage * 3);
        }
        return 0;
    }

    public double getTotalCost() {
        return (getBrandCost() + getStorageCost());
    }

    public void upgradeStorage(int value) {
        setStorage(getStorage() + value);
    }

    @Override
    public String toString() {
        return "Smartphone{" + "brand=" + brand + ", storage=" + storage + '}';
    }

}
