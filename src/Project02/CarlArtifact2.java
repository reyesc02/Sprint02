package Project02;

/**
 * The CarlWarrior class.
 * This class sets up the CarlWarrier type.
 */
public class CarlArtifact2 extends People {
    /**
     * The CarlWarrior constructor.
     * This sets up the CarlWarrior type.
     * @param nation the nation of the person
     * @param tribe the tribe of the person
     * @param lifePoints the lifePoints of the person
     * @param warriorStrategy, the Strategy
     */
    public CarlArtifact2(String nation, String tribe, int lifePoints, Strategy artifactStrategy) {
        super(nation, tribe, PeopleType.artifact, lifePoints, artifactStrategy);
        myDescription = "\tCarl Artifact 2 - Full Rejuvenation Potion";
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