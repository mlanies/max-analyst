package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class m63 extends hdc {
    public final int Y;
    public final int Z;
    public final int o;
    public final int t0;
    public o63 u0;
    public int[] X = {-65536};
    public int s0 = -1;

    public m63(Context context, int i) {
        this.o = i;
        this.Y = tu0.f(context, 6);
        this.Z = tu0.f(context, 32);
        this.t0 = tu0.f(context, 2);
    }

    @Override // defpackage.hdc
    public final int j() {
        return this.X.length;
    }

    @Override // defpackage.hdc
    public final void r(dec decVar, int i) {
        q63 q63Var = (q63) decVar;
        q63Var.F0.setColor(this.X[i]);
        View view = q63Var.a;
        view.animate().cancel();
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        int measuredHeight;
        int paddingBottom;
        int i2 = this.s0;
        int i3 = this.Z;
        int i4 = this.Y;
        int i5 = this.o;
        if (i2 == -1) {
            if (i5 == 0) {
                measuredHeight = viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft();
                paddingBottom = viewGroup.getPaddingRight();
            } else {
                measuredHeight = viewGroup.getMeasuredHeight() - viewGroup.getPaddingTop();
                paddingBottom = viewGroup.getPaddingBottom();
            }
            int i6 = measuredHeight - paddingBottom;
            float f = (i4 * 2) + i3;
            float f2 = i6;
            float f3 = f2 / f;
            this.s0 = (int) (((f2 / (f3 - (f3 - (((int) f3) + 0.5f)))) - f) / 2.0f);
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new pdc(-2, -2));
        frameLayout.setClipToPadding(false);
        if (i5 == 0) {
            int i7 = this.s0 + i4;
            frameLayout.setPadding(i7, i4, i7, i4);
        } else {
            int i8 = this.s0 + i4;
            frameLayout.setPadding(i4, i8, i4, i8);
        }
        n63 n63Var = new n63(viewGroup.getContext());
        n63Var.c = tu0.f(n63Var.getContext(), 2);
        Paint paint = new Paint();
        n63Var.a = paint;
        paint.setColor(-65536);
        Paint paint2 = n63Var.a;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        n63Var.a.setAntiAlias(true);
        n63Var.a.setDither(true);
        Paint paint3 = new Paint();
        n63Var.b = paint3;
        paint3.setColor(-1);
        n63Var.b.setStyle(style);
        n63Var.b.setAntiAlias(true);
        n63Var.b.setDither(true);
        n63Var.setClipToOutline(false);
        n63Var.setOutlineProvider(new e62(n63Var, 2));
        n63Var.setLayoutParams(new pdc(i3, i3));
        n63Var.setElevation(this.t0);
        frameLayout.addView(n63Var);
        return new q63(frameLayout, n63Var, this.u0);
    }
}
