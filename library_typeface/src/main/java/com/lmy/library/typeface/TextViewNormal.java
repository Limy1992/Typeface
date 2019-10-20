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
public class TextViewNormal extends TextView {
    public TextViewNormal(Context context) {
        super(context);
        Typeface regularTypeface = Typeface.createFromAsset(context.getApplicationContext().getAssets(), "fonts/SourceHanSansCN-Normal-2.otf");
        setTypeface(regularTypeface);
    }

    public TextViewNormal(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TextViewNormal(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
