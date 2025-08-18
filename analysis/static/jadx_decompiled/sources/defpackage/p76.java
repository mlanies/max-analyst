package defpackage;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import one.me.sdk.gallery.view.NumericCheckButton;
import one.me.sdk.gallery.view.VideoInfoTextView;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class p76 extends hl7 {
    public final z96 X;

    public p76(z96 z96Var) {
        super(y34.f);
        this.X = z96Var;
    }

    @Override // defpackage.hdc
    public final int l(int i) {
        v86 v86Var = (v86) C(i);
        if (v86Var != null) {
            return v86Var.a;
        }
        return 0;
    }

    @Override // defpackage.hdc
    public final void r(dec decVar, int i) throws NumberFormatException {
        sme smeVarR;
        a96 a96Var = (a96) decVar;
        v86 v86Var = (v86) C(i);
        if (v86Var == null) {
            return;
        }
        if ((a96Var instanceof z86) && (v86Var instanceof u86)) {
            z86 z86Var = (z86) a96Var;
            u86 u86Var = (u86) v86Var;
            zp7 zp7Var = u86Var.c;
            int i2 = zp7Var.w0;
            int i3 = ((i2 == 3) || i2 == 4) ? 0 : 8;
            VideoInfoTextView videoInfoTextView = z86Var.I0;
            videoInfoTextView.setVisibility(i3);
            int i4 = zp7Var.w0;
            if (i4 == 3) {
                videoInfoTextView.setText(videoInfoTextView.getContext().getString(jpc.m1));
                videoInfoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                videoInfoTextView.setVisibility(0);
            } else if (i4 == 4) {
                Context context = videoInfoTextView.getContext();
                int i5 = gpc.u0;
                if (videoInfoTextView.isInEditMode()) {
                    smeVarR = ee4.e0;
                } else {
                    Context context2 = videoInfoTextView.getContext();
                    khe kheVar = sme.a0;
                    smeVarR = fm9.R(context2);
                }
                Drawable drawableU = ngg.u(i5, smeVarR.t, context);
                videoInfoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableU, (Drawable) null, (Drawable) null, (Drawable) null);
                if (drawableU instanceof AnimationDrawable) {
                    videoInfoTextView.post(new cy8(drawableU, 1));
                }
                String[] strArr = are.b;
                videoInfoTextView.setText(tfg.c(u86Var.m));
                videoInfoTextView.setVisibility(0);
            }
            Context context3 = z86Var.a.getContext();
            xv6 xv6VarD = xv6.d(u86Var.l);
            xv6VarD.i = false;
            xv6VarD.o = Boolean.FALSE;
            xv6VarD.d = u86Var.d;
            int i6 = u86Var.k;
            if (i6 != 0) {
                xv6VarD.l = new bwa(i6, 1);
            }
            Uri uri = u86Var.g;
            if (uri != null) {
                xv6VarD.l = new eoa(context3, uri);
            }
            wv6 wv6VarA = xv6VarD.a();
            int i7 = OneMeDraweeView.B0;
            z86Var.H0.o(wv6VarA, null);
            NumericCheckButton numericCheckButton = z86Var.G0;
            if (numericCheckButton != null) {
                if (u86Var.i) {
                    numericCheckButton.setEnabled(true);
                    numericCheckButton.setNumber(u86Var.h);
                } else {
                    numericCheckButton.setNumber(0);
                    numericCheckButton.setEnabled(false);
                }
                tu0.K(numericCheckButton, 300L, new xx5(3, z86Var));
            }
        }
        tu0.K(a96Var.a, 300L, new p23(this, i, v86Var, 2));
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        return i == 5 ? new x86(layoutInflaterFrom.inflate(gga.b, viewGroup, false)) : new z86(layoutInflaterFrom.inflate(gga.c, viewGroup, false), this.X);
    }
}
