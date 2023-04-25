package Project02;

import Project02.Nation;
import Project02.People;
import java.util.*;

/**
 * The World Class.
 * This class sets up the game and holds the data for
 * various nations such as worldLifePoints, the number of alive
 * or dead people, and keeps track of round number.
 */
public class World
{
    private final int worldLifePoints = 4000;
    private final int numberOfRounds = 40;
    private ArrayList<Nation> allNations = new ArrayList<>();
    private ArrayList<Nation> allLivingNations = new ArrayList<>();

//    private Random generator;

    private Die generator = new Die(6);
    private ArrayList<People> worldCreatedPeople = new ArrayList<>();

    /**
     * Constructor for World
     * This creates a new Random generator and adds all created populations
     * to the world.
     */
    public World()
    {
        // seed for psuedo-random number generator
        Date seed = new Date();
        generator = new Random(seed.getTime());
        createWorld();
        worldCreatedPeople.addAll(getWorldCreatedPopulation());
    }

    /**
     * The war function.
     * This function runs each round for the world.
     * Until 40 rounds are reached or all nations are destroyed.
     */
    public void war()
        {
            ArrayList<Integer> worldSurvivingPeople = new ArrayList<>();

            for(int round = 1; round < numberOfRounds; round++)
            {
                Set<String> survivingNations = new HashSet<>();
                System.out.println("Round number: " + round);
                worldSurvivingPeople.clear();
                worldSurvivingPeople.addAll(getWorldSurvivingPeople());
                survivingNations.addAll(getSurvivingNations());
                if ((worldSurvivingPeople.size() >= 2) && (survivingNations.size() > 1) )
                    playOneRound(worldSurvivingPeople);
                else
                {
                    System.out.print("Game is over! Winning Nation is: ");
                    if (survivingNations.size() == 0)
                    {
                        System.out.println("All Nations Distroyed.");
                    }
                    else
                    {
                        System.out.println(survivingNations);
                        System.out.println("The survivors are:");
                        for (Integer i = 0; i < worldSurvivingPeople.size(); i++)
                        {
                            System.out.println(worldCreatedPeople.get(worldSurvivingPeople.get(i)));
                        }
                    }
                    break;
                }

            }

    }


    /**
     * The create world function.
     * This functions adds all the nations to the world.
     */
    public void createWorld()
    {
        allNations.add(new Nation("Idiots", (worldLifePoints / 5)));
        allNations.add(new Nation("Minions", (worldLifePoints) / 5));
        allNations.add(new Nation("Diablos", (worldLifePoints / 5)));
        allNations.add(new Nation("Source2", (worldLifePoints / 5)));
        allNations.add(new Nation("Anna", (worldLifePoints / 5)));
    }


    /**
     * The getWorldCreatedPopulation function.
     * This function adds all living people to an arrayList
     * @return livingPeople, the ArrayList of all living people.
     */
    public ArrayList<People> getWorldCreatedPopulation()
    {
        ArrayList<People> livingPeople = new ArrayList<>();
        // add all living people from allNations to livingPeople
        for(int nation = 0; nation < allNations.size(); nation++)
            livingPeople.addAll(allNations.get(nation).getNationPopulation());
        //System.out.println(livingPeople);
        return livingPeople;
    }

    /**
     * the getworldsurvivingpeople function.
     * This function adds the surviving people to an ArrayList.
     * @return survivors, The list of surviving people.
     */
    public ArrayList<Integer> getWorldSurvivingPeople()
    {
        ArrayList<Integer> survivors = new ArrayList<>();
        for (Integer i = 0; i < worldCreatedPeople.size(); i++)
        {
            if(worldCreatedPeople.get(i).isPersonAlive())
            {
                survivors.add(i);
            }
        }
        return survivors;
    }

    /**
     * getSurvivingNations function.
     * This function adds all surviving nations to an ArrayList
     * @return survivingNations, the list of surviving nations.
     */
    public Set<String> getSurvivingNations()
    {
        Set<String> survivingNations = new HashSet<>();

        for (Integer i = 0; i < worldCreatedPeople.size(); i++)
        {
            if(worldCreatedPeople.get(i).isPersonAlive())
            {
                survivingNations.add(worldCreatedPeople.get(i).getNation());
            }
        }
        return survivingNations;
    }


