package co.aartea.tic_tac_toe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//Project notes: When 'X' is clicked; change color with dark blue text, light blue background
//'O' is clicked -- display dark red text; light red background.
//Refactor -- iterate buttons and setOnItemClickListeners();

public class GameActivity extends AppCompatActivity{

    Button n1,n2,n3,n4,n5,n6,n7,n8,n9;

    String player1, player2;
    int counter = 0;
    String[]board= {"1","2","3","4","5","6","7","8","9"};       //Indiscriminate values as placeholders so logic remains false

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        n1 = (Button) findViewById(R.id.n1);
        n2 = (Button) findViewById(R.id.n2);
        n3 = (Button) findViewById(R.id.n3);
        n4 = (Button) findViewById(R.id.n4);
        n5 = (Button) findViewById(R.id.n5);
        n6 = (Button) findViewById(R.id.n6);
        n7 = (Button) findViewById(R.id.n7);
        n8 = (Button) findViewById(R.id.n8);
        n9 = (Button) findViewById(R.id.n9);

        player1 = "O";      //mod2 == 0; even
        player2 = "X";      //mod2 == 1; odd

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(!isWin()) {
                if (counter % 2 == 0) {
                    n1.setText(player1);
                    board[0] = player1;
                } else {
                    n1.setText(player2);
                    board[0] = player2;
                }
            }
                n1.setClickable(false);
                counter++;
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isWin()) {
                    if (counter % 2 == 0) {
                        n2.setText(player1);
                        board[1] = player1;
                    } else {
                        n2.setText(player2);
                        board[1] = player2;
                    }
                }
                n2.setClickable(false);
                counter++;
            }

        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isWin()) {
                    if (counter % 2 == 0) {
                        n3.setText(player1);
                        board[2] = player1;
                    } else {
                        n3.setText(player2);
                        board[2] = player2;
                    }
                }
                n3.setClickable(false);
                counter++;
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isWin()) {
                    if (counter % 2 == 0) {
                        n4.setText(player1);
                        board[3] = player1;
                    } else {
                        n4.setText(player2);
                        board[3] = player2;
                    }
                }
                n4.setClickable(false);
                counter++;
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isWin()) {
                    if (counter % 2 == 0) {
                        n5.setText(player1);
                        board[4] = player1;
                    } else {
                        n5.setText(player2);
                        board[4] = player2;
                    }
                }
                n5.setClickable(false);
                counter++;
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isWin()) {
                    if (counter % 2 == 0) {
                        n6.setText(player1);
                        board[5] = player1;
                    } else {
                        n6.setText(player2);
                        board[5] = player2;
                    }
                }
                n6.setClickable(false);
                counter++;
            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isWin()) {
                    if (counter % 2 == 0) {
                        n7.setText(player1);
                        board[6] = player1;
                    } else {
                        n7.setText(player2);
                        board[6] = player2;
                    }
                }
                n7.setClickable(false);
                counter++;
            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isWin()) {
                    if (counter % 2 == 0) {
                        n8.setText(player1);
                        board[7] = player1;
                    } else {
                        n8.setText(player2);
                        board[7] = player2;
                    }
                }
                n8.setClickable(false);
                counter++;
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isWin()) {
                    if (counter % 2 == 0) {
                        n9.setText(player1);
                        board[8] = player1;
                    } else {
                        n9.setText(player2);
                        board[8] = player2;
                    }
                }
                n9.setClickable(false);
                counter++;
            }
        });
    }//Ends method onCreate

        public boolean isWin(){
        //Win via row
        if((board[0].equalsIgnoreCase(board[1])) && (board[0].equalsIgnoreCase(board[2]))){
            Toast.makeText(GameActivity.this, "Winner!", Toast.LENGTH_SHORT).show();
            return true;
                }
        else if((board[3].equalsIgnoreCase(board[4])) && (board[3].equalsIgnoreCase(board[5]))){
            Toast.makeText(GameActivity.this, "Winner!", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if((board[6] == board[7]) && (board[6] == board[8])){
            Toast.makeText(GameActivity.this, "Winner!", Toast.LENGTH_SHORT).show();
            return true;
        }
            //Win via column
            if((board[0].equalsIgnoreCase(board[3])) && (board[0].equalsIgnoreCase(board[6]))){
                Toast.makeText(GameActivity.this, "Winner!", Toast.LENGTH_SHORT).show();
                return true;
            }
            else if((board[1].equalsIgnoreCase(board[4])) && (board[1].equalsIgnoreCase(board[7]))){
                Toast.makeText(GameActivity.this, "Winner!", Toast.LENGTH_SHORT).show();
                return true;
            }
            else if((board[2] == board[7]) && (board[5] == board[8])){
                Toast.makeText(GameActivity.this, "Winner!", Toast.LENGTH_SHORT).show();
                return true;
            }
        //Win via diagonal
        else if((board[0] == board[4]) && (board[0] == board[8])){
            Toast.makeText(GameActivity.this, "Diagonal Winner!", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if((board[2] == board[4]) && (board[2] == board[6])){
            Toast.makeText(GameActivity.this, "Diagonal Winner!", Toast.LENGTH_SHORT).show();
            return true;

        }
            return false;
        }
}//Ends class GameActivity
