package module.puzzle.characters;

import module.puzzle.behavior.SwordBehavior;
import module.puzzle.behavior.WeaponBehavior;

/**
 * Created by Povilas on 2015.07.01.
 */
public class Character {

    private WeaponBehavior weapon;

    public Character() {
        this.weapon = new SwordBehavior();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void fight(){
        System.out.println("Character is fighting!");
        weapon.useWeapon();
    }
}
