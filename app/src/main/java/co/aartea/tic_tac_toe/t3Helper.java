package co.aartea.tic_tac_toe;

/**
 * Created by aaron on 4/22/2016.
 *
 * T3, or tic-tac-toe, helper class that will maintain the core logic and
 * referential components with respect to the game as it is played.
 *
 *Side notes: Each turn, toast will appear (X's Turn, O's Turn); add timer
 */
public class t3Helper {


    private String[][] player1 = new String[3][3];
    private String[][] player2 = new String[3][3];
    private String[][] position = new String[3][3];               //Row and column number
    private int counter = 0;


    //Use an intent to handle key of p1 and p2's position and map it against
    //HashMap.

    //Board state will "refresh" or check for any changes during play; add logic to preclude win and ultimately, player loss.
    public void boardState(String[][]position) {
        //States of board win(s)
        toWin(position);

        //Add values when user clicks -- dependent upon buttonlisteners

        //If board is full; check for tie.
        setCounter(counter);
        counter++;
        }

    //Method will be called upon by boardState to detect a win. Includes diagonal.
    //True = p1; false = p2
    public boolean toWin(String[][] position) {
        String value;

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < i; j++) {
                if (position[i][j].equalsIgnoreCase("X")) {
                    value = player1[i][j];
                    position[i][j] = value;         //Player will store value of p1 or p2 and compare later.
                } else
                    value = player2[i][j];
                    position[i][j] = value;
            }

        //Rows and columns only.
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < i; j++) {
                if (position[i][j] == position[i + 1][j + 1] && position[i + 1][j + 1] == position[i + 2][j + 2]) {
                    if (position[i][j].equalsIgnoreCase("X"))
                        return true;
                }
                else
                    return false;
                }

        //Diagonal going from top left to bottom right.
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < i; j++) {
                if(position[i][j] == position[1][1] && position[1][1] == position[2][2] ){
                    if (position[i][j].equalsIgnoreCase("X"))
                        return true;
                }
                else
                    return false;
            }

        //Diagonal going from top right to bottom left.
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < i; j++) {
                if(position[0][2] == position[1][1] && position[1][1] == position[2][0] ){
                    if (position[i][j].equalsIgnoreCase("X"))
                        return true;
                }
                else
                    return false;
            }
        return true;
    }


    //Counter method; used for differentiating between p1 and p2 turns. Requires sharedpref.
    public int setCounter(int counter) {
        return counter;
    }

    //p1%1 == 0; player1 turn
    //p2%2 == 1; player2 turn
//    public void playerTurn(int counter) {
//        if(!toWin(position)){
//            player
//
//        }
//
//        }
}

