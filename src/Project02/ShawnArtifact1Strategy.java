package Project02;
import java.util.Random;
/**
 * The ShawnArtifact1Strategy Class.
 * This class is modeled after the thunder gun from call of duty.
 * The class generates a random number from 0-100 and uses that number as
 * damaged against an enemy.
 */


public class ShawnArtifact1Strategy implements Strategy {
    @Override
    public int strategy(People me, People otherPerson) {
        Random rand = new Random();
        int thunderGunDamage = rand.nextInt(100);
        if (me.getNation() != otherPerson.getNation()) { //if not in same nation
            //thunderGunDamage;
            otherPerson.addNumEncounters(); // add encounter to artifact
            System.out.println("Thunder Gun Encounters: " + otherPerson.getNumEncounters());
        }
        return thunderGunDamage;
    }
}
