import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

/**
 * This is a POJO that represents a Monster.
 *
 * @author Alan Becker
 * @version 1.0, 07/20/24
 * CST 338 - Software Design with Dr. C
 * Week 5 Homework 0: Strategy Homework
 */

public abstract class Monster {

  private Integer hp;
  private Integer xp = 10;
  private Integer maxHP;
  private HashMap<String, Integer> items;
  Integer agility = 10;
  Integer defense = 10;
  Integer strength = 10;
  Attack attack;

  public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
    this.maxHP = maxHP;
    hp = this.maxHP;
    this.xp = xp;
    this.items = items;
  }

  public Integer getHp() {
    return hp;
  }

  public void setHp(Integer hp) {
    this.hp = hp;
  }

  public Integer getXp() {
    return xp;
  }

  public void setXp(Integer xp) {
    this.xp = xp;
  }

  public Integer getMaxHP() {
    return maxHP;
  }

  public void setMaxHP(Integer maxHP) {
    this.maxHP = maxHP;
  }

  public HashMap<String, Integer> getItems() {
    return items;
  }

  public void setItems(HashMap<String, Integer> items) {
    this.items = items;
  }

  public Integer getAgility() {
    return agility;
  }

  public Integer getDefense() {
    return defense;
  }

  public Integer getStrength() {
    return strength;
  }

  Integer getAttribute (Integer min, Integer max) {
    Random rand = new Random();
    if (min > max) {
      Integer temp = min;
      min = max;
      max = temp;
    }

    //returns a random number between min and max inclusive
    return rand.nextInt(max-min) + min;
  }

  boolean takeDamage(Integer damage) {
    if (damage > 0) {
      this.setHp(this.getHp() - damage);
      System.out.println("The creature was hit for " + damage + " damage");
      if (this.getHp() <= 0) {
        System.out.println("Oh no! the creature has perished");
      }
    }
    System.out.println(this.toString());
    return this.getHp() > 0;
  }

  Integer attackTarget(Monster target) {
    Integer damage = attack.attack(target);
    target.takeDamage(damage);
    return damage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Monster monster = (Monster) o;
    return Objects.equals(getHp(), monster.getHp()) && Objects.equals(getXp(),
        monster.getXp()) && Objects.equals(getMaxHP(), monster.getMaxHP())
        && Objects.equals(getItems(), monster.getItems());
  }

  @Override
  public int hashCode() {
    int result = Objects.hashCode(getHp());
    result = 31 * result + Objects.hashCode(getXp());
    result = 31 * result + Objects.hashCode(getMaxHP());
    result = 31 * result + Objects.hashCode(getItems());
    return result;
  }

  @Override
  public String toString() {
    return "hp=" + getHp() + '/' + getMaxHP();
  }
}
