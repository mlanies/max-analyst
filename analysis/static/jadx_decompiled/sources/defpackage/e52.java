package defpackage;

import android.net.Uri;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class e52 implements Comparable {
    public final d8a A0;
    public final kr2 B0;
    public final es8 X;
    public final long Y;
    public final long a;
    public final k92 b;
    public final es8 c;
    public final es8 o;
    public volatile String s0;
    public volatile CharSequence t0;
    public volatile CharSequence u0;
    public volatile CharSequence v0;
    public volatile CharSequence x0;
    public volatile v5c y0;
    public volatile String z0;
    public final ArrayList Z = new ArrayList();
    public final AtomicReference w0 = new AtomicReference(null);
    public mpa C0 = null;

    public e52(d8a d8aVar, kr2 kr2Var, long j, long j2, k92 k92Var, es8 es8Var, es8 es8Var2, es8 es8Var3) {
        this.A0 = d8aVar;
        this.B0 = kr2Var;
        this.a = j;
        this.Y = j2;
        this.b = k92Var;
        this.c = es8Var;
        this.o = es8Var2;
        this.X = es8Var3;
    }

    public final boolean A() {
        return v() && this.o.a.q(this.Y);
    }

    public final boolean B() {
        bw8 bw8Var;
        es8 es8Var;
        uj3 uj3Var;
        if (!A()) {
            if (v()) {
                es8 es8Var2 = this.o;
                long j = es8Var2.a.Y;
                long j2 = this.Y;
                if (j == j2 || (bw8Var = es8Var2.c) == null || (es8Var = bw8Var.c) == null || (uj3Var = es8Var.b) == null || uj3Var.n() != j2) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean C() {
        k92 k92Var = this.b;
        return k92Var != null && k92Var.c == i92.a;
    }

    public final boolean D() {
        return C() && e0();
    }

    public final boolean E(long j) {
        return this.b.R.containsKey(Long.valueOf(j));
    }

    public final boolean F() {
        f92 f92Var;
        k92 k92Var = this.b;
        return (k92Var == null || (f92Var = k92Var.K) == null || !f92Var.c) ? false : true;
    }

    public final boolean G() {
        boolean z;
        synchronized (this.Z) {
            try {
                z = false;
                if (M() && !this.Z.isEmpty() && ((uj3) this.Z.get(0)).s()) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final boolean H() {
        uj3 uj3VarL = l();
        return M() && uj3VarL != null && uj3VarL.t();
    }

    public final boolean I() {
        return this.b.b == j92.c;
    }

    public final boolean J() {
        return this.b.b == j92.b;
    }

    public final boolean K() {
        return r() != null && r().f == 2;
    }

    public final boolean L() {
        return this.b.c == i92.Y;
    }

    public final boolean M() {
        return this.b.b == j92.a;
    }

    public final boolean N() {
        return this.b.a().e != 0;
    }

    public final boolean O(q33 q33Var, hp hpVar) {
        if (V(q33Var)) {
            return true;
        }
        kxc kxcVar = (kxc) hpVar;
        return (M() ? kxcVar.p() : kxcVar.o()) == 1;
    }

    public final boolean P() {
        z82 z82Var;
        boolean zD = D();
        k92 k92Var = this.b;
        return ((zD && !I()) ? (!d0() && ((z82Var = k92Var.H) == null || z82Var.f)) ? oag.s(e(this.Y), 64) : true : false) && k92Var.c() > 0;
    }

    public final boolean Q() {
        return this.b.b == j92.o;
    }

    public final boolean R() {
        k92 k92Var = this.b;
        return k92Var != null && k92Var.c == i92.Z;
    }

    public final boolean S() {
        return J() && a0() && C() && !e0();
    }

    public final boolean T() {
        return !M() && this.b.c == i92.b;
    }

    public final boolean U(qe5 qe5Var) {
        if (this.b.J.b(64)) {
            return false;
        }
        if (!M()) {
            return I() ? ((se5) qe5Var).t() ? y() : x() : C() && e0();
        }
        if (H()) {
            return !g0();
        }
        if (l() == null) {
            return false;
        }
        return !r3.s();
    }

    public final boolean V(q33 q33Var) {
        k92 k92Var = this.b;
        return k92Var.a().a == -1 || k92Var.a().a > ((hyc) q33Var).n();
    }

    public final boolean W() {
        if (H()) {
            k92 k92Var = this.b;
            if (k92Var.e0.b || this.c == null || k92Var.a == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean X() {
        return this.b.H.c;
    }

    public final boolean Y(long j) {
        return j == this.b.d && C();
    }

    public final boolean Z() {
        return this.b.r0 == 2;
    }

    public final boolean a() {
        z82 z82Var;
        if (K() || M() || !D()) {
            return false;
        }
        k92 k92Var = this.b;
        if (k92Var.J.b(2)) {
            return false;
        }
        if (d0()) {
            return true;
        }
        boolean zU = u();
        if (I() || (z82Var = k92Var.H) == null || z82Var.b) {
            return zU;
        }
        return true;
    }

    public final boolean a0() {
        return this.b.r0 == 1;
    }

    public final boolean b() {
        return I() && a0() && !c0();
    }

    public final boolean b0() {
        return C() && E(this.Y);
    }

    public final boolean c() {
        if (d0()) {
            if (I()) {
                return true;
            }
            k92 k92Var = this.b;
            if ((!oag.t(k92Var.I)) || k92Var.c() > 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean c0() {
        return b0() || this.b.e.containsKey(Long.valueOf(this.Y));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return np8.j(((e52) obj).o(), o());
    }

    public final Long d(long j) {
        if (C() && E(j)) {
            return Long.valueOf(((t82) this.b.R.get(Long.valueOf(j))).c);
        }
        return null;
    }

    public final boolean d0() {
        return this.Y == this.b.d && C();
    }

    public final int e(long j) {
        if (!C()) {
            return 0;
        }
        k92 k92Var = this.b;
        if (j == k92Var.d) {
            return 2047;
        }
        if (k92Var.R.containsKey(Long.valueOf(j))) {
            return ((t82) k92Var.R.get(Long.valueOf(j))).b;
        }
        return 0;
    }

    public final boolean e0() {
        return this.b.e.containsKey(Long.valueOf(this.Y)) || F();
    }

    public final long f() {
        k92 k92Var = this.b;
        if (k92Var.f(this.Y)) {
            return 0L;
        }
        uj3 uj3VarL = l();
        return uj3VarL != null ? uj3VarL.n() : k92Var.a;
    }

    public final boolean f0() {
        boolean z = this.b.H.h;
        if (z) {
            return true;
        }
        uj3 uj3VarL = l();
        return uj3VarL != null ? uj3VarL.v() : z;
    }

    public final String g(kk0 kk0Var, jk0 jk0Var) {
        k92 k92Var = this.b;
        d8a d8aVar = this.A0;
        if (d8aVar != null) {
            String str = k92Var.f(((wxc) d8aVar.a.getValue()).a()) ? (String) d8aVar.b.getValue() : null;
            if (str != null) {
                return str;
            }
        }
        uj3 uj3VarL = l();
        if (uj3VarL == null) {
            return k92Var.b(kk0Var, jk0Var);
        }
        Uri uriN = j47.N(ju0.t(uj3VarL.a.c.c, kk0Var, jk0Var));
        if (uriN == null) {
            return null;
        }
        return uriN.toString();
    }

    public final boolean g0() {
        return this.b.e0.b;
    }

    public final List h() {
        String strB;
        k92 k92Var = this.b;
        d8a d8aVar = this.A0;
        if (d8aVar != null) {
            List list = k92Var.f(((wxc) d8aVar.a.getValue()).a()) ? (List) d8aVar.c.getValue() : null;
            if (list != null) {
                return list;
            }
        }
        uj3 uj3VarL = l();
        if (uj3VarL != null) {
            return uj3VarL.r();
        }
        String str = k92Var.h;
        mpa mpaVar = this.C0;
        if (mpaVar == null || !c37.k(mpaVar.a, str)) {
            kk0 kk0Var = kk0.b;
            kk0 kk0Var2 = kk0.o;
            kl7 kl7VarL = j1e.l();
            Iterator it = new r08(nk0.a).iterator();
            while (true) {
                ListIterator listIterator = ((fkc) it).b;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                kk0 kk0Var3 = (kk0) listIterator.previous();
                if (kk0Var3.compareTo(kk0Var) >= 0 && kk0Var3.compareTo(kk0Var2) <= 0 && (strB = k92Var.b(kk0Var3, jk0.a)) != null) {
                    kl7VarL.add(strB);
                }
            }
            kl7 kl7VarD = j1e.d(kl7VarL);
            this.C0 = new mpa(str, kl7VarD.isEmpty() ? null : kl7VarD);
        }
        return (List) this.C0.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h0() {
        /*
            r10 = this;
            r0 = 0
            k92 r1 = r10.b
            if (r1 == 0) goto L89
            j92 r2 = defpackage.j92.c
            long r3 = r10.Y
            i92 r10 = defpackage.i92.Y
            i92 r5 = r1.c
            j92 r6 = r1.b
            r7 = 1
            java.util.Map r8 = r1.e
            if (r6 != r2) goto L3a
            boolean r2 = r1.d()
            if (r2 != 0) goto L88
            if (r5 != r10) goto L89
            boolean r10 = r1.d()
            if (r10 == 0) goto L2f
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            java.util.Map r1 = r1.R
            boolean r10 = r1.containsKey(r10)
            if (r10 == 0) goto L2f
            goto L88
        L2f:
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            boolean r10 = r8.containsKey(r10)
            if (r10 == 0) goto L89
            goto L88
        L3a:
            boolean r2 = r1.e()
            if (r2 == 0) goto L48
            boolean r2 = r1.d()
            if (r2 == 0) goto L48
            r2 = r7
            goto L49
        L48:
            r2 = r0
        L49:
            boolean r6 = r1.e()
            if (r6 != 0) goto L72
            if (r5 != r10) goto L72
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            boolean r10 = r8.containsKey(r10)
            if (r10 != 0) goto L63
            f92 r10 = r1.K
            if (r10 == 0) goto L72
            boolean r10 = r10.c
            if (r10 == 0) goto L72
        L63:
            long r8 = r1.d
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 != 0) goto L70
            boolean r10 = r1.d()
            if (r10 == 0) goto L70
            goto L72
        L70:
            r10 = r7
            goto L73
        L72:
            r10 = r0
        L73:
            if (r2 != 0) goto L88
            boolean r2 = r1.d()
            if (r2 != 0) goto L88
            boolean r1 = r1.e()
            if (r1 != 0) goto L86
            i92 r1 = defpackage.i92.b
            if (r5 != r1) goto L86
            goto L88
        L86:
            if (r10 == 0) goto L89
        L88:
            r0 = r7
        L89:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e52.h0():boolean");
    }

    public final long i(long j, mg4 mg4Var) {
        d92 d92VarV = hm9.v(j, this.b.n.d(mg4Var));
        if (d92VarV != null) {
            long j2 = d92VarV.a;
            long j3 = d92VarV.b;
            if (j2 != j3) {
                return j3;
            }
        }
        return 0L;
    }

    public final boolean i0() {
        es8 es8Var = this.c;
        return es8Var != null && es8Var.a.x() && es8Var.a.f().a == p10.o && es8Var.a.f().b == this.Y;
    }

    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.Z) {
            arrayList.addAll(this.Z);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e52.j0():void");
    }

    public final String k() {
        if (M() && l() != null) {
            return l().a.c.o;
        }
        if (J() || I()) {
            return this.b.E;
        }
        return null;
    }

    public final void k0() {
        if (this.u0 != null) {
            return;
        }
        if (this.b.f(this.Y)) {
            this.u0 = q();
            return;
        }
        kr2 kr2Var = this.B0;
        String strQ = q();
        rm4 rm4Var = kr2Var.b;
        ida idaVar = (ida) rm4Var.get();
        ida idaVar2 = (ida) rm4Var.get();
        idaVar2.getClass();
        this.u0 = idaVar.j.b((int) (fk4.e(((p7b) idaVar2.i).c.g.getFloat("app.extra.text.size.sp", 0.0f)) + tu0.G(TypedValue.applyDimension(2, 16, fk4.d().getDisplayMetrics()))), strQ);
    }

    public final uj3 l() {
        synchronized (this.Z) {
            try {
                if (!M() || this.Z.isEmpty()) {
                    return null;
                }
                return (uj3) this.Z.get(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l0() {
        if (this.x0 != null) {
            return;
        }
        d8a d8aVar = this.A0;
        if (d8aVar != null) {
            if (this.b.f(((wxc) d8aVar.a.getValue()).a())) {
                this.x0 = "";
                return;
            }
        }
        uj3 uj3VarL = l();
        if (uj3VarL != null) {
            this.x0 = uj3VarL.m();
            return;
        }
        kr2 kr2Var = this.B0;
        String strQ = q();
        rm4 rm4Var = kr2Var.b;
        ida idaVar = (ida) rm4Var.get();
        Pattern pattern = fca.a;
        this.x0 = idaVar.j.e(fca.a(strQ, (ida) rm4Var.get()));
    }

    public final long m() {
        es8 es8Var = this.c;
        if (es8Var != null) {
            return es8Var.a.k();
        }
        return 0L;
    }

    public final void m0() {
        String string;
        kr2 kr2Var = this.B0;
        long j = this.Y;
        boolean zF = this.b.f(((wxc) kr2Var.g.get()).a());
        rm4 rm4Var = kr2Var.b;
        if (zF) {
            string = ((ida) rm4Var.get()).a.getString(c2c.saved_messages);
        } else {
            String strTrim = null;
            if (M()) {
                uj3 uj3VarL = l();
                if (uj3VarL != null) {
                    strTrim = uj3VarL.d();
                }
            } else {
                k92 k92Var = this.b;
                if (oag.t(k92Var.g)) {
                    ArrayList arrayListJ = j();
                    if (!I() && !arrayListJ.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        Iterator it = arrayListJ.iterator();
                        while (it.hasNext()) {
                            uj3 uj3Var = (uj3) it.next();
                            if (!uj3Var.w() && j != uj3Var.n()) {
                                sb.append(uj3Var.d().trim());
                                sb.append(", ");
                            }
                        }
                        if (sb.length() > 0) {
                            sb.delete(sb.length() - 2, sb.length());
                        }
                        strTrim = sb.toString().trim();
                    } else if (I()) {
                        strTrim = "";
                    }
                } else {
                    strTrim = k92Var.g;
                }
            }
            string = strTrim == null ? ((ida) rm4Var.get()).a.getString(c2c.tt_chat_participants_empty__title) : strTrim;
        }
        this.s0 = string;
    }

    public final long n() {
        boolean zI = I();
        es8 es8Var = this.c;
        if (zI && L()) {
            if (es8Var != null) {
                return es8Var.a.o;
            }
            return 0L;
        }
        k92 k92Var = this.b;
        Map map = k92Var.e;
        long j = this.Y;
        Long l = (Long) map.get(Long.valueOf(j));
        if (l != null && l.longValue() != 0) {
            return l.longValue();
        }
        if (es8Var == null) {
            return 0L;
        }
        if (!e0() || es8Var.a.Y == j || ((I() && !c0()) || F())) {
            return es8Var.a.o;
        }
        long j2 = es8Var.a.o;
        long j3 = k92Var.P;
        return j2 <= j3 ? j2 - 1 : j3;
    }

    public final boolean n0() {
        return this.b.e0.a || H();
    }

    public final long o() {
        return lz7.k(m(), this.b);
    }

    public final void o0(el3 el3Var) {
        el3Var.b();
        synchronized (this.Z) {
            try {
                this.Z.clear();
                Iterator it = this.b.e.keySet().iterator();
                while (it.hasNext()) {
                    uj3 uj3VarI = el3Var.i(((Long) it.next()).longValue(), true);
                    long jN = uj3VarI.n();
                    long j = this.Y;
                    if (jN != j || this.b.f(j)) {
                        this.Z.add(uj3VarI);
                    }
                }
                m0();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.u0 = null;
        this.v0 = null;
        this.x0 = null;
        this.w0.set(null);
    }

    public final CharSequence p() {
        this.t0 = this.B0.a(this);
        return this.t0;
    }

    public final String q() {
        if (this.s0 == null) {
            m0();
        }
        return this.s0;
    }

    public final k10 r() {
        k92 k92Var = this.b;
        if (k92Var == null) {
            return null;
        }
        return k92Var.T;
    }

    public final boolean s() {
        if (D()) {
            return d0() || oag.s(e(this.Y), 4);
        }
        return false;
    }

    public final boolean t() {
        z82 z82Var;
        if (K()) {
            return false;
        }
        k92 k92Var = this.b;
        if (k92Var.J.b(1) || !D()) {
            return false;
        }
        if (d0()) {
            return true;
        }
        boolean zS = oag.s(e(this.Y), 2);
        if (I() || (z82Var = k92Var.H) == null || z82Var.d) {
            return zS;
        }
        return true;
    }

    public final String toString() {
        return "Chat{id=" + this.a + ",data=" + this.b + '}';
    }

    public final boolean u() {
        if (D()) {
            return d0() || oag.s(e(this.Y), 8);
        }
        return false;
    }

    public final boolean v() {
        es8 es8Var = this.o;
        return (es8Var == null || es8Var.a.v0 == vx8.DELETED || n() >= es8Var.a.o) ? false : true;
    }

    public final boolean w() {
        z82 z82Var;
        if (M() || Q()) {
            return false;
        }
        k92 k92Var = this.b;
        if (k92Var.J.b(16) || !D() || k92Var.J.b(16)) {
            return false;
        }
        if (d0()) {
            return true;
        }
        boolean zS = oag.s(e(this.Y), 16);
        if (I() || (z82Var = k92Var.H) == null || !z82Var.e) {
            return zS;
        }
        return true;
    }

    public final boolean x() {
        return d0() || oag.s(e(this.Y), 1);
    }

    public final boolean y() {
        return d0() || oag.s(e(this.Y), 256);
    }

    public final boolean z() {
        if (!D() || I()) {
            return false;
        }
        z82 z82Var = this.b.H;
        if (z82Var == null || !z82Var.i) {
            return oag.s(e(this.Y), 128);
        }
        return true;
    }
}
