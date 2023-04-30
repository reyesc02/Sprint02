package Project02;

public class AnnaArtifact2Strategy implements Strategy {
    @Override
    public int strategy(People me, People otherPerson) {
        int magicSpell;
        if (me.getNation() != otherPerson.getNation() && me.getTribe() != otherPerson.getTribe()) { //if in same nation
            magicSpell = - 80;// damage
            otherPerson.getNumEncounters();
            System.out.println("Magic Spell: " + otherPerson.getNumEncounters());

            int medicinePill = 0;
            if (me.getNation() == otherPerson.getNation())
            {
                medicinePill = me.getLifePoints() + 50;
                otherPerson.addNumEncounters();
                System.out.println("Medicine Potion: " + otherPerson.getNumEncounters());
                return medicinePill;
            }
        }
        else
        {
            magicSpell = -1; // run away
        }
        return magicSpell;
    }
}
