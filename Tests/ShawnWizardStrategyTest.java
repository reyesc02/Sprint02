import Project02.*;
import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.*;
public class ShawnWizardStrategyTest {

        @Test
        public void TestMeWizardStrategyAttack()
        {
            ShawnWizardStrategy wizard = new ShawnWizardStrategy();
            People meWizard = new ShawnWizard("Idiot", "3", 90, wizard);
            People otherWizard = new ShawnWarrior("Minion", "3", 80, wizard);

            assertEquals(30, wizard.strategy(meWizard, otherWizard));

        }
        @Test
        public void  testWizardStrategyWhenMePointsLessThanOtherPoints(){
            ShawnWizardStrategy wizard = new ShawnWizardStrategy();
            People meWizard = new ShawnWizard("Minion", "3", 80, wizard);
            People otherWarrior = new ShawnWarrior("Idiot", "3", 90, wizard);
            assertEquals(79,wizard.strategy(meWizard,otherWarrior));
        }

        @Test
        public void TestMeWizardStrategyHeal()
        {
            ShawnWarriorStrategy wizard = new ShawnWarriorStrategy();
            People meWizard = new ShawnWizard("Idiots", "2", 50, wizard);
            People otherWizard = new ShawnWarrior("Minion", "2", 70, wizard);

            assertEquals(60,wizard.strategy(meWizard, otherWizard));

        }
}

