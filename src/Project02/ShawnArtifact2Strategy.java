package Project02;

/**
 * The ShawnArtifact2Strategy Class.
 * This class is modeled after Sylas' Shackles from League of Legends.
 * My character has a chance to roll the iteam in which case they will
 * steal life points and turn the life into damage (plus 50) to use
 * against another enemy.
 */

public class ShawnArtifact2Strategy implements Strategy {
    @Override
        public int strategy(People me, People otherPerson) {
            int brokenShackles = 0;
            if (me.getNation() != otherPerson.getNation()) { //if not in same nation
                int enemyhp = otherPerson.getLifePoints();
                brokenShackles = enemyhp + 50;
                otherPerson.addNumEncounters(); // add encounter to artifact
                System.out.println("Sylas' Shackles Encounters: " + otherPerson.getNumEncounters());
            }
            return brokenShackles;
        }
    }
