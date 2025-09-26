package Kuis1;

public class GameTest {
  public static void main(String[] args) {
    Player hero = new Player("HeroIlham", 100, 20, 5);
    Monster monster = new Monster("Goblin", 80, 15, "Goblin");
    BossMonster boss = new BossMonster("Demon King", 150, 30, "Demon");

    System.out.println("=== Battle ===");
    System.out.println(hero.getName() + " (HP: " + hero.getHealth() + ") VS " + monster.getName() + "(HP: " + monster.getHealth() + ")");

    System.out.println();
    while (hero.getHealth() > 0 && monster.getHealth() > 0) {
      if (Math.random() < 0.5) {
        hero.attack(monster);
        if (monster.getHealth() <= 0) {
          System.out.println(hero.getName() + " Win");
          break;
        }
      } else {
        monster.attack(hero);
        if (hero.getHealth() <= 0) {
          System.out.println(monster.getName() + " Win");
          System.out.println("Hero lose");
          System.exit(0);
        }
      }
      System.out.println("---------------------------------------------------");
    }

    System.out.println("\n" + hero.getName() + " Healing");
    hero.healing(100 - hero.getHealth());

    System.out.println("\n=== Bos Battle ===");
    System.out.println(hero.getName() + " (HP: " + hero.getHealth() + ") VS " + boss.getName() + "(HP: " + boss.getHealth() + ")");

    System.out.println();
    while (hero.getHealth() > 0 && boss.getHealth() > 0) {
      if (Math.random() < 0.55) {
        hero.attack(boss);
        if (boss.getHealth() <= 0) {
          System.out.println(hero.getName() + " Win");
          break;
        }
      } else {
        boss.attack(hero);
        if (hero.getHealth() <= 0) {
          System.out.println(boss.getName() + " Win");
          System.out.println(hero.getName() + " Lose");
          break;
        }
      }
      System.out.println("---------------------------------------------------");
    }
  }
}
