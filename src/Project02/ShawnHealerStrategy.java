package Project02;

import java.util.Random;

/**
 * The ShawnHealerStrategy Class.
 *This class represents a deranged healer on the loose in the kingdom.
 * The healer is merely masquerading as someone who knows medicine.
 * The healer rolls a number between -50 and 75 to give to the player.
 * Negative subtracting health, positive adding, what could they be up to??
 */

public class ShawnHealerStrategy implements Strategy {
    @Override
    public int strategy(People me, People otherPerson) {
        int lifePointsToHeal = 0;
        Random rand = new Random();
        int untrustWorthyHealer = rand.nextInt(-50,75);
        if (me.getNation() == otherPerson.getNation()) { // if in same nation
            if (me.getType() != PeopleType.healer) // if other person is not also a healer
                lifePointsToHeal = untrustWorthyHealer; //heal health from -50 to 50, take a chance
        } else {
            lifePointsToHeal = -1; // run away
        }
        return lifePointsToHeal;
    }
}
