package Monsters;

import Abilities.RangedAttack;
import java.util.HashMap;

/**
 * This is a POJO that represents a Monsters.Kobold.
 *
 * @author Alan Becker
 * @version 1.0, 07/20/24
 * CST 338 - Software Design with Dr. C
 * Week 5 Homework 0: Strategy Homework
 */

public class Kobold extends Monster {

  public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
    super(maxHP, xp, items);
    //These should be stored in a HashMap
    // that way we can use an iterator.
    Integer maxStr = 15;
    Integer maxDef = 6;
    Integer maxAgi = 3;

    attack = new RangedAttack(this);
    //this should use a data structure
    strength = super.getAttribute(strength, maxStr);
    defense = super.getAttribute(defense, maxDef);
    agility = super.getAttribute(agility, maxAgi);
  }

  @Override
  public String toString() {
    return this.getClass().getName() + " has : " + super.toString();
  }
}
