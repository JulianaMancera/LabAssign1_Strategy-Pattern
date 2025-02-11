package MainGame;

import CharacterType.Archer;
import CharacterType.Knight;
import CharacterType.Wizard;

public class GameApp{
    public static void main(String[] args) {
        
        Character knight = new Character(new Knight());
        Character wizard = new Character(new Wizard());
        Character archer = new Character(new Archer());

        System.out.println("\nAttackers (　-_･) ︻デ═一 ▸ : \n");
        System.out.println(knight.attacking());
        System.out.println(wizard.attacking());
        System.out.println(archer.attacking());

        System.out.println();

        System.out.println("Defenders (ง •_•)ง : \n");
        System.out.println(knight.defending());
        System.out.println(wizard.defending());
        System.out.println(archer.defending());
    }
}