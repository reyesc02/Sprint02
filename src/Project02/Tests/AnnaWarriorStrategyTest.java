package Project02.Tests;

import Project02.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnnaWarriorStrategyTest {

    @Test
    public void TestMeWarriorStrategy(){
        AnnaWarriorStrategy warrior = new AnnaWarriorStrategy();
        People meWarrior = new AnnaWarrior("Minion","5", 59, warrior);
        People otherWarrior = new AnnaWarrior("Idiot", "5", 60, warrior);

        assertEquals(58,warrior.strategy(meWarrior,otherWarrior));
   }
   @Test
    public void TestOtherWarriorStrategy(){
        AnnaWarriorStrategy warrior = new AnnaWarriorStrategy();
        People meWarrior = new AnnaWarrior("Minion", "4", 59, warrior);
        People otherWarrior = new AnnaWarrior("Idiot", "4", 90, warrior);

        assertEquals(80,warrior.strategy(meWarrior, otherWarrior));
   }

}
