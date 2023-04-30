package Project02;

/**
 * The CarlWarrior class.
 * This class sets up the CarlWarrier type.
 */
public class AnnaArtifact1 extends People {
    /**
     * The AnnaWarrior constructor.
     * This sets up the AnnaWarrior type.
     * @param nation the nation of the person
     * @param tribe the tribe of the person
     * @param lifePoints the lifePoints of the person
     * @param artifactStrategy, the Strategy
     */
    public AnnaArtifact1(String nation, String tribe, int lifePoints, Strategy artifactStrategy) {
        super(nation, tribe, PeopleType.artifact, lifePoints, artifactStrategy);
        myDescription = "\tAnna Artifact 1 - Magic Spear";
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