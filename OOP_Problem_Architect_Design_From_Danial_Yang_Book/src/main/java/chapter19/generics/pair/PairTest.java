package chapter19.generics.pair;

public class PairTest {
    public static void main(String[] args) {
        // اختبار مع Integer
        Pair<Integer> intPair = Pair.of(10, 20);
        System.out.println("Integer Pair: (" + intPair.getFirst() + ", " + intPair.getSecond() + ")");

        // اختبار مع String
        Pair<String> stringPair = Pair.of("Abdulrahman", "Ali");
        System.out.println("String Pair: (" + stringPair.getFirst() + ", " + stringPair.getSecond() + ")");

        // اختبار مع Double
        Pair<Double> doublePair = Pair.of(3.14, 2.71);
        System.out.println("Double Pair: (" + doublePair.getFirst() + ", " + doublePair.getSecond() + ")");

        // اختبار مع كائنات مخصصة
        Person p1 = new Person("John", 25);
        Person p2 = new Person("Jane", 30);
        Pair<Person> personPair = Pair.of(p1, p2);
        System.out.println("Person Pair: (" + personPair.getFirst() + ", " + personPair.getSecond() + ")");

        // مقارنة العناوين (لاحظ: لأن equals لم يُعرف في Pair أو Person)
        Pair<Integer> anotherIntPair = Pair.of(10, 20);
        System.out.println("intPair == anotherIntPair? " + (intPair == anotherIntPair));
        System.out.println("intPair.equals(anotherIntPair)? " + intPair.equals(anotherIntPair));
    }
}

// كلاس Person تجريبي للاختبار
class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
