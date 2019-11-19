package ru.otus.demo.testflavourapp;

import android.content.Context;

import androidx.annotation.Nullable;



public class GetterText implements ITextGetter {

    Context ctx;
    @Nullable
    @Override
    public String getValue() {

        return "Благодарим :)";
    }
}
