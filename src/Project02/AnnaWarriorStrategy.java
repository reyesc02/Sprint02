package Project02;

/**
 If encounter same tribes, nations,another warrior will take the other warrior life points and /2 add
 that life-point to my life point
 If it encounters a different tribes, nations, and peopleType will attack minimum if my life points is
 less than the other life point I will have do max attack
 */
public class AnnaWarriorStrategy implements Strategy {
    public int strategy(People me, People otherPerson)
    {
            if(me.getNation() != otherPerson.getNation() && me.getTribe() != otherPerson.getTribe())
            {
                //other life is less than me so cause minimum damage because me life is greater here
                if (otherPerson.getLifePoints() < me.getLifePoints())
                {
                    return otherPerson.getLifePoints() - 60;
                    
                    //causing maximum damage cos other life points greater than me
                } else if (otherPerson.getLifePoints() > me.getLifePoints());
                    return otherPerson.getLifePoints() / 2;

            }
        return otherPerson.getLifePoints()/2;
    }
}