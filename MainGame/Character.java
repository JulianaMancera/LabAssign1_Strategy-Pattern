package MainGame;
import CharacterType.CharacterType;

public class Character{
    private CharacterType character;

    public Character(CharacterType character){
        this.character = character;
    }

    public String attacking(){
        return character.attacking();
    }

    public String defending(){
        return character.defending();
    }
}