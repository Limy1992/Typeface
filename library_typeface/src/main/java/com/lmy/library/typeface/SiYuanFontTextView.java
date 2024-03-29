package com.lmy.library.typeface;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

/**
 * 思源字体
 * Create by 2019/9/21
 * Author lmy
 */
@SuppressLint("AppCompatCustomView")
public class SiYuanFontTextView extends TextView {
    private Context mContext;

    /**
     *   <enum name="RegularSan" value="1"/>
     *             <enum name="MediumAir" value="2"/>
     *             <enum name="BookAir" value="3"/>
     *             <enum name="MediumSan" value="4"/>
     *             <enum name="NormalSan" value="5"/>
     */


    private SiYuanFontManger siYuanFontManger;

    public SiYuanFontTextView(Context context) {
        this(context, null);
    }

    public SiYuanFontTextView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SiYuanFontTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        siYuanFontManger = new SiYuanFontManger(mContext);
        initTypeView(attrs);
    }

    private void initTypeView(AttributeSet attrs) {
        setIncludeFontPadding(false);
        TypedArray typedArray = mContext.obtainStyledAttributes(attrs, R.styleable.SiYuanFontTextView);
        int textType = typedArray.getInt(R.styleable.SiYuanFontTextView_fontTypeface,0);
        switch (textType) {
            case SiYuanFontManger.REGULAR:
                setTypeface(siYuanFontManger.getTypefaceR());
                break;
            case SiYuanFontManger.AIR_MEDIUM:
                setTypeface(siYuanFontManger.getTypefaceAM());
                break;
            case SiYuanFontManger.AIR_BOOK:
                setTypeface(siYuanFontManger.getTypefaceAB());
                break;
            case SiYuanFontManger.SNA_MEDIUM:
                setTypeface(siYuanFontManger.getTypefaceSM());
                break;
            case SiYuanFontManger.SNA_NORMAL:
                setTypeface(siYuanFontManger.getTypefaceSN());
                break;
        }
        typedArray.recycle();
    }
}
