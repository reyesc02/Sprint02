package Project02;

import Project02.People;
import Project02.PeopleType;


public class SchaperWizard extends People
{
    SchaperWizard(String nation, String tribe, int lifePoints, Strategy strategy)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints, strategy);
        myDescription = "\tSchaper Wizard";

    }

    @Override
    public int encounterLifePoints(People me, People otherPerson)
    {
        return encounterStrategy.strategy(me, otherPerson);
    }

}
