package homework.riddle_game;

import java.util.Random;

public class RiddleGameMain {
    public static void main(String[] args) throws InterruptedException {
        new RiddleGame(100, new Random().nextInt(10) + 1).play();
    }
}
