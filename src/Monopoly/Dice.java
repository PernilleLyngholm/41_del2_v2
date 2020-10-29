package Monopoly;

import java.util.Random;

public class Dice {

    //her laver vi en a variabel
    private int numberOfside;

    // her laver vi a construktor
    public Dice(){
        this.numberOfside=6;
    }
    //her er en anden construktor
    public Dice(int s){
        if(s>1)
            this.numberOfside=s;
    }
    // her laver vi en method/ funktion som har et opgave at rolle terning og viser den numberofside
    public int rolle(){

        Random rand= new Random(); // den her hadder en objekt
        return 1+rand.nextInt((numberOfside));
    }










}

