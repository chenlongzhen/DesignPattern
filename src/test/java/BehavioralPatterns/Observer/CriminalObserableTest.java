package BehavioralPatterns.Observer;

import org.junit.Test;

import static org.junit.Assert.*;

public class CriminalObserableTest {

    @Test
    public void test(){
        CriminalObserable zhangSan = new CriminalObserable();
        PoliceObserver policeObserver1 = new PoliceObserver();
        PoliceObserver policeObserver2 = new PoliceObserver();

        zhangSan.addObserver(policeObserver1);
        zhangSan.addObserver(policeObserver2);

        zhangSan.crime("偷东西");


    }

}