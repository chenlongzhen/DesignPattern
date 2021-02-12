package Factory;

import Factory.User;
import org.junit.Test;

/**
 * @program: DesignPattern
 * @description: 测试
 * @author: chenlonghzen
 * @create: 2021-02-12 09:42
 **/
public class FactoryTest {

    @Test
    public void  test(){
        User user = new User();
        user.eat();

    }
}
