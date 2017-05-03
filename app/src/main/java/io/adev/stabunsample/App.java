package io.adev.stabunsample;

import android.app.Application;
import android.content.Context;

/**
 * Created by sand on 03.05.2017.
 */

public class App extends Application {

    public static Context appContext;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
    }

}
