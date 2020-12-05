package person.billtsui.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author billtsui
 * @date 2020/12/5
 */
public class ThreadCallableTest implements Callable {

    @Override
    public Object call() throws Exception {
        //计算 1 ~ 10000之间的累加和并打印返回
        int sum = 0;

        for (int i = 1; i <= 10000; i++) {
            sum += i;
        }

        System.out.println("计算的累加和是：" + sum);
        return sum;
    }

    public static void main(String[] args) {
        ThreadCallableTest threadCallableTest = new ThreadCallableTest();
        FutureTask futureTask = new FutureTask(threadCallableTest);
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            Object o = futureTask.get();
            System.out.println((int)o);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
