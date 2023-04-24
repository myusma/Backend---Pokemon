import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private final String type = "grass";
    List<String> attacks = Arrays.asList("leafStorm","solarBeam","leechSeed","leaveBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
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
        case "electric":
            damage = baseDamage * 4;
        case "fire":
            damage = baseDamage * 3;
        case "water":
            damage = baseDamage * 2;
        case "grass":
            damage = baseDamage;
    }

        return damage;
}

    public void leafStorm(Pokemon name, Pokemon enemy) {
        String type = enemy.getType();

        int basedamage = 30;
        int damage = damageCalculator(name, enemy, basedamage);
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + "." + " Does " + damage + " damage with leafStorm. " + enemy.getName() + " has " + enemy.getHp() + " hP left ");

    }



    public void solarBeam(Pokemon name, Pokemon enemy) {
        String type = enemy.getType();

        int basedamage = 30;
        int damage = damageCalculator(name, enemy, basedamage);
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + "." + " Does " + damage + " damage with solarBeam. " + enemy.getName() + " has " + enemy.getHp() + " hP left ");

    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        String type = enemy.getType();

        int basedamage = 30;
        int damage = damageCalculator(name, enemy, basedamage);
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + "." + " Does " + damage + " damage with leechSeed. " + enemy.getName() + " has " + enemy.getHp() + " hP left ");

    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        String type = enemy.getType();

        int basedamage = 30;
        int damage = damageCalculator(name, enemy, basedamage);
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + "." + " Does " + damage + " damage with leaveBlade. " + enemy.getName() + " has " + enemy.getHp() + " hP left ");

    }
}
