package com.academy.app.courtcounter;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AlertDialog gameOverAlert;

    MediaPlayer mediaPlayer;

    private TextView point1View;
    private int point1;
    private TextView point2View;
    private int point2;

    private TextView team1View;
    private String stringteam1;
    private TextView team2View;
    private String stringteam2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        gameOverAlert= new AlertDialog.Builder(MainActivity.this).create();

        mediaPlayer = MediaPlayer.create(this,R.raw.mgsound);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        point1View = (TextView)findViewById(R.id.addpoint1);
        point1=0;
        point1View.setText("0");

        point2View = (TextView)findViewById(R.id.addpoint2);
        point2=0;
        point2View.setText("0");

        team1View = (TextView)findViewById(R.id.team1);
        stringteam1="Team billy bob wins";
        team2View = (TextView)findViewById(R.id.team2);
        stringteam2="Team joreyjock wins";

        }

    public void clickpoint1(View view){
        point1++;
        point1View.setText("" + point1);
        mediaPlayer.start();
    }

    public void clickpoint2(View view){
        point2++;
        point2View.setText("" + point2);
        mediaPlayer.start();
    }

    public void clickpoint3(View view){
        point1--;
        point1View.setText("" + point1);
        mediaPlayer.start();
    }

    public void clickpoint4(View view){
        point2--;
        point2View.setText("" + point2);
        mediaPlayer.start();
    }

    public void clickgameover(View view){
        mediaPlayer.start();
        if (point1 > point2) {
            gameOverAlert.setMessage(stringteam1);
        }
        else if (point1 < point2) {
            gameOverAlert.setMessage(stringteam2);
        }
        else {
            gameOverAlert.setMessage("It Is a Tie");
        }

        gameOverAlert.setTitle("Game Over");
        gameOverAlert.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        gameOverAlert.show();
        point1=0;
        point1View.setText("" + point1);
        point2=0;
        point2View.setText("" + point2);

    }

    }

