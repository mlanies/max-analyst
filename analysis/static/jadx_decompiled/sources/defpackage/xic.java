package defpackage;

/* loaded from: classes.dex */
public final class xic {
    public mhc a;
    public sob b;
    public String d;
    public fi6 e;
    public i8c g;
    public yic h;
    public yic i;
    public yic j;
    public long k;
    public long l;
    public od m;
    public int c = -1;
    public bj6 f = new bj6();

    public static void b(yic yicVar, String str) {
        if (yicVar != null) {
            if (yicVar.Z != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (yicVar.s0 != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (yicVar.t0 != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (yicVar.u0 != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final yic a() {
        int i = this.c;
        if (!(i >= 0)) {
            throw new IllegalStateException(("code < 0: " + this.c).toString());
        }
        mhc mhcVar = this.a;
        if (mhcVar == null) {
            throw new IllegalStateException("request == null".toString());
        }
        sob sobVar = this.b;
        if (sobVar == null) {
            throw new IllegalStateException("protocol == null".toString());
        }
        String str = this.d;
        if (str != null) {
            return new yic(mhcVar, sobVar, str, i, this.e, this.f.c(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        throw new IllegalStateException("message == null".toString());
    }
}
