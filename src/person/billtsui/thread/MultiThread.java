package person.billtsui.thread;

/**
 * @author billtsui
 * @date 2020/12/3
 */
public class MultiThread {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if (i % 2 == 1) {
                        System.out.println("子线程一：i=" + i);
                    }
                }
            }
        };

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if(i % 2 == 0) {
                        System.out.println("子线程二：i=" + i);
                    }
                }
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2  = new Thread(runnable1);
        thread1.start();
        thread2.start();

        System.out.println("主线程等待开始");
        thread1.join();
        thread2.join();
        System.out.println("主线程等待结束");
    }
}
