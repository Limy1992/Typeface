package com.lmy.library.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.lmy.library.typeface.R;

/**
 * 直播预告 and 课程历史 筛选条件样式
 * Create by 2019/10/9
 * Author lmy
 */
public class LinLayoutView extends LinearLayout {
    private Context mContext;
    public ImageView imageView;
    public TextView textView;
    private int iconWidth;
    private int iconHeight;
    private float textViewSize;
    private int iconSrc;
    private int linBackground;
    private String linTextView;
    private int textColor;

    public LinLayoutView(Context context) {
        this(context, null);
    }

    public LinLayoutView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LinLayoutView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;

        TypedArray typedArray = mContext.obtainStyledAttributes(attrs, R.styleable.LinLayoutView);
        iconWidth = typedArray.getLayoutDimension(R.styleable.LinLayoutView_linIconWidth, dip2px(13));
        iconHeight = typedArray.getLayoutDimension(R.styleable.LinLayoutView_linIconHeight, dip2px(13));
        textViewSize = typedArray.getDimension(R.styleable.LinLayoutView_linTextSize, 0);
        iconSrc = typedArray.getResourceId(R.styleable.LinLayoutView_linIconScr, R.drawable.ic_m_sing_en);
        linBackground = typedArray.getResourceId(R.styleable.LinLayoutView_linBackground, R.drawable.bg_m_button5);
        linTextView = typedArray.getString(R.styleable.LinLayoutView_linTextView);
        textColor = typedArray.getColor(R.styleable.LinLayoutView_linTextColor, Color.parseColor("#26292D"));
        setBackgroundResource(linBackground);
        initAddChildView();
        typedArray.recycle();
    }

    private void initAddChildView() {
        LayoutParams params = new LayoutParams(iconWidth, iconHeight);
        params.setMargins(dip2px(9f)
                , dip2px(7f)
                , 0
                , dip2px(7f));
        params.gravity = Gravity.CENTER_VERTICAL;
        imageView = new ImageView(mContext);
        imageView.setImageResource(iconSrc);
        addView(imageView, params);

        LayoutParams textParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        textParams.leftMargin = dip2px(7f);
        textParams.weight = 1;
        textParams.gravity = Gravity.CENTER_VERTICAL;
        textView = new TextView(mContext);
        textView.setTextAppearance(mContext, R.style.TextFieldRegular);
        textView.setText(linTextView);
        if (textViewSize > 0) {
            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, textViewSize);
        } else {
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 8F);
        }
        textView.setTextColor(textColor);
        addView(textView, textParams);

        LayoutParams moreParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        moreParams.rightMargin = dip2px(9f);
        moreParams.gravity = Gravity.CENTER_VERTICAL;
        ImageView moreImage = new ImageView(mContext);
        moreImage.setImageResource(R.drawable.ic_m_down);
        addView(moreImage, moreParams);
    }

    /**
     * dp转换
     */
    public int dip2px(float dpValue) {
        float scale = getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5F);
    }

    public int sp2px(float spValue) {
        final float fontScale = getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }
}
