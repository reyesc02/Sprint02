import Project02.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import  static org.junit.jupiter.api.Assertions.*;
//
public class ShawnWarriorStrategyTest {

    @Test
    public void TestMeWarriorStrategy(){
        ShawnWarriorStrategy warrior = new ShawnWarriorStrategy();
        People meWarrior = new ShawnWarrior("Minion","5", 59, warrior);
        People otherWarrior = new ShawnWarrior("Idiot", "5", 60, warrior);

        assertEquals(59,warrior.strategy(meWarrior,otherWarrior));


    }


    @Test
    public void TestOtherWarriorStrategy(){
        ShawnWarriorStrategy warrior = new ShawnWarriorStrategy();
        People meWarrior = new ShawnWarrior("Minion", "4", 59, warrior);
        People otherWarrior = new ShawnWarrior("Idiot", "4", 90, warrior);

        assertEquals(59,warrior.strategy(meWarrior, otherWarrior));
    }

}
