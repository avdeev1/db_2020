package homework.heroes;

public class Elf extends Hero {

    public Elf(String name) {
        super(name, Constants.ELF_POWER, Constants.ELF_HP);
    }

    @Override
    void kick(Hero hero) {
        if (this.power > hero.getPower()) {
            this.killHero(hero);
            return;
        }

        System.out.println(this + " decrease the " + hero + "'s power!");
        hero.decreasePower(Constants.ELF_DECREASE_POWER);
    }
}
