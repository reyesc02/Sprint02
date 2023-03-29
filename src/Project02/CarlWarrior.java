package Project02;

public class CarlWarrior extends People {
    CarlWarrior(String nation, String tribe, int lifePoints, Strategy warriorStrategy) {
        super(nation, tribe, PeopleType.warrior, lifePoints, warriorStrategy);
        myDescription = "\tCarl Warrior";
    }
    @Override
    public int encounterLifePoints(People me, People otherPerson) {
        return encounterStrategy.strategy(me, otherPerson);
    }

}