package Monopoly;

public class Board {
String[] squareName = {"Tower", "Crater", "Palace gates", "Cold Desert", "Walled city", "Monastery", "Black cave", "Huts in the mountain", "The Werewall (werewolf-wall)", "The pit", "Goldmine"};
int [] valueSquare = {+250, -100, +100, -20, +180, 0, -70, +60, -80, -50, +650};

int getpoints (int dieValue) {
    return valueSquare [dieValue -2];

}
public String getsquareName (int dieValue) {

    return squareName[dieValue-2];

}

}
