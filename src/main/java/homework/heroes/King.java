package homework.heroes;

import java.util.Random;

public class King extends HighRankedHero {
    public King(String name) {
        super(
                name,
                new Random().nextInt(
                        Constants.KING_MAX_POWER - Constants.KING_MIN_POWER + 1
                ) + Constants.KING_MIN_POWER,
                new Random().nextInt(
                        Constants.KING_MAX_HP - Constants.KING_MIN_HP + 1
                ) + Constants.KING_MIN_HP
        );
    }
}
