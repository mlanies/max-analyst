package defpackage;

/* loaded from: classes.dex */
public final class v5b extends u5b {
    public final Object c;

    public v5b(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.u5b, defpackage.t5b
    public final boolean e(Object obj) {
        boolean zE;
        synchronized (this.c) {
            zE = super.e(obj);
        }
        return zE;
    }

    @Override // defpackage.u5b, defpackage.t5b
    public final Object f() {
        Object objF;
        synchronized (this.c) {
            objF = super.f();
        }
        return objF;
    }
}
