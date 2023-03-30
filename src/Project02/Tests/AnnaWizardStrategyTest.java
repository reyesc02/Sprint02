package Project02.Tests;

import Project02.*;
import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.*;

public class AnnaWizardStrategyTest {

    @Test
    public void TestMeWizardStrategyAttack()
    {
        AnnaWizardStrategy wizard = new AnnaWizardStrategy();
        People meWizard = new AnnaWizard("Idiot", "3", 90, wizard);
        People otherWizard = new AnnaWarrior("Minion", "3", 80, wizard);

        assertEquals(30, wizard.strategy(meWizard, otherWizard));

    }
    @Test
    public void  testWizardStrategyWhenMePointsLessThanOtherPoints(){
        AnnaWizardStrategy wizard = new AnnaWizardStrategy();
        People meWizard = new AnnaWizard("Minion", "3", 80, wizard);
        People otherWarrior = new AnnaWarrior("Idiot", "3", 90, wizard);
        assertEquals(79,wizard.strategy(meWizard,otherWarrior));
    }

    @Test
    public void TestMeWizardStrategyHeal()
    {
        AnnaWarriorStrategy wizard = new AnnaWarriorStrategy();
        People meWizard = new AnnaWizard("Idiots", "2", 50, wizard);
        People otherWizard = new AnnaWarrior("Minion", "2", 70, wizard);

        assertEquals(60,wizard.strategy(meWizard, otherWizard));

    }
}
