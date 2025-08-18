package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class t25 extends d5b {
    public final w6d l;
    public final khe m;

    public t25(int i) {
        super("one.me.webapp.domain.jsbridge.SuccessResponse.Status", null, i);
        this.l = w6d.f;
        this.m = new khe(new s25(i, this));
    }

    @Override // defpackage.d5b, defpackage.r6d
    public final pag e() {
        return this.l;
    }

    @Override // defpackage.d5b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof r6d)) {
            return false;
        }
        r6d r6dVar = (r6d) obj;
        if (r6dVar.e() != w6d.f) {
            return false;
        }
        return tpa.f(this.a, r6dVar.a()) && tpa.f(j1e.e(this), j1e.e(r6dVar));
    }

    @Override // defpackage.d5b
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        Iterator it = new zs(4, this).iterator();
        int iHashCode2 = 1;
        while (it.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) it.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // defpackage.d5b, defpackage.r6d
    public final r6d i(int i) {
        return ((r6d[]) this.m.getValue())[i];
    }

    @Override // defpackage.d5b
    public final String toString() {
        return x53.n0(new zs(4, this), ", ", rh4.m(new StringBuilder(), this.a, '('), ")", null, 56);
    }
}
