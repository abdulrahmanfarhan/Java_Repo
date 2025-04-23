package chapter10.ObjectOrientedThinking.MyPoint;

public class MyPoint {

    private double x;
    private double y;

    public MyPoint() {
        setX(0);
        setY(0);
    }

    public MyPoint(double x, double y) {
        setX(x);
        setY(y);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint p) {
        double x1 = p.getX();
        double y1 = p.getY();

        double x2 = this.getX();
        double y2 = this.getY();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public double distance(int x, int y) {
        double x1 = x;
        double y1 = y;

        double x2 = this.getX();
        double y2 = this.getY();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public double distance(MyPoint p1, MyPoint p2) {
        double x1 = p1.getX();
        double y1 = p1.getY();

        double x2 = p2.getX();
        double y2 = p2.getY();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Override
    public String toString() {
        return "MyPoint{" + "x=" + x + ", y=" + y + '}';
    }
    
    

}
