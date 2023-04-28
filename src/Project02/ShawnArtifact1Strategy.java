package Project02;

public class ShawnArtifact1Strategy implements Strategy {
    @Override
        public int strategy(People me, People otherPerson) {
            int artifactDamage = 88; // explode for 88 damage
            otherPerson.addNumEncounters(); // add encounter to artifact
            return artifactDamage;
        }
}
