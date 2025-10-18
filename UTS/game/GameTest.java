package UTS.game;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GameTest {
  public static void main(String[] args) {
    Player p = new Player("HeroVipkas", 120, 25, 5, new LevelScaledStrategy(2));
    p.addSkill(new HealSkill(15));
    p.addSkill(new PiercingStrike(1.2));
    p.addEffect(new Shield(10, 3)); 
    p.addEffect(new Regen(8, 4));

    List<Character> teamA = new ArrayList<>();
    teamA.add(p);
    Monster monster = new Monster("Goblin", 80, 12, 2, new FixedStrategy(20));
    BossMonster boss = new BossMonster("Drake", 150, 28, 5, new FixedStrategy(40)); 

    List<Character> teamB = new ArrayList<>();
    teamB.add(monster);
    teamB.add(boss);

    System.out.println("Team A:");
    int baseDamage = p.getAttackPower() + (p.getLevel() * 2);
    String skills = p.getSkills().stream().map(Skill::name).collect(Collectors.joining(", "));
    System.out.printf("- Player(name=%s, HP=%d/%d, AP=%d, Lv=%d, Strategy=%s)\n",
      p.getName(), p.getHealth(), p.getMaxHealth(), p.getAttackPower(), p.getLevel(), "LevelScaled(+2/level)");
    System.out.printf("  Skills: [%s]\n", skills);
    System.out.printf("  Effects: [Shield(-10 dmg, 3 turns), Regen(+8 HP, 4 turns)]\n");
    
    System.out.println("\nTeam B:");
    System.out.printf("- BossMonster(name=%s, HP=%d/%d, AP=%d, Threat=%d)\n",
    boss.getName(), boss.getHealth(), boss.getMaxHealth(), boss.getAttackPower(), boss.getThreatLevel());
    System.out.printf("- Monster(name=%s, HP=%d/%d, AP=%d, Threat=%d)\n",
    monster.getName(), monster.getHealth(), monster.getMaxHealth(), monster.getAttackPower(), monster.getThreatLevel());
    
    System.out.println("\nDamage rules:");
    System.out.printf("- Player base damage = AP + Lv*2 = %d + %d*2 = %d\n", p.getAttackPower(), p.getLevel(), baseDamage);
    System.out.printf("- Piercing Strike: %d * 1.2 = %d damage \n", baseDamage, (int)(baseDamage * 1.2));
    System.out.println("- Shield(flat 10) aktif 3 giliran, Regen(8 HP) aktif 4 giliran");
    System.out.println("- Boss Rage Strike: 2x damage jika HP < 50% ATAU setiap turn ke-3");

    Battle battle = new Battle(teamA, teamB);
    battle.run();
  }
}