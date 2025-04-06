package chapter9.objectsClasses.StopWatch;

import java.util.Date;

/**
 *
 * @author Abdulrahman
 */
public class StopWatch {

    private long startTime;
    private long endTime;

    StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return (endTime - startTime);
    }
}
