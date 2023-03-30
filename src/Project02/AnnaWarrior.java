package Project02;

//
public class AnnaWarrior extends People {
    public AnnaWarrior(String nation, String tribe, int lifePoints, Strategy AnnaWarriorStrategy)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints, AnnaWarriorStrategy);
        myDescription = "\tAnna Warrior";
    }

    @Override
    public int encounterLifePoints(People me, People otherPerson)
    {
        return encounterStrategy.strategy(me, otherPerson);
    }

}
