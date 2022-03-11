package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.util.Scanner;

public class HumanPlayer implements Player {
    private final Logger logger = LoggerFactory.getLogger("player");
    @Override
    public long askNextGuess() {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            logger.log("Entrez un nombre:");
            if (!scanner.hasNextLong()) {
                logger.log("Il faut que se soit un mombre");
                scanner.nextLine();
                continue;
            }
            long num = scanner.nextLong();
            scanner.nextLine();
            return num;
        }

    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater)
            logger.log("La valeur est plus grande");
        else
            logger.log("La valeur est plus petite");
    }
}}
