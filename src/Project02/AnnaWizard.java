package Project02;

public class AnnaWizard extends People {
    public AnnaWizard(String nation, String tribe, int lifePoints, Strategy AnnaWizardStrategy) {
        super(nation, tribe, PeopleType.wizard, lifePoints, AnnaWizardStrategy);
        myDescription = "\tAnna Wizard";
    }

    @Override
    public int encounterLifePoints(People me, People otherPerson)
    {
        return encounterStrategy.strategy(me, otherPerson);
    }
}

