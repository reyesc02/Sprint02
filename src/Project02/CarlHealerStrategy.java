package Project02;

public class CarlHealerStrategy implements Strategy {
    @Override
    public int strategy(People me, People otherPerson) {
        int lifePointsToHeal = 0;
        if (me.getNation() == otherPerson.getNation()) { // if in same nation
            if (me.getType() != PeopleType.healer) // if other person is not also a healer
                lifePointsToHeal = 44; // heal 44 hp
        } else {
            lifePointsToHeal = -1; // run away
        }
        return lifePointsToHeal;
    }
}
