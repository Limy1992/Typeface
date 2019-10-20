package com.lmy.library.typeface;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

import androidx.annotation.Nullable;

/**
 * Create by 2019/10/20
 * Author lmy
 */
public class TextFieldRegular {
    public static Typeface regularTypeface;

    public static Typeface getTypefaceR(Context context) {
        if (regularTypeface == null) {
            regularTypeface = Typeface.createFromAsset(context.getApplicationContext().getAssets(), "fonts/NotoSansHans-Regular.otf");
        }
        return regularTypeface;
    }
}
