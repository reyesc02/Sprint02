package Project02;

public class AnnaArtifact2Strategy implements Strategy {
    @Override
    public int strategy(People me, People otherPerson) {
        int artifactHealing;
        if (me.getNation() == otherPerson.getNation()) { //if in same nation
            artifactHealing = -75; // heal 75 pts
            otherPerson.addNumEncounters();
        } else {
            artifactHealing = -1; // run away
        }
        return artifactHealing;
    }
}
