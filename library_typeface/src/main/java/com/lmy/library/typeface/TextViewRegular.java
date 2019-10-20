package com.lmy.library.typeface;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

/**
 * Create by 2019/10/20
 * Author lmy
 */
public class TextViewRegular extends TextView {
    public TextViewRegular(Context context) {
        super(context);
        Typeface regularTypeface = Typeface.createFromAsset(context.getApplicationContext().getAssets(), "fonts/NotoSansHans-Regular.otf");
        setTypeface(regularTypeface);
    }

    public TextViewRegular(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TextViewRegular(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
