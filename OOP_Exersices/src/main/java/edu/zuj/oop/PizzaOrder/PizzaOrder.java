package edu.zuj.oop.PizzaOrder;

public class PizzaOrder {

    private String pizzaType;
    private int quantity;
    private char size;

    public PizzaOrder() {
        this("Detroit pizza", 2, 'S');
    }

    public PizzaOrder(String pizzaType, int quantity, char size) {
        setPizzaType(pizzaType);
        setQuantity(quantity);
        setSize(size);
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        if (pizzaType.equalsIgnoreCase("Greek Pizza")) {
            this.pizzaType = pizzaType;
        }
        if (pizzaType.equalsIgnoreCase("Detroit Pizza")) {
            this.pizzaType = pizzaType;
        }
        if (pizzaType.equalsIgnoreCase("California Pizza")) {
            this.pizzaType = pizzaType;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        if (size == 's' || size == 'S') {
            this.size = 'S';
        }
        if (size == 'l' || size == 'L') {
            this.size = 'L';
        }
    }

    public double calculatePizzaCost() {
        double cost = 0;
        switch (this.pizzaType) {
            case "Greek Pizza":
                cost += 6.0;
                break;
            case "Detroit Pizza":
                cost += 4.0;
                break;
            case "California Pizza":
                cost += 3.5;
                break;
        }
        switch (this.size) {
            case 'S':
                cost += 0.75;
                break;
            case 'L':
                cost += 1.25;
                break;
        }

        cost = (cost * getQuantity());
        return cost;
    }

    @Override
    public String toString() {
        return "PizzaOrder{" + "pizzaType=" + pizzaType + ", quantity=" + quantity + ", size=" + size + '}';
    }

}
