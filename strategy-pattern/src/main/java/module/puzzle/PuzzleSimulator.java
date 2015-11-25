package module.puzzle;


import module.puzzle.behavior.AxeBehavior;
import module.puzzle.characters.Character;

/**
 * Created by Povilas on 2015.07.01.
 */
public class PuzzleSimulator {

    /*
    * Strategy pattern - defines a famaly of algorithms,
    * encapsulates each one, and makes them interchangeable.
    * Strategy lets the algorithm vary independently clients that use it.
    */

    public static void main(String args[]) {
        Character character = new Character();
        character.fight();
        character.setWeapon(new AxeBehavior());
        character.fight();
    }
}
