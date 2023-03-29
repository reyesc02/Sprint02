package Project02;


public class CarlWizard extends People
{
    CarlWizard(String nation, String tribe, int lifePoints, Strategy strategy)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints, strategy);
        myDescription = "\tCarl Wizard";

    }

    @Override
    public int encounterLifePoints(People me, People otherPerson)
    {
        return encounterStrategy.strategy(me, otherPerson);
    }

}
