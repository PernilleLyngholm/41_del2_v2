package Monopoly;

public class Board {
    Squares[] squares = new Squares[11]; {
        squares[0] = new Squares("Tower", +250, false);
        squares[1] = new Squares("Crater", -100, false);
        squares[2] = new Squares("Palace gates", +100, false);
        squares[3] = new Squares("Cold Desert", -20, false);
        squares[4] = new Squares("Walled City", +180, false);
        squares[5] = new Squares("Monastery", 0, true);
        squares[6] = new Squares("Black cave", -70, false);
        squares[7] = new Squares("Huts in the mountain", +60, false);
        squares[8] = new Squares("The Werewall (werewolf-wall)", -80, true);
        squares[9] = new Squares("The pit", -50, false);
        squares[10] = new Squares("Goldmine", +650, false);
    }

int getpoints (int dieValue) {
    return valueSquare [dieValue -2];
}
public String getsquareName (int dieValue) {

    return squareName[dieValue-2];

}

}
