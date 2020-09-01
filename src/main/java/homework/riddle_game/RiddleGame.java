package homework.riddle_game;

import design_patterns.template_method.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class RiddleGame implements Game {

    private final int MAX_SCORE = 10000;
    private int upperBound;
    private int riddleNumber;
    private int stepsAmounts;
    private int numberOfPlayers;
    private RiddlePlayer winner;

    private List<RiddlePlayer> players;
    private Random random = new Random();

    public RiddleGame(int upperBound, int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        this.upperBound = upperBound;
    }

    @Override
    public final void play() throws InterruptedException {
        prepareGame();
        playGame();
        printResult();
    }

    private void printResult() throws InterruptedException {
        System.out.println("\n");
        System.out.println("##################################");
        System.out.println("Param pam pam!!!");
        System.out.println("We have a winner!!!");
        System.out.print("The winner is .... ");
        Thread.sleep(1000);
        System.out.println(this.winner);

        int winnerScore = calculateScore();
        System.out.println("Score: " + winnerScore);
        System.out.println("Predicted number: " + this.riddleNumber);
        System.out.println("Number of attempts: " + this.stepsAmounts);
        System.out.println("Number of players: " + this.numberOfPlayers);
        System.out.println("##################################");
    }

    private int calculateScore() {
        return this.MAX_SCORE / this.stepsAmounts;
    }

    private void playGame() {
        boolean isGameEnd = false;
        while (!isGameEnd) {
            for (RiddlePlayer player : this.players) {
                int move = player.makeMove();
                if (this.gameEnded(move)) {
                    this.winner = player;
                    isGameEnd = true;
                    break;
                }
            }
            this.stepsAmounts++;
        }
    }

    private boolean gameEnded(int predict) {
        return this.riddleNumber == predict;
    }

    private void prepareGame() {
        this.stepsAmounts = 1;
        this.riddleNumber = random.nextInt(this.upperBound);
        this.players = new ArrayList<>(this.numberOfPlayers);
        this.createPlayers();
    }

    private void createPlayers() {
        for (int i = 0; i < this.numberOfPlayers; i++) {
            players.add(new RiddlePlayer(i + 1, this.upperBound));
        }
    }
}
