package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class Simulation {
    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }


    private boolean nextRound() {
        long input = player.askNextGuess();
        logger.log("User typed " + input);
        if (input < numberToGuess) {
            player.respond(true);
            return false;
        }
        else if (input > numberToGuess) {
            player.respond(false);
            return false;
        }
        return true;
    }

    public void loopUntilPlayerSucceed() {
        boolean end = false;
        while (!end){
            end = nextRound();
        }
    }
}
