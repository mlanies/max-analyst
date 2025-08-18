package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import defpackage.dz1;
import defpackage.gz1;
import defpackage.m3b;
import defpackage.maf;
import defpackage.rbe;
import defpackage.s36;
import defpackage.ud7;
import defpackage.vz3;
import defpackage.x3g;
import defpackage.xz3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout implements m3b {
    public List a;
    public gz1 b;
    public int c;
    public float o;
    public float s0;
    public boolean t0;
    public boolean u0;
    public int v0;
    public rbe w0;
    public View x0;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Collections.emptyList();
        this.b = gz1.g;
        this.c = 0;
        this.o = 0.0533f;
        this.s0 = 0.08f;
        this.t0 = true;
        this.u0 = true;
        dz1 dz1Var = new dz1(context);
        this.w0 = dz1Var;
        this.x0 = dz1Var;
        addView(dz1Var);
        this.v0 = 1;
    }

    private List<xz3> getCuesWithStylingPreferencesApplied() {
        if (this.t0 && this.u0) {
            return this.a;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        for (int i = 0; i < this.a.size(); i++) {
            vz3 vz3VarA = ((xz3) this.a.get(i)).a();
            if (!this.t0) {
                vz3VarA.n = false;
                CharSequence charSequence = vz3VarA.a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        vz3VarA.a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = vz3VarA.a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof ud7)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                s36.A(vz3VarA);
            } else if (!this.u0) {
                s36.A(vz3VarA);
            }
            arrayList.add(vz3VarA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (maf.a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private gz1 getUserCaptionStyle() {
        CaptioningManager captioningManager;
        gz1 gz1Var;
        int i = maf.a;
        gz1 gz1Var2 = gz1.g;
        if (i < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return gz1Var2;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (i >= 21) {
            gz1Var = new gz1(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        } else {
            gz1Var = new gz1(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
        }
        return gz1Var;
    }

    private <T extends View & rbe> void setView(T t) {
        removeView(this.x0);
        View view = this.x0;
        if (view instanceof x3g) {
            ((x3g) view).b.destroy();
        }
        this.x0 = t;
        this.w0 = t;
        addView(t);
    }

    public final void b() {
        this.w0.a(getCuesWithStylingPreferencesApplied(), this.b, this.o, this.c, this.s0);
    }

    @Override // defpackage.m3b
    public final void k(List list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.u0 = z;
        b();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.t0 = z;
        b();
    }

    public void setBottomPaddingFraction(float f) {
        this.s0 = f;
        b();
    }

    public void setCues(List<xz3> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.a = list;
        b();
    }

    public void setFractionalTextSize(float f) {
        this.c = 0;
        this.o = f;
        b();
    }

    public void setStyle(gz1 gz1Var) {
        this.b = gz1Var;
        b();
    }

    public void setViewType(int i) {
        if (this.v0 == i) {
            return;
        }
        if (i == 1) {
            setView(new dz1(getContext()));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new x3g(getContext()));
        }
        this.v0 = i;
    }
}
