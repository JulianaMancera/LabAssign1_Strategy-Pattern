# LabAssign1_Strategy-Pattern
## Problem scenario:

### Suppose we have three types of characters in a GameApp:

&emsp; **1. Knight:** Attacks with a sword; uses 3 strategies to defend (shield, dodge, magic barrier) <br>
&emsp; **2. Wizard:** Casts spells; uses magic barrier to defend <br>
&emsp; **3. Archer:** Shoots arrows; uses dodge to to defend <br>

### Implement two types of Strategy:
**A.  DefenseStrategy** <br>
&emsp;&emsp;1. Shield <br>
&emsp;&emsp;2. Dodge <br>
&emsp;&emsp;3. CreateMagic <br>

**B.  AttackStrategy** <br>
&emsp;&emsp;1.  CastSpell <br>
&emsp;&emsp;2.  ShootArrow <br>
&emsp;&emsp;3.  SwingSword <br>

### Refactor the existing codes and provide the UML Diagram:
```
  public class Character {
  
  private String type;

    public Character(String type) {
        this.type = type;
    }

    public void attack() {
        if (type.equals("Knight")) {
            System.out.println("Knight attacks with a sword!");
        } else if (type.equals("Wizard")) {
            System.out.println("Wizard casts a spell!");
        } else if (type.equals("Archer")) {
            System.out.println("Archer shoots an arrow!");
        }
    }

    public void defend() {
        if (type.equals("Knight")) {
            System.out.println("Using a shield to defend!");
	System.out.println("Dodgin to avoid attack!");
            System.out.println("Creating a magic barrier for defense!"");		

        } else if (type.equals("Wizard")) {
            System.out.println("Creating a magic barrier for defense!"");
        } else if (type.equals("Archer")) {
            System.out.println("Using a shield to defend!"");
        }
    }
}
```

## UML Class Diagram: 

![Lab Assign 1 SE2 - Juliana R  Mancera 3BSCS-1](https://github.com/user-attachments/assets/6fe43b2a-0c40-4db8-b83d-a914ee98f77a)
