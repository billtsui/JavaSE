package person.billtsui.thread;

/**
 * 仓库类
 *
 * @author billtsui
 * @date 2020/12/5
 */
public class StoreHouse {
    //记录产品数量
    private int cnt = 0;

    public synchronized void produceProduct() {
        notify();
        if (cnt < 10) {
            System.out.println("线程：" + Thread.currentThread().getName() + "正在生产第" + (cnt + 1) + "个产品");
            cnt++;
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumerProduct() {
        notify();
        if(cnt > 0 ){
            System.out.println("线程：" + Thread.currentThread().getName() + "正在消费第" + cnt + "个产品");
            cnt--;
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
