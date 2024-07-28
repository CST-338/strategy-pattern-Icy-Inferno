import java.util.HashMap;

/**
 * This is a POJO that represents a Kobold.
 *
 * @author Alan Becker
 * @version 1.0, 07/20/24
 * CST 338 - Software Design with Dr. C
 * Week 5 Homework 0: Strategy Homework
 */

public class Kobold extends Monster {

  public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
    super(maxHP, xp, items);
  }

  @Override
  public String toString() {
    return this.getClass().getName() + " has : " + super.toString();
  }
}