    /**
     * The encounter function
     * This function runs an encounter between 2 people using their strategy.
     * @param person1, the 1st person of the encounter.
     * @param person2, the 2nd person of the encounter.
     */
    public void encounter(Integer person1, Integer person2)
    {
        Integer person1LifePointsToUse;
        Integer person2LifePointsToUse;
        System.out.println("Encounter: " + worldCreatedPeople.get(person1) + "\t" + worldCreatedPeople.get(person2));

        //if lifePointsToUse is negative, then person is either running away in a hostile encounter
        // or person is giving life points to another person from same nation
        person1LifePointsToUse = worldCreatedPeople.get(person1).encounterLifePoints(worldCreatedPeople.get(person2), worldCreatedPeople.get(person1));
        person2LifePointsToUse = worldCreatedPeople.get(person2).encounterLifePoints(worldCreatedPeople.get(person1), worldCreatedPeople.get(person2));

        // amount of life points actually used is subject to a psuedo-random encounter
        Integer p1damage =  (int) (generator.nextFloat() * person1LifePointsToUse);
        Integer p2damage =  (int) (generator.nextFloat() * person2LifePointsToUse);

        int distance = generator.roll();

        if ((p1damage > 0) && (p2damage > 0))  // person 1  and person 2 are fighting and inflicting damage
        {
            p2damage =  (int) (generator.nextFloat() * (worldCreatedPeople.get(person1).getType().ordinal()+1)*p1damage);
            p1damage =  (int) (generator.nextFloat() * (worldCreatedPeople.get(person2).getType().ordinal()+1)*p2damage);
        }
        else if ((p1damage > 0) && (p2damage <= 0)) // person 1 is fighting and person 2 is running
        {
            p2damage =  (int) (generator.nextFloat() * (worldCreatedPeople.get(person1).getType().ordinal()+1)*(p1damage/3));
        }
        else if ((p1damage <= 0) && (p2damage > 0)) // person 2 is fighting and person 1 is running
        {
            p1damage =  (int) (generator.nextFloat() * (worldCreatedPeople.get(person2).getType().ordinal()+1)*(p2damage/3));
        }
        else // freindly encounter, do nothing
        {

        }

        // record the damage: positive damage should be subtracted for persons lifePoint
        // negative damage is added to persons life points
        worldCreatedPeople.get(person1).modifyLifePoints((-p2damage));
        worldCreatedPeople.get(person2).modifyLifePoints((-p1damage ));

        // HP Failsafe if over 100 hp reset to 100 hp.
        if (worldCreatedPeople.get(person1).getLifePoints() > 100) {
            //System.out.println("Person 1 above 100 hp! " + worldCreatedPeople.get(person1).myDescription + " " + worldCreatedPeople.get(person1).getLifePoints());
            int newlp = worldCreatedPeople.get(person1).getLifePoints() - 100;
            worldCreatedPeople.get(person1).modifyLifePoints((-newlp));
            //System.out.println(worldCreatedPeople.get(person1).getLifePoints() + "\r");
        }
        else if (worldCreatedPeople.get(person2).getLifePoints() > 100) {
            //System.out.println("Person 2 above 100 hp! " + worldCreatedPeople.get(person2).myDescription + " " + worldCreatedPeople.get(person2).getLifePoints());
            int newlp = worldCreatedPeople.get(person2).getLifePoints() - 100;
            worldCreatedPeople.get(person2).modifyLifePoints((-newlp));
            //System.out.println(worldCreatedPeople.get(person2).getLifePoints() + "\r");
        }

        // Both people lose 1 life point per encounter due to aging
        worldCreatedPeople.get(person1).modifyLifePoints((-1));
        worldCreatedPeople.get(person2).modifyLifePoints((-1));


    }

    /**
     * The play 1 round function.
     * This function plays 1 round by assigning each person a combatant
     * @param combatants the list of people to pair up.
     */
    public void playOneRound(ArrayList<Integer> combatants)
    {
        System.out.println(combatants.size());
        ArrayList<Integer> survivors = new ArrayList<>();
        Integer numberOfCombatants;
        Collections.shuffle(combatants);
        numberOfCombatants = combatants.size() - 1;
        Integer combatantIndex = 0;
        while(combatantIndex < numberOfCombatants)
        {
            encounter(combatants.get(combatantIndex), combatants.get(combatantIndex+1));
            combatantIndex = combatantIndex + 2;
        }
    }



}
