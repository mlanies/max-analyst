package defpackage;

/* loaded from: classes.dex */
public final class ynb implements wj8 {
    public final q24 a;
    public final yt8 b;
    public final pl8 c;
    public final huc d;
    public final int e;

    public ynb(q24 q24Var, va4 va4Var) {
        yt8 yt8Var = new yt8(24, va4Var);
        pl8 pl8Var = new pl8();
        huc hucVar = new huc();
        this.a = q24Var;
        this.b = yt8Var;
        this.c = pl8Var;
        this.d = hucVar;
        this.e = 1048576;
    }

    @Override // defpackage.wj8
    public final wj8 a() {
        fm9.i(null, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    @Override // defpackage.wj8
    public final wj8 c() {
        fm9.i(null, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    @Override // defpackage.wj8
    public final ej0 e(tb8 tb8Var) {
        tb8Var.b.getClass();
        return new aob(tb8Var, this.a, this.b, this.c.x(tb8Var), this.d, this.e);
    }
}
