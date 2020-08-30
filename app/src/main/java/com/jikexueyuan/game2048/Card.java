package com.jikexueyuan.game2048;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Card extends FrameLayout {
    private TextView label;
    private int num = 0;

    public Card(@NonNull Context context) {
        super(context);
        label = new TextView(getContext());
        label.setTextSize(35);
        label.setBackgroundColor(0x33ffffff);
        label.setGravity(Gravity.CENTER);
        LayoutParams lp = new LayoutParams(-1, -1);
        lp.setMargins(10, 10, 0, 0);
        addView(label, lp);
        setNum(0);
    }

    public Card(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Card(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setNum(int num) {
        this.num = num;
        if (num <= 0) {
            label.setText("");
            label.setBackgroundColor(0x33ffffff);
        } else {
            switch (num) {
                case 2:
                    label.setBackgroundColor(0xffbcd6dd);
                    break;
                case 4:
                    label.setBackgroundColor(0xffadd9d8);
                    break;
                case 8:
                    label.setBackgroundColor(0xff9fdcd4 );
                    break;
                case 16:
                    label.setBackgroundColor(0xff91e0d0);
                    break;
                case 32:
                    label.setBackgroundColor(0xff83e3cc);
                    break;
                case 64:
                    label.setBackgroundColor(0xff75e7c8);
                    break;
                case 128:
                    label.setBackgroundColor(0xff67eac4);
                    break;
                case 256:
                    label.setBackgroundColor(0xff58edc0);
                    break;
                case 512:
                    label.setBackgroundColor(0xff4af1bc);
                    break;
                case 1024:
                    label.setBackgroundColor(0xff3cf4b8);
                    break;
                case 2048:
                    label.setBackgroundColor(0xff2ef8b4);
                    break;
                case 4096:
                    label.setBackgroundColor(0xff20fbb0);
                    break;
                case 8192:
                    label.setBackgroundColor(0xff12ffac);
                    break;
                    default:
                        label.setBackgroundColor(0xffFF0000);
                        break;
            }
            label.setText(num + "");
        }
    }

    public int getNum() {
        return num;
    }

    public boolean equals(Card card) {
        return getNum()==card.getNum();
    }
}
