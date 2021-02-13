package BehavioralPatterns.Iterator;

import lombok.NonNull;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @program: DesignPattern
 * @description: 平时常用的 for-each 循环，也是迭代器模式的一种应用。在 Java 中，只要实现了 Iterable 接口的类，
 * 都被视为可迭代访问的。Iterable 中的核心方法只有一个，也就是刚才我们在 MyList 类中实现过的用于获取迭代器的 iterator() 方法
 * @author: chenlonghzen
 * @create: 2021-02-13 14:23
 **/

public class MyList implements Iterable<String> {
    private List<String> data = Arrays.asList("a", "b", "c");

    @NonNull
    @Override
    public Iterator<String> iterator() {
        // 每次生成一个新的迭代器，用于遍历列表
        return new Itr();
    }

    private class Itr implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < data.size();
        }

        @Override
        public String next() {
            return data.get(index++);
        }

        @Override
        public void remove() {
            index++; //简单起见，向后移动一位
        }
    }
}

