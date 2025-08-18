package defpackage;

import android.content.Context;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class u6b {
    public final ida a;
    public final el3 b;
    public final m7b c;
    public final cu8 d;
    public final rj e;
    public e52 f;
    public CharSequence g;
    public CharSequence h;
    public CharSequence i;
    public CharSequence j;
    public String k;
    public String l;
    public String m;
    public n34 n;
    public boolean o;
    public boolean p;
    public boolean q;

    public u6b(ida idaVar, el3 el3Var, m7b m7bVar, cu8 cu8Var, e52 e52Var, rj rjVar) {
        this.a = idaVar;
        this.b = el3Var;
        this.c = m7bVar;
        this.d = cu8Var;
        this.e = rjVar;
        if (e52Var != null) {
            h(e52Var);
            return;
        }
        d();
        f();
        e();
        c(idaVar.g());
    }

    public final String a(e52 e52Var, cu8 cu8Var) {
        boolean z = ((p7b) this.c).c.g.getBoolean("audio.transcription.enabled", true);
        boolean zN = cu8Var.n();
        String str = cu8Var.s0;
        if (!zN) {
            return str;
        }
        if (!cu8Var.D() && !oag.t(str)) {
            return str;
        }
        ida idaVar = this.a;
        if (e52Var == null || e52Var.I() || e52Var.M() || e52Var.Q()) {
            return idaVar.e.f(idaVar.a, idaVar, cu8Var, false, false, false, z, idaVar.c.t(), true);
        }
        String strF = idaVar.e.f(idaVar.a, idaVar, cu8Var, false, false, false, z, idaVar.c.t(), true);
        idaVar.e.f(idaVar.a, idaVar, cu8Var, false, false, false, z, idaVar.c.t(), true);
        return strF;
    }

    public final CharSequence b(e52 e52Var) {
        this.f = e52Var;
        ida idaVar = this.a;
        i(e52Var, idaVar.f(), idaVar.e());
        return this.i;
    }

    public final void c(int i) {
        uj3 uj3VarI = this.b.i(this.d.Y, true);
        if (this.h == null) {
            this.h = this.a.j.b(i, uj3VarI.d());
        }
    }

    public final void d() {
        if (this.n == null) {
            cu8 cu8Var = this.d;
            this.n = n34.g(cu8Var.o() ? cu8Var.T0.a : cu8Var.k(), TimeZone.getDefault());
        }
    }

    public final void e() {
        String strQ;
        if (this.l == null) {
            d();
            n34 n34Var = this.n;
            ida idaVar = this.a;
            Locale localeV = idaVar.c.v();
            n34 n34VarG = n34.g(System.currentTimeMillis(), TimeZone.getDefault());
            boolean zA = ay7.A(n34VarG, n34Var);
            Context context = idaVar.a;
            if (zA) {
                strQ = context.getString(c2c.tt_dates_today);
            } else {
                n34Var.f();
                Integer num = n34Var.c;
                n34Var.f();
                n34 n34VarL = new n34(n34Var.a, n34Var.b, num, 0, 0, 0, 0).l(1);
                n34VarG.f();
                Integer num2 = n34VarG.c;
                n34VarG.f();
                if (n34VarL.equals(new n34(n34VarG.a, n34VarG.b, num2, 0, 0, 0, 0))) {
                    strQ = context.getString(c2c.tt_dates_yesterday);
                } else {
                    long jH = n34Var.h(TimeZone.getDefault());
                    strQ = n34VarG.a.equals(n34Var.a) ? ay7.q(localeV, jH, false) : ay7.q(localeV, jH, true);
                }
            }
            this.l = strQ;
        }
    }

    public final void f() {
        if (this.k == null) {
            cu8 cu8Var = this.d;
            long jK = cu8Var.o() ? cu8Var.T0.a : cu8Var.k();
            ida idaVar = this.a;
            this.k = ay7.k(idaVar.a, jK, idaVar.c.v());
        }
    }

    public final void g(e52 e52Var) {
        boolean z;
        if (this.p) {
            return;
        }
        cu8 cu8Var = this.d;
        boolean zX = cu8Var.x();
        m7b m7bVar = this.c;
        if (!zX) {
            z = true;
        } else if (zX) {
            ((p7b) m7bVar).a.getClass();
            z = true;
        } else {
            z = false;
        }
        if (!oag.t(this.g) && z) {
            this.g = kp.y(this.a.a(this.g, e52Var != null && (e52Var.J() || e52Var.Q()), true, e52Var != null && e52Var.n0(), !zX, cu8Var.R0, cu8Var.Y != ((p7b) m7bVar).a.t()));
        }
        this.p = true;
    }

    public final void h(e52 e52Var) {
        this.f = e52Var;
        ida idaVar = this.a;
        i(e52Var, idaVar.f(), idaVar.e());
        g(e52Var);
        d();
        f();
        e();
        c(idaVar.g());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.e52 r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u6b.i(e52, int, int):void");
    }
}
