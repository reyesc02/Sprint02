package Project02;

import Project02.PeopleType;
/**
 * The People Class
 * This class uses a constructor to create a specific person. It holds variables for
 * the specific person, including their nation, tribe, who they are, description, and lifepoints.
 * It also contains the functions for interacting with the person, including checking of
 * they're alive, and reducing their health points as needed.
 */
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

    /**
     * Constructor for People.
     * This function takes 4 parameters, nation, tribe, person, lifepoints.
     * It is important to note that, person is of type PeopleType, created in the PeopleType class.
     * @param nation The nationality of the specific person
     * @param tribe The tribe of the specific person
     * @param person The specific person is designated a soldier or tricky.
     * @param lifePoints The lifePoints of the specific person
     * @param strategy The strategy of the person
     */
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

    /**
     * SetDead function.
     * This function sets the private dead variable to true.
     */
    public void setDead()
    {
        dead = true;
    }

    /**
     * GetDead function.
     * This function returns true or false if the person is dead.
     * @return dead, the state of the person.
     */
    public boolean getDead()
    {
        return dead;
    }

    /**
     * Function to get PeopleType.
     * @return the type of said person
     */
    public PeopleType getType()
    {
        return me;
    }

    /**
     * Function to get the tribe of a person.
     * @return the tribe type of said person
     */
    public String getTribe()
    {
        return myTribe;
    }

    /**
     * Function to get the nation of a person.
     * @return the nation type of said person
     */
    public String getNation()
    {
        return myNation;
    }

    /**
     * isPersonAlive function
     * Returns true or false based on lifePoints.
     * @return true or false if life points > 0
     */
    public Boolean isPersonAlive()
    {
        return (myLifePoints > 0);
    }

    /**
     * Function to get the health of the person.
     * @return the health of the person
     */
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

    /**
     * This is the encounterLifePoints function.
     * This function takes 2 people as parameters.
     * @param me, the 1st person in the encounter.
     * @param otherPerson the 2nd person in the encounter.
     */
    public abstract int encounterLifePoints(People me, People otherPerson);

    /**
     * Function to display all the information about a person and have it formatted.
     * @return the toString, to create formatting.
     */
    public String toString()
    {
        String result = new String( myNation + "\t" +  myTribe + "\t" + me + "\t" + myDescription + "\t" + myLifePoints);
        return result;
    }
}

