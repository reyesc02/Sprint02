package Project02;

/**
 If it encounters a different tribes, nations, and peopleType will attack minimum if my life points is
 less than the other life point I will have do max attack if my life point is greater greater than the otherPerson
 life point
 */
public class AnnaWarriorStrategy implements Strategy {
    public int strategy(People me, People otherPerson)
    {
            if(me.getNation() != otherPerson.getNation() && me.getTribe() != otherPerson.getTribe())
            {
                //other life is less than me so cause minimum damage because me life is greater here
                if (otherPerson.getLifePoints() < me.getLifePoints())
                {
                    int mini_damage = (int)(Math.random() * 60) + 50; // attack between 50 qne 60
                    return otherPerson.getLifePoints() - mini_damage ;
                    
                    //causing maximum damage cos other life points greater than me
                } else if (otherPerson.getLifePoints() > me.getLifePoints());
                    return otherPerson.getLifePoints() / 2;

            }
        return otherPerson.getLifePoints()/2;
    }
}