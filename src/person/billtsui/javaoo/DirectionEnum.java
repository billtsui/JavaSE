package person.billtsui.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/26 23:27
 * 枚举类型要求所有枚举值必须放在枚举类型的最前面
 */
public enum DirectionEnum implements DirectionInterface {
    //枚举类型 每个对象都重写接口
    UP("向上"){
        @Override
        public void show() {
            System.out.println("我是向上");
        }
    },
    DOWN("向下") {
        @Override
        public void show() {
            System.out.println("我是向下");
        }
    },
    LEFT("向左") {
        @Override
        public void show() {
            System.out.println("我是向左");
        }
    },
    RIGHT("向右") {
        @Override
        public void show() {
            System.out.println("我是向右");
        }
    };

    private final String desc;
    private DirectionEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    /**
     * 整个枚举类型只重写一次，所有对象调用同一个
     */
//    @Override
//    public void show() {
//        System.out.println("现在可以实现接口中抽象方法的重写了！");
//    }
}
