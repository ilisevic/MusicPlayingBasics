package com.boilerplatecode.musicplayingbasics;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btnOn, btnOff;
    public MediaPlayer mpSoundSos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOn = findViewById(R.id.button);
        btnOff = findViewById(R.id.button2);
         mpSoundSos = MediaPlayer.create(this,R.raw.emergency);

        btnOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpSoundSos.setLooping(true);
           mpSoundSos.start();

            }
        });
        btnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  mpSoundSos.setLooping(false);
                mpSoundSos.pause();
            }
        });
    }
}
