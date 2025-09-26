package Kuis1;

class BossMonster extends Monster {
  private boolean hasSpecialAttack;

  public BossMonster(String name, int health, int attackPower, String type){
    super(name, health, attackPower, type);
    this.hasSpecialAttack=true;
  }

  @Override
  public void attack(Character target){
    if (hasSpecialAttack&Math.random()<0.3) {
      specialAttack(target);
    } else{
      normalAttack(target);
    }
  }

  public void normalAttack(Character target){
    int damage = (int) (Math.random() * 15) + 5;
    System.out.println(getName() + " (" + getType() + ") attacks ferociously! Damage: " + damage);
    target.takeDamage(damage);
  }

  public void specialAttack(Character target){
    int damage = (int) ((Math.random()*15)+5)*2;
    System.out.println(getName() + " (" + getType() + ") Special attacks ferociously! Damage: " + damage);
    target.takeDamage(damage);
  }
}
