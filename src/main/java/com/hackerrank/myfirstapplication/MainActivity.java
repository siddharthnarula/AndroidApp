package com.hackerrank.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1 :
                Toast.makeText(this, "Opening VR Video...", Toast.LENGTH_SHORT).show();
                Intent launchIntent1 = getPackageManager().getLaunchIntentForPackage("com.abc.spherevr");
                if(launchIntent1!=null) {
                    startActivity(launchIntent1);
                }
                break;

            case R.id.button2 :
                Toast.makeText(this, "Opening AR Module", Toast.LENGTH_SHORT).show();
                Intent launchIntent2 = getPackageManager().getLaunchIntentForPackage("com.abc.Ar");
                if(launchIntent2!=null) {
                    startActivity(launchIntent2);
                }
                break;

            case R.id.button3 :
                Intent intent = new Intent(MainActivity.this,Weather.class);
                startActivity(intent);
                break;

            case R.id.button4 :

                break;


        }



    }
}
