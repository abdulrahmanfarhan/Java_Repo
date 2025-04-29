package edu.zuj.oop.car;

public class Car {

    private String brand;
    private String model;
    private int year;
    private double price;
    private double speed;

    Car() {
        
    }

    Car(String brand, String model, int year, double price) {
        setAllData(brand, model, year, price);
    }

    public void setAllData(String brand, String model, int year, double price) {
        setBrand(brand);
        setModel(model);
        setYear(year);
    }

    private void setBrand(String brand) {
        if (brand != null) {
            this.brand = brand;
        }
    }

    private void setModel(String model) {
        if (model != null) {
            this.model = model;
        }
    }

    private void setYear(int year) {
        if (year > 2000) {
            this.year = year;
        }
    }

    private void setPrice(double price) {
        if (price > 3000) {
            this.price = price;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public double getPrice() {
        return price;
    }

    public void accelerate(double value) {
        if (value > 0) {
            speed += value;
        } else {
            //else here, if you want to break the speed, and the argumentd had negetive value
            if (this.speed >= 0) {
                speed += value;
            }
        }
    }

    @Override
    public String toString() {
        return "Car{" + "brand=" + brand + ", model=" + model + ", year=" + year + ", price=" + price + ", speed=" + speed + '}';
    }

}
