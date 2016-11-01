package com.academy.app.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView point1View;
    private int point1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        point1View = (TextView)findViewById(R.id.addpoint1);
        point1=0;
        point1View.setText("0");
        }

    public void clickpoint1(View view){
        point1++;
        point1View.setText("" + point1);
    }
}
