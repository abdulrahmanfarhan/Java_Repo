package chapter10.ObjectOrientedThinking.MyInteger;

public class MyInteger {

    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return this.value % 2 == 0;
    }

    public boolean isOdd() {
        return this.value % 2 != 0;
    }

    public boolean isPrime() {
        if (this.value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(this.value); i++) {
            if (this.value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger num) {
        return num.getValue() % 2 == 0;
    }

    public static boolean isOdd(MyInteger num) {
        return num.getValue() % 2 != 0;
    }

    public static boolean isPrime(MyInteger num) {
        if (num.getValue() <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num.getValue()); i++) {
            if (num.getValue() % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(int n) {
        return this.getValue() == n;
    }

    public boolean equals(MyInteger n) {
        return this.getValue() == n.getValue();
    }
    
    
}
