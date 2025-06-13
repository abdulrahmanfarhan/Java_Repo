package chapter11.InheritanceAndPolymorphism.Queue;

public class Test {

    public static void main(String[] args) {
        Queue q = new Queue();
        for (int i = 0; i < 20; i++) {
            q.enQueue(i + 1);
            System.out.println(i + 1 + ". is enQueue!");
        }
        System.out.println("-----------------");
        System.out.println("The Queue size is " + q.getSize());
        System.out.println("-----------------");
        for (int i = 0; i < 20; i++) {
            System.out.println("the (" + q.deQueue() + ") is deQueue!");
        }
        System.out.println("-----------------");
        System.out.println("-----The End-----");
    }
}
