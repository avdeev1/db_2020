package homework.heroes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Hero {
    protected int power;
    protected int hp;
    protected String name;

    public Hero(String name, int power, int hp) {
        this.name = name;
        this.power = power;
        this.hp = hp;
    }

    abstract void kick(Hero hero);

    public boolean isAlive() {
        return this.hp > 0 && this.power > 0;
    }

    public void heatHero(int hp) {
        this.hp -= hp;
    }

    void killHero(Hero hero) {
        System.out.println(this.name + " kills " + hero.name);
        hero.die();
    }

    protected void die() {
        this.hp = 0;
    }

    public int getPower() {
        return power;
    }

    protected void decreasePower(int i) {
        this.power -= i;
    }

    public static Hero createHero(String name) {
        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hobbit(name));
        heroes.add(new Elf(name));
        heroes.add(new Knight(name));
        heroes.add(new King(name));
        return heroes.get(new Random().nextInt(4));
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.name;
    }
}
