package co.aartea.tic_tac_toe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//Project notes: When 'X' is clicked; change color with dark blue text, light blue background
//'O' is clicked -- display dark red text; light red background.
//Refactor -- iterate buttons and setOnItemClickListeners();

public class GameActivity extends AppCompatActivity{

    Button n1,n2,n3,n4,n5,n6,n7,n8,n9;

    String player1, player2;
    int counter = 0;

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

        player1 = "X";      //mod2 == 0; even
        player2 = "O";      //mod2 == 1; odd

        n1.setOnClickListener(new View.OnClickListener() {
            int tile = 0;
            @Override
            public void onClick(View v) {
                if(counter%2 == 0){
                    n1.setText(player1);
                }
                else {
                    n1.setText(player2);
                }
                counter++;
            }

        });

        n2.setOnClickListener(new View.OnClickListener() {
            int tile = 1;
            @Override
            public void onClick(View v) {
                if(counter%2 == 0){
                    n2.setText(player1);
                   // game.boardState(player1,tile);
                }
                else{
                    n2.setText(player2);}
                   // game.boardState(player2,tile);
                counter++;
            }

        });

        n3.setOnClickListener(new View.OnClickListener() {
            int tile = 2;
            @Override
            public void onClick(View v) {
                if(counter%2 == 0){
                    n3.setText(player1);
                }
                else {
                    n3.setText(player2);
                }
                counter++;
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter%2 == 0){
                    n4.setText(player1);
                }
                else {
                    n4.setText(player2);
                }
                counter++;
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter%2 == 0){
                    n5.setText(player1);
                }
                else {
                    n5.setText(player2);
                }
                counter++;
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter%2 == 0){
                    n6.setText(player1);
                }
                else {
                    n6.setText(player2);
                }
            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter%2 == 0){
                    n7.setText(player1);
                }
                else {
                    n7.setText(player2);
                }
                counter++;
            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter%2 == 0){
                    n8.setText(player1);
                }
                else{
                    n8.setText(player2);
                }
                counter++;
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter%2 == 0){
                    n9.setText(player1);
                }
                else {
                    n9.setText(player2);
                }
                counter++;
            }
        });
    }//Ends method onCreate
}//Ends class GameActivity
