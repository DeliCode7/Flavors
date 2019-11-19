package ru.otus.demo.testflavourapp;

import android.content.Context;

import androidx.annotation.Nullable;

import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.YandexMetricaConfig;

public class GetterText implements ITextGetter {

    Context ctx;
    @Nullable
    @Override
    public String getValue() {
        //YandexMetricaConfig config = YandexMetricaConfig.newConfigBuilder("API_KEY").withLogs().build();
        //YandexMetrica.activate(ctx, config);

        return "Купите наше приложение :)";
    }
}
