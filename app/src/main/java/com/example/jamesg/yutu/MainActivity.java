 package com.example.jamesg.yutu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubeStandalonePlayer;

import static com.google.android.youtube.player.YouTubePlayer.*;

public class MainActivity extends YouTubeBaseActivity {
Button b;
    private YouTubePlayerView youTubePlayerView;
    private OnInitializedListener onInitializedListener;
    private YouTubePlayer youTubePlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.maview);
        onInitializedListener = new OnInitializedListener() {

            public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean b) {
                youTubePlayer.loadVideo ("hhnvlpNVQocw");
            }

            public void onInitializationFailure(Provider provider, YouTubeInitializationResult error) {

            }
        };
        b = (Button) findViewById(R.id.mabutton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youTubePlayerView.initialize("AIzaSyB-EP3xFROiZ--KgN8YXkp2d5m1uGG0DJc", onInitializedListener);
            }
        });
    }}