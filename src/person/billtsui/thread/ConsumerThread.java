package person.billtsui.thread;

/**
 * @author billtsui
 * @date 2020/12/5
 */
public class ConsumerThread extends Thread {

    private  StoreHouse storeHouse;

    public ConsumerThread(StoreHouse storeHouse){
        this.storeHouse = storeHouse;
    }

    @Override
    public void run() {
        while(true){
            storeHouse.consumerProduct();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
