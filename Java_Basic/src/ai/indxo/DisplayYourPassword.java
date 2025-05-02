package ai.indxo;

import java.io.Console;
import java.util.Arrays;

public class DisplayYourPassword {

    public static void main(String[] args) {
        Console cons = System.console();

        if (cons == null) {
            System.err.println("No console available. Please run this program from the terminal.");
            return;
        }

        char[] pass_ward = null;

        try {
            pass_ward = cons.readPassword("Input your Password: ");
            System.out.println("Your password was: " + new String(pass_ward)); // Avoid in real use!
        } finally {
            if (pass_ward != null) {
                Arrays.fill(pass_ward, ' ');
            }
        }
    }
}
