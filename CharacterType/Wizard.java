package CharacterType;

import AttackStrategy.CastSpell;
import DefenseStrategy.CreateMagic;

public class Wizard implements CharacterType{

    CastSpell spell = new CastSpell();
    CreateMagic barrier = new CreateMagic();

    @Override
    public String attacking(){
        return "Wizard " + spell.attack();
    }

    @Override
    public String defending(){
        return "Wizard is " + barrier.defend();
    }

}