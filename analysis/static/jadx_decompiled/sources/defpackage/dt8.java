package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class dt8 {
    public final Context a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final khe f;
    public final khe g;
    public final khe h;
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
    public final khe t;
    public final khe u;

    public dt8(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, Context context) {
        this.a = context;
        this.b = je7Var;
        this.c = je7Var2;
        this.d = je7Var3;
        this.e = je7Var4;
        final int i = 0;
        this.f = new khe(new k56(this) { // from class: at8
            public final /* synthetic */ dt8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return au1.g(this.b.a.getString(oda.C0), ":");
                    case 1:
                        return this.b.a.getString(oda.E0);
                    case 2:
                        return this.b.a.getString(oda.z0);
                    case 3:
                        Drawable drawableB = kt3.b(this.b.a, woc.P);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 4:
                        Drawable drawableB2 = kt3.b(this.b.a, woc.o1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 5:
                        Drawable drawableB3 = kt3.b(this.b.a, woc.w0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 6:
                        Drawable drawableB4 = kt3.b(this.b.a, woc.p);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 7:
                        Drawable drawableB5 = kt3.b(this.b.a, woc.z1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 8:
                        Drawable drawableB6 = kt3.b(this.b.a, woc.g0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 9:
                        Drawable drawableB7 = kt3.b(this.b.a, woc.y1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 10:
                        Drawable drawableB8 = kt3.b(this.b.a, lda.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 11:
                        Drawable drawableB9 = kt3.b(this.b.a, lda.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return kt3.b(this.b.a, lda.e);
                    case 13:
                        return this.b.a.getString(oda.D0);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return this.b.a.getString(oda.A0);
                    default:
                        return this.b.a.getString(oda.B0);
                }
            }
        });
        final int i2 = 13;
        this.g = new khe(new k56(this) { // from class: at8
            public final /* synthetic */ dt8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return au1.g(this.b.a.getString(oda.C0), ":");
                    case 1:
                        return this.b.a.getString(oda.E0);
                    case 2:
                        return this.b.a.getString(oda.z0);
                    case 3:
                        Drawable drawableB = kt3.b(this.b.a, woc.P);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 4:
                        Drawable drawableB2 = kt3.b(this.b.a, woc.o1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 5:
                        Drawable drawableB3 = kt3.b(this.b.a, woc.w0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 6:
                        Drawable drawableB4 = kt3.b(this.b.a, woc.p);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 7:
                        Drawable drawableB5 = kt3.b(this.b.a, woc.z1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 8:
                        Drawable drawableB6 = kt3.b(this.b.a, woc.g0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 9:
                        Drawable drawableB7 = kt3.b(this.b.a, woc.y1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 10:
                        Drawable drawableB8 = kt3.b(this.b.a, lda.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 11:
                        Drawable drawableB9 = kt3.b(this.b.a, lda.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return kt3.b(this.b.a, lda.e);
                    case 13:
                        return this.b.a.getString(oda.D0);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return this.b.a.getString(oda.A0);
                    default:
                        return this.b.a.getString(oda.B0);
                }
            }
        });
        final int i3 = 14;
        this.h = new khe(new k56(this) { // from class: at8
            public final /* synthetic */ dt8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return au1.g(this.b.a.getString(oda.C0), ":");
                    case 1:
                        return this.b.a.getString(oda.E0);
                    case 2:
                        return this.b.a.getString(oda.z0);
                    case 3:
                        Drawable drawableB = kt3.b(this.b.a, woc.P);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 4:
                        Drawable drawableB2 = kt3.b(this.b.a, woc.o1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 5:
                        Drawable drawableB3 = kt3.b(this.b.a, woc.w0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 6:
                        Drawable drawableB4 = kt3.b(this.b.a, woc.p);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 7:
                        Drawable drawableB5 = kt3.b(this.b.a, woc.z1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 8:
                        Drawable drawableB6 = kt3.b(this.b.a, woc.g0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 9:
                        Drawable drawableB7 = kt3.b(this.b.a, woc.y1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 10:
                        Drawable drawableB8 = kt3.b(this.b.a, lda.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 11:
                        Drawable drawableB9 = kt3.b(this.b.a, lda.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return kt3.b(this.b.a, lda.e);
                    case 13:
                        return this.b.a.getString(oda.D0);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return this.b.a.getString(oda.A0);
                    default:
                        return this.b.a.getString(oda.B0);
                }
            }
        });
        final int i4 = 15;
        this.i = new khe(new k56(this) { // from class: at8
            public final /* synthetic */ dt8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return au1.g(this.b.a.getString(oda.C0), ":");
                    case 1:
                        return this.b.a.getString(oda.E0);
                    case 2:
                        return this.b.a.getString(oda.z0);
                    case 3:
                        Drawable drawableB = kt3.b(this.b.a, woc.P);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 4:
                        Drawable drawableB2 = kt3.b(this.b.a, woc.o1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 5:
                        Drawable drawableB3 = kt3.b(this.b.a, woc.w0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 6:
                        Drawable drawableB4 = kt3.b(this.b.a, woc.p);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 7:
                        Drawable drawableB5 = kt3.b(this.b.a, woc.z1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 8:
                        Drawable drawableB6 = kt3.b(this.b.a, woc.g0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 9:
                        Drawable drawableB7 = kt3.b(this.b.a, woc.y1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 10:
                        Drawable drawableB8 = kt3.b(this.b.a, lda.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 11:
                        Drawable drawableB9 = kt3.b(this.b.a, lda.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return kt3.b(this.b.a, lda.e);
                    case 13:
                        return this.b.a.getString(oda.D0);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return this.b.a.getString(oda.A0);
                    default:
                        return this.b.a.getString(oda.B0);
                }
            }
        });
        final int i5 = 1;
        this.j = new khe(new k56(this) { // from class: at8
            public final /* synthetic */ dt8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return au1.g(this.b.a.getString(oda.C0), ":");
                    case 1:
                        return this.b.a.getString(oda.E0);
                    case 2:
                        return this.b.a.getString(oda.z0);
                    case 3:
                        Drawable drawableB = kt3.b(this.b.a, woc.P);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 4:
                        Drawable drawableB2 = kt3.b(this.b.a, woc.o1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 5:
                        Drawable drawableB3 = kt3.b(this.b.a, woc.w0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 6:
                        Drawable drawableB4 = kt3.b(this.b.a, woc.p);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 7:
                        Drawable drawableB5 = kt3.b(this.b.a, woc.z1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 8:
                        Drawable drawableB6 = kt3.b(this.b.a, woc.g0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 9:
                        Drawable drawableB7 = kt3.b(this.b.a, woc.y1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 10:
                        Drawable drawableB8 = kt3.b(this.b.a, lda.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 11:
                        Drawable drawableB9 = kt3.b(this.b.a, lda.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return kt3.b(this.b.a, lda.e);
                    case 13:
                        return this.b.a.getString(oda.D0);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return this.b.a.getString(oda.A0);
                    default:
                        return this.b.a.getString(oda.B0);
                }
            }
        });
        final int i6 = 2;
        this.k = new khe(new k56(this) { // from class: at8
            public final /* synthetic */ dt8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return au1.g(this.b.a.getString(oda.C0), ":");
                    case 1:
                        return this.b.a.getString(oda.E0);
                    case 2:
                        return this.b.a.getString(oda.z0);
                    case 3:
                        Drawable drawableB = kt3.b(this.b.a, woc.P);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 4:
                        Drawable drawableB2 = kt3.b(this.b.a, woc.o1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 5:
                        Drawable drawableB3 = kt3.b(this.b.a, woc.w0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 6:
                        Drawable drawableB4 = kt3.b(this.b.a, woc.p);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 7:
                        Drawable drawableB5 = kt3.b(this.b.a, woc.z1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 8:
                        Drawable drawableB6 = kt3.b(this.b.a, woc.g0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 9:
                        Drawable drawableB7 = kt3.b(this.b.a, woc.y1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 10:
                        Drawable drawableB8 = kt3.b(this.b.a, lda.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 11:
                        Drawable drawableB9 = kt3.b(this.b.a, lda.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return kt3.b(this.b.a, lda.e);
                    case 13:
                        return this.b.a.getString(oda.D0);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return this.b.a.getString(oda.A0);
                    default:
                        return this.b.a.getString(oda.B0);
                }
            }
        });
        final int i7 = 3;
        this.l = new khe(new k56(this) { // from class: at8
            public final /* synthetic */ dt8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return au1.g(this.b.a.getString(oda.C0), ":");
                    case 1:
                        return this.b.a.getString(oda.E0);
                    case 2:
                        return this.b.a.getString(oda.z0);
                    case 3:
                        Drawable drawableB = kt3.b(this.b.a, woc.P);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 4:
                        Drawable drawableB2 = kt3.b(this.b.a, woc.o1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 5:
                        Drawable drawableB3 = kt3.b(this.b.a, woc.w0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 6:
                        Drawable drawableB4 = kt3.b(this.b.a, woc.p);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 7:
                        Drawable drawableB5 = kt3.b(this.b.a, woc.z1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 8:
                        Drawable drawableB6 = kt3.b(this.b.a, woc.g0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 9:
                        Drawable drawableB7 = kt3.b(this.b.a, woc.y1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 10:
                        Drawable drawableB8 = kt3.b(this.b.a, lda.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 11:
                        Drawable drawableB9 = kt3.b(this.b.a, lda.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return kt3.b(this.b.a, lda.e);
                    case 13:
                        return this.b.a.getString(oda.D0);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return this.b.a.getString(oda.A0);
                    default:
                        return this.b.a.getString(oda.B0);
                }
            }
        });
        final int i8 = 4;
        this.m = new khe(new k56(this) { // from class: at8
            public final /* synthetic */ dt8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        return au1.g(this.b.a.getString(oda.C0), ":");
                    case 1:
                        return this.b.a.getString(oda.E0);
                    case 2:
                        return this.b.a.getString(oda.z0);
                    case 3:
                        Drawable drawableB = kt3.b(this.b.a, woc.P);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 4:
                        Drawable drawableB2 = kt3.b(this.b.a, woc.o1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 5:
                        Drawable drawableB3 = kt3.b(this.b.a, woc.w0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 6:
                        Drawable drawableB4 = kt3.b(this.b.a, woc.p);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 7:
                        Drawable drawableB5 = kt3.b(this.b.a, woc.z1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 8:
                        Drawable drawableB6 = kt3.b(this.b.a, woc.g0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 9:
                        Drawable drawableB7 = kt3.b(this.b.a, woc.y1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 10:
                        Drawable drawableB8 = kt3.b(this.b.a, lda.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 11:
                        Drawable drawableB9 = kt3.b(this.b.a, lda.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return kt3.b(this.b.a, lda.e);
                    case 13:
                        return this.b.a.getString(oda.D0);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return this.b.a.getString(oda.A0);
                    default:
                        return this.b.a.getString(oda.B0);
                }
            }
        });
        final int i9 = 5;
        this.n = new khe(new k56(this) { // from class: at8
            public final /* synthetic */ dt8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return au1.g(this.b.a.getString(oda.C0), ":");
                    case 1:
                        return this.b.a.getString(oda.E0);
                    case 2:
                        return this.b.a.getString(oda.z0);
                    case 3:
                        Drawable drawableB = kt3.b(this.b.a, woc.P);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 4:
                        Drawable drawableB2 = kt3.b(this.b.a, woc.o1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 5:
                        Drawable drawableB3 = kt3.b(this.b.a, woc.w0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 6:
                        Drawable drawableB4 = kt3.b(this.b.a, woc.p);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 7:
                        Drawable drawableB5 = kt3.b(this.b.a, woc.z1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 8:
                        Drawable drawableB6 = kt3.b(this.b.a, woc.g0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 9:
                        Drawable drawableB7 = kt3.b(this.b.a, woc.y1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 10:
                        Drawable drawableB8 = kt3.b(this.b.a, lda.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 11:
                        Drawable drawableB9 = kt3.b(this.b.a, lda.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return kt3.b(this.b.a, lda.e);
                    case 13:
                        return this.b.a.getString(oda.D0);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return this.b.a.getString(oda.A0);
                    default:
                        return this.b.a.getString(oda.B0);
                }
            }
        });
        final int i10 = 6;
        this.o = new khe(new k56(this) { // from class: at8
            public final /* synthetic */ dt8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return au1.g(this.b.a.getString(oda.C0), ":");
                    case 1:
                        return this.b.a.getString(oda.E0);
                    case 2:
                        return this.b.a.getString(oda.z0);
                    case 3:
                        Drawable drawableB = kt3.b(this.b.a, woc.P);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 4:
                        Drawable drawableB2 = kt3.b(this.b.a, woc.o1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 5:
                        Drawable drawableB3 = kt3.b(this.b.a, woc.w0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 6:
                        Drawable drawableB4 = kt3.b(this.b.a, woc.p);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 7:
                        Drawable drawableB5 = kt3.b(this.b.a, woc.z1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 8:
                        Drawable drawableB6 = kt3.b(this.b.a, woc.g0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 9:
                        Drawable drawableB7 = kt3.b(this.b.a, woc.y1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 10:
                        Drawable drawableB8 = kt3.b(this.b.a, lda.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 11:
                        Drawable drawableB9 = kt3.b(this.b.a, lda.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return kt3.b(this.b.a, lda.e);
                    case 13:
                        return this.b.a.getString(oda.D0);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return this.b.a.getString(oda.A0);
                    default:
                        return this.b.a.getString(oda.B0);
                }
            }
        });
        final int i11 = 7;
        this.p = new khe(new k56(this) { // from class: at8
            public final /* synthetic */ dt8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return au1.g(this.b.a.getString(oda.C0), ":");
                    case 1:
                        return this.b.a.getString(oda.E0);
                    case 2:
                        return this.b.a.getString(oda.z0);
                    case 3:
                        Drawable drawableB = kt3.b(this.b.a, woc.P);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 4:
                        Drawable drawableB2 = kt3.b(this.b.a, woc.o1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 5:
                        Drawable drawableB3 = kt3.b(this.b.a, woc.w0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 6:
                        Drawable drawableB4 = kt3.b(this.b.a, woc.p);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 7:
                        Drawable drawableB5 = kt3.b(this.b.a, woc.z1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 8:
                        Drawable drawableB6 = kt3.b(this.b.a, woc.g0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 9:
                        Drawable drawableB7 = kt3.b(this.b.a, woc.y1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 10:
                        Drawable drawableB8 = kt3.b(this.b.a, lda.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 11:
                        Drawable drawableB9 = kt3.b(this.b.a, lda.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return kt3.b(this.b.a, lda.e);
                    case 13:
                        return this.b.a.getString(oda.D0);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return this.b.a.getString(oda.A0);
                    default:
                        return this.b.a.getString(oda.B0);
                }
            }
        });
        final int i12 = 8;
        this.q = new khe(new k56(this) { // from class: at8
            public final /* synthetic */ dt8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return au1.g(this.b.a.getString(oda.C0), ":");
                    case 1:
                        return this.b.a.getString(oda.E0);
                    case 2:
                        return this.b.a.getString(oda.z0);
                    case 3:
                        Drawable drawableB = kt3.b(this.b.a, woc.P);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 4:
                        Drawable drawableB2 = kt3.b(this.b.a, woc.o1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 5:
                        Drawable drawableB3 = kt3.b(this.b.a, woc.w0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 6:
                        Drawable drawableB4 = kt3.b(this.b.a, woc.p);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 7:
                        Drawable drawableB5 = kt3.b(this.b.a, woc.z1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 8:
                        Drawable drawableB6 = kt3.b(this.b.a, woc.g0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 9:
                        Drawable drawableB7 = kt3.b(this.b.a, woc.y1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 10:
                        Drawable drawableB8 = kt3.b(this.b.a, lda.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 11:
                        Drawable drawableB9 = kt3.b(this.b.a, lda.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return kt3.b(this.b.a, lda.e);
                    case 13:
                        return this.b.a.getString(oda.D0);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return this.b.a.getString(oda.A0);
                    default:
                        return this.b.a.getString(oda.B0);
                }
            }
        });
        final int i13 = 9;
        this.r = new khe(new k56(this) { // from class: at8
            public final /* synthetic */ dt8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return au1.g(this.b.a.getString(oda.C0), ":");
                    case 1:
                        return this.b.a.getString(oda.E0);
                    case 2:
                        return this.b.a.getString(oda.z0);
                    case 3:
                        Drawable drawableB = kt3.b(this.b.a, woc.P);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 4:
                        Drawable drawableB2 = kt3.b(this.b.a, woc.o1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 5:
                        Drawable drawableB3 = kt3.b(this.b.a, woc.w0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 6:
                        Drawable drawableB4 = kt3.b(this.b.a, woc.p);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 7:
                        Drawable drawableB5 = kt3.b(this.b.a, woc.z1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 8:
                        Drawable drawableB6 = kt3.b(this.b.a, woc.g0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 9:
                        Drawable drawableB7 = kt3.b(this.b.a, woc.y1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 10:
                        Drawable drawableB8 = kt3.b(this.b.a, lda.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 11:
                        Drawable drawableB9 = kt3.b(this.b.a, lda.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return kt3.b(this.b.a, lda.e);
                    case 13:
                        return this.b.a.getString(oda.D0);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return this.b.a.getString(oda.A0);
                    default:
                        return this.b.a.getString(oda.B0);
                }
            }
        });
        final int i14 = 10;
        this.s = new khe(new k56(this) { // from class: at8
            public final /* synthetic */ dt8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return au1.g(this.b.a.getString(oda.C0), ":");
                    case 1:
                        return this.b.a.getString(oda.E0);
                    case 2:
                        return this.b.a.getString(oda.z0);
                    case 3:
                        Drawable drawableB = kt3.b(this.b.a, woc.P);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 4:
                        Drawable drawableB2 = kt3.b(this.b.a, woc.o1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 5:
                        Drawable drawableB3 = kt3.b(this.b.a, woc.w0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 6:
                        Drawable drawableB4 = kt3.b(this.b.a, woc.p);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 7:
                        Drawable drawableB5 = kt3.b(this.b.a, woc.z1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 8:
                        Drawable drawableB6 = kt3.b(this.b.a, woc.g0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 9:
                        Drawable drawableB7 = kt3.b(this.b.a, woc.y1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 10:
                        Drawable drawableB8 = kt3.b(this.b.a, lda.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 11:
                        Drawable drawableB9 = kt3.b(this.b.a, lda.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return kt3.b(this.b.a, lda.e);
                    case 13:
                        return this.b.a.getString(oda.D0);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return this.b.a.getString(oda.A0);
                    default:
                        return this.b.a.getString(oda.B0);
                }
            }
        });
        final int i15 = 11;
        this.t = new khe(new k56(this) { // from class: at8
            public final /* synthetic */ dt8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return au1.g(this.b.a.getString(oda.C0), ":");
                    case 1:
                        return this.b.a.getString(oda.E0);
                    case 2:
                        return this.b.a.getString(oda.z0);
                    case 3:
                        Drawable drawableB = kt3.b(this.b.a, woc.P);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 4:
                        Drawable drawableB2 = kt3.b(this.b.a, woc.o1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 5:
                        Drawable drawableB3 = kt3.b(this.b.a, woc.w0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 6:
                        Drawable drawableB4 = kt3.b(this.b.a, woc.p);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 7:
                        Drawable drawableB5 = kt3.b(this.b.a, woc.z1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 8:
                        Drawable drawableB6 = kt3.b(this.b.a, woc.g0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 9:
                        Drawable drawableB7 = kt3.b(this.b.a, woc.y1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 10:
                        Drawable drawableB8 = kt3.b(this.b.a, lda.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 11:
                        Drawable drawableB9 = kt3.b(this.b.a, lda.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return kt3.b(this.b.a, lda.e);
                    case 13:
                        return this.b.a.getString(oda.D0);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return this.b.a.getString(oda.A0);
                    default:
                        return this.b.a.getString(oda.B0);
                }
            }
        });
        final int i16 = 12;
        this.u = new khe(new k56(this) { // from class: at8
            public final /* synthetic */ dt8 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return au1.g(this.b.a.getString(oda.C0), ":");
                    case 1:
                        return this.b.a.getString(oda.E0);
                    case 2:
                        return this.b.a.getString(oda.z0);
                    case 3:
                        Drawable drawableB = kt3.b(this.b.a, woc.P);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 4:
                        Drawable drawableB2 = kt3.b(this.b.a, woc.o1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 5:
                        Drawable drawableB3 = kt3.b(this.b.a, woc.w0);
                        if (drawableB3 != null) {
                            return drawableB3;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 6:
                        Drawable drawableB4 = kt3.b(this.b.a, woc.p);
                        if (drawableB4 != null) {
                            return drawableB4;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 7:
                        Drawable drawableB5 = kt3.b(this.b.a, woc.z1);
                        if (drawableB5 != null) {
                            return drawableB5;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 8:
                        Drawable drawableB6 = kt3.b(this.b.a, woc.g0);
                        if (drawableB6 != null) {
                            return drawableB6;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 9:
                        Drawable drawableB7 = kt3.b(this.b.a, woc.y1);
                        if (drawableB7 != null) {
                            return drawableB7;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 10:
                        Drawable drawableB8 = kt3.b(this.b.a, lda.h);
                        if (drawableB8 != null) {
                            return drawableB8;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case 11:
                        Drawable drawableB9 = kt3.b(this.b.a, lda.f);
                        if (drawableB9 != null) {
                            return drawableB9;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    case Protos.Attaches.Attach.PRESENT /* 12 */:
                        return kt3.b(this.b.a, lda.e);
                    case 13:
                        return this.b.a.getString(oda.D0);
                    case Protos.Attaches.Attach.LOCATION /* 14 */:
                        return this.b.a.getString(oda.A0);
                    default:
                        return this.b.a.getString(oda.B0);
                }
            }
        });
    }

    public static int e(boolean z, boolean z2) {
        if (!z2 || z) {
            return z ? tu0.G(20 * fk4.d().getDisplayMetrics().density) : tu0.G(8 * fk4.d().getDisplayMetrics().density);
        }
        return 0;
    }

    public final Layout a(tz tzVar, boolean z) {
        return f().a(au1.g((String) this.k.getValue(), ":"), g().a(os2.g), b(tzVar, e(z, true)), 1, false, TextUtils.TruncateAt.END);
    }

    public final int b(tz tzVar, int i) {
        int iG;
        int iQ;
        int iG2;
        o00 o00Var = tzVar.d;
        if (o00Var instanceof v2e) {
            iQ = tu0.G(((v2e) o00Var).a.s0 * fk4.d().getDisplayMetrics().density);
            iG2 = tu0.G(10 * fk4.d().getDisplayMetrics().density);
        } else {
            boolean z = o00Var instanceof k50;
            je7 je7Var = this.c;
            if (!z) {
                iG = o00Var instanceof wgf ? tu0.G(228 * fk4.d().getDisplayMetrics().density) : ((w6a) ((os0) je7Var.getValue())).a();
                return iG - i;
            }
            int iIntValue = ((Number) ((w6a) ((os0) je7Var.getValue())).d.getValue()).intValue();
            float f = 192;
            iQ = (int) ((rh4.q(f, fk4.d().getDisplayMetrics().density, iIntValue) * ((ote.f(((k50) o00Var).j, 1000L, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) - 1000) / 29000)) + tu0.G(fk4.d().getDisplayMetrics().density * f));
            iG2 = tu0.G(10 * fk4.d().getDisplayMetrics().density);
        }
        iG = iQ - (iG2 * 2);
        return iG - i;
    }

    public final Layout c(CharSequence charSequence, tz tzVar, boolean z, boolean z2, boolean z3, boolean z4) {
        int iE = e(z4, false);
        if (z) {
            iE = rh4.c(36, fk4.d().getDisplayMetrics().density, iE);
        }
        int iB = b(tzVar, iE);
        if (!z2) {
            return f().a(charSequence, g().a(os2.j), iB, 1, false, TextUtils.TruncateAt.END);
        }
        return i24.g(this.a, f(), charSequence, iB, g().a(os2.j), new bt8(z3, 1));
    }

    public final Layout d(String str, tz tzVar, boolean z, Drawable drawable) {
        CharSequence spannedString = str;
        if (drawable != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            tpa.e(spannableStringBuilder, "\u200b", new ct8(drawable));
            tpa.e(spannableStringBuilder, "\u200b", new bvd(tu0.G(2 * fk4.d().getDisplayMetrics().density)));
            spannableStringBuilder.append((CharSequence) str);
            spannedString = new SpannedString(spannableStringBuilder);
        }
        return f().a(spannedString, g().a(os2.f), b(tzVar, e(z, false)), 1, false, TextUtils.TruncateAt.END);
    }

    public final fe7 f() {
        return (fe7) this.b.getValue();
    }

    public final tpe g() {
        return (tpe) this.e.getValue();
    }
}
