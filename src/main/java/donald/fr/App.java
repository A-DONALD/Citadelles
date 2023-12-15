package donald.fr;

import donald.fr.application.Jeu;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Jeu test=new Jeu(null, 0, new Random());
        test.jouer();
    }
}
