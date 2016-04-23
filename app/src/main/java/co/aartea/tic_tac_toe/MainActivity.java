package co.aartea.tic_tac_toe;

//First page; will ask user to input information.

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText p1, p2;
    TextView tv;
    Button startGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tv = (TextView) findViewById(R.id.)
        p1 = (EditText) findViewById(R.id.player1);
        p2 = (EditText) findViewById(R.id.player2);
        startGame = (Button) findViewById(R.id.gameStart);



        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1,s2;
                s1 = p1.getText().toString();
                s2 = p2.getText().toString();
                if(s1.isEmpty() || s2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter a valid name!", Toast.LENGTH_SHORT).show();
                }
                Intent i = new Intent(MainActivity.this,GameActivity.class);
                startActivity(i);
            }
        });


    }





}
