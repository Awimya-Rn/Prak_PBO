package UTS.game;

public class FixedStrategy implements AttackStrategy {
  private int fixedDamage;

  public FixedStrategy(int fixedDamage) {
    this.fixedDamage = fixedDamage;
  }

  @Override
  public int computeDamage(Character self, Character target) {
    return fixedDamage;
  }
}