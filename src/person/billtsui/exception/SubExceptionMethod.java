package person.billtsui.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author billtsui
 * @date 2020/11/19
 */
public class SubExceptionMethod extends ExceptionMethod {

    /**
     * 子类继承父类不能抛出比父类范围更大的异常
     * @throws Exception
     */
    @Override
    public void show() {
    }
}
