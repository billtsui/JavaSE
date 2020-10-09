package JavaOO;

public class Point {

    // 横坐标
    int x;

    // 纵坐标
    int y;

    Point() {

    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void show() {
        System.out.println("横坐标是：" + x + ",纵坐标是：" + y);
    }

    //纵坐标减去指定数值
    void up(int j) {
        this.y = this.y - j;
    }

    //纵坐标减一
    void up() {
        this.y--;
    }

    public static void main(String[] args) {
        // 1、使用有参构造方法构造对象并打印
        Point p1 = new Point(3, 5);
        p1.show();

        // 2、使用无参构造方法构造对象并打印
        Point p2 = new Point();
        p2.show();
    }
}
