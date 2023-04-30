package Project02;

public class AnnaArtifact1Strategy implements Strategy {
    @Override
    public int strategy(People me, People otherPerson) {
            int artifactDamage = 0;
            if (me.getNation() != otherPerson.getNation()) { //if not in same nation
                artifactDamage = 75;
                otherPerson.addNumEncounters(); // add encounter to artifact
                System.out.println("Magic Sword Encounters: " + otherPerson.getNumEncounters());
            }
            return artifactDamage;
        }
}
