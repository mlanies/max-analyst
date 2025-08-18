package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class dza extends pnf {
    public static final /* synthetic */ bc7[] Y;
    public final w4d X;
    public final w7c b;
    public final js3 c;
    public final q0e o;

    static {
        oi9 oi9Var = new oi9(dza.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        Y = new bc7[]{oi9Var};
    }

    public dza(qn3 qn3Var, je7 je7Var, je7 je7Var2) {
        ap8 ap8Var = new ap8(qn3Var.a(), this, 3);
        nz4 nz4Var = nz4.a;
        this.b = od2.X(ap8Var, this.a, wld.a, nz4Var);
        js3 js3Var = new js3(this.a, qn3Var.a(), null, je7Var, je7Var2);
        this.c = js3Var;
        this.o = r0e.a(null);
        this.X = mqd.D();
        qn3Var.b();
        od2.L(new zn5(js3Var.i, new aza(this, null), 5), this.a);
    }

    public static final List q(dza dzaVar, dn3 dn3Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        dzaVar.getClass();
        if (dn3Var.b()) {
            return nz4.a;
        }
        kl7 kl7VarL = j1e.l();
        List<nn3> list = dn3Var.a;
        if (list != null) {
            arrayList = new ArrayList(z53.S(list, 10));
            for (nn3 nn3Var : list) {
                long j = nn3Var.a;
                CharSequence charSequence = nn3Var.X;
                arrayList.add(new pxa(j, j, nn3Var.b, charSequence != null ? new iqe(charSequence) : null, nn3Var.Z, false, nn3Var.t0, new gza(j, fza.b), nn3Var.u0, true));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            kl7VarL.addAll(arrayList);
        }
        List<nn3> list2 = dn3Var.c;
        if (list2 != null) {
            arrayList2 = new ArrayList(z53.S(list2, 10));
            for (nn3 nn3Var2 : list2) {
                long j2 = nn3Var2.a;
                CharSequence charSequence2 = nn3Var2.X;
                arrayList2.add(new pxa(j2, j2, nn3Var2.b, charSequence2 != null ? new iqe(charSequence2) : null, nn3Var2.Z, false, nn3Var2.t0, new gza(j2, fza.c), nn3Var2.u0, true));
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            kl7VarL.addAll(arrayList2);
        }
        return j1e.d(kl7VarL);
    }
}
