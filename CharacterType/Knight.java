package CharacterType;

import AttackStrategy.SwingSword;
import DefenseStrategy.CreateMagic;
import DefenseStrategy.Dodge;
import DefenseStrategy.Shield;

public class Knight implements CharacterType{
    SwingSword swingSword = new SwingSword();
    Shield shield = new Shield();
    Dodge dodge = new Dodge();
    CreateMagic barrier = new CreateMagic();

    @Override
    public String attacking() {
        return "Knight "+ swingSword.attack();
    }

    @Override
    public String defending(){
        return "Knight is " + shield.defend() + "\n" +
        "Knight is " + dodge.defend() +"\n" +
        "Knight is " + barrier.defend();
    }

}