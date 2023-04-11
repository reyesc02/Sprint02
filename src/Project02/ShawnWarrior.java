package Project02;


public class ShawnWarrior extends People {
    public ShawnWarrior(String nation, String tribe, int lifePoints, Strategy warriorStrategy) {
        super(nation, tribe, PeopleType.warrior, lifePoints, warriorStrategy);
        myDescription = "\tShawn Warrior";
    }
    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return encounterStrategy.strategy(me, otherPerson);
    }

}