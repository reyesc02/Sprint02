package Project02;

/**
 * The AnnaArtifact2 class.
 * This class sets up the AnnaArtifact2 type.
 */
public class AnnaArtifact2 extends People {
    /**
     * The AnnaArtifact2 constructor.
     * This sets up the AnnaArtifact2 type.
     * @param nation the nation of the person
     * @param tribe the tribe of the person
     * @param lifePoints the lifePoints of the person
     * @param artifactStrategy, the Strategy
     */
    public AnnaArtifact2(String nation, String tribe, int lifePoints, Strategy artifactStrategy) {
        super(nation, tribe, PeopleType.artifact, lifePoints, artifactStrategy);
        myDescription = "\tAnna Artifact 2 - Magic Spell";
    }

    /**
     * The encounterLifePoints function
     * This function runs the encounter Strategy of the AnnaArtifact2
     * @param me the 1st person
     * @param otherPerson the 2nd person in the encounter.
     * @return the outcome of the encounter.
     */
    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return encounterStrategy.strategy(me, otherPerson);
    }

}