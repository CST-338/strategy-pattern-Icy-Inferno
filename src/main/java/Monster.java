import java.util.HashMap;
import java.util.Objects;

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
