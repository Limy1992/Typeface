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

    private static final int REGULAR = 1;
    private static final int AIR_MEDIUM = 2;
    private static final int AIR_BOOK = 3;
    private static final int SNA_MEDIUM = 4;
    private static final int SNA_NORMAL = 5;


    public SiYuanFontTextView(Context context) {
        this(context, null);
    }

    public SiYuanFontTextView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SiYuanFontTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        initTypeView(attrs);
    }

    private void initTypeView(AttributeSet attrs) {
        TypedArray typedArray = mContext.obtainStyledAttributes(attrs, R.styleable.SiYuanFontTextView);
        int textType = typedArray.getInt(R.styleable.SiYuanFontTextView_fontTypeface,SNA_MEDIUM);
        switch (textType) {
            case REGULAR:
                setTypeface(getTypefaceR("fonts/NotoSansHans-Regular.otf"));
                break;
            case AIR_MEDIUM:
                setTypeface(getTypefaceAM("AvenirLTStd-Medium.otf"));
                break;
            case AIR_BOOK:
                setTypeface(getTypefaceAB("AvenirLTStd-Book.otf"));
                break;
            case SNA_MEDIUM:
                setTypeface(getTypefaceSM("NotoSansHans-Medium.otf"));
                break;
            case SNA_NORMAL:
                setTypeface(getTypefaceSN("SourceHanSansCN-Normal-2.otf"));
                break;
        }
        typedArray.recycle();
    }

    private Typeface regularTypeface;
    private Typeface airMediumTypeface;
    private Typeface airBookTypeface;
    private Typeface sanMediumTypeface;
    private Typeface sanNormalTypeface;

    public Typeface getTypefaceR(String textType) {
        if (regularTypeface == null) {
            regularTypeface = Typeface.createFromAsset(mContext.getAssets(), textType);
        }
        return regularTypeface;
    }

    public Typeface getTypefaceAM(String textType) {
        if (airMediumTypeface == null) {
            airMediumTypeface = Typeface.createFromAsset(mContext.getAssets(), textType);
        }
        return airMediumTypeface;
    }

    public Typeface getTypefaceAB(String textType) {
        if (airBookTypeface == null) {
            airBookTypeface = Typeface.createFromAsset(mContext.getAssets(), textType);
        }
        return airBookTypeface;
    }

    public Typeface getTypefaceSM(String textType) {
        if (sanMediumTypeface == null) {
            sanMediumTypeface = Typeface.createFromAsset(mContext.getAssets(), textType);
        }
        return sanMediumTypeface;
    }

    public Typeface getTypefaceSN(String textType) {
        if (sanNormalTypeface == null) {
            sanNormalTypeface = Typeface.createFromAsset(mContext.getAssets(), textType);
        }
        return sanNormalTypeface;
    }
}
