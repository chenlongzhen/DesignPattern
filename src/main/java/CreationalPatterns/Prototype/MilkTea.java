package CreationalPatterns.Prototype;

import lombok.NonNull;

/**
 * @program: DesignPattern
 * @description: 比如有一天，周杰伦到奶茶店点了一份不加冰的原味奶茶，你说我是周杰伦的忠实粉，我也要一份跟周杰伦一样的。
 * @author: chenlonghzen
 * @create: 2021-02-12 10:16
 **/
public class MilkTea implements Cloneable{
    public String type;
    public boolean ice;

    @NonNull
    @Override
    protected MilkTea clone() throws CloneNotSupportedException {
        return (MilkTea) super.clone();
    }
}

