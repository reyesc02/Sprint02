package Project02;

public class CarlArtifact2Strategy implements Strategy {
    @Override
    public int strategy(People me, People otherPerson) {
        int artifactHealing;
        if (me.getNation() == otherPerson.getNation()) { //if in same nation
            if (me.getType() == PeopleType.healer) // if healing a healer
                artifactHealing = -100; // heal 100 pts
            else
                artifactHealing = -50; // else heal 50
            otherPerson.addNumEncounters();
            System.out.println("Potion Encounters: " + otherPerson.getNumEncounters());
        } else {
            artifactHealing = -1; // run away
        }
        return artifactHealing;
    }
}
