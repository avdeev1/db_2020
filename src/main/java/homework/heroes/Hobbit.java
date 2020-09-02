package homework.heroes;

public class Hobbit extends Hero {
    public Hobbit(String name) {
        super(name,
                Constants.HOBBIT_POWER,
                Constants.HOBBIT_HP
        );
    }

    @Override
    void kick(Hero hero) {
        System.out.println(this + " is crying :c");
    }

    @Override
    protected void die() {
        System.out.println("The hobbit is crying and he can't fight :c");
        this.hp = 0;
    }
}
