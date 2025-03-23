package chapter9.objects_classes.StopWatch;

/**
 *
 * @author Abdulrahman
 * This Test class was created using ChatGPT AI model.
 */
import java.util.Random;

public class TestStopWatch {

    public static void main(String[] args) {
        int size = 100000;
        int[] numbers = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(100000);
        }

        // إنشاء كائن ساعة التوقيت
        StopWatch stopwatch = new StopWatch();

        // بدء التوقيت
        stopwatch.start();

        // تنفيذ خوارزمية Selection Sort
        selectionSort(numbers);

        // إيقاف التوقيت
        stopwatch.stop();

        // طباعة الزمن المنقضي
        System.out.println("Elapsed time for sorting 100,000 numbers: " + stopwatch.getElapsedTime() + " milliseconds");
    }

    // خوارزمية الترتيب Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // تبديل القيم
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
