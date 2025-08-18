package defpackage;

import java.text.CollationKey;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class uj3 implements Comparable {
    public CollationKey X;
    public final boolean Y;
    public final ida Z;
    public final ql3 a;
    public CharSequence b;
    public CharSequence c;
    public String o;
    public mpa s0 = null;

    public uj3(ql3 ql3Var, boolean z, ida idaVar) {
        this.a = ql3Var;
        this.Y = z;
        this.Z = idaVar;
    }

    public static uj3 a(long j, long j2, ida idaVar) {
        hl3 hl3Var = new hl3();
        hl3Var.a = j;
        hl3Var.f = Collections.singletonList(jl3.e);
        hl3Var.s = j2;
        hl3Var.k = ol3.b;
        hl3Var.j = 2;
        return new uj3(new ql3(0L, hl3Var.a()), false, idaVar);
    }

    public static uj3 b(long j, long j2, ida idaVar) {
        hl3 hl3Var = new hl3();
        hl3Var.a = j;
        hl3Var.f = Collections.singletonList(jl3.e);
        hl3Var.s = j2;
        hl3Var.k = ol3.b;
        return new uj3(new ql3(0L, hl3Var.a()), false, idaVar);
    }

    public final boolean c() {
        ql3 ql3Var = this.a;
        return ql3Var.b != 0 && ql3Var.c.k == ol3.a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return d().toLowerCase().compareTo(((uj3) obj).d().toLowerCase());
    }

    public final String d() {
        String strA = null;
        if (this.Y) {
            jl3 jl3VarH = h();
            String strA2 = jl3VarH != null ? jl3VarH.a() : null;
            if (oag.u(strA2)) {
                return strA2;
            }
        }
        ql3 ql3Var = this.a;
        int i = ql3Var.c.j;
        ida idaVar = this.Z;
        if (i == 2) {
            return idaVar.a.getString(c2c.tt_unbind_ok_deleted_user);
        }
        if (i == 1) {
            return idaVar.a.getString(c2c.tt_blocked_user);
        }
        if (w()) {
            n();
            return idaVar.a.getString(dpc.t);
        }
        for (jl3 jl3Var : ql3Var.c.f) {
            if (!jl3Var.equals(jl3.e)) {
                strA = jl3Var.a();
                if (oag.u(strA)) {
                    return strA;
                }
            }
        }
        if (!oag.t(strA)) {
            return strA;
        }
        n();
        return idaVar.a.getString(dpc.t);
    }

    public final String e() {
        jl3 jl3VarH;
        if (this.Y && (jl3VarH = h()) != null) {
            String str = jl3VarH.a;
            if (oag.u(str)) {
                return str;
            }
        }
        pl3 pl3Var = this.a.c;
        int i = pl3Var.j;
        ida idaVar = this.Z;
        if (i == 2) {
            return idaVar.a.getString(c2c.tt_unbind_ok_deleted_user);
        }
        if (i == 1) {
            return idaVar.a.getString(c2c.tt_blocked_user);
        }
        List list = pl3Var.f;
        if (!list.isEmpty()) {
            return ((jl3) list.get(0)).a;
        }
        n();
        return idaVar.a.getString(dpc.t);
    }

    public final String f() {
        jl3 jl3VarH;
        if (this.Y && (jl3VarH = h()) != null) {
            String str = jl3VarH.b;
            if (oag.u(str)) {
                return str;
            }
        }
        pl3 pl3Var = this.a.c;
        int i = pl3Var.j;
        if (i == 2 || i == 1) {
            return null;
        }
        List list = pl3Var.f;
        if (list.isEmpty()) {
            return null;
        }
        return ((jl3) list.get(0)).b;
    }

    public final String g() {
        return this.a.c.p;
    }

    public final jl3 h() {
        Object next;
        il3 il3Var = il3.c;
        List list = this.a.c.f;
        if (list == null) {
            next = null;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                next = it.next();
                try {
                    if (((jl3) next).c == il3Var) {
                        break;
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            next = null;
        }
        jl3 jl3Var = (jl3) next;
        if (jl3Var == null || oag.t(jl3Var.a().trim())) {
            return null;
        }
        return jl3Var;
    }

    public final List i() {
        return this.a.c.f;
    }

    public final String j() {
        String strC = bre.c(this.a.c.p);
        return !oag.t(strC) ? strC : "";
    }

    public final int k() {
        return this.a.c.j;
    }

    public final CharSequence l(ida idaVar) {
        if (this.c == null) {
            this.c = idaVar.j.b(0, this.a.c.o);
        }
        return this.c;
    }

    public final CharSequence m() {
        if (this.o == null) {
            Pattern pattern = fca.a;
            this.o = fca.b(e(), f());
        }
        return this.o;
    }

    public final long n() {
        return this.a.c.a;
    }

    public final long o() {
        return this.a.c.h;
    }

    public final String p(kk0 kk0Var) {
        if (!(!w())) {
            return null;
        }
        String strT = ju0.t(this.a.c.c, kk0Var, jk0.a);
        if (oag.t(strT)) {
            return null;
        }
        return strT;
    }

    public final String q(String str, kk0 kk0Var) {
        if (!(!w())) {
            return null;
        }
        boolean z = this.Y;
        String str2 = z ? str : null;
        if (!oag.t(str2)) {
            return str2;
        }
        ql3 ql3Var = this.a;
        String strT = ju0.t(ql3Var.c.c, kk0Var, jk0.a);
        if (!oag.t(strT)) {
            return strT;
        }
        if (!w()) {
            if (z) {
                return str;
            }
            pl3 pl3Var = ql3Var.c;
            if (!oag.t(pl3Var.b)) {
                return pl3Var.b;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List r() {
        /*
            r7 = this;
            mpa r0 = r7.s0
            ql3 r1 = r7.a
            if (r0 == 0) goto L12
            pl3 r2 = r1.c
            java.lang.String r2 = r2.c
            java.lang.Object r0 = r0.a
            boolean r0 = defpackage.c37.k(r0, r2)
            if (r0 != 0) goto L62
        L12:
            kk0 r0 = defpackage.kk0.b
            kk0 r2 = defpackage.kk0.o
            kl7 r3 = defpackage.j1e.l()
            v25 r4 = defpackage.nk0.a
            r08 r5 = new r08
            r5.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L25:
            r5 = r4
            fkc r5 = (defpackage.fkc) r5
            java.util.ListIterator r5 = r5.b
            boolean r6 = r5.hasPrevious()
            if (r6 == 0) goto L4c
            java.lang.Object r5 = r5.previous()
            kk0 r5 = (defpackage.kk0) r5
            int r6 = r5.compareTo(r0)
            if (r6 < 0) goto L25
            int r6 = r5.compareTo(r2)
            if (r6 > 0) goto L25
            java.lang.String r5 = r7.p(r5)
            if (r5 == 0) goto L25
            r3.add(r5)
            goto L25
        L4c:
            kl7 r0 = defpackage.j1e.d(r3)
            pl3 r1 = r1.c
            java.lang.String r1 = r1.c
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L5b
            r0 = 0
        L5b:
            mpa r2 = new mpa
            r2.<init>(r1, r0)
            r7.s0 = r2
        L62:
            mpa r7 = r7.s0
            java.lang.Object r7 = r7.b
            java.util.List r7 = (java.util.List) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj3.r():java.util.List");
    }

    public final boolean s() {
        return this.a.c.i == nl3.a;
    }

    public final boolean t() {
        return this.a.c.n.contains(ll3.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Contact{id=");
        ql3 ql3Var = this.a;
        sb.append(ql3Var.b);
        sb.append(", data=");
        sb.append(ql3Var.c);
        sb.append('}');
        return sb.toString();
    }

    public final boolean u() {
        return this.a.c.n.contains(ll3.a);
    }

    public final boolean v() {
        return this.a.c.n.contains(ll3.c);
    }

    public final boolean w() {
        return k() == 0 && this.a.c.a();
    }
}
