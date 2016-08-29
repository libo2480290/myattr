package com.example.libo.myapplicationattr;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by libo on 16/7/13.
 */
public class MyView extends TextView {

    private String mString = "Welcome to Kesion's blog";

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.MyAttr);
        int textColor = a.getColor(R.styleable.MyAttr_textColor,
                0XFFFFFFFF);
        float textSize = a.getDimension(R.styleable.MyAttr_textSize, 36);
        mString = a.getString(R.styleable.MyAttr_title);
        setText(mString);
        setTextSize(textSize);
        setTextColor(textColor);
    }
}
