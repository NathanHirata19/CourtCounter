package com.academy.app.courtcounter;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AlertDialog gameOverAlert;


    private TextView point1View;
    private int point1;
    private TextView point2View;
    private int point2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        gameOverAlert= new AlertDialog.Builder(MainActivity.this).create();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        point1View = (TextView)findViewById(R.id.addpoint1);
        point1=0;
        point1View.setText("0");

        point2View = (TextView)findViewById(R.id.addpoint2);
        point2=0;
        point2View.setText("0");

        }

    public void clickpoint1(View view){
        point1++;
        point1View.setText("" + point1);}

    public void clickpoint2(View view){
        point2++;
        point1View.setText("" + point2);}

    public void clickpoint4(View view){
        point2--;
        point2View.setText("" + point2);
    }

    public void clickpoint3(View view){
        point1--;
        point1View.setText("" + point1);
    }

    public void clickgameover(View view){
        if (point1 > point2) {
            gameOverAlert.setMessage("Team 1 wins");
        }
        else if (point1 < point2) {
            gameOverAlert.setMessage("Team 2 wins");
        }
        else {
            gameOverAlert.setMessage("It Is a Tie");
        }

        gameOverAlert.setTitle("Game Over");
        gameOverAlert.setMessage("Message Text");
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

