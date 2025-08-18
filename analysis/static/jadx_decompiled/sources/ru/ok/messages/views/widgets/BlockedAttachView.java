package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.bk4;
import defpackage.epc;
import defpackage.gpc;
import defpackage.jpc;
import defpackage.lt3;

/* loaded from: classes2.dex */
public class BlockedAttachView extends LinearLayout {
    public final AppCompatTextView a;
    public final GradientDrawable b;

    public BlockedAttachView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        bk4 bk4VarB = bk4.b();
        setOrientation(1);
        setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.b = gradientDrawable;
        gradientDrawable.setColor(lt3.a(getContext(), epc.d));
        setBackground(this.b);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
        appCompatImageView.setImageResource(gpc.e0);
        appCompatImageView.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        addView(appCompatImageView, new LinearLayout.LayoutParams(-2, -2));
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.a = appCompatTextView;
        appCompatTextView.setGravity(17);
        this.a.setTextSize(0, bk4VarB.H);
        this.a.setText(getResources().getText(jpc.T));
        this.a.setTextColor(-1);
        this.a.setPadding(0, bk4VarB.i, 0, 0);
        addView(this.a, new LinearLayout.LayoutParams(-1, -2));
    }

    public void setCorners(float[] fArr) {
        this.b.setCornerRadii(fArr);
    }
}
