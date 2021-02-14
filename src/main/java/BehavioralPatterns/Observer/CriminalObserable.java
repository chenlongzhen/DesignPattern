package BehavioralPatterns.Observer;

/**
 * @program: DesignPattern
 * @description:
 * @author: chenlonghzen
 * @create: 2021-02-14 10:10
 **/
public class CriminalObserable extends Observable{
    public void crime(String event) {
        System.out.println("罪犯正在" + event);
        notifyObservers(event);
    }
}
