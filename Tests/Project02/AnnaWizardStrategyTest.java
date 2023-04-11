import Project02.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AnnaWizardStrategyTest {

    @org.junit.Test
    public void TestMeWizardHealStrategy() {
        AnnaWarriorStrategy warrior = new AnnaWarriorStrategy();
        People meWarrior = new AnnaWarrior("Idiot", "5", 60, warrior);
        People otherWarrior = new AnnaWarrior("Idiot", "5", 70, warrior);

        assertEquals(95, warrior.strategy(meWarrior, otherWarrior));
    }

    @org.junit.Test
    public void TestOtherWizardStrategy() {
        AnnaWarriorStrategy warrior = new AnnaWarriorStrategy();
        People meWarrior = new AnnaWarrior("Minion", "4", 80, warrior);
        People otherWarrior = new AnnaWarrior("Minion", "4", 59, warrior);

        assertEquals(80, warrior.strategy(meWarrior, otherWarrior));
    }

    @Test
    public void TestOtherWizardStrategyAttack() {
        AnnaWarriorStrategy warrior = new AnnaWarriorStrategy();
        People meWarrior = new AnnaWarrior("Idiot", "2", 50, warrior);
        People otherWarrior = new AnnaWarrior("Minion", "4", 60, warrior);

        assertEquals(30, warrior.strategy(meWarrior, otherWarrior));
    }
}
