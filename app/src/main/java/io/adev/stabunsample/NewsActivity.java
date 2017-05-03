package io.adev.stabunsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static io.adev.stabunsample.NewsSender.*;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public long enterTime;

    @Override
    protected void onResume() {
        super.onResume();
        NEWS_SENDER.onScreenEnter();
        enterTime = System.currentTimeMillis();
    }

    @Override
    protected void onPause() {
        super.onPause();
        long sessionTime = System.currentTimeMillis() - enterTime;
        NEWS_SENDER.onScreenExit(sessionTime);
    }
}
