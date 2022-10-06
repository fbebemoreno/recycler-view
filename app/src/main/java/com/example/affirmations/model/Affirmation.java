package com.example.affirmations.model;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

public class Affirmation {
    @StringRes public int stringResourceId;
    @DrawableRes public int imageResourceId;

    public Affirmation(
            int stringResourceId,
            int imageResourceId
    ) {
        this.stringResourceId = stringResourceId;
        this.imageResourceId = imageResourceId;
    }
}
