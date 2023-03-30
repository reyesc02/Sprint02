package Project02;

/**
 * SchaperWarrior class
 * This class creates the methods for the SchaperWarrior PeopleType.
 */
public class SchaperWarrior extends People {
    /**
     * SchaperWarrior constructor
     * This constructor sets the description for the SchaperWarrior Type.
     * @param nation the nation of the person
     * @param tribe the tribe of the person
     * @param lifePoints the lifePoints of the person
     * @param warriorStrategy The strategy of the person
     */
    public SchaperWarrior(String nation, String tribe, int lifePoints, Strategy warriorStrategy) {
        super(nation, tribe, PeopleType.warrior, lifePoints, warriorStrategy);
        myDescription = "\tSchaper Warrior";
    }

    /**
     * The encounterLifePoints function.
     * This function returns the outcome of the encounter of the two people
     * @param me the 1st person in the encounter
     * @param otherPerson the 2nd person in the encounter.
     * @return the outcome of the encounter
     */
    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return encounterStrategy.strategy(me, otherPerson);
    }

}