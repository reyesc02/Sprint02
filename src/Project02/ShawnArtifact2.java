package Project02;

/**
 * The ShawnArtifact2 class.
 * This class sets up the ShawnArtifact2 type.
 */
public class ShawnArtifact2 extends People {
    /**
     * The ShawnArtifact2 constructor.
     * This sets up the CarlWarrior type.
     * @param nation the nation of the person
     * @param tribe the tribe of the person
     * @param lifePoints the lifePoints of the person
     * @param artifactStrategy, the Strategy of the artifact
     */
    public ShawnArtifact2(String nation, String tribe, int lifePoints, Strategy artifactStrategy) {
        super(nation, tribe, PeopleType.artifact, lifePoints, artifactStrategy);
        myDescription = "\tShawn Artifact 2 - Sylas' chains";
    }

    /**
     * The encounterLifePoints function
     * This function runs the encounter Strategy of the CarlWarrior
     * @param me the 1st person
     * @param otherPerson the 2nd person in the encounter.
     * @return the outcome of the encounter.
     */
    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return encounterStrategy.strategy(me, otherPerson);
    }

}