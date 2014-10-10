package com.chadduffey.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by chadduffey on 10/10/14.
 */
public class ColorWheel {

    public String mColors[] = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public int getColor(){


        //The button was clicked so update the fact label with a new fact
        String color = "";

        //randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);

        //convert our random number to a text fact
        color = mColors[randomNumber];

        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
