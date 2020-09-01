package homework.riddle_game;

import java.util.Random;

public class RiddlePlayer {
    private Random random = new Random();
    private int upperBound;
    private int playerId;

    public RiddlePlayer(int id, int upperBound) {
        this.playerId = id;
        this.upperBound = upperBound;
    }

    public int makeMove() {
        int predict = this.random.nextInt(this.upperBound);
        System.out.println("Player" + this.playerId + " predicts the number: " + predict);
        return predict;
    }

    @Override
    public String toString() {
        return "Player" + this.playerId;
    }
}
