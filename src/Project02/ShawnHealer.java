package Project02;

public class ShawnHealer extends People {
    public ShawnHealer(String nation, String tribe, int lifePoints, Strategy healerStrategy) {
        super(nation, tribe, PeopleType.healer, lifePoints, healerStrategy);
        myDescription = "\tShawn Healer";
    }

    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return encounterStrategy.strategy(me, otherPerson);
    }
}
