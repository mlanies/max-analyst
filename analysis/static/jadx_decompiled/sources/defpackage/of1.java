package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class of1 extends pnf implements zl1 {
    public final q0e A0;
    public final en1 B0;
    public final q0e C0;
    public final w7c D0;
    public final s35 E0;
    public final kke X;
    public final ir1 Y;
    public final qx7 Z;
    public final b31 b;
    public final eo1 c;
    public final oqa o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public String y0;
    public final q0e z0;

    public of1(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, b31 b31Var, eo1 eo1Var, oqa oqaVar, kke kkeVar, ir1 ir1Var, qx7 qx7Var) {
        Object value;
        je7 je7Var7 = iyc.h;
        this.b = b31Var;
        this.c = eo1Var;
        this.o = oqaVar;
        this.X = kkeVar;
        this.Y = ir1Var;
        this.Z = qx7Var;
        this.s0 = je7Var7;
        this.t0 = je7Var4;
        this.u0 = je7Var2;
        this.v0 = je7Var;
        this.w0 = je7Var6;
        this.x0 = tu0.r(3, new k11(18));
        this.y0 = "";
        q0e q0eVarA = r0e.a(wf1.g);
        this.z0 = q0eVarA;
        this.A0 = q0eVarA;
        this.B0 = new en1();
        q0e q0eVarA2 = r0e.a(na.c);
        this.C0 = q0eVarA2;
        this.D0 = new w7c(q0eVarA2);
        this.E0 = new s35(0);
        w9a w9aVar = (w9a) kkeVar;
        od2.L(od2.F(new zn5(((yz0) ((ez0) je7Var4.getValue())).t0, new ef1(this, null), 5), w9aVar.a()), this.a);
        j47.T(this.a, w9aVar.e(), null, new gf1(this, null), 2);
        od2.L(new zn5(eo1Var.j, new hf1(this, null), 5), this.a);
        od2.L(new zn5(((l31) ir1Var.f).k, new if1(this, null), 5), this.a);
        od2.L(new j31(ir1Var.c.e, new e21(ir1Var.e(), je7Var3, 1), new jf1(je7Var3, this, (Continuation) null, 0), 4), this.a);
        boolean z = ((se5) ((qe5) je7Var5.getValue())).r() && !((y21) ((l31) b31Var).k.getValue()).g;
        if (((se5) ((qe5) je7Var5.getValue())).q()) {
            od2.L(od2.F(new zn5(((yz0) ((ez0) je7Var4.getValue())).F0, new kf1(this, z, je7Var5, null), 5), w9aVar.a()), this.a);
        } else {
            do {
                value = q0eVarA.getValue();
            } while (!q0eVarA.c(value, wf1.a((wf1) value, null, r(false, z), null, false, null, false, 29)));
        }
        od2.L(new zn5(((yz0) this.Y.l).D0, new lf1(this, null), 5), this.a);
        ((wr1) ((kr1) this.u0.getValue())).d(this);
    }

    public static final void q(of1 of1Var, kl7 kl7Var, Map map) {
        Object value;
        wf1 wf1Var;
        ArrayList arrayList;
        q0e q0eVar = of1Var.z0;
        do {
            value = q0eVar.getValue();
            wf1Var = (wf1) value;
            arrayList = new ArrayList(z53.S(kl7Var, 10));
            ListIterator listIterator = kl7Var.listIterator(0);
            while (true) {
                il7 il7Var = (il7) listIterator;
                if (!il7Var.hasNext()) {
                    break;
                }
                fqa fqaVar = (fqa) il7Var.next();
                gg1 id = fqaVar.a.getId();
                bo1 bo1Var = fqaVar.b;
                String strQ = bo1Var.q();
                if (strQ == null) {
                    strQ = "";
                }
                String str = strQ;
                String name = bo1Var.getName();
                ig1 ig1Var = fqaVar.a;
                boolean zM = ig1Var.m();
                boolean zO = ig1Var.o();
                boolean zH = ig1Var.h();
                Long l = (Long) map.get(ig1Var.getId());
                arrayList.add(new ve1(id, name, str, zO, zM, zH, l != null ? l.longValue() : -1L, Integer.valueOf((ig1Var.m() && ig1Var.o()) ? b8a.l2 : ig1Var.m() ? b8a.i2 : ig1Var.o() ? b8a.k2 : b8a.m2)));
            }
        } while (!q0eVar.c(value, wf1.a(wf1Var, x53.x0(arrayList, (Comparator) of1Var.x0.getValue()), null, null, false, null, false, 62)));
    }

    public static kl7 r(boolean z, boolean z2) {
        kl7 kl7VarL = j1e.l();
        if (!z2) {
            kl7VarL.add(new l7a(y7a.f1, Integer.valueOf(b8a.o1), (Integer) null, Integer.valueOf(x7a.S), (Integer) null, 52));
        }
        if (!z2) {
            kl7VarL.add(new l7a(y7a.e1, Integer.valueOf(yoc.s0), (Integer) null, Integer.valueOf(x7a.d), (Integer) null, 52));
        } else if (z2 && z) {
            kl7VarL.add(new l7a(y7a.d1, Integer.valueOf(b8a.l1), (Integer) null, Integer.valueOf(x7a.d), (Integer) null, 52));
        }
        return j1e.d(kl7VarL);
    }

    @Override // defpackage.zl1
    public final void i() {
        pnf.o(this.E0, aj1.D);
    }
}
