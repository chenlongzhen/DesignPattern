package BehavioralPatterns.ChainOfResposibility;

/**
 * @program: DesignPattern
 * @description:
 * @author: chenlonghzen
 * @create: 2021-02-13 14:11
 **/
public abstract class Programer {
    protected Programer next;

    public void setNext(Programer next){
        this.next = next;
    }


    abstract void handle(Bug bug);
}
