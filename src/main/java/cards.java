import java.awt.Color;
import java.util.Random;

import TurtleGraphics.StandardPen;

public class cards {

    public int DrawCard(StandardPen pen)
    {
        Random generator = new Random();
        pen.setColor(Color.white);
        pen.setWidth(2);
        pen.down();
        pen.setDirection(90);
        pen.move(250);
        pen.setDirection(0);
        pen.move(150);
        pen.setDirection(270);
        pen.move(250);
        pen.setDirection(180);
        pen.move(150);
        //card
        pen.up();
        pen.setDirection(90);
        pen.move(230);
        pen.setDirection(0);
        pen.move(5);
        pen.down();
        int number=generator.nextInt(13)+1;
        String cardValue="";
        cardValue+=number;
        if (number == 11)
        {
            cardValue = "J";
            number = 10;
        }
        else if (number == 12)
        {
            cardValue = "Q";
            number = 10;
        }
        else if (number == 13)
        {
            cardValue = "K";
            number = 10;
        }
        else if (number == 1)
        {
            cardValue = "A";
            number = 11;
        }
        pen.drawString(cardValue);
        pen.setDirection(180);
        pen.up();
        pen.move(5);
        pen.setDirection(270);
        pen.move(230);
        pen.setDirection(0);
        pen.move(135);
        pen.setDirection(90);
        pen.move(5);
        pen.down();
        pen.drawString(cardValue);
        pen.setDirection(270);
        pen.up();
        pen.move(5);
        pen.setDirection(180);
        pen.move(135);

        int suit;
        suit=generator.nextInt(4)+1;
        if(suit==1)
            Diamond(pen);
        else if(suit==2)
            Spade(pen);
        else if(suit == 3)
            Club(pen);
        else if(suit == 4)
            Heart(pen);
        return(number);

    }
    public void Diamond(StandardPen pen) {

        pen.setColor(Color.red);
        pen.setDirection(90);
        pen.move(170);
        pen.setDirection(0);
        pen.move(75);
        pen.down();
        pen.setColor(Color.RED);
        pen.setDirection(300);
        pen.move(50);
        pen.setDirection(240);
        pen.move(50);
        pen.setDirection(120);
        pen.move(50);
        pen.setDirection(60);
        pen.move(50);
        pen.setDirection(300);
        for (int a = 0; a < 50; a++)
        {
            pen.setDirection(300);
            pen.move(1);
            pen.turn(-60);
            pen.move(50);
            pen.turn(180);
            pen.move(50);
        }
        pen.up();
        pen.setDirection(180);
        pen.move(100);
        pen.setDirection(270);
        pen.move(126);
        pen.setDirection(0);
        pen.move(180);
        //card 1



    }
    public void Spade(StandardPen pen)
    {
        pen.setColor(Color.white);
        pen.up();
        pen.setDirection(90);
        pen.move(170);
        pen.setDirection(0);
        pen.move(75);
        pen.down();
        pen.setDirection(220);
        pen.move(40);
        for (int a = 0;  a < 82; a++)
        {
            pen.turn(2);
            pen.move(1);
        }
        pen.setDirection(270);
        for (int a = 0; a < 20; a++)
        {
            pen.turn(-5);
            pen.move(1);
        }
        pen.setDirection(0);
        pen.move(30);
        pen.setDirection(180);
        for (int a = 0; a < 18; a++)
        {
            pen.turn(-5);
            pen.move(1);
        }
        pen.setDirection(330);
        for (int a = 0;  a < 82; a++)
        {
            pen.turn(2);
            pen.move(1);
        }

        pen.setDirection(145);
        pen.move(47);
        pen.setDirection(270);
        pen.move(6);
        pen.setWidth(10);
        pen.move(74);
        pen.setDirection(0);
        pen.move(3);
        pen.setDirection(180);
        pen.move(3);
        pen.setDirection(90);
        pen.move(10);
        pen.setDirection(0);
        pen.move(24);
        pen.setDirection(180);
        pen.move(45);
        pen.setDirection(90);
        pen.move(3);
        pen.setDirection(180);
        pen.move(5);
        pen.setDirection(0);
        pen.move(55);
        pen.setDirection(90);
        pen.move(3);
        pen.setDirection(0);
        pen.move(5);
        pen.setDirection(180);
        pen.move(60);
        pen.setDirection(90);
        pen.move(2);
        pen.setDirection(180);
        pen.move(5);
        pen.setDirection(0);
        pen.move(65);
        pen.setDirection(90);
        pen.move(3);
        pen.setDirection(0);
        pen.move(3);
        pen.setDirection(180);
        pen.move(70);
        pen.setDirection(90);
        pen.move(3);
        pen.setDirection(180);
        pen.move(3);
        pen.setDirection(0);
        pen.move(73);
        pen.setDirection(90);
        pen.move(3);
        pen.setDirection(0);
        pen.move(3);
        pen.setDirection(180);
        pen.move(74);
        pen.setDirection(90);
        pen.move(3);
        pen.setDirection(180);
        pen.move(3);
        pen.setDirection(0);
        pen.move(78);
        pen.setDirection(90);
        pen.move(4);
        pen.setDirection(180);
        pen.move(76);
        pen.setDirection(90);
        pen.move(4);
        pen.setDirection(0);
        pen.move(75);
        pen.setDirection(90);
        pen.move(3);
        pen.setDirection(180);
        pen.move(73);
        pen.setDirection(90);
        pen.move(3);
        pen.setDirection(0);
        pen.move(70);
        pen.setDirection(90);
        pen.move(3);
        pen.setDirection(180);
        pen.move(68);
        pen.setDirection(0);
        pen.move(3);
        pen.setDirection(90);
        pen.move(3);
        pen.setDirection(0);
        pen.move(63);
        pen.setDirection(180);
        pen.move(5);
        pen.setDirection(90);
        pen.move(3);
        pen.setDirection(180);
        pen.move(56);
        pen.setDirection(0);
        pen.move(5);
        pen.setDirection(90);
        pen.move(3);
        pen.setDirection(0);
        pen.move(48);
        pen.setDirection(180);
        pen.move(5);
        pen.setDirection(90);
        pen.move(3);
        pen.setDirection(180);
        pen.move(40);
        pen.setDirection(0);
        pen.move(5);
        pen.setDirection(90);
        pen.move(3);
        pen.setDirection(0);
        pen.move(30);
        pen.setDirection(180);
        pen.move(5);
        pen.setDirection(90);
        pen.move(3);
        pen.setDirection(180);
        pen.move(20);
        pen.setDirection(0);
        pen.move(5);
        pen.setDirection(90);
        pen.move(3);
        pen.setDirection(0);
        pen.move(7);
        pen.setWidth(2);
        pen.up();
        pen.setDirection(180);
        pen.move(80);
        pen.setDirection(270);
        pen.move(158);
        pen.setDirection(0);
        pen.move(180);



    }
    public void Club(StandardPen pen) {

        pen.setDirection(90);
        pen.move(140);
        pen.setDirection(0);
        pen.move(75);
        pen.down();
        for (int a = 0; a < 360; a++)
        {
            pen.move(20);
            pen.turn(180);
            pen.move(20);
            pen.turn(180);
            pen.turn(1);
        }
        pen.setDirection(270);
        pen.move(20);
        pen.setDirection(0);
        for (int a = 0; a < 360; a++)
        {
            pen.move(10);
            pen.turn(180);
            pen.move(10);
            pen.turn(180);
            pen.turn(1);
        }
        pen.setDirection(180);
        pen.move(20);
        pen.setDirection(0);
        for (int a = 0; a < 360; a++)
        {
            pen.move(20);
            pen.turn(180);
            pen.move(20);
            pen.turn(180);
            pen.turn(1);
        }
        pen.setDirection(0);
        pen.move(40);
        for (int a = 0; a < 360; a++)
        {
            pen.move(20);
            pen.turn(180);
            pen.move(20);
            pen.turn(180);
            pen.turn(1);
        }
        pen.setDirection(180);
        pen.move(20);
        pen.setWidth(20);
        pen.setDirection(270);
        pen.move(30);
        pen.up();
        pen.setWidth(2);
        pen.setDirection(180);
        pen.move(75);
        pen.setDirection(270);
        pen.move(90);
        pen.setDirection(0);
        pen.move(180);
    }
    public void Heart(StandardPen pen) {
        pen.setDirection(90);
        pen.move(130);
        pen.setDirection(0);
        pen.move(45);
        pen.setColor(Color.red);
        pen.down();
        for (int a = 0; a < 360; a++)
        {
            pen.move(20);
            pen.turn(180);
            pen.move(20);
            pen.turn(180);
            pen.turn(1);
        }
        pen.setDirection(0);
        pen.move(40);
        for (int a = 0; a < 360; a++)
        {
            pen.move(20);
            pen.turn(180);
            pen.move(20);
            pen.turn(180);
            pen.turn(1);
        }
        pen.setDirection(0);
        pen.move(20);
        pen.setDirection(240);
        pen.move(75);
        pen.setDirection(123);
        pen.move(75);
        pen.setDirection(0);
        pen.move(8);
        pen.setWidth(10);
        pen.setDirection(300);
        pen.move(62);
        pen.setWidth(5);
        pen.move(5);
        pen.setDirection(63);
        pen.move(5);
        pen.setWidth(10);
        pen.move(40);
        pen.setDirection(180);
        pen.setWidth(10);
        pen.move(23);
        pen.setDirection(90);
        pen.move(10);
        pen.setDirection(270);
        pen.move(10);
        pen.setDirection(180);
        pen.move(10);
        pen.setDirection(270);
        pen.move(10);
        pen.setDirection(0);
        pen.move(20);
        pen.setDirection(180);
        pen.move(13);
        pen.setDirection(270);
        pen.move(15);
        pen.setDirection(0);
        pen.move(5);
        pen.setDirection(90);
        pen.move(10);
        pen.setDirection(0);
        pen.move(5);
        pen.setDirection(270);
        pen.move(10);
        pen.setWidth(2);
        pen.setDirection(180);
        pen.up();
        pen.move(72);
        pen.setDirection(270);
        pen.move(85);
        pen.setDirection(0);
        pen.move(180);
    }
    public int CardBack(StandardPen pen) {
        Random generator = new Random();
        pen.setColor(Color.white);
        pen.setWidth(2);
        pen.down();
        pen.setDirection(90);
        pen.move(250);
        pen.setDirection(0);
        pen.move(150);
        pen.setDirection(270);
        pen.move(250);
        pen.setDirection(180);
        pen.move(150);
        //card
        pen.up();
        pen.setDirection(90);
        pen.move(230);
        pen.setDirection(0);
        pen.move(5);
        pen.down();
        int number=generator.nextInt(13)+1;
        pen.setDirection(180);
        pen.up();
        pen.move(5);
        pen.setDirection(270);
        pen.move(230);
        pen.setDirection(0);
        pen.move(135);
        pen.setDirection(90);
        pen.move(5);
        pen.down();
        pen.setDirection(270);
        pen.up();
        pen.move(5);
        pen.setDirection(180);
        pen.move(135);




        pen.setDirection(0);
        pen.move(1);
        pen.setColor(Color.red);
        pen.down();
        for (int a = 0; a < 41; a++)
        {
            pen.setDirection(90);
            pen.move(5);
            pen.setDirection(0);
            for(int b = 0; b < 15; b++)
            {
                pen.down();
                pen.move(5);
                pen.up();
                pen.move(5);
            }
            pen.setDirection(90);
            pen.move(1);
            pen.setDirection(180);
            for(int b = 0; b < 15; b++)
            {
                pen.down();
                pen.move(5);
                pen.up();
                pen.move(5);
            }
        }
        pen.setDirection(180);
        pen.move(1);
        pen.setDirection(270);
        pen.move(246);
        pen.setDirection(0);
        pen.move(180);
        return(number);
    }
}