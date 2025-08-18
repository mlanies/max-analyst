package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class r47 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public r47(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
    }

    public final void a(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "r47", zr6.h(collection.size(), "invalidateChatsInternal, contactsIds.size() = "), null);
        }
        List<e52> listE = ((p82) this.a.getValue()).E(p82.I);
        t6b t6bVar = (t6b) this.c.getValue();
        p82 p82Var = (p82) this.a.getValue();
        t6bVar.getClass();
        xs xsVar = new xs(collection);
        hm9.m("t6b", "invalidatePreprocessedDataByContacts, contactIds = %d", Integer.valueOf(xsVar.c));
        ArrayList arrayList = new ArrayList();
        xs xsVar2 = new xs(0);
        Iterator it = t6bVar.c.entrySet().iterator();
        while (it.hasNext()) {
            u6b u6bVar = (u6b) ((Map.Entry) it.next()).getValue();
            boolean zContains = xsVar.contains(Long.valueOf(u6bVar.d.Y));
            cu8 cu8Var = u6bVar.d;
            if (zContains) {
                arrayList.add(cu8Var);
                xsVar2.add(Long.valueOf(cu8Var.b));
            }
            cu8 cu8Var2 = cu8Var.C0;
            if (cu8Var2 != null && xsVar.contains(Long.valueOf(cu8Var2.Y))) {
                arrayList.add(cu8Var);
                xsVar2.add(Long.valueOf(cu8Var.b));
            }
            q10 q10VarF = cu8Var.f();
            if (q10VarF != null) {
                if (!xsVar.contains(Long.valueOf(q10VarF.b))) {
                    Iterator it2 = q10VarF.c.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (xsVar.contains((Long) it2.next())) {
                            arrayList.add(cu8Var);
                            xsVar2.add(Long.valueOf(cu8Var.b));
                            break;
                        }
                    }
                } else {
                    arrayList.add(cu8Var);
                    xsVar2.add(Long.valueOf(cu8Var.b));
                }
            }
        }
        hm9.m("t6b", "invalidated messages count = %d", Integer.valueOf(arrayList.size()));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            cu8 cu8Var3 = (cu8) it3.next();
            e52 e52VarC = p82Var.C(cu8Var3.t0);
            if (e52VarC == null) {
                hm9.m0("t6b", "don't create and put preprocessed data, because chat is null", new Object[0]);
            } else {
                t6bVar.b(e52VarC, cu8Var3);
                t6bVar = t6bVar;
                t6bVar.a.c(new l6f(cu8Var3.t0, cu8Var3.b, 0));
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(xsVar2);
        gi9 gi9Var = new gi9((Object) null);
        for (e52 e52Var : listE) {
            ArrayList arrayListJ = e52Var.j();
            xs xsVar3 = new xs(0);
            Iterator it4 = arrayListJ.iterator();
            while (it4.hasNext()) {
                xsVar3.add(Long.valueOf(((uj3) it4.next()).n()));
            }
            if (!Collections.disjoint(collection, xsVar3)) {
                gi9Var.a(e52Var.b.a);
                e52Var.o0((el3) this.b.getValue());
            }
            es8 es8Var = e52Var.c;
            if (es8Var != null && setUnmodifiableSet.contains(Long.valueOf(es8Var.a.b))) {
                ((p82) this.a.getValue()).k0(e52Var.a, e52Var.c.a, true);
                gi9Var.a(e52Var.b.a);
            }
        }
        if (gi9Var.j()) {
            ((cea) this.d.getValue()).g(gi9Var);
        }
    }
}
