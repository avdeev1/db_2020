package homework.heroes;

import java.util.Random;

public abstract class HighRankedHero extends Hero {

    public HighRankedHero(String name, int power, int hp) {
        super(name, power, hp);
    }

    @Override
    void kick(Hero hero) {
        Random random = new Random();
        int damage = random.nextInt(this.power) + 1;
        hero.heatHero(damage);

        System.out.println(this + " heat the " + damage + " damage");
    }
}
