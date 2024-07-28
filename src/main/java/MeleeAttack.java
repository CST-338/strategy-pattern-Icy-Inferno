/**
 * This is a POJO that represents a monster's Melee Attack.
 *
 * @author Alan Becker
 * @version 1.0, 07/20/24
 * CST 338 - Software Design with Dr. C
 * Week 6 Homework 0: Strategy Homework
 */

public class MeleeAttack implements Attack {

  Monster attacker;

  MeleeAttack(Monster attacker) {
    this.attacker = attacker;
  }

  @Override
  public Integer attack(Monster target) {
    String message = attacker + " uses a melee attack on " + target;
    System.out.println(message);
    return null;
  }
}
