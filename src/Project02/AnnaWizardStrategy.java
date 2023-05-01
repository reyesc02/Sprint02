package Project02;

/**
 If encounter same tribes, nations,another wizard will take the other Wizard life points and /2 add
 that life-point to my life point
 If it encounters a different tribes, nations, and peopleType will attack minimum if my life points is
 less than the other life point I will have do max attack
 */
public class AnnaWizardStrategy implements Strategy {
    public int strategy(People me, People otherPerson)
    {
            if(me.getNation() != otherPerson.getNation() && me.getTribe() != otherPerson.getTribe())
            {
                //other life is less than me so cause minimum damage because me life is greater here
                if (otherPerson.getLifePoints() < me.getLifePoints())
                {
                    int mini_damage = (int) (Math.random() * 60) + 50; // between 50 and 60 random
                    return otherPerson.getLifePoints() - mini_damage;
                    //causing maximum damage cos other life points greater than me
                } else if (otherPerson.getLifePoints() > me.getLifePoints());

                    int max_damage = otherPerson.getLifePoints() /2;
                    return max_damage;
            }
        return otherPerson.getLifePoints() / 2;
    }
}
