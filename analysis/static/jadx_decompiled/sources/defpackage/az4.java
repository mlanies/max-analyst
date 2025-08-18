package defpackage;

import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class az4 extends pnf {
    public static final /* synthetic */ bc7[] v0;
    public final je7 X;
    public final q0e Y;
    public final w7c Z;
    public final ji b;
    public final y8 c;
    public final kke o;
    public final w4d s0;
    public final q0e t0;
    public final w7c u0;

    static {
        oi9 oi9Var = new oi9(az4.class, "selectedFindJob", "getSelectedFindJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        v0 = new bc7[]{oi9Var};
    }

    public az4(je7 je7Var, ji jiVar, y8 y8Var, kke kkeVar, x9c x9cVar) {
        this.b = jiVar;
        this.c = y8Var;
        this.o = kkeVar;
        this.X = je7Var;
        q0e q0eVarA = r0e.a(new yy4(0, 0, 0, 7));
        this.Y = q0eVarA;
        this.Z = new w7c(q0eVarA);
        this.s0 = mqd.D();
        nz4 nz4Var = nz4.a;
        q0e q0eVarA2 = r0e.a(new xy4(nz4Var, nz4Var));
        this.t0 = q0eVarA2;
        this.u0 = new w7c(q0eVarA2);
        hm9.n(az4.class.getName(), "Load emoji. Start");
        mqc mqcVar = new mqc(new uy4(this, null));
        kq1 kq1VarC = c37.c(x9cVar.b().a(y53.M(t9c.EMOJI, t9c.ANIMOJI)));
        gj gjVar = (gj) je7Var.getValue();
        gjVar.getClass();
        od2.L(od2.F(new zn5(od2.t(mqcVar, kq1VarC, new mqc(new yi(gjVar, null)), vy4.s0), new wy4(this, null), 5), ((w9a) kkeVar).b()), this.a);
    }

    public final qx4 q(List list, ph phVar, int i, int i2) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (tpa.f(((qx4) next).c, phVar.b)) {
                break;
            }
        }
        qx4 qx4Var = (qx4) next;
        Drawable drawable = qx4Var != null ? qx4Var.X : null;
        long j = phVar.a;
        int iG = tu0.G(28 * fk4.d().getDisplayMetrics().density);
        ji jiVar = this.b;
        jiVar.getClass();
        Long lValueOf = Long.valueOf(j);
        String str = phVar.c;
        if (str == null) {
            str = "";
        }
        String str2 = phVar.e;
        zj zjVar = new zj(jiVar.b, iG, r0e.a(new a3f(lValueOf, str, str2 != null ? str2 : "")), drawable == null ? li.a : new ki(drawable), jiVar.a);
        zjVar.setBounds(0, 0, iG, iG);
        return new qx4(i, qx4Var != null ? qx4Var.b : i2, phVar.b, null, zjVar, phVar.a, 8);
    }

    public final void r(int i, m56 m56Var) {
        vxd vxdVarS = j47.S(this.a, ((w9a) this.o).b(), vx3.b, new zy4(m56Var, i, this, null));
        this.s0.o1(this, v0[0], vxdVarS);
    }
}
