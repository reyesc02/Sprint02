import Project02.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarlWarriorStrategyTest {

    @Test
    public void TestMeWarriorStrategy(){
        CarlWarriorStrategy warrior = new CarlWarriorStrategy();
        People meWarrior = new CarlWarrior("Diablos","0", 80, new CarlWarriorStrategy());
        People otherWarrior = new SchaperWarrior("Minions", "0", 80, new WarriorStrategy());

        int i = warrior.strategy(meWarrior,otherWarrior);
        assertTrue(i == 80);
    }

    @Test
    public void TestWizardEncounter(){
        CarlWarriorStrategy warrior = new CarlWarriorStrategy();
        People meWarrior = new CarlWarrior("Diablos","0", 80, new CarlWarriorStrategy());
        People otherWarrior = new CarlWizard("Diablos", "0", 80, new CarlWizardStrategy());

        int i = warrior.strategy(meWarrior,otherWarrior);
        assertEquals(0, i);
    }

    @Test
    public void TestWarriorEncounter(){
        CarlWarriorStrategy warrior = new CarlWarriorStrategy();
        People meWarrior = new CarlWarrior("Diablos","0", 80, new CarlWarriorStrategy());
        People otherWarrior = new CarlWarrior("Diablos", "0", 80, new CarlWarriorStrategy());

        int i = warrior.strategy(meWarrior,otherWarrior);
        assertEquals(0, i);
    }

}