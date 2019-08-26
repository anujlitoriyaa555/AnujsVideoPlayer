package com.example.anujsvideoplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView anujvideoview = (VideoView) findViewById(R.id.anujvideoView);

        anujvideoview.setVideoPath("");

        //player controllers
        MediaController mediaController = new MediaController(this);

        mediaController.setAnchorView(anujvideoview);
        anujvideoview.setMediaController(mediaController);

        anujvideoview.start();

    }
}
