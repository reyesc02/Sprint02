import Project02.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarlWizardStrategyTest {

    @Test
    public void TestMeWizardStrategy(){
        CarlWizardStrategy wizard = new CarlWizardStrategy();
        People meWizard = new CarlWizard("Diablos","0", 80, new CarlWizardStrategy());
        People otherWarrior = new SchaperWarrior("Minions", "0", 80, new WarriorStrategy());

        int i = wizard.strategy(meWizard,otherWarrior);
        assertTrue(i == -1);
    }

    @Test
    public void TestWizardEncounter(){
        CarlWizardStrategy wizard = new CarlWizardStrategy();
        People meWizard = new CarlWizard("Diablos","0", 80, new CarlWizardStrategy());
        People otherWarrior = new CarlWizard("Diablos", "0", 80, new CarlWizardStrategy());

        int i = wizard.strategy(meWizard,otherWarrior);
        assertEquals(0, i);
    }

    @Test
    public void TestWarriorEncounter(){
        CarlWizardStrategy wizard = new CarlWizardStrategy();
        People meWizard = new CarlWizard("Diablos","0", 80, new CarlWizardStrategy());
        People otherWarrior = new CarlWarrior("Diablos", "0", 80, new CarlWarriorStrategy());

        int i = wizard.strategy(meWizard,otherWarrior);
        assertEquals(0, i);
    }

}