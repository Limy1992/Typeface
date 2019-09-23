package com.lmy.library.typeface;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;

import androidx.annotation.Nullable;

/**
 * Button
 * Create by 2019/9/23
 * Author lmy
 */
@SuppressLint("AppCompatCustomView")
public class SiYuanFontButton  extends Button {
    private Context mContext;

    private SiYuanFontManger siYuanFontManger;

    public SiYuanFontButton(Context context) {
        this(context, null);
    }

    public SiYuanFontButton(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SiYuanFontButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        siYuanFontManger = new SiYuanFontManger(mContext);
        initTypeView(attrs);
    }

    private void initTypeView(AttributeSet attrs) {
        setIncludeFontPadding(false);
        @SuppressLint("CustomViewStyleable")
        TypedArray typedArray = mContext.obtainStyledAttributes(attrs, R.styleable.SiYuanFontTextView);
        int textType = typedArray.getInt(R.styleable.SiYuanFontTextView_fontTypeface,SiYuanFontManger.SNA_MEDIUM);
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