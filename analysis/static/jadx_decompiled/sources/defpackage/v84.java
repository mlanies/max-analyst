package defpackage;

/* loaded from: classes.dex */
public final class v84 extends o43 {
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.a) {
                    super.finalize();
                    return;
                }
                Object objB = this.b.b();
                ta5.m("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.b)), objB == null ? null : objB.getClass().getName());
                n43 n43Var = this.c;
                if (n43Var != null) {
                    n43Var.r(this.b, this.o);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // defpackage.o43
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final o43 clone() {
        od2.p(m0());
        return new v84(this.b, this.c, this.o != null ? new Throwable() : null);
    }
}
