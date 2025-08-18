package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* loaded from: classes2.dex */
public final class gn3 extends ol implements lme {
    public final int X;
    public final int o;

    public gn3(long j, int i) {
        super(j);
        this.o = i;
        this.X = 40;
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        List<wm3> listEmptyList;
        RuntimeException runtimeException;
        List list;
        List list2 = ((hn3) gleVar).c;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                try {
                    if (((wm3) obj) != um3.A0) {
                        arrayList.add(obj);
                    }
                } finally {
                }
            }
            listEmptyList = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (wm3 wm3Var : listEmptyList) {
            if (n().g(wm3Var.a)) {
                arrayList2.add(wm3Var);
            } else {
                arrayList3.add(wm3Var);
            }
        }
        n().t(arrayList2, ol3.a);
        n().t(arrayList3, ol3.b);
        av0 av0VarL = l();
        if (listEmptyList.isEmpty()) {
            list = nz4.a;
        } else {
            ArrayList arrayList4 = new ArrayList(listEmptyList.size());
            Iterator it = listEmptyList.iterator();
            while (it.hasNext()) {
                try {
                    arrayList4.add(Long.valueOf(((wm3) it.next()).a));
                } finally {
                }
            }
            list = arrayList4;
        }
        av0VarL.c(new kn3(this.o, this.a, list));
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        boolean z = pkeVar instanceof gke;
        long j = this.a;
        if (z) {
            l().c(new oi0(j, pkeVar));
            return;
        }
        l().c(new kn3(this.o, j, nz4.a));
    }

    @Override // defpackage.ol
    public final dle i() {
        tq2 tq2Var = new tq2((sla) null, 7);
        tq2Var.p("status", "BLOCKED");
        int i = this.o;
        if (i > 0) {
            tq2Var.e(i, "from");
        }
        int i2 = this.X;
        if (i2 > 0) {
            tq2Var.e(i2, NewHtcHomeBadger.COUNT);
        }
        return tq2Var;
    }
}
