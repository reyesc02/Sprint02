import Project02.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


    public class AnnaWarriorStrategyTest {
    @Test
    public void TestMeWarriorStrategy() {
        AnnaWarriorStrategy warrior = new AnnaWarriorStrategy();
        People meWarrior = new AnnaWarrior("Idiot", "5", 50, warrior);
        People otherWarrior = new AnnaWarrior("Idiot", "5", 60, warrior);

        assertEquals(80, warrior.strategy(meWarrior, otherWarrior));
    }

    @Test
    public void TestOtherWarriorStrategy() {
        AnnaWarriorStrategy warrior = new AnnaWarriorStrategy();
        People meWarrior = new AnnaWarrior("Minion", "4", 90, warrior);
        People otherWarrior = new AnnaWarrior("Minion", "4", 59, warrior);

        assertEquals(90, warrior.strategy(meWarrior, otherWarrior));
    }

    @Test
    public void TestOtherWarriorStrategy2() {
        AnnaWarriorStrategy warrior = new AnnaWarriorStrategy();
        People meWarrior = new AnnaWarrior("Idiot", "2", 50, warrior);
        People otherWarrior = new AnnaWarrior("Minion", "4", 60, warrior);

        assertEquals(30, warrior.strategy(meWarrior, otherWarrior));
    }

}
