import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private final String type = "electric";

    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);

    }

    public String getType() {
        return type;
    }

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    List<String> getAttacks() {
        return attacks;
    }


    public int damageCalculator(Pokemon name, Pokemon enemy, int baseDamage) {
        int damage = 0;


        switch (enemy.getType()) {
            case "water":
                damage = baseDamage * 4;
            case "grass":
                damage = baseDamage * 3;
            case "fire":
                damage = baseDamage * 2;
            case "electric":
                damage = baseDamage;
        }

        return damage;
    }


    void thunderPunch(Pokemon name, Pokemon enemy) {

        String type = enemy.getType();

        int basedamage = 30;
        int damage = damageCalculator(name, enemy, basedamage);
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + "." + " Does " + damage + " damage with thunderPunch. " + enemy.getName() + " has " + enemy.getHp() + " hP left ");

    }
    void electroBall(Pokemon name, Pokemon enemy) {
        String type = enemy.getType();

        int basedamage = 20;
        int damage = damageCalculator(name, enemy, basedamage);
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + "." + " Does " + damage + " damage with electroBall. " + enemy.getName() + " has " + enemy.getHp() + " hP left ");

    }
    void thunder(Pokemon name, Pokemon enemy) {
        String type = enemy.getType();

        int basedamage = 25;
        int damage = damageCalculator(name, enemy, basedamage);
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + "." + " Does " + damage + " damage with thunder. " + enemy.getName() + " has " + enemy.getHp() + " hP left ");
    }
    void voltTackle(Pokemon name, Pokemon enemy) {
        String type = enemy.getType();

        int basedamage = 15;
        int damage = damageCalculator(name, enemy, basedamage);
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + "." + " Does " + damage + " damage with voltTackle. " + enemy.getName() + " has " + enemy.getHp() + " hP left ");
    }
}
