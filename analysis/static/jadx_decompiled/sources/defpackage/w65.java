package defpackage;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public final class w65 {
    public final Context a;
    public final rhe b;
    public final jde c;
    public final jde d;
    public jde e;
    public jde f;
    public final jde g;
    public final w56 h;
    public final Looper i;
    public final g30 j;
    public final int k;
    public final boolean l;
    public final w1d m;
    public final cc4 n;
    public final long o;
    public boolean p;

    public w65(Context context, cle cleVar) {
        lc4 lc4Var = new lc4(5, cleVar);
        v65 v65Var = new v65(context, 2);
        v65 v65Var2 = new v65(context, 3);
        xc3 xc3Var = new xc3(3);
        v65 v65Var3 = new v65(context, 6);
        ta4 ta4Var = new ta4(15);
        this.a = context;
        this.c = lc4Var;
        this.d = v65Var;
        this.e = v65Var2;
        this.f = xc3Var;
        this.g = v65Var3;
        this.h = ta4Var;
        int i = maf.a;
        Looper looperMyLooper = Looper.myLooper();
        this.i = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.j = g30.Z;
        this.k = 1;
        this.l = true;
        this.m = w1d.c;
        this.n = new cc4(0, maf.D(20L), 0.999f, maf.D(500L));
        this.b = rhe.a;
        this.o = 2000L;
    }
}
