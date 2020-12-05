package person.billtsui.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author billtsui
 * @date 2020/12/5
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(new ThreadCallableTest());
        executorService.shutdown();
    }
}
