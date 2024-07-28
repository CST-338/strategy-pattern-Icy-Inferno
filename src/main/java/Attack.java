/**
 * This is an interface that represents a monster's Attack.
 *
 * @author Alan Becker
 * @version 1.0, 07/20/24
 * CST 338 - Software Design with Dr. C
 * Week 6 Homework 0: Strategy Homework
 */

public interface Attack extends Ability {

  Integer attack(Monster target);
}