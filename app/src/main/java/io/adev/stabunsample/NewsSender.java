package io.adev.stabunsample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.adev.stabun.core.send.StabunSender;
import io.adev.stabun.core.wrapper.StatisticsWrapper;
import io.adev.stabun_google.GoogleStatisticsWrapper;

import static io.adev.stabunsample.App.*;

/**
 * Created by sand on 03.05.2017.
 */

public class NewsSender extends StabunSender {

    public static NewsSender NEWS_SENDER = new NewsSender();

    private static List<StatisticsWrapper> wrappers = Arrays.asList((StatisticsWrapper) new GoogleStatisticsWrapper("<your key>", appContext));

    public NewsSender() {
        super(wrappers);
    }

    @Override
    protected String screenName() {
        return "Новости";
    }

    public void onScreenEnter() {
        Map<String, String> params = new HashMap<>();
        send(params);
    }

    public void onScreenExit(long sessionTime) {
        Map<String, String> params = new HashMap<>();
        params.put("время сессии", "" + sessionTime);
        send(params);
    }

}
