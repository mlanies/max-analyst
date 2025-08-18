package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.ivb;
import defpackage.og;
import defpackage.stb;
import defpackage.tsb;
import defpackage.z7;
import defpackage.zmf;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {
    public TextView a;
    public Button b;
    public int c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z7.Q(context, tsb.motionEasingEmphasizedInterpolator, og.b);
    }

    public final boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.a.getPaddingTop() == i2 && this.a.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.a;
        WeakHashMap weakHashMap = zmf.a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.b;
    }

    public TextView getMessageView() {
        return this.a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(ivb.snackbar_text);
        this.b = (Button) findViewById(ivb.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(stb.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(stb.design_snackbar_padding_vertical);
        Layout layout = this.a.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.c <= 0 || this.b.getMeasuredWidth() <= this.c) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.c = i;
    }
}
