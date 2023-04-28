package Project02;

public class CarlHealer extends People {
    public CarlHealer(String nation, String tribe, int lifePoints, Strategy healerStrategy) {
        super(nation, tribe, PeopleType.healer, lifePoints, healerStrategy);
        myDescription = "\tCarl Healer";
    }

    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return encounterStrategy.strategy(me, otherPerson);
    }
}
