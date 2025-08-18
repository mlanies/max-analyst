package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class rf0 {
    public final boolean d;
    public final boolean l;
    public boolean m;
    public boolean n;
    public double o;
    public double p;
    public final ebg a = new ebg();
    public final CopyOnWriteArraySet k = new CopyOnWriteArraySet();
    public final jw4 b = new jw4();
    public final jw4 c = new jw4();
    public final aw7 g = new aw7();
    public final aw7 h = new aw7();
    public final l7 e = new l7(11, false);
    public final l7 f = new l7(11, false);
    public final mbg i = new mbg();
    public final mbg j = new mbg();

    public rf0(boolean z, boolean z2) {
        this.l = z2;
        this.d = z;
    }

    public static boolean b(ebg ebgVar, double d, double d2, double d3, pf0 pf0Var) {
        if (d > d3 && d3 > 0.0d) {
            return ebgVar.a(pf0Var, true);
        }
        if (d >= d2 || d2 <= 0.0d) {
            return false;
        }
        return ebgVar.a(pf0Var, false);
    }

    public final void a() {
        boolean zA;
        boolean zA2;
        bg1 bg1VarQ;
        boolean z = this.a.b == 0;
        double d = this.b.b;
        ebg ebgVar = this.a;
        double d2 = this.i.a;
        double d3 = this.j.a;
        pf0 pf0Var = pf0.b;
        boolean zB = b(ebgVar, d, d2, d3, pf0Var);
        double d4 = this.c.b;
        ebg ebgVar2 = this.a;
        double d5 = this.i.b;
        double d6 = this.j.b;
        pf0 pf0Var2 = pf0.c;
        boolean zB2 = zB | b(ebgVar2, d4, d5, d6, pf0Var2);
        boolean z2 = this.n;
        pf0 pf0Var3 = pf0.a;
        boolean zA3 = zB2 | (z2 ? this.a.a(pf0Var3, this.m) : this.a.a(pf0Var3, false));
        boolean z3 = this.l;
        pf0 pf0Var4 = pf0.X;
        pf0 pf0Var5 = pf0.o;
        if (!z3 || Double.isNaN(this.o) || Double.isNaN(this.p)) {
            zA = zA3 | this.a.a(pf0Var4, false);
            zA2 = this.a.a(pf0Var5, false);
        } else {
            zA = zA3 | b(this.a, this.o, this.i.a, this.j.a, pf0Var5);
            zA2 = b(this.a, this.p, this.i.b, this.j.b, pf0Var4);
        }
        if (zA || zA2) {
            ebg ebgVar3 = this.a;
            boolean z4 = ebgVar3.b == 0;
            HashSet hashSet = new HashSet();
            pf0[] pf0VarArrValues = pf0.values();
            int i = 0;
            while (true) {
                boolean[] zArr = ebgVar3.a;
                if (i >= zArr.length) {
                    break;
                }
                if (zArr[i]) {
                    hashSet.add(pf0VarArrValues[i]);
                }
                i++;
            }
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                qf0 qf0Var = (qf0) it.next();
                if (z4 != z) {
                    if (z4) {
                        qf0Var.getClass();
                    } else {
                        qf0Var.getClass();
                    }
                }
                rcg rcgVar = (rcg) qf0Var;
                py0 py0Var = rcgVar.b;
                boolean z5 = py0Var.u0.A.c.a;
                if (!py0Var.A0 && py0Var.t1.H(xxe.b) && !z5 && (bg1VarQ = py0Var.q()) != null) {
                    if (!rcgVar.a && (hashSet.contains(pf0Var) || hashSet.contains(pf0Var2))) {
                        rcgVar.a = true;
                        py0Var.Z.i(z7.e(bg1VarQ, true));
                    } else if (rcgVar.a && !hashSet.contains(pf0Var) && !hashSet.contains(pf0Var2)) {
                        rcgVar.a = false;
                        py0Var.Z.i(z7.e(bg1VarQ, false));
                    }
                }
            }
        }
    }
}
