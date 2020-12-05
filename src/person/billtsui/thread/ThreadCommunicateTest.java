package person.billtsui.thread;

/**
 * @author billtsui
 * @date 2020/12/5
 */
public class ThreadCommunicateTest {

    private static int cnt = 1;

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (this) {
                        notify();
                        if (cnt <= 100) {
                            System.out.println("线程：" + Thread.currentThread().getName() + "中：cnt = " + cnt);
                            cnt++;
                            try {
                                //当前线程进入阻塞状态，自动释放对象锁
                                this.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}
