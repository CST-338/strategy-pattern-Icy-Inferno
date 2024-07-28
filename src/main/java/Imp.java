import java.util.HashMap;

/**
 * This is a POJO that represents an Imp.
 *
 * @author Alan Becker
 * @version 1.0, 07/20/24
 * CST 338 - Software Design with Dr. C
 * Week 5 Homework 0: Strategy Homework
 */

public class Imp extends Monster {

  public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
    super(maxHP, xp, items);
  }

  @Override
  public String toString() {
    return this.getClass().getName() + " has : " + super.toString();
  }
}
