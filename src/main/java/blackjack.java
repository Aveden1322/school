import TurtleGraphics.StandardPen;
import com.ethanzeigler.utils.KeyboardReader;

import java.awt.*;

public class blackjack {

    public static void main(String[] args) {
        cards object = new cards();
        StandardPen pen = new StandardPen();
        KeyboardReader reader = new KeyboardReader();
        int tokens = 1000;
        int pcard1, pcard2, pcardHit, ptot, pace = 0, wager;
        int dcard1, dcard2, dcardHit, dtot, dace = 0;
        char type = 'y';

        int i = -1;
        while ((type == 'y') && (tokens > 0)) {
            i++;
            pace = 0;
            dace = 0;
            pen.home();
            pen.down();
            pen.setDirection(180);
            pen.move(500);
            pen.setDirection(270);
            pen.move(300);
            pen.setColor(Color.black);
            pen.setDirection(0);
            pen.setWidth(100000);
            pen.move(10000);
            pen.home();
            pen.setWidth(2);
            pen.setColor(Color.white);
            pen.up();
            pen.setDirection(180);
            pen.move(500);
            pen.setDirection(270);
            pen.move(300);
            pcard1 = object.DrawCard(pen);
            if (pcard1 == 11) {
                pace++;
            }
            pcard2 = object.DrawCard(pen);
            if (pcard2 == 11) {
                pace++;
            }
            pen.up();
            pen.home();
            pen.setDirection(180);
            pen.move(500);
            pen.setDirection(270);
            pen.move(300);
            pen.setDirection(90);
            pen.move(400);
            dcard1 = object.DrawCard(pen);
            if (dcard1 == 11) {
                dace++;
            }
            dcard2 = object.CardBack(pen);
            if (dcard2 == 11) {
                dace++;
            }
            dtot = dcard1 + dcard2;
            ptot = pcard1 + pcard2;
            pen.setDirection(180);
            pen.move(360);
            pen.setDirection(270);
            pen.move(400);
            pen.setDirection(0);
            pen.move(360);
            System.out.println("How many tokens will you wager?");
            wager = reader.readInt(1, Integer.MAX_VALUE);
            while (wager > tokens) {
                System.out.println("Not enough tokens, you have " + tokens + " tokens");
            }
            tokens = tokens - wager;
            System.out.println("You now have " + tokens + " tokens");
            System.out.println("Your total is " + ptot + ". Hit? y/n");
            type = reader.readChar();
            while (type == 'y') {
                pcardHit = object.DrawCard(pen);
                if (pcardHit == 11)
                    pace++;
                ptot = ptot + pcardHit;
                if ((ptot > 21) && (pace > 0)) {
                    ptot -= -10;
                    pace--;
                }
                if (ptot > 21) {
                    break;
                }
                System.out.println("Your total is " + ptot + ". Hit? y/n");
                type = reader.readChar();
            }
            pen.home();
            pen.setDirection(180);
            pen.move(140);
            pen.setDirection(270);
            pen.move(300);
            pen.setDirection(90);
            pen.move(400);
            pen.setDirection(0);
            while (dtot <= 16) {
                dcardHit = object.CardBack(pen);
                if ((dtot > 21) && (dace >= 1)) {
                    dtot = -10;
                    dace--;
                }
                dtot += dcardHit;
            }

            if ((ptot > 21) && (dtot > 21)) {
                System.out.println("Both players have busted!");
                System.out.println("Tokens for playing has been returned");
                tokens = wager + tokens;
            } else if (ptot == dtot) {
                System.out.println("Tie!");
                System.out.println("Tokens for playing has been returned");
                tokens = wager + tokens;
            } else if (ptot > 21) {
                System.out.println("You have busted!");
            } else if (dtot > 21) {
                System.out.println("Dealer busted! Earned " + wager * 2 + " tokens!");
                tokens = wager * 2 + tokens;
            } else if (ptot > dtot) {
                System.out.println("You win! Your total was " + ptot + ", while the dealer had " + dtot + "!");
                System.out.println("Earned " + wager * 2 + " tokens!");
                tokens = wager * 2 + tokens;
            } else if (dtot > ptot) {
                System.out.println("You lose! Your total was " + ptot + ", while the dealer had " + dtot + "!");
            }
            System.out.println("Play again? y/n");
            type = reader.readChar();
        }
        if (tokens < 1) {
            System.out.println("Out of tokens");
        }
    }
}