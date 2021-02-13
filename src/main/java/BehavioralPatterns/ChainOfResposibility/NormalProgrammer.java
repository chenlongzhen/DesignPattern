package BehavioralPatterns.ChainOfResposibility;

/**
 * @program: DesignPattern
 * @description:
 * @author: chenlonghzen
 * @create: 2021-02-13 14:14
 **/
public class NormalProgrammer extends Programer{

    @Override
    public void handle(Bug bug){
        if (bug.value > 20 && bug.value <= 50){
            solve(bug);
        }else if(next != null){
            next.handle(bug);
        }
    }

    private void solve(Bug bug){
        System.out.println("普通程序员解决了一个难度为 " +bug.value + "的bug");
    }

}
