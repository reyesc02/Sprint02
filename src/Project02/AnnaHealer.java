package Project02;

public class AnnaHealer extends People {
    public AnnaHealer(String nation, String tribe, int lifePoints, Strategy healerStrategy) {
        super(nation, tribe, PeopleType.healer, lifePoints, healerStrategy);
        myDescription = "\tAnna Healer";
    }

    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return encounterStrategy.strategy(me, otherPerson);
    }
}
