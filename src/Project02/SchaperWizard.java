package Project02;

import Project02.People;
import Project02.PeopleType;

/**
 * SchaperWizard class
 * This class creates the methods for the SchaperWizard PeopleType.
 */
public class SchaperWizard extends People
{
    /**
     * SchaperWizard constructor
     * This constructor sets the description for the SchaperWizard Type.
     * @param nation the nation of the person
     * @param tribe the tribe of the person
     * @param lifePoints the lifePoints of the person
     * @param warriorStrategy The strategy of the person
     */
    SchaperWizard(String nation, String tribe, int lifePoints, Strategy strategy)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints, strategy);
        myDescription = "\tSchaper Wizard";

    }
    /**
     * The encounterLifePoints function.
     * This function returns the outcome of the encounter of the two people
     * @param me the 1st person in the encounter
     * @param otherPerson the 2nd person in the encounter.
     * @return the outcome of the encounter
     */
    @Override
    public int encounterLifePoints(People me, People otherPerson)
    {
        return encounterStrategy.strategy(me, otherPerson);
    }

}
