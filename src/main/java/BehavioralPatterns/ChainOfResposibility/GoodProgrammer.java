package BehavioralPatterns.ChainOfResposibility;

/**
 * @program: DesignPattern
 * @description:
 * @author: chenlonghzen
 * @create: 2021-02-13 14:14
 **/
public class GoodProgrammer extends Programer{

    @Override
    public void handle(Bug bug){
        if (bug.value > 50 && bug.value <= 100){
            solve(bug);
        }else if(next != null){
            next.handle(bug);
        }
    }

    private void solve(Bug bug){
        System.out.println("高级程序员解决了一个难度为 " +bug.value + "的bug");
    }

}
