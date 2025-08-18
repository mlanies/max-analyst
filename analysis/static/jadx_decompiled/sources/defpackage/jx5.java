package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class jx5 extends pnf {
    public final eca X;
    public final lqf Y;
    public final je7 Z;
    public final kke b;
    public final rba c;
    public final vh3 o;
    public final q0e s0;
    public final w7c t0;
    public final q0e u0;
    public final w7c v0;
    public final w7c w0;
    public boolean x0;

    public jx5() {
        je7 je7Var = iyc.y;
        ys2 ys2Var = ys2.a;
        nba nbaVar = (nba) ys2Var.getAccessor().c(nba.class);
        jyc jycVar = jyc.a;
        kke kkeVarS = jycVar.s();
        rba rbaVar = (rba) jycVar.getAccessor().c(rba.class);
        vh3 vh3Var = (vh3) ys2Var.getAccessor().c(vh3.class);
        eca ecaVar = (eca) ys2Var.getAccessor().c(eca.class);
        ys2Var.getAccessor().d(hda.class);
        lqf lqfVar = (lqf) ys2Var.getAccessor().c(lqf.class);
        this.b = kkeVarS;
        this.c = rbaVar;
        this.o = vh3Var;
        this.X = ecaVar;
        this.Y = lqfVar;
        this.Z = je7Var;
        kl7 kl7VarL = j1e.l();
        List<xa9> list = (List) ((AtomicReference) ((ya9) ecaVar.c.getValue()).c).get();
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        boolean z = false;
        for (xa9 xa9Var : list) {
            if (tpa.f(xa9Var.a, "all.chat.folder")) {
                z = true;
            }
            arrayList.add(new av5(xa9Var.a, xa9Var.b, null, xa9Var.c, xa9Var.d));
        }
        kl7VarL.addAll(arrayList);
        if (!z) {
            kl7VarL.add(0, new av5("all.chat.folder", this.c.a.getString(jpc.f0), null, hy3.b, EnumSet.allOf(cv5.class)));
        }
        q0e q0eVarA = r0e.a(j1e.d(kl7VarL));
        this.s0 = q0eVarA;
        this.t0 = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a(0);
        this.u0 = q0eVarA2;
        this.v0 = new w7c(q0eVarA2);
        t03 t03VarG = ((zb2) ((ta2) this.Z.getValue())).g();
        w7c w7cVar = nbaVar.f;
        Continuation continuation = null;
        od2.L(od2.F(new zn5(od2.F(new j31(t03VarG, w7cVar, new c3(this, continuation, 12), 4), ((w9a) this.b).a()), new dx5(this, null), 5), ((w9a) this.b).b()), this.a);
        int i = ft4.o;
        long jE = ft4.e(z7.R(2, kt4.SECONDS));
        lec lecVar = new lec();
        lecVar.a = System.currentTimeMillis();
        this.w0 = od2.X(od2.x(od2.M(od2.x(nu0.Q(new j31(od2.g(new ix5(this, lecVar, null)), new ac(new w7c(this.o.a), 23, this), new xi1(3, continuation, 1), 4), z7.R(500, kt4.MILLISECONDS))), new gx5(lecVar, jE, null))), this.a, wld.b, xi6.c);
    }

    public final void q(String str) {
        if (str == null) {
            return;
        }
        Iterator it = ((List) this.s0.getValue()).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (tpa.f(((av5) it.next()).a, str)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            this.u0.m(null, Integer.valueOf(i));
        }
    }
}
