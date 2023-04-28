package Project02;

public class ShawnArtifact2Strategy implements Strategy {
    @Override
    public int strategy(People me, People otherPerson) {
        int artifactHealing;
        if (me.getNation() == otherPerson.getNation()) { //if in same nation
            if (me.getType() == PeopleType.warrior) // if healing a warrior
                artifactHealing = -80; // heal 80 pts
            else
                artifactHealing = -40; // else heal 40
            otherPerson.addNumEncounters();
        } else {
            artifactHealing = -1; // run away
        }
        return artifactHealing;
    }
}
