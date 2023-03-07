package Project02;

import Project02.PeopleType;

public abstract class People
{
    private String personName;
    private String myNation;
    private String myTribe;
    private PeopleType me;
    protected String myDescription;
    private int myLifePoints;
    private boolean dead;

    protected Strategy encounterStrategy;


    public People(String nation, String tribe, PeopleType person, int lifePoints, Strategy strategy)
    {
        myNation = nation;
        myTribe = tribe;
        me = person;
        myDescription = me.getDescription();
        myLifePoints = lifePoints;
        dead = false;
        encounterStrategy = strategy;
    }

    public void setDead()
    {
        dead = true;
    }

    public boolean getDead()
    {
        return dead;
    }

    public PeopleType getType()
    {
        return me;
    }

    public String getTribe()
    {
        return myTribe;
    }

    public String getNation()
    {
        return myNation;
    }

    public Boolean isPersonAlive()
    {
        return (myLifePoints > 0);
    }

    public int getLifePoints()
    {
        return myLifePoints;
    }

    public void modifyLifePoints(int points)
    {
        myLifePoints += points;
    }

    public void changeStrategy(Strategy s)
    {
        encounterStrategy = s;
    }

    public abstract int encounterLifePoints(People me, People otherPerson);

    public String toString()
    {
        String result = new String( myNation + "\t" +  myTribe + "\t" + me + "\t" + myDescription + "\t" + myLifePoints);
        return result;
    }
}

