package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ld2 implements lr2, d4f {
    public final Context a;
    public final k56 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final khe i;
    public final khe j;
    public final khe k;
    public final khe l;
    public final khe m;
    public final khe n;
    public final khe o;
    public final khe p;
    public final khe q;
    public final khe r;
    public final khe s;
    public final id2 t = new id2(this);
    public final String u = ld2.class.getName();
    public final kd2 v;

    public ld2(Context context, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, kke kkeVar, je7 je7Var6, ot2 ot2Var) {
        this.a = context;
        this.b = ot2Var;
        this.c = je7Var2;
        this.d = je7Var;
        this.e = je7Var4;
        this.f = je7Var3;
        this.g = je7Var5;
        this.h = je7Var6;
        final int i = 3;
        this.i = new khe(new k56(this) { // from class: ed2
            public final /* synthetic */ ld2 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        int i2 = woc.y1;
                        Context context2 = this.b.a;
                        Drawable drawableN = s36.n(context2, i2);
                        if (drawableN == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN, k7d.h(qp4.u0, context2).c);
                        return drawableN;
                    case 1:
                        int i3 = woc.k2;
                        Context context3 = this.b.a;
                        Drawable drawableN2 = s36.n(context3, i3);
                        if (drawableN2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN2, k7d.h(qp4.u0, context3).c);
                        return drawableN2;
                    case 2:
                        int i4 = woc.I1;
                        Context context4 = this.b.a;
                        Drawable drawableN3 = s36.n(context4, i4);
                        if (drawableN3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN3, k7d.h(qp4.u0, context4).b);
                        return drawableN3;
                    case 3:
                        int i5 = woc.Y1;
                        Context context5 = this.b.a;
                        Drawable drawableN4 = s36.n(context5, i5);
                        if (drawableN4 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN4, k7d.h(qp4.u0, context5).j);
                        return drawableN4;
                    case 4:
                        return new yl5(new e4f(qp4.u0.b(this.b.a).i(), new we1(14)), sl5.a, 4);
                    case 5:
                        int i6 = woc.p;
                        Context context6 = this.b.a;
                        Drawable drawableN5 = s36.n(context6, i6);
                        if (drawableN5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN5, k7d.h(qp4.u0, context6).j);
                        return drawableN5;
                    case 6:
                        int i7 = woc.y;
                        Context context7 = this.b.a;
                        Drawable drawableN6 = s36.n(context7, i7);
                        if (drawableN6 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN6, k7d.h(qp4.u0, context7).j);
                        return drawableN6;
                    case 7:
                        int i8 = woc.o1;
                        Context context8 = this.b.a;
                        Drawable drawableN7 = s36.n(context8, i8);
                        if (drawableN7 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN7, k7d.h(qp4.u0, context8).j);
                        return drawableN7;
                    case 8:
                        int i9 = woc.P;
                        Context context9 = this.b.a;
                        Drawable drawableN8 = s36.n(context9, i9);
                        if (drawableN8 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN8, k7d.h(qp4.u0, context9).j);
                        return drawableN8;
                    case 9:
                        int i10 = woc.z1;
                        Context context10 = this.b.a;
                        Drawable drawableN9 = s36.n(context10, i10);
                        if (drawableN9 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN9, k7d.h(qp4.u0, context10).j);
                        return drawableN9;
                    default:
                        int i11 = woc.m2;
                        Context context11 = this.b.a;
                        Drawable drawableN10 = s36.n(context11, i11);
                        if (drawableN10 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN10, k7d.h(qp4.u0, context11).j);
                        return drawableN10;
                }
            }
        });
        final int i2 = 5;
        this.j = new khe(new k56(this) { // from class: ed2
            public final /* synthetic */ ld2 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        int i22 = woc.y1;
                        Context context2 = this.b.a;
                        Drawable drawableN = s36.n(context2, i22);
                        if (drawableN == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN, k7d.h(qp4.u0, context2).c);
                        return drawableN;
                    case 1:
                        int i3 = woc.k2;
                        Context context3 = this.b.a;
                        Drawable drawableN2 = s36.n(context3, i3);
                        if (drawableN2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN2, k7d.h(qp4.u0, context3).c);
                        return drawableN2;
                    case 2:
                        int i4 = woc.I1;
                        Context context4 = this.b.a;
                        Drawable drawableN3 = s36.n(context4, i4);
                        if (drawableN3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN3, k7d.h(qp4.u0, context4).b);
                        return drawableN3;
                    case 3:
                        int i5 = woc.Y1;
                        Context context5 = this.b.a;
                        Drawable drawableN4 = s36.n(context5, i5);
                        if (drawableN4 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN4, k7d.h(qp4.u0, context5).j);
                        return drawableN4;
                    case 4:
                        return new yl5(new e4f(qp4.u0.b(this.b.a).i(), new we1(14)), sl5.a, 4);
                    case 5:
                        int i6 = woc.p;
                        Context context6 = this.b.a;
                        Drawable drawableN5 = s36.n(context6, i6);
                        if (drawableN5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN5, k7d.h(qp4.u0, context6).j);
                        return drawableN5;
                    case 6:
                        int i7 = woc.y;
                        Context context7 = this.b.a;
                        Drawable drawableN6 = s36.n(context7, i7);
                        if (drawableN6 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN6, k7d.h(qp4.u0, context7).j);
                        return drawableN6;
                    case 7:
                        int i8 = woc.o1;
                        Context context8 = this.b.a;
                        Drawable drawableN7 = s36.n(context8, i8);
                        if (drawableN7 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN7, k7d.h(qp4.u0, context8).j);
                        return drawableN7;
                    case 8:
                        int i9 = woc.P;
                        Context context9 = this.b.a;
                        Drawable drawableN8 = s36.n(context9, i9);
                        if (drawableN8 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN8, k7d.h(qp4.u0, context9).j);
                        return drawableN8;
                    case 9:
                        int i10 = woc.z1;
                        Context context10 = this.b.a;
                        Drawable drawableN9 = s36.n(context10, i10);
                        if (drawableN9 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN9, k7d.h(qp4.u0, context10).j);
                        return drawableN9;
                    default:
                        int i11 = woc.m2;
                        Context context11 = this.b.a;
                        Drawable drawableN10 = s36.n(context11, i11);
                        if (drawableN10 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN10, k7d.h(qp4.u0, context11).j);
                        return drawableN10;
                }
            }
        });
        final int i3 = 6;
        this.k = new khe(new k56(this) { // from class: ed2
            public final /* synthetic */ ld2 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        int i22 = woc.y1;
                        Context context2 = this.b.a;
                        Drawable drawableN = s36.n(context2, i22);
                        if (drawableN == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN, k7d.h(qp4.u0, context2).c);
                        return drawableN;
                    case 1:
                        int i32 = woc.k2;
                        Context context3 = this.b.a;
                        Drawable drawableN2 = s36.n(context3, i32);
                        if (drawableN2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN2, k7d.h(qp4.u0, context3).c);
                        return drawableN2;
                    case 2:
                        int i4 = woc.I1;
                        Context context4 = this.b.a;
                        Drawable drawableN3 = s36.n(context4, i4);
                        if (drawableN3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN3, k7d.h(qp4.u0, context4).b);
                        return drawableN3;
                    case 3:
                        int i5 = woc.Y1;
                        Context context5 = this.b.a;
                        Drawable drawableN4 = s36.n(context5, i5);
                        if (drawableN4 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN4, k7d.h(qp4.u0, context5).j);
                        return drawableN4;
                    case 4:
                        return new yl5(new e4f(qp4.u0.b(this.b.a).i(), new we1(14)), sl5.a, 4);
                    case 5:
                        int i6 = woc.p;
                        Context context6 = this.b.a;
                        Drawable drawableN5 = s36.n(context6, i6);
                        if (drawableN5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN5, k7d.h(qp4.u0, context6).j);
                        return drawableN5;
                    case 6:
                        int i7 = woc.y;
                        Context context7 = this.b.a;
                        Drawable drawableN6 = s36.n(context7, i7);
                        if (drawableN6 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN6, k7d.h(qp4.u0, context7).j);
                        return drawableN6;
                    case 7:
                        int i8 = woc.o1;
                        Context context8 = this.b.a;
                        Drawable drawableN7 = s36.n(context8, i8);
                        if (drawableN7 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN7, k7d.h(qp4.u0, context8).j);
                        return drawableN7;
                    case 8:
                        int i9 = woc.P;
                        Context context9 = this.b.a;
                        Drawable drawableN8 = s36.n(context9, i9);
                        if (drawableN8 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN8, k7d.h(qp4.u0, context9).j);
                        return drawableN8;
                    case 9:
                        int i10 = woc.z1;
                        Context context10 = this.b.a;
                        Drawable drawableN9 = s36.n(context10, i10);
                        if (drawableN9 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN9, k7d.h(qp4.u0, context10).j);
                        return drawableN9;
                    default:
                        int i11 = woc.m2;
                        Context context11 = this.b.a;
                        Drawable drawableN10 = s36.n(context11, i11);
                        if (drawableN10 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN10, k7d.h(qp4.u0, context11).j);
                        return drawableN10;
                }
            }
        });
        final int i4 = 7;
        this.l = new khe(new k56(this) { // from class: ed2
            public final /* synthetic */ ld2 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        int i22 = woc.y1;
                        Context context2 = this.b.a;
                        Drawable drawableN = s36.n(context2, i22);
                        if (drawableN == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN, k7d.h(qp4.u0, context2).c);
                        return drawableN;
                    case 1:
                        int i32 = woc.k2;
                        Context context3 = this.b.a;
                        Drawable drawableN2 = s36.n(context3, i32);
                        if (drawableN2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN2, k7d.h(qp4.u0, context3).c);
                        return drawableN2;
                    case 2:
                        int i42 = woc.I1;
                        Context context4 = this.b.a;
                        Drawable drawableN3 = s36.n(context4, i42);
                        if (drawableN3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN3, k7d.h(qp4.u0, context4).b);
                        return drawableN3;
                    case 3:
                        int i5 = woc.Y1;
                        Context context5 = this.b.a;
                        Drawable drawableN4 = s36.n(context5, i5);
                        if (drawableN4 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN4, k7d.h(qp4.u0, context5).j);
                        return drawableN4;
                    case 4:
                        return new yl5(new e4f(qp4.u0.b(this.b.a).i(), new we1(14)), sl5.a, 4);
                    case 5:
                        int i6 = woc.p;
                        Context context6 = this.b.a;
                        Drawable drawableN5 = s36.n(context6, i6);
                        if (drawableN5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN5, k7d.h(qp4.u0, context6).j);
                        return drawableN5;
                    case 6:
                        int i7 = woc.y;
                        Context context7 = this.b.a;
                        Drawable drawableN6 = s36.n(context7, i7);
                        if (drawableN6 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN6, k7d.h(qp4.u0, context7).j);
                        return drawableN6;
                    case 7:
                        int i8 = woc.o1;
                        Context context8 = this.b.a;
                        Drawable drawableN7 = s36.n(context8, i8);
                        if (drawableN7 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN7, k7d.h(qp4.u0, context8).j);
                        return drawableN7;
                    case 8:
                        int i9 = woc.P;
                        Context context9 = this.b.a;
                        Drawable drawableN8 = s36.n(context9, i9);
                        if (drawableN8 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN8, k7d.h(qp4.u0, context9).j);
                        return drawableN8;
                    case 9:
                        int i10 = woc.z1;
                        Context context10 = this.b.a;
                        Drawable drawableN9 = s36.n(context10, i10);
                        if (drawableN9 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN9, k7d.h(qp4.u0, context10).j);
                        return drawableN9;
                    default:
                        int i11 = woc.m2;
                        Context context11 = this.b.a;
                        Drawable drawableN10 = s36.n(context11, i11);
                        if (drawableN10 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN10, k7d.h(qp4.u0, context11).j);
                        return drawableN10;
                }
            }
        });
        final int i5 = 8;
        this.m = new khe(new k56(this) { // from class: ed2
            public final /* synthetic */ ld2 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        int i22 = woc.y1;
                        Context context2 = this.b.a;
                        Drawable drawableN = s36.n(context2, i22);
                        if (drawableN == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN, k7d.h(qp4.u0, context2).c);
                        return drawableN;
                    case 1:
                        int i32 = woc.k2;
                        Context context3 = this.b.a;
                        Drawable drawableN2 = s36.n(context3, i32);
                        if (drawableN2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN2, k7d.h(qp4.u0, context3).c);
                        return drawableN2;
                    case 2:
                        int i42 = woc.I1;
                        Context context4 = this.b.a;
                        Drawable drawableN3 = s36.n(context4, i42);
                        if (drawableN3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN3, k7d.h(qp4.u0, context4).b);
                        return drawableN3;
                    case 3:
                        int i52 = woc.Y1;
                        Context context5 = this.b.a;
                        Drawable drawableN4 = s36.n(context5, i52);
                        if (drawableN4 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN4, k7d.h(qp4.u0, context5).j);
                        return drawableN4;
                    case 4:
                        return new yl5(new e4f(qp4.u0.b(this.b.a).i(), new we1(14)), sl5.a, 4);
                    case 5:
                        int i6 = woc.p;
                        Context context6 = this.b.a;
                        Drawable drawableN5 = s36.n(context6, i6);
                        if (drawableN5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN5, k7d.h(qp4.u0, context6).j);
                        return drawableN5;
                    case 6:
                        int i7 = woc.y;
                        Context context7 = this.b.a;
                        Drawable drawableN6 = s36.n(context7, i7);
                        if (drawableN6 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN6, k7d.h(qp4.u0, context7).j);
                        return drawableN6;
                    case 7:
                        int i8 = woc.o1;
                        Context context8 = this.b.a;
                        Drawable drawableN7 = s36.n(context8, i8);
                        if (drawableN7 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN7, k7d.h(qp4.u0, context8).j);
                        return drawableN7;
                    case 8:
                        int i9 = woc.P;
                        Context context9 = this.b.a;
                        Drawable drawableN8 = s36.n(context9, i9);
                        if (drawableN8 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN8, k7d.h(qp4.u0, context9).j);
                        return drawableN8;
                    case 9:
                        int i10 = woc.z1;
                        Context context10 = this.b.a;
                        Drawable drawableN9 = s36.n(context10, i10);
                        if (drawableN9 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN9, k7d.h(qp4.u0, context10).j);
                        return drawableN9;
                    default:
                        int i11 = woc.m2;
                        Context context11 = this.b.a;
                        Drawable drawableN10 = s36.n(context11, i11);
                        if (drawableN10 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN10, k7d.h(qp4.u0, context11).j);
                        return drawableN10;
                }
            }
        });
        final int i6 = 9;
        this.n = new khe(new k56(this) { // from class: ed2
            public final /* synthetic */ ld2 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        int i22 = woc.y1;
                        Context context2 = this.b.a;
                        Drawable drawableN = s36.n(context2, i22);
                        if (drawableN == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN, k7d.h(qp4.u0, context2).c);
                        return drawableN;
                    case 1:
                        int i32 = woc.k2;
                        Context context3 = this.b.a;
                        Drawable drawableN2 = s36.n(context3, i32);
                        if (drawableN2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN2, k7d.h(qp4.u0, context3).c);
                        return drawableN2;
                    case 2:
                        int i42 = woc.I1;
                        Context context4 = this.b.a;
                        Drawable drawableN3 = s36.n(context4, i42);
                        if (drawableN3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN3, k7d.h(qp4.u0, context4).b);
                        return drawableN3;
                    case 3:
                        int i52 = woc.Y1;
                        Context context5 = this.b.a;
                        Drawable drawableN4 = s36.n(context5, i52);
                        if (drawableN4 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN4, k7d.h(qp4.u0, context5).j);
                        return drawableN4;
                    case 4:
                        return new yl5(new e4f(qp4.u0.b(this.b.a).i(), new we1(14)), sl5.a, 4);
                    case 5:
                        int i62 = woc.p;
                        Context context6 = this.b.a;
                        Drawable drawableN5 = s36.n(context6, i62);
                        if (drawableN5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN5, k7d.h(qp4.u0, context6).j);
                        return drawableN5;
                    case 6:
                        int i7 = woc.y;
                        Context context7 = this.b.a;
                        Drawable drawableN6 = s36.n(context7, i7);
                        if (drawableN6 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN6, k7d.h(qp4.u0, context7).j);
                        return drawableN6;
                    case 7:
                        int i8 = woc.o1;
                        Context context8 = this.b.a;
                        Drawable drawableN7 = s36.n(context8, i8);
                        if (drawableN7 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN7, k7d.h(qp4.u0, context8).j);
                        return drawableN7;
                    case 8:
                        int i9 = woc.P;
                        Context context9 = this.b.a;
                        Drawable drawableN8 = s36.n(context9, i9);
                        if (drawableN8 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN8, k7d.h(qp4.u0, context9).j);
                        return drawableN8;
                    case 9:
                        int i10 = woc.z1;
                        Context context10 = this.b.a;
                        Drawable drawableN9 = s36.n(context10, i10);
                        if (drawableN9 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN9, k7d.h(qp4.u0, context10).j);
                        return drawableN9;
                    default:
                        int i11 = woc.m2;
                        Context context11 = this.b.a;
                        Drawable drawableN10 = s36.n(context11, i11);
                        if (drawableN10 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN10, k7d.h(qp4.u0, context11).j);
                        return drawableN10;
                }
            }
        });
        final int i7 = 10;
        this.o = new khe(new k56(this) { // from class: ed2
            public final /* synthetic */ ld2 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        int i22 = woc.y1;
                        Context context2 = this.b.a;
                        Drawable drawableN = s36.n(context2, i22);
                        if (drawableN == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN, k7d.h(qp4.u0, context2).c);
                        return drawableN;
                    case 1:
                        int i32 = woc.k2;
                        Context context3 = this.b.a;
                        Drawable drawableN2 = s36.n(context3, i32);
                        if (drawableN2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN2, k7d.h(qp4.u0, context3).c);
                        return drawableN2;
                    case 2:
                        int i42 = woc.I1;
                        Context context4 = this.b.a;
                        Drawable drawableN3 = s36.n(context4, i42);
                        if (drawableN3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN3, k7d.h(qp4.u0, context4).b);
                        return drawableN3;
                    case 3:
                        int i52 = woc.Y1;
                        Context context5 = this.b.a;
                        Drawable drawableN4 = s36.n(context5, i52);
                        if (drawableN4 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN4, k7d.h(qp4.u0, context5).j);
                        return drawableN4;
                    case 4:
                        return new yl5(new e4f(qp4.u0.b(this.b.a).i(), new we1(14)), sl5.a, 4);
                    case 5:
                        int i62 = woc.p;
                        Context context6 = this.b.a;
                        Drawable drawableN5 = s36.n(context6, i62);
                        if (drawableN5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN5, k7d.h(qp4.u0, context6).j);
                        return drawableN5;
                    case 6:
                        int i72 = woc.y;
                        Context context7 = this.b.a;
                        Drawable drawableN6 = s36.n(context7, i72);
                        if (drawableN6 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN6, k7d.h(qp4.u0, context7).j);
                        return drawableN6;
                    case 7:
                        int i8 = woc.o1;
                        Context context8 = this.b.a;
                        Drawable drawableN7 = s36.n(context8, i8);
                        if (drawableN7 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN7, k7d.h(qp4.u0, context8).j);
                        return drawableN7;
                    case 8:
                        int i9 = woc.P;
                        Context context9 = this.b.a;
                        Drawable drawableN8 = s36.n(context9, i9);
                        if (drawableN8 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN8, k7d.h(qp4.u0, context9).j);
                        return drawableN8;
                    case 9:
                        int i10 = woc.z1;
                        Context context10 = this.b.a;
                        Drawable drawableN9 = s36.n(context10, i10);
                        if (drawableN9 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN9, k7d.h(qp4.u0, context10).j);
                        return drawableN9;
                    default:
                        int i11 = woc.m2;
                        Context context11 = this.b.a;
                        Drawable drawableN10 = s36.n(context11, i11);
                        if (drawableN10 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN10, k7d.h(qp4.u0, context11).j);
                        return drawableN10;
                }
            }
        });
        final int i8 = 0;
        this.p = new khe(new k56(this) { // from class: ed2
            public final /* synthetic */ ld2 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        int i22 = woc.y1;
                        Context context2 = this.b.a;
                        Drawable drawableN = s36.n(context2, i22);
                        if (drawableN == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN, k7d.h(qp4.u0, context2).c);
                        return drawableN;
                    case 1:
                        int i32 = woc.k2;
                        Context context3 = this.b.a;
                        Drawable drawableN2 = s36.n(context3, i32);
                        if (drawableN2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN2, k7d.h(qp4.u0, context3).c);
                        return drawableN2;
                    case 2:
                        int i42 = woc.I1;
                        Context context4 = this.b.a;
                        Drawable drawableN3 = s36.n(context4, i42);
                        if (drawableN3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN3, k7d.h(qp4.u0, context4).b);
                        return drawableN3;
                    case 3:
                        int i52 = woc.Y1;
                        Context context5 = this.b.a;
                        Drawable drawableN4 = s36.n(context5, i52);
                        if (drawableN4 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN4, k7d.h(qp4.u0, context5).j);
                        return drawableN4;
                    case 4:
                        return new yl5(new e4f(qp4.u0.b(this.b.a).i(), new we1(14)), sl5.a, 4);
                    case 5:
                        int i62 = woc.p;
                        Context context6 = this.b.a;
                        Drawable drawableN5 = s36.n(context6, i62);
                        if (drawableN5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN5, k7d.h(qp4.u0, context6).j);
                        return drawableN5;
                    case 6:
                        int i72 = woc.y;
                        Context context7 = this.b.a;
                        Drawable drawableN6 = s36.n(context7, i72);
                        if (drawableN6 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN6, k7d.h(qp4.u0, context7).j);
                        return drawableN6;
                    case 7:
                        int i82 = woc.o1;
                        Context context8 = this.b.a;
                        Drawable drawableN7 = s36.n(context8, i82);
                        if (drawableN7 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN7, k7d.h(qp4.u0, context8).j);
                        return drawableN7;
                    case 8:
                        int i9 = woc.P;
                        Context context9 = this.b.a;
                        Drawable drawableN8 = s36.n(context9, i9);
                        if (drawableN8 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN8, k7d.h(qp4.u0, context9).j);
                        return drawableN8;
                    case 9:
                        int i10 = woc.z1;
                        Context context10 = this.b.a;
                        Drawable drawableN9 = s36.n(context10, i10);
                        if (drawableN9 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN9, k7d.h(qp4.u0, context10).j);
                        return drawableN9;
                    default:
                        int i11 = woc.m2;
                        Context context11 = this.b.a;
                        Drawable drawableN10 = s36.n(context11, i11);
                        if (drawableN10 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN10, k7d.h(qp4.u0, context11).j);
                        return drawableN10;
                }
            }
        });
        final int i9 = 1;
        this.q = new khe(new k56(this) { // from class: ed2
            public final /* synthetic */ ld2 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        int i22 = woc.y1;
                        Context context2 = this.b.a;
                        Drawable drawableN = s36.n(context2, i22);
                        if (drawableN == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN, k7d.h(qp4.u0, context2).c);
                        return drawableN;
                    case 1:
                        int i32 = woc.k2;
                        Context context3 = this.b.a;
                        Drawable drawableN2 = s36.n(context3, i32);
                        if (drawableN2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN2, k7d.h(qp4.u0, context3).c);
                        return drawableN2;
                    case 2:
                        int i42 = woc.I1;
                        Context context4 = this.b.a;
                        Drawable drawableN3 = s36.n(context4, i42);
                        if (drawableN3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN3, k7d.h(qp4.u0, context4).b);
                        return drawableN3;
                    case 3:
                        int i52 = woc.Y1;
                        Context context5 = this.b.a;
                        Drawable drawableN4 = s36.n(context5, i52);
                        if (drawableN4 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN4, k7d.h(qp4.u0, context5).j);
                        return drawableN4;
                    case 4:
                        return new yl5(new e4f(qp4.u0.b(this.b.a).i(), new we1(14)), sl5.a, 4);
                    case 5:
                        int i62 = woc.p;
                        Context context6 = this.b.a;
                        Drawable drawableN5 = s36.n(context6, i62);
                        if (drawableN5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN5, k7d.h(qp4.u0, context6).j);
                        return drawableN5;
                    case 6:
                        int i72 = woc.y;
                        Context context7 = this.b.a;
                        Drawable drawableN6 = s36.n(context7, i72);
                        if (drawableN6 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN6, k7d.h(qp4.u0, context7).j);
                        return drawableN6;
                    case 7:
                        int i82 = woc.o1;
                        Context context8 = this.b.a;
                        Drawable drawableN7 = s36.n(context8, i82);
                        if (drawableN7 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN7, k7d.h(qp4.u0, context8).j);
                        return drawableN7;
                    case 8:
                        int i92 = woc.P;
                        Context context9 = this.b.a;
                        Drawable drawableN8 = s36.n(context9, i92);
                        if (drawableN8 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN8, k7d.h(qp4.u0, context9).j);
                        return drawableN8;
                    case 9:
                        int i10 = woc.z1;
                        Context context10 = this.b.a;
                        Drawable drawableN9 = s36.n(context10, i10);
                        if (drawableN9 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN9, k7d.h(qp4.u0, context10).j);
                        return drawableN9;
                    default:
                        int i11 = woc.m2;
                        Context context11 = this.b.a;
                        Drawable drawableN10 = s36.n(context11, i11);
                        if (drawableN10 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN10, k7d.h(qp4.u0, context11).j);
                        return drawableN10;
                }
            }
        });
        final int i10 = 2;
        this.r = new khe(new k56(this) { // from class: ed2
            public final /* synthetic */ ld2 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        int i22 = woc.y1;
                        Context context2 = this.b.a;
                        Drawable drawableN = s36.n(context2, i22);
                        if (drawableN == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN, k7d.h(qp4.u0, context2).c);
                        return drawableN;
                    case 1:
                        int i32 = woc.k2;
                        Context context3 = this.b.a;
                        Drawable drawableN2 = s36.n(context3, i32);
                        if (drawableN2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN2, k7d.h(qp4.u0, context3).c);
                        return drawableN2;
                    case 2:
                        int i42 = woc.I1;
                        Context context4 = this.b.a;
                        Drawable drawableN3 = s36.n(context4, i42);
                        if (drawableN3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN3, k7d.h(qp4.u0, context4).b);
                        return drawableN3;
                    case 3:
                        int i52 = woc.Y1;
                        Context context5 = this.b.a;
                        Drawable drawableN4 = s36.n(context5, i52);
                        if (drawableN4 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN4, k7d.h(qp4.u0, context5).j);
                        return drawableN4;
                    case 4:
                        return new yl5(new e4f(qp4.u0.b(this.b.a).i(), new we1(14)), sl5.a, 4);
                    case 5:
                        int i62 = woc.p;
                        Context context6 = this.b.a;
                        Drawable drawableN5 = s36.n(context6, i62);
                        if (drawableN5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN5, k7d.h(qp4.u0, context6).j);
                        return drawableN5;
                    case 6:
                        int i72 = woc.y;
                        Context context7 = this.b.a;
                        Drawable drawableN6 = s36.n(context7, i72);
                        if (drawableN6 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN6, k7d.h(qp4.u0, context7).j);
                        return drawableN6;
                    case 7:
                        int i82 = woc.o1;
                        Context context8 = this.b.a;
                        Drawable drawableN7 = s36.n(context8, i82);
                        if (drawableN7 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN7, k7d.h(qp4.u0, context8).j);
                        return drawableN7;
                    case 8:
                        int i92 = woc.P;
                        Context context9 = this.b.a;
                        Drawable drawableN8 = s36.n(context9, i92);
                        if (drawableN8 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN8, k7d.h(qp4.u0, context9).j);
                        return drawableN8;
                    case 9:
                        int i102 = woc.z1;
                        Context context10 = this.b.a;
                        Drawable drawableN9 = s36.n(context10, i102);
                        if (drawableN9 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN9, k7d.h(qp4.u0, context10).j);
                        return drawableN9;
                    default:
                        int i11 = woc.m2;
                        Context context11 = this.b.a;
                        Drawable drawableN10 = s36.n(context11, i11);
                        if (drawableN10 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN10, k7d.h(qp4.u0, context11).j);
                        return drawableN10;
                }
            }
        });
        final int i11 = 4;
        this.s = new khe(new k56(this) { // from class: ed2
            public final /* synthetic */ ld2 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        int i22 = woc.y1;
                        Context context2 = this.b.a;
                        Drawable drawableN = s36.n(context2, i22);
                        if (drawableN == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN, k7d.h(qp4.u0, context2).c);
                        return drawableN;
                    case 1:
                        int i32 = woc.k2;
                        Context context3 = this.b.a;
                        Drawable drawableN2 = s36.n(context3, i32);
                        if (drawableN2 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN2, k7d.h(qp4.u0, context3).c);
                        return drawableN2;
                    case 2:
                        int i42 = woc.I1;
                        Context context4 = this.b.a;
                        Drawable drawableN3 = s36.n(context4, i42);
                        if (drawableN3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN3, k7d.h(qp4.u0, context4).b);
                        return drawableN3;
                    case 3:
                        int i52 = woc.Y1;
                        Context context5 = this.b.a;
                        Drawable drawableN4 = s36.n(context5, i52);
                        if (drawableN4 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN4, k7d.h(qp4.u0, context5).j);
                        return drawableN4;
                    case 4:
                        return new yl5(new e4f(qp4.u0.b(this.b.a).i(), new we1(14)), sl5.a, 4);
                    case 5:
                        int i62 = woc.p;
                        Context context6 = this.b.a;
                        Drawable drawableN5 = s36.n(context6, i62);
                        if (drawableN5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN5, k7d.h(qp4.u0, context6).j);
                        return drawableN5;
                    case 6:
                        int i72 = woc.y;
                        Context context7 = this.b.a;
                        Drawable drawableN6 = s36.n(context7, i72);
                        if (drawableN6 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN6, k7d.h(qp4.u0, context7).j);
                        return drawableN6;
                    case 7:
                        int i82 = woc.o1;
                        Context context8 = this.b.a;
                        Drawable drawableN7 = s36.n(context8, i82);
                        if (drawableN7 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN7, k7d.h(qp4.u0, context8).j);
                        return drawableN7;
                    case 8:
                        int i92 = woc.P;
                        Context context9 = this.b.a;
                        Drawable drawableN8 = s36.n(context9, i92);
                        if (drawableN8 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN8, k7d.h(qp4.u0, context9).j);
                        return drawableN8;
                    case 9:
                        int i102 = woc.z1;
                        Context context10 = this.b.a;
                        Drawable drawableN9 = s36.n(context10, i102);
                        if (drawableN9 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN9, k7d.h(qp4.u0, context10).j);
                        return drawableN9;
                    default:
                        int i112 = woc.m2;
                        Context context11 = this.b.a;
                        Drawable drawableN10 = s36.n(context11, i112);
                        if (drawableN10 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ngg.G(drawableN10, k7d.h(qp4.u0, context11).j);
                        return drawableN10;
                }
            }
        });
        this.v = new kd2(je7Var2, je7Var, this);
        context.registerComponentCallbacks(new fd2(0, this));
        od2.L(new zn5((w7c) qp4.u0.b(context).t0, new jd2(this, null), 5), j1e.a(((w9a) kkeVar).a()));
    }

    public static /* synthetic */ SpannableString f(ld2 ld2Var, e52 e52Var, es8 es8Var, int i) {
        return ld2Var.e(e52Var, es8Var, i, false);
    }

    public final boolean a(int i, e52 e52Var, es8 es8Var, SpannableStringBuilder spannableStringBuilder, boolean z) {
        if (i != 1 && !z && !es8Var.a.x()) {
            pq9 pq9Var = qp4.u0;
            Context context = this.a;
            int i2 = 6;
            uj3 uj3Var = es8Var.b;
            if (uj3Var == null || uj3Var.n() != ((Number) this.b.invoke()).longValue()) {
                if (e52Var.J()) {
                    g5a g5aVar = new g5a(context, j5a.a);
                    g5aVar.b(oag.a(uj3Var.m(), Long.valueOf(uj3Var.n())), uj3Var.p(kk0.a));
                    tpa.d(spannableStringBuilder, (char) 8203, new yl5(g5aVar, (sl5) null, i2));
                    spannableStringBuilder.append((char) 8288);
                    tpa.d(spannableStringBuilder, (char) 8203, new bvd(tu0.G(4 * fk4.d().getDisplayMetrics().density)));
                    spannableStringBuilder.append((char) 8288);
                    tpa.e(spannableStringBuilder, String.valueOf(uj3Var.d()), new mse(pq9Var.b(context).i(), new we1(11)));
                    spannableStringBuilder.append((char) 8288);
                    if (uj3Var.u()) {
                        spannableStringBuilder.append(" ");
                        spannableStringBuilder.setSpan(new fcf(context, 1, true, new we1(12)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((char) 8288);
                    }
                    tpa.e(spannableStringBuilder, ":", new mse(pq9Var.b(context).i(), new we1(13)));
                    spannableStringBuilder.append((char) 8288);
                    tpa.d(spannableStringBuilder, (char) 8203, new bvd(tu0.G(6 * fk4.d().getDisplayMetrics().density)));
                    return true;
                }
            } else if (e52Var.J()) {
                tpa.e(spannableStringBuilder, au1.g(context.getString(dpc.E), ":"), new mse(pq9Var.b(context).i(), new we1(15)));
                spannableStringBuilder.append((char) 8288);
                tpa.d(spannableStringBuilder, (char) 8203, new bvd(tu0.G(6 * fk4.d().getDisplayMetrics().density)));
                spannableStringBuilder.append((char) 8288);
                return true;
            }
        }
        return false;
    }

    public final void b(SpannableStringBuilder spannableStringBuilder, es8 es8Var, boolean z) {
        List list;
        Drawable drawable;
        l10 l10VarD;
        l10 l10VarD2;
        Object next;
        int i = 2;
        cu8 cu8Var = es8Var.a;
        c6d c6dVarQ = vz4.a;
        if (cu8Var == null) {
            hm9.p(this.u, "Empty MessageDb while process message", null);
        } else if (cu8Var.p()) {
            c6dVarQ = ys.Q(new Drawable[]{(Drawable) this.i.getValue()});
        } else if (cu8Var.w()) {
            c6dVarQ = ys.Q(new Drawable[]{(Drawable) this.j.getValue()});
        } else if (cu8Var.y()) {
            ph5 ph5Var = new ph5(this.a);
            String strF = s5c.F(cu8Var.g());
            Iterator it = sf5.c.iterator();
            while (true) {
                u1 u1Var = (u1) it;
                if (u1Var.hasNext()) {
                    next = u1Var.next();
                    if (eae.k0(((sf5) next).name(), strF, true)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            uf5 uf5VarW = (sf5) next;
            if (uf5VarW == null) {
                tf5 tf5Var = tf5.c;
                uf5VarW = ema.w(strF);
            }
            ph5Var.a(uf5VarW);
            c6dVarQ = ys.Q(new ph5[]{ph5Var});
        } else if (cu8Var.u()) {
            c6dVarQ = ys.Q(new Drawable[]{(Drawable) this.l.getValue()});
        } else if (cu8Var.z()) {
            c6dVarQ = ys.Q(new Drawable[]{(Drawable) this.m.getValue()});
        } else if (cu8Var.v()) {
            l10 l10VarD3 = cu8Var.d();
            if (l10VarD3 == null || !l10VarD3.d() || (l10VarD2 = cu8Var.d()) == null || !l10VarD2.b()) {
                l10 l10VarD4 = cu8Var.d();
                if (l10VarD4 == null || !l10VarD4.d()) {
                    l10 l10VarD5 = cu8Var.d();
                    if (l10VarD5 == null || l10VarD5.d() || (l10VarD = cu8Var.d()) == null || !l10VarD.b()) {
                        l10 l10VarD6 = cu8Var.d();
                        khe kheVar = this.n;
                        drawable = (l10VarD6 == null || !l10VarD6.d()) ? (Drawable) kheVar.getValue() : (Drawable) kheVar.getValue();
                    } else {
                        drawable = (Drawable) this.p.getValue();
                    }
                } else {
                    drawable = (Drawable) this.o.getValue();
                }
            } else {
                drawable = (Drawable) this.q.getValue();
            }
            c6dVarQ = ys.Q(new Drawable[]{drawable});
        } else {
            k8g k8gVar = cu8Var.z0;
            c6d c6dVarG0 = (k8gVar == null || (list = (List) k8gVar.a) == null) ? null : l6d.g0(l6d.e0(new at(2, list), new ga(this, i, es8Var)), 3);
            if (c6dVarG0 != null) {
                c6dVarQ = c6dVarG0;
            }
        }
        List listI0 = l6d.i0(c6dVarQ);
        if (!(!listI0.isEmpty())) {
            listI0 = null;
        }
        if (listI0 != null) {
            if (!z) {
                tpa.d(spannableStringBuilder, (char) 8203, new bvd(tu0.G(6 * fk4.d().getDisplayMetrics().density)));
                spannableStringBuilder.append((char) 8288);
            }
            int i2 = 0;
            for (Object obj : listI0) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    y53.R();
                    throw null;
                }
                tpa.d(spannableStringBuilder, (char) 8203, new yl5((Drawable) obj, sl5.a, 4));
                spannableStringBuilder.append((char) 8288);
                if (i2 < listI0.size() - 1) {
                    tpa.d(spannableStringBuilder, (char) 8203, new bvd(tu0.G(2 * fk4.d().getDisplayMetrics().density)));
                    spannableStringBuilder.append((char) 8288);
                }
                i2 = i3;
            }
            tpa.d(spannableStringBuilder, (char) 8203, new bvd(tu0.G(6 * fk4.d().getDisplayMetrics().density)));
            spannableStringBuilder.append((char) 8288);
        }
    }

    public final void c(int i, e52 e52Var, es8 es8Var, SpannableStringBuilder spannableStringBuilder, boolean z) throws Resources.NotFoundException {
        CharSequence charSequence;
        Object next;
        d5g d5gVar;
        Object next2;
        d5g d5gVar2;
        d5g d5gVar3;
        Object[] spans;
        cu8 cu8Var = es8Var.a;
        Object[] spans2 = null;
        CharSequence charSequence2 = null;
        strA = null;
        String strA = null;
        if (cu8Var == null) {
            hm9.p(this.u, "Empty MessageDb while process message", null);
            return;
        }
        if (cu8Var.D()) {
            CharSequence charSequenceF = ((are) this.e.getValue()).f(this.a, (ida) this.d.getValue(), es8Var.a, false, true, true, false, ((Number) this.b.invoke()).longValue(), false);
            if (charSequenceF != null) {
                spannableStringBuilder.append(charSequenceF);
                return;
            }
            return;
        }
        if (cu8Var.w()) {
            spannableStringBuilder.append(are.j(this.a, cu8Var.e(), (ak3) this.g.getValue(), false, false));
            return;
        }
        if (cu8Var.C()) {
            u6b u6bVar = es8Var.X;
            u6bVar.f = e52Var;
            ida idaVar = u6bVar.a;
            u6bVar.i(e52Var, idaVar.f(), idaVar.e());
            CharSequence charSequence3 = u6bVar.g;
            if (charSequence3 != null) {
                int i2 = gvd.a;
                gvd gvdVarL = crd.l(charSequence3, true);
                try {
                    spans = gvdVarL.getSpans(0, gvdVarL.length(), ClickableSpan.class);
                } catch (Throwable unused) {
                    spans = null;
                }
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spans;
                if (clickableSpanArr != null) {
                    for (ClickableSpan clickableSpan : clickableSpanArr) {
                        gvdVarL.removeSpan(clickableSpan);
                    }
                }
                try {
                    spans2 = gvdVarL.getSpans(0, gvdVarL.length(), URLSpan.class);
                } catch (Throwable unused2) {
                }
                URLSpan[] uRLSpanArr = (URLSpan[]) spans2;
                if (uRLSpanArr != null) {
                    int length = uRLSpanArr.length;
                    while (i < length) {
                        gvdVarL.removeSpan(uRLSpanArr[i]);
                        i++;
                    }
                }
                charSequence2 = gvdVarL;
            }
            if (charSequence2 != null) {
                spannableStringBuilder.append(charSequence2);
                return;
            }
            return;
        }
        if (cu8Var.x()) {
            q10 q10VarF = cu8Var.f();
            if ((q10VarF != null ? q10VarF.a : null) == p10.u0) {
                if (!z) {
                    tpa.d(spannableStringBuilder, (char) 8203, new bvd(tu0.G(6 * fk4.d().getDisplayMetrics().density)));
                    spannableStringBuilder.append((char) 8288);
                }
                spannableStringBuilder.append(this.a.getString(yoc.t0));
                spannableStringBuilder.append(": ");
                spannableStringBuilder.append(f(this, e52Var, es8Var.o, 1));
                return;
            }
        }
        if (!cu8Var.F()) {
            if (cu8Var.v()) {
                spannableStringBuilder.append(are.h(this.a, cu8Var, false, true, ((Number) this.b.invoke()).longValue()));
                return;
            }
            if (cu8Var.p() && es8Var.a() != null) {
                es8 es8VarA = es8Var.a();
                while (es8VarA.a() != null) {
                    es8VarA = es8VarA.a();
                }
                spannableStringBuilder.append(e(e52Var, es8VarA, i, true));
                return;
            }
            if (i == 2) {
                e52Var.j0();
                CharSequence charSequence4 = e52Var.v0;
                CharSequence charSequence5 = (((charSequence4 == null || charSequence4.length() == 0) ? 1 : 0) ^ 1) != 0 ? charSequence4 : null;
                if (charSequence5 != null) {
                    spannableStringBuilder.append(charSequence5);
                    return;
                }
                return;
            }
            if (i == 1) {
                int iE = (int) (ck4.e(i4f.m.g(du4.b)) * fk4.d().getDisplayMetrics().density);
                u6b u6bVar2 = es8Var.X;
                u6bVar2.f = e52Var;
                if (!u6bVar2.q) {
                    cu8 cu8Var2 = u6bVar2.d;
                    String strA2 = u6bVar2.a(e52Var, cu8Var2);
                    ida idaVar2 = u6bVar2.a;
                    u6bVar2.j = idaVar2.j(idaVar2.j.b(iE, strA2), cu8Var2.R0, iE);
                    u6bVar2.q = true;
                }
                CharSequence charSequence6 = u6bVar2.j;
                if (charSequence6 != null) {
                    spannableStringBuilder.append(charSequence6);
                    return;
                }
                return;
            }
            return;
        }
        j5g j5gVar = cu8Var.F() ? cu8Var.z0.k(g20.y0).n : null;
        if (j5gVar != null) {
            Iterator it = j5gVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                f5g f5gVar = (f5g) next2;
                if (f5gVar.c()) {
                    break;
                }
                if (f5gVar.a == e5g.o && (d5gVar3 = f5gVar.b) != null && d5gVar3.a.length() > 0) {
                    break;
                }
            }
            f5g f5gVar2 = (f5g) next2;
            if (f5gVar2 == null || (d5gVar2 = f5gVar2.b) == null) {
                d5gVar2 = d5g.c;
            }
            charSequence = d5gVar2.a;
        } else {
            charSequence = null;
        }
        if (j5gVar != null) {
            Iterator it2 = j5gVar.a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                f5g f5gVar3 = (f5g) next;
                if (f5gVar3.a == e5g.X && (d5gVar = f5gVar3.b) != null && d5gVar.a.length() > 0) {
                    break;
                }
            }
            f5g f5gVar4 = (f5g) next;
            if (f5gVar4 != null) {
                strA = f5gVar4.a();
            }
        }
        spannableStringBuilder.append(charSequence);
        if ((((strA == null || strA.length() == 0) ? 1 : 0) ^ 1) != 0) {
            spannableStringBuilder.append(". ");
            spannableStringBuilder.append((CharSequence) strA);
        }
    }

    public final CharSequence d(e52 e52Var) {
        Object objC = this.t.c(new gd2(e52Var));
        CharSequence charSequence = (CharSequence) objC;
        if (charSequence == null || w9e.C0(charSequence)) {
            objC = null;
        }
        CharSequence charSequence2 = (CharSequence) objC;
        if (charSequence2 == null) {
            return e52Var.b.f(((Number) this.b.invoke()).longValue()) ? this.a.getString(dpc.o) : charSequence2;
        }
        return charSequence2;
    }

    public final SpannableString e(e52 e52Var, es8 es8Var, int i, boolean z) {
        Object njcVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        try {
            boolean z2 = a(i, e52Var, es8Var, spannableStringBuilder, z) || spannableStringBuilder.length() == 0;
            b(spannableStringBuilder, es8Var, z2);
            c(i, e52Var, es8Var, spannableStringBuilder, z2);
            njcVar = e5f.a;
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Throwable thA = pjc.a(njcVar);
        if (thA != null) {
            hm9.p(this.u, "FAILURE process last message for chatRow", thA);
            ((ty3) this.h.getValue()).a("ONEME-16071", new IllegalStateException("FAILURE process last message for chatRow", thA));
        }
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), yz7.class)) {
            spannableStringBuilder.removeSpan((yz7) obj);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final CharSequence g(long j) {
        fi9 fi9Var;
        Map mapA = ((mz6) this.c.getValue()).a(j);
        if (mapA == null) {
            return null;
        }
        if (mapA.isEmpty()) {
            fi9Var = rv7.a;
        } else {
            fi9 fi9Var2 = new fi9(mapA.size());
            for (Map.Entry entry : mapA.entrySet()) {
                fi9Var2.f(((Number) entry.getKey()).longValue(), entry.getValue());
            }
            fi9Var = fi9Var2;
        }
        if (fi9Var == null) {
            return null;
        }
        return (CharSequence) this.v.c(new hd2(j, fi9Var));
    }
}
