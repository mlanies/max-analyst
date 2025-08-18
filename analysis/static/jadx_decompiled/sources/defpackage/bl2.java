package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class bl2 extends pnf {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final long b;
    public final boolean c;
    public final je7 o;
    public final a8g s0;
    public vxd t0;
    public final ArrayList u0;
    public final AtomicBoolean v0;
    public final int w0;
    public final s35 x0;
    public final mn5 y0;

    public bl2(int i, long j, boolean z) {
        int i2 = 2;
        z = (i & 2) != 0 ? false : z;
        xcb xcbVar = xcb.a;
        je7 je7VarC = xcbVar.c();
        je7 je7VarE = xcbVar.e();
        je7 je7VarF = xcbVar.f();
        je7 je7VarR = tu0.r(3, new m52(20));
        this.b = j;
        this.c = z;
        this.o = je7VarC;
        this.X = je7VarE;
        this.Y = je7VarF;
        this.Z = je7VarR;
        this.s0 = new a8g(5);
        this.u0 = new ArrayList();
        this.v0 = new AtomicBoolean(false);
        e52 e52VarQ = q();
        if (e52VarQ != null && e52VarQ.I()) {
            i2 = 1;
        }
        this.w0 = i2;
        this.x0 = new s35(0);
        this.y0 = od2.x(new wk2(od2.F(new t03(((jz2) ((iy2) ((khe) je7VarC).getValue())).m(j), 11), ((w9a) ((kke) ((khe) je7VarF).getValue())).b()), this, 1));
    }

    public static boolean t(e52 e52Var) {
        if (e52Var.K()) {
            return false;
        }
        return e52Var.d0() || ((oag.t(e52Var.b.I) ^ true) && (e52Var.t() || e52Var.z()));
    }

    public final e52 q() {
        return (e52) ((jz2) ((iy2) this.o.getValue())).m(this.b).a.getValue();
    }

    public final kl7 r() {
        e52 e52VarQ = q();
        a8g a8gVar = this.s0;
        a8gVar.getClass();
        kl7 kl7VarL = j1e.l();
        if (e52VarQ != null && e52VarQ.t()) {
            if (!this.c) {
                kl7VarL.add((tt3) ((je7) a8gVar.a).getValue());
            }
            if (e52VarQ.I()) {
                kl7VarL.add((tt3) ((je7) a8gVar.c).getValue());
            } else {
                kl7VarL.add((tt3) ((je7) a8gVar.b).getValue());
            }
        }
        return j1e.d(kl7VarL);
    }

    public final mn5 s() {
        return od2.x(od2.F(new wk2(new t03(((jz2) ((iy2) this.o.getValue())).m(this.b), 11), this, 0), ((w9a) ((kke) this.Y.getValue())).b()));
    }

    public final void u(List list, boolean z) {
        aqe aqeVar;
        this.v0.set(z);
        ArrayList arrayList = this.u0;
        arrayList.clear();
        arrayList.addAll(list);
        int iS = au1.s(this.w0);
        if (iS == 0) {
            aqeVar = new aqe(xea.c, list.size());
        } else {
            if (iS != 1) {
                throw new NoWhenBranchMatchedException();
            }
            aqeVar = new aqe(xea.d, list.size());
        }
        pnf.o(this.x0, new gjb(aqeVar));
    }

    public final void v() {
        aqe aqeVar;
        this.v0.set(false);
        ArrayList arrayList = this.u0;
        arrayList.clear();
        int iS = au1.s(this.w0);
        if (iS == 0) {
            aqeVar = new aqe(xea.e, arrayList.size());
        } else {
            if (iS != 1) {
                throw new NoWhenBranchMatchedException();
            }
            aqeVar = new aqe(xea.f, arrayList.size());
        }
        pnf.o(this.x0, new hjb(aqeVar));
    }

    public final void w() {
        ArrayList arrayList = this.u0;
        List listD0 = x53.D0(arrayList);
        arrayList.clear();
        vxd vxdVar = this.t0;
        if ((vxdVar == null || !vxdVar.isActive()) && !listD0.isEmpty()) {
            this.t0 = pnf.n(this, ((w9a) ((kke) this.Y.getValue())).b().plus(xq9.a), null, new al2(this, listD0, null), 2);
        }
    }
}
