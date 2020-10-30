package Monopoly;

import java.util.Random;

public class Dice {
    //giver terning 6 sider
    private int Max = 6;
    private int facevalue;

    public Dice(int value, int facevalue) {
        facevalue = value;

    }

    public Dice() {

    }
    //kast terningen og vis værdien.
    public int roll(){
        //+1 for at terningen viser 6
        facevalue = (int)
                (Math.random()*Max)+1;

        return facevalue;


    }
    //hent værdien
    public int getFacevaule(){
        return facevalue;

    }
    //retunerer en strengrrpræsentation og objektes data.
    public String toString(){
        String result = "value" + facevalue;
        return result;

    }
}

