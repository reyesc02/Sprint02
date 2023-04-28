package Project02;
import java.util.Collection;
import java.util.Collections;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.Objects;

import Project02.People;
import Project02.PeopleType;
import Project02.SchaperWarrior;
import Project02.SchaperWizard;


public class Tribe
{
    private String nationName;
    private String tribeName;
    private int tribeLifePoints;
    private ArrayList<People> members = new ArrayList<>();
    private ArrayList<People> livingMembers = new ArrayList<>();

    /**
     * Constructor for Tribe.
     * This function takes 3 parameters, nation, tribe, and lifepoints.
     * Also sets the strategy for each nation based on name.
     * @param nation The nationality of the specific tribe
     * @param tribe The tribe name
     * @param lifePoints The lifePoints of the specific tribe
     */
    public Tribe(String nation, String tribe, int lifePoints)
    {
        nationName = nation;
        tribeName = tribe;
        tribeLifePoints = lifePoints;
        for(int i = 0; i < 6; i++)
            if(i % 2 == 0 && i < 4)
                switch (nationName) {
                case "Diablos":
                    members.add(new CarlWarrior(nationName, tribeName, tribeLifePoints / 3, new CarlWarriorStrategy()));
                    break;
                case "Source2":
                    members.add(new ShawnWarrior(nationName, tribeName, tribeLifePoints / 3, new ShawnWarriorStrategy()));
                    break;
                case "Anna":
                    members.add(new AnnaWarrior(nationName, tribeName, tribeLifePoints / 3, new AnnaWarriorStrategy()));
                    break;
                default:
                    members.add(new SchaperWarrior(nationName, tribeName, tribeLifePoints / 3, new WarriorStrategy()));
                    break;
                }
            else if (i % 2 == 1 && i < 4)
                switch (nationName) {
                case "Diablos":
                    members.add(new CarlWizard(nationName, tribeName, tribeLifePoints / 3, new CarlWizardStrategy()));
                    break;
                case "Source2":
                    members.add(new ShawnWizard(nationName, tribeName, tribeLifePoints / 3, new ShawnWizardStrategy()));
                    break;
                case "Anna":
                    members.add(new AnnaWizard(nationName, tribeName, tribeLifePoints / 3, new AnnaWizardStrategy()));
                    break;
                default:
                    members.add(new SchaperWizard(nationName, tribeName, tribeLifePoints / 3, new WizardStrategy()));
                    break;
                }
            else if (i == 4)
                switch (nationName) {
                    case "Diablos":
                        members.add(new CarlHealer(nationName, tribeName, tribeLifePoints / 3, new CarlHealerStrategy()));
                        break;
                    case "Source2":
                        members.add(new ShawnHealer(nationName, tribeName, tribeLifePoints / 3, new ShawnHealerStrategy()));
                        break;
                    case "Anna":
                        members.add(new AnnaHealer(nationName, tribeName, tribeLifePoints / 3, new AnnaHealerStrategy()));
                        break;
                    default:
                        members.add(new CarlHealer(nationName, tribeName, tribeLifePoints / 3, new CarlHealerStrategy()));
                        break;
                }

            members.add(new CarlArtifact1("Diablos", "Tribe5", 88, CarlArtifact1Strategy));
            for(int i = 0; i < members.size(); i++)
                livingMembers.addAll(members);
    }
    /**
     * Function for collecting all living tribe members
     * Returns an arraylist of living entities
     */
    public ArrayList<People> getLivingTribeMembers()
    {
        livingMembers.clear();
        tribeLifePoints = 0;
        for(int person = 0; person < members.size(); person++)
        {
            if(members.get(person).isPersonAlive())
            {
                livingMembers.add(members.get(person));
                tribeLifePoints += members.get(person).getLifePoints();
                //System.out.println(members.get(person));
            }
            else
            {
                if(!(members.get(person).getDead()))
                {
                    members.get(person).setDead();
                    System.out.println("\t\t" + members.get(person) + " is dead!");
                }
            }
        }
        //System.out.println(livingMembers);
        return livingMembers;
    }
    /*
    public void printMembers()
    {
        for(int i = 0; i < 2; i++)
        {
            System.out.println(people.get(i));
        }
    }
*/

    /**
     * Function to get Tribe size.
     * @return the type of said person
     */
    public int getTribeSize()
    {
        return livingMembers.size();
    }
    /**
     * Function to determine if tribe health is above 0.
     * @return a boolean value if above 0
     */
    public Boolean isTribeAlive()
    {
        return (tribeLifePoints > 0);
    }

    /**
     * Function to get tribe life points
     * @return an int of said tribe life points
     */
    public int getTribeLifePoints()
    {
        return tribeLifePoints;
    }
    /**
     * Function to get the tribes name
     * @return a string of the tribe name
     */
    public String getTribeName()
    {
        return tribeName;
    }
    /**
     * Function to display all the information members and results about encounters.
     * @return the toString, to create formatting.
     */
    public String toString()
    {
        String result = "\0";

        result = tribeName;
        for(int i = 0; i < members.size(); i++)
        {
            result = result + '\n' + members.get(i).toString();
        }
        result = result + '\n';
        return result;
    }

}
