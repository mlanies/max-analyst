package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class pza extends pnf {
    public static final /* synthetic */ bc7[] s0;
    public final je7 X;
    public final q0e Y = r0e.a(null);
    public final w4d Z = mqd.D();
    public final long b;
    public final mp8 c;
    public final kq8 o;

    static {
        oi9 oi9Var = new oi9(pza.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        s0 = new bc7[]{oi9Var};
    }

    public pza(long j, mp8 mp8Var, kq8 kq8Var, je7 je7Var) {
        this.b = j;
        this.c = mp8Var;
        this.o = kq8Var;
        this.X = je7Var;
        xp8 xp8Var = (xp8) mp8Var;
        if (xp8Var.g.compareAndSet(false, true)) {
            j47.T(xp8Var.f, null, null, new wp8(xp8Var, null), 3);
        }
        od2.L(new zn5(((xp8) kq8Var).l, new mza(this, null), 5), this.a);
    }

    public static final ArrayList q(pza pzaVar, List list) {
        pzaVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            pxa pxaVar = (pxa) obj;
            e52 e52Var = (e52) ((jz2) ((iy2) pzaVar.X.getValue())).m(pzaVar.b).a.getValue();
            if (e52Var != null) {
                ArrayList arrayListJ = e52Var.j();
                if (!arrayListJ.isEmpty()) {
                    Iterator it = arrayListJ.iterator();
                    while (it.hasNext()) {
                        if (((uj3) it.next()).n() == pxaVar.a) {
                            break;
                        }
                    }
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final boolean r() {
        e52 e52Var;
        long j = this.b;
        return j > 0 && (e52Var = (e52) ((jz2) ((iy2) this.X.getValue())).m(j).a.getValue()) != null && (e52Var.j().isEmpty() ^ true);
    }
}
