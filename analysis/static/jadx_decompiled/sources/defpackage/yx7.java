package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* loaded from: classes2.dex */
public final class yx7 {
    public final p82 a;
    public final ztc b;
    public final ztc c;
    public final mle d;
    public final av0 e;
    public final fme f;
    public final o45 g;
    public final long h;
    public px7 i;
    public td7 j;
    public iq1 k;
    public iq1 l;
    public iq1 m;
    public String r;
    public final jt3 t;
    public ArrayList n = new ArrayList();
    public volatile List o = new ArrayList();
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public String s = "";

    public yx7(final p82 p82Var, final el3 el3Var, final b0d b0dVar, final oq3 oq3Var, ztc ztcVar, ztc ztcVar2, mle mleVar, av0 av0Var, fme fmeVar, final boolean z, o45 o45Var, final y7d y7dVar) {
        this.a = p82Var;
        this.b = ztcVar2;
        this.c = ztcVar;
        this.d = mleVar;
        this.e = av0Var;
        this.f = fmeVar;
        this.g = o45Var;
        this.h = el3Var.i(((p7b) el3Var.h).a.t(), false).n();
        this.t = new jt3(new lde() { // from class: ux7
            @Override // defpackage.lde
            public final Object get() {
                String[] strArr = (String[]) ((qyc) y7dVar).k.getValue();
                p82 p82Var2 = p82Var;
                el3 el3Var2 = el3Var;
                oq3 oq3Var2 = oq3Var;
                b0d b0dVar2 = b0dVar;
                boolean z2 = z;
                vzc vzcVar = new vzc(p82Var2, el3Var2, oq3Var2, b0dVar2, z2);
                wzc wzcVar = null;
                if (strArr != null) {
                    if (!(!(strArr.length == 0))) {
                        strArr = null;
                    }
                    if (strArr != null) {
                        wzcVar = new wzc(strArr, p82Var2, b0dVar2);
                    }
                }
                return new uzc(p82Var2, el3Var2, b0dVar2, z2, vzcVar, wzcVar);
            }
        });
    }

    public final void a() {
        if (!cqc.c(this.j)) {
            td7 td7Var = this.j;
            td7Var.getClass();
            zae.a(td7Var);
            try {
                this.e.f(this);
            } catch (Exception unused) {
            }
        }
        this.n.clear();
        this.r = null;
        this.s = "";
    }

    public final void b() {
        if (!cqc.c(this.k)) {
            iq1 iq1Var = this.k;
            iq1Var.getClass();
            dm4.a(iq1Var);
            try {
                this.e.f(this);
            } catch (Exception unused) {
            }
        }
        this.p.clear();
        this.o.clear();
    }

    public final void c() {
        if (!cqc.c(this.l)) {
            iq1 iq1Var = this.l;
            iq1Var.getClass();
            dm4.a(iq1Var);
        }
        this.q.clear();
        this.s = "";
    }

    public final void d() {
        hm9.n("yx7", "clear");
        a();
        b();
        c();
    }

    public final drd e(String str) {
        gs9 gs9Var = new gs9((sla) null, 4);
        gs9Var.p("query", str);
        gs9Var.e(5, NewHtcHomeBadger.COUNT);
        gs9Var.p("type", "ALL");
        tle tleVar = (tle) this.d;
        tleVar.getClass();
        q1a q1aVar = new q1a(1, new ypc(tleVar, 9, gs9Var));
        ztc ztcVar = this.c;
        return new frd(q1aVar.i(ztcVar).h(new rx7(this, 2)).h(new kp7(5)), new kp7(6), null).m(ztcVar);
    }

    @uae
    public void onEvent(vz2 vz2Var) {
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            e52 e52Var = ((kzc) it.next()).o;
            if (e52Var != null && vz2Var.b.contains(Long.valueOf(e52Var.a))) {
                cqc.b(this.m);
                this.m = cqc.a(new e5(11, this), this.c, null, new kp7(13), null);
                return;
            }
        }
    }
}
