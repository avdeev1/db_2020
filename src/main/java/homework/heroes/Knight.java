package homework.heroes;

import java.util.Random;

public class Knight extends HighRankedHero {
    public Knight(String name) {
        super(
                name,
                new Random().nextInt(
                        Constants.KNIGHT_MAX_POWER - Constants.KNIGHT_MIN_POWER + 1
                ) + Constants.KNIGHT_MIN_POWER,
                new Random().nextInt(
                        Constants.KNIGHT_MAX_HP - Constants.KNIGHT_MIN_HP + 1
                ) + Constants.KNIGHT_MIN_HP
        );
    }
}
