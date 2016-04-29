package co.aartea.tic_tac_toe;

//First page; will ask user to input information.

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText p1, p2;
    TextView previousWin;

    Button startGame;
    String s1, s2, s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1 = (EditText) findViewById(R.id.player1);
        p2 = (EditText) findViewById(R.id.player2);

        startGame = (Button) findViewById(R.id.gameStart);

        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = p1.getText().toString();
                s2 = p2.getText().toString();
                //Validate name input
                if (s1.equals("") || s2.equals("")) {         //Android can't use toString. Because it will allow for "" and that's a string.
                    Toast.makeText(MainActivity.this, "Please enter a valid name!", Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(MainActivity.this, GameActivity.class);
                    i.putExtra("p1", s1);
                    i.putExtra("p2", s2);
                    startActivity(i);
                }
            }
        });
    }

    public void onResume(){
        super.onResume();
        SharedPreferences prefs = getApplicationContext().getSharedPreferences("winner", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("winner", "");

        previousWin = (TextView) findViewById(R.id.winnerPreview);

        s = String.valueOf(prefs.getString("winner",""));

        previousWin.setText("Previous winner was: "+s);

        }
    }
