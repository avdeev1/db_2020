package homework.heroes;

public class GameManager {
    private String name1;
    private String name2;

    private Hero hero1;
    private Hero hero2;

    public GameManager(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    public void startGame() {
        this.hero1 = Hero.createHero(this.name1);
        this.hero2 = Hero.createHero(this.name2);


        introduceHeroes();
        fight(hero1, hero2);
        printResults();
    }

    private void introduceHeroes() {
        System.out.println("Param pam pam");
        System.out.println("In the left corner - " + this.hero1);
        System.out.println("In the right corner - " + this.hero2);
        System.out.println("################");
    }

    private void printResults() {
        System.out.println("#####################");
        System.out.println("The fight is over.");
        if (this.hero1.isAlive()) {
            System.out.println(this.hero1 + " is a winner!!!!!");
            return;
        }

        if (this.hero2.isAlive()) {
            System.out.println(this.hero2 + " is a winner!!!!!");
            return;
        }

        System.out.println("We have no winners :(");

    }

    private void fight(Hero hero1, Hero hero2) {
        while (hero1.isAlive() && hero2.isAlive()) {
            hero1.kick(hero2);
            if (hero1.isAlive() && hero2.isAlive()) {
                hero2.kick(hero1);
            }
        }
    }
}
