package Project02;

public class AnnaArtifact1Strategy implements Strategy {
    @Override
    public int strategy(People me, People otherPerson)
    {
        int magicSpear= 0;
        if(me.getNation() != otherPerson.getNation() && me.getTribe() != otherPerson.getTribe())
        {
            //if not from the same nation
            magicSpear = 90;
            otherPerson.addNumEncounters(); // add encounter to artifact
            System.out.println("Magic Spear: " + otherPerson.getNumEncounters());
        }
        else
        {
            magicSpear = -1; // run away
        }
        return magicSpear;
    }
}
