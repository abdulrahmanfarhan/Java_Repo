package circlesummary;

public class CreatArrayOfObj {
    public static Circle[] Creat(int num) {
        
    Circle a[] = new Circle[num];
        for (int i = 0; i < a.length; i++) {
            int randomNum = (int) (Math.random() * 100);
            a[i] = new Circle(randomNum);
        }
        return a;
    }
}
