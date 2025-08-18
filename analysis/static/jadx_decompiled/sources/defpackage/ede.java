package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class ede implements bde {
    public final pk a;
    public final av0 b;
    public final p82 c;
    public final dq0 d;
    public final ece e;
    public final y8 f;
    public final ztc g;
    public final b0d h;
    public final bdb i;
    public final m7b j;
    public final u7b k;
    public final hbd l;
    public final je7 m;
    public e52 n;
    public final ArrayList o;
    public final ArrayList p;
    public iq1 q;
    public iq1 r;
    public final je7 s;

    public ede(pk pkVar, av0 av0Var, p82 p82Var, dq0 dq0Var, e52 e52Var, ztc ztcVar, b0d b0dVar, ida idaVar, m7b m7bVar, u7b u7bVar, hbd hbdVar) {
        je7 je7Var = iyc.z;
        je7 je7Var2 = iyc.q;
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.b = av0Var;
        this.c = p82Var;
        this.d = dq0Var;
        j92 j92Var = e52Var.b.b;
        this.f = new y8(j92Var);
        this.n = e52Var;
        this.a = pkVar;
        this.e = new ece(j92Var);
        this.g = ztcVar;
        this.h = b0dVar;
        this.j = m7bVar;
        this.k = u7bVar;
        this.l = hbdVar;
        this.i = new bdb(b0dVar, 7, idaVar);
        this.s = je7Var;
        this.m = je7Var2;
        av0Var.d(this);
        d();
    }

    @Override // defpackage.bde
    public final q1a a(int i, String str) {
        return new q1a(1, new ui0(this, str, i, 12));
    }

    @Override // defpackage.bde
    public final List b(LinkedHashSet linkedHashSet) {
        dce dceVarC = c();
        this.e.getClass();
        return dceVarC.l(linkedHashSet);
    }

    public final dce c() {
        if (((jbd) this.l).h != 3 || this.n.b.e.size() >= this.n.b.c()) {
            return new q40(this.h, this.i, this.j, this.k, this.s, new dde(this));
        }
        long j = this.n.b.a;
        pk pkVar = this.a;
        bdb bdbVar = this.i;
        ztc ztcVar = this.g;
        je7 je7Var = this.s;
        qi8 qi8Var = new qi8();
        qi8Var.o = j;
        qi8Var.a = pkVar;
        qi8Var.b = bdbVar;
        qi8Var.c = ztcVar;
        qi8Var.X = je7Var;
        return qi8Var;
    }

    @Override // defpackage.bde
    public final void clear() {
        this.o.clear();
        this.p.clear();
        try {
            this.b.f(this);
        } catch (Exception unused) {
        }
    }

    public final void d() {
        cqc.b(this.r);
        if (e()) {
            long j = this.n.b.a;
            au auVar = new au((sla) null, 12);
            auVar.i(j, ApiProtocol.PARAM_CHAT_ID);
            drd drdVarK = ((k4a) this.a).K(auVar, muc.b());
            iq1 iq1Var = new iq1(new dde(this), 2, new m2e(25));
            drdVarK.k(iq1Var);
            this.r = iq1Var;
        }
    }

    public final boolean e() {
        e52 e52Var = this.n;
        return e52Var.b.a != 0 && e52Var.e0() && this.n.C() && this.n.n0();
    }

    @uae
    public void onEvent(vz2 vz2Var) {
        e52 e52Var = this.n;
        if (e52Var != null && vz2Var.b.contains(Long.valueOf(e52Var.a))) {
            cqc.b(this.q);
            this.q = cqc.a(new e5(16, this), this.g, null, new m2e(24), null);
        }
    }
}
