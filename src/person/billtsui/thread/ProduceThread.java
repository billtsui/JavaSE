package person.billtsui.thread;

/**
 * 生产者
 * @author billtsui
 * @date 2020/12/5
 */
public class ProduceThread extends Thread {

    private  StoreHouse storeHouse;

    public ProduceThread(StoreHouse storeHouse){
        this.storeHouse = storeHouse;
    }

    @Override
    public void run() {
        while(true){
            storeHouse.produceProduct();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
