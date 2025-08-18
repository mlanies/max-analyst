package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* loaded from: classes.dex */
public final class bg0 extends Drawable implements cpe {
    public static final int y0 = m2c.Widget_MaterialComponents_Badge;
    public static final int z0 = tsb.badgeStyle;
    public final dg0 X;
    public float Y;
    public float Z;
    public final WeakReference a;
    public final q18 b;
    public final dpe c;
    public final Rect o;
    public final int s0;
    public float t0;
    public float u0;
    public float v0;
    public WeakReference w0;
    public WeakReference x0;

    public bg0(int i, int i2, Context context) {
        voe voeVar;
        WeakReference weakReference = new WeakReference(context);
        this.a = weakReference;
        sre.c(context, sre.b, "Theme.MaterialComponents");
        this.o = new Rect();
        dpe dpeVar = new dpe(this);
        this.c = dpeVar;
        TextPaint textPaint = dpeVar.a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        dg0 dg0Var = new dg0(i, i2, context);
        this.X = dg0Var;
        boolean zE = e();
        cg0 cg0Var = dg0Var.b;
        q18 q18Var = new q18(gjd.a(context, zE ? cg0Var.Z.intValue() : cg0Var.X.intValue(), e() ? cg0Var.s0.intValue() : cg0Var.Y.intValue(), new a0(0)).c());
        this.b = q18Var;
        g();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && dpeVar.g != (voeVar = new voe(context2, cg0Var.o.intValue()))) {
            dpeVar.c(voeVar, context2);
            textPaint.setColor(cg0Var.c.intValue());
            invalidateSelf();
            i();
            invalidateSelf();
        }
        int i3 = cg0Var.w0;
        if (i3 != -2) {
            this.s0 = ((int) Math.pow(10.0d, i3 - 1.0d)) - 1;
        } else {
            this.s0 = cg0Var.x0;
        }
        dpeVar.e = true;
        i();
        invalidateSelf();
        dpeVar.e = true;
        g();
        i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(cg0Var.b.intValue());
        if (q18Var.a.c != colorStateListValueOf) {
            q18Var.l(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(cg0Var.c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.w0;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.w0.get();
            WeakReference weakReference3 = this.x0;
            h(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        i();
        setVisible(cg0Var.E0.booleanValue(), false);
    }

    @Override // defpackage.cpe
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        dg0 dg0Var = this.X;
        cg0 cg0Var = dg0Var.b;
        String str = cg0Var.u0;
        boolean z = str != null;
        WeakReference weakReference = this.a;
        if (z) {
            int i = cg0Var.w0;
            if (i == -2 || str == null || str.length() <= i) {
                return str;
            }
            Context context = (Context) weakReference.get();
            if (context == null) {
                return "";
            }
            return String.format(context.getString(wzb.m3_exceed_max_badge_text_suffix), str.substring(0, i - 1), "…");
        }
        if (!f()) {
            return null;
        }
        int i2 = this.s0;
        cg0 cg0Var2 = dg0Var.b;
        if (i2 == -2 || d() <= this.s0) {
            return NumberFormat.getInstance(cg0Var2.y0).format(d());
        }
        Context context2 = (Context) weakReference.get();
        return context2 == null ? "" : String.format(cg0Var2.y0, context2.getString(wzb.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.s0), "+");
    }

    public final FrameLayout c() {
        WeakReference weakReference = this.x0;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int d() {
        int i = this.X.b.v0;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strB;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.b.draw(canvas);
        if (!e() || (strB = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        dpe dpeVar = this.c;
        dpeVar.a.getTextBounds(strB, 0, strB.length(), rect);
        float fExactCenterY = this.Z - rect.exactCenterY();
        canvas.drawText(strB, this.Y, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), dpeVar.a);
    }

    public final boolean e() {
        return this.X.b.u0 != null || f();
    }

    public final boolean f() {
        cg0 cg0Var = this.X.b;
        return cg0Var.u0 == null && cg0Var.v0 != -1;
    }

    public final void g() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        boolean zE = e();
        dg0 dg0Var = this.X;
        this.b.setShapeAppearanceModel(gjd.a(context, zE ? dg0Var.b.Z.intValue() : dg0Var.b.X.intValue(), e() ? dg0Var.b.s0.intValue() : dg0Var.b.Y.intValue(), new a0(0)).c());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.X.b.t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.o.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.o.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(View view, FrameLayout frameLayout) {
        this.w0 = new WeakReference(view);
        this.x0 = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        i();
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bg0.i():void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, defpackage.cpe
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        dg0 dg0Var = this.X;
        dg0Var.a.t0 = i;
        dg0Var.b.t0 = i;
        this.c.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
