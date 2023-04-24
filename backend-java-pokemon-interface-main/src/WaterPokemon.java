import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{

    private final String type = "water";
    List<String> attacks = Arrays.asList("surf","hydroPump","hydroCanon","rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);

    }

    public String getType() {
        return type;
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


    void surf(Pokemon name, Pokemon enemy) {
        String type = enemy.getType();

        int basedamage = 30;
        int damage = damageCalculator(name, enemy, basedamage);
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + "." + " Does " + damage + " damage with surf. " + enemy.getName() + " has " + enemy.getHp() + " hP left ");

    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        String type = enemy.getType();

        int basedamage = 30;
        int damage = damageCalculator(name, enemy, basedamage);
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + "." + " Does " + damage + " damage with hydroPump. " + enemy.getName() + " has " + enemy.getHp() + " hP left ");

    }
    void hydroCanon(Pokemon name, Pokemon enemy) {
        String type = enemy.getType();

        int basedamage = 30;
        int damage = damageCalculator(name, enemy, basedamage);
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + "." + " Does " + damage + " damage with hydroCanon. " + enemy.getName() + " has " + enemy.getHp() + " hP left ");

    }

    void rainDance(Pokemon name, Pokemon enemy) {
        String type = enemy.getType();

        int basedamage = 30;
        int damage = damageCalculator(name, enemy, basedamage);
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(name.getName() + " attacks " + enemy.getName() + "." + " Does " + damage + " damage with rainDance. " + enemy.getName() + " has " + enemy.getHp() + " hP left ");

    }
}



