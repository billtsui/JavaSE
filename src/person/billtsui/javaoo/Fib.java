package person.billtsui.javaoo;

/**
 * 计算斐波那契数列第n项
 */
public class Fib {

    // 递归的方式
    int fib(int n) {
        if (1 == n || 2 == n) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    // 累加的方式
    int fib2(int n) {
        int ia = 1;
        int ib = 1;

        int ic = 0;
        if (n == 1 || n == 2)
            return 1;

        for (int i = 3; i <= n; i++) {
            ic = ia + ib;
            ia = ib;
            ib = ic;
        }
        return ic;
    }

    public static void main(String[] args) {
        Fib fibTest = new Fib();
        int result = fibTest.fib2(4);
    
        System.out.println("最终的计算结果是：" + result);
    }
}
