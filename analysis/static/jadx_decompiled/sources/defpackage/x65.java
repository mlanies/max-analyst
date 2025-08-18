package defpackage;

import android.content.Context;
import android.os.Looper;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes.dex */
public final class x65 {
    public final Context a;
    public she b;
    public final jde c;
    public jde d;
    public jde e;
    public jde f;
    public final jde g;
    public final w56 h;
    public Looper i;
    public final int j;
    public final h30 k;
    public final int l;
    public final boolean m;
    public final x1d n;
    public final long o;
    public final long p;
    public final long q;
    public final cc4 r;
    public long s;
    public final long t;
    public boolean u;
    public boolean v;
    public final String w;

    public x65(Context context) {
        this(context, new v65(context, 0), new v65(context, 1));
    }

    public final u75 a() {
        fm9.k(!this.v);
        this.v = true;
        return new u75(this);
    }

    public x65(Context context, jde jdeVar, jde jdeVar2) {
        v65 v65Var = new v65(context, 5);
        xc3 xc3Var = new xc3(4);
        v65 v65Var2 = new v65(context, 7);
        ta4 ta4Var = new ta4(16);
        context.getClass();
        this.a = context;
        this.c = jdeVar;
        this.d = jdeVar2;
        this.e = v65Var;
        this.f = xc3Var;
        this.g = v65Var2;
        this.h = ta4Var;
        this.i = oaf.w();
        this.k = h30.g;
        this.l = 1;
        this.m = true;
        this.n = x1d.c;
        this.o = MultiFileUploader.UPLOAD_NEXT_INTERVAL;
        this.p = 15000L;
        this.q = CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
        this.r = new cc4(1, oaf.S(20L), 0.999f, oaf.S(500L));
        this.b = she.a;
        this.s = 500L;
        this.t = 2000L;
        this.u = true;
        this.w = "";
        this.j = -1000;
    }
}
