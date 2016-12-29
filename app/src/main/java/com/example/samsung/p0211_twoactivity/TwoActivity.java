package com.example.samsung.p0211_twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TwoActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnActThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        btnActThree = (Button) findViewById(R.id.btnActThree);
        btnActThree.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnActThree :
                //TODO Call second activity
                Intent intent = new Intent(this, ThreeActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }

    }
}
