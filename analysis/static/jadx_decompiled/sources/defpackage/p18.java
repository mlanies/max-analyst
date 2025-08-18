package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class p18 extends Drawable.ConstantState {
    public gjd a;
    public ew4 b;
    public ColorStateList c;
    public ColorStateList d;
    public final ColorStateList e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public Rect h;
    public final float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public final float o;
    public int p;
    public int q;
    public int r;
    public final int s;
    public final boolean t;
    public final Paint.Style u;

    public p18(gjd gjdVar) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        this.u = Paint.Style.FILL_AND_STROKE;
        this.a = gjdVar;
        this.b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        q18 q18Var = new q18(this);
        q18Var.X = true;
        return q18Var;
    }

    public p18(p18 p18Var) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        this.u = Paint.Style.FILL_AND_STROKE;
        this.a = p18Var.a;
        this.b = p18Var.b;
        this.k = p18Var.k;
        this.c = p18Var.c;
        this.d = p18Var.d;
        this.g = p18Var.g;
        this.f = p18Var.f;
        this.l = p18Var.l;
        this.i = p18Var.i;
        this.r = p18Var.r;
        this.p = p18Var.p;
        this.t = p18Var.t;
        this.j = p18Var.j;
        this.m = p18Var.m;
        this.n = p18Var.n;
        this.o = p18Var.o;
        this.q = p18Var.q;
        this.s = p18Var.s;
        this.e = p18Var.e;
        this.u = p18Var.u;
        if (p18Var.h != null) {
            this.h = new Rect(p18Var.h);
        }
    }
}
