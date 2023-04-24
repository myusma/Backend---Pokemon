import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{
    private final String type = "fire";
    List<String> attacks = Arrays.asList("fireLash","flameThrower","pyroBall","inferno");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
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
            case "grass":
                damage = baseDamage * 4;
            case "water":
                damage = baseDamage * 3;
            case "electric":
                damage = baseDamage * 2;
            case "fire":
                damage = baseDamage;
        }

        return damage;
    }


    void fireLash(Pokemon name, Pokemon enemy) {
        String type = enemy.getType();

        int basedamage = 30;
        int damage = damageCalculator(name, enemy, basedamage);
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + "." + " Does " + damage + " damage with fireLash. " + enemy.getName() + " has " + enemy.getHp() + " hP left ");

    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        String type = enemy.getType();

        int basedamage = 30;
        int damage = damageCalculator(name, enemy, basedamage);
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + "." + " Does " + damage + " damage with flameThrower. " + enemy.getName() + " has " + enemy.getHp() + " hP left ");

    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        String type = enemy.getType();

        int basedamage = 30;
        int damage = damageCalculator(name, enemy, basedamage);
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + "." + " Does " + damage + " damage with pyroBall. " + enemy.getName() + " has " + enemy.getHp() + " hP left ");

    }

    void inferno(Pokemon name, Pokemon enemy) {
        String type = enemy.getType();

        int basedamage = 30;
        int damage = damageCalculator(name, enemy, basedamage);
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + "." + " Does " + damage + " damage with inferno. " + enemy.getName() + " has " + enemy.getHp() + " hP left ");

    }
}

