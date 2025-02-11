package CharacterType;

import AttackStrategy.ShootArrow;
import DefenseStrategy.Shield;

public class Archer implements CharacterType{

    ShootArrow shootArrow = new ShootArrow();
    Shield shield = new Shield();

    @Override
    public String attacking(){
        return "Archer is " + shootArrow.attack();

    }

    @Override
    public String defending(){
        return "Archer is " + shield.defend();
    }
}