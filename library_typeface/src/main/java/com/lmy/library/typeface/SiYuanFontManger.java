package com.lmy.library.typeface;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * 思源字体
 * Create by 2019/9/23
 * Author lmy
 */
public class SiYuanFontManger {

    private final Context mContext;

    public static final int REGULAR = 1;
    public static final int AIR_MEDIUM = 2;
    public static final int AIR_BOOK = 3;
    public static final int SNA_MEDIUM = 4;
    public static final int SNA_NORMAL = 5;

    public SiYuanFontManger(Context mContext){
        this.mContext = mContext;
    }

    private Typeface regularTypeface;
    private Typeface airMediumTypeface;
    private Typeface airBookTypeface;
    private Typeface sanMediumTypeface;
    private Typeface sanNormalTypeface;


    Typeface getTypefaceR() {
        if (regularTypeface == null) {
            regularTypeface = Typeface.createFromAsset(mContext.getAssets(), "fonts/NotoSansHans-Regular.otf");
        }
        return regularTypeface;
    }

    Typeface getTypefaceAM() {
        if (airMediumTypeface == null) {
            airMediumTypeface = Typeface.createFromAsset(mContext.getAssets(), "fonts/Avenir-Medium.otf");
        }
        return airMediumTypeface;
    }

    Typeface getTypefaceAB() {
        if (airBookTypeface == null) {
            airBookTypeface = Typeface.createFromAsset(mContext.getAssets(), "fonts/Avenir-Book.otf");
        }
        return airBookTypeface;
    }

    Typeface getTypefaceSM() {
        if (sanMediumTypeface == null) {
            sanMediumTypeface = Typeface.createFromAsset(mContext.getAssets(), "fonts/NotoSansHans-Medium.otf");
        }
        return sanMediumTypeface;
    }

    Typeface getTypefaceSN() {
        if (sanNormalTypeface == null) {
            sanNormalTypeface = Typeface.createFromAsset(mContext.getAssets(), "fonts/SourceHanSansCN-Normal-2.otf");
        }
        return sanNormalTypeface;
    }

}
