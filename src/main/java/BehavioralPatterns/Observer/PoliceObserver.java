package BehavioralPatterns.Observer;

/**
 * @program: DesignPattern
 * @description:
 * @author: chenlonghzen
 * @create: 2021-02-14 10:09
 **/
public class PoliceObserver implements Observer{

    @Override
    public void update(String event){
        System.out.println("警察收到消息，罪犯在" + event);
    }

}
