package defpackage;

import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class oq3 {
    public final lqd a;
    public final u7b b;
    public final el3 c;
    public final p82 d;
    public final ri4 e;
    public final hbd f;
    public final ConcurrentHashMap g = new ConcurrentHashMap();

    public oq3(m7b m7bVar, u7b u7bVar, el3 el3Var, p82 p82Var, ri4 ri4Var, hbd hbdVar, ztc ztcVar) {
        lqd lqdVar = new lqd(new q1a(1, new v02(22, m7bVar)).m(ztcVar));
        this.a = lqdVar;
        lqdVar.k(new j28(1, new un0(28)));
        this.b = u7bVar;
        this.c = el3Var;
        this.d = p82Var;
        this.e = ri4Var;
        this.f = hbdVar;
    }

    public static int a(uj3 uj3Var, uj3 uj3Var2, Collator collator) {
        CollationKey collationKey = uj3Var.X;
        if (collationKey == null) {
            collationKey = collator.getCollationKey(uj3Var.d().toLowerCase());
            uj3Var.X = collationKey;
        }
        CollationKey collationKey2 = uj3Var2.X;
        if (collationKey2 == null) {
            collationKey2 = collator.getCollationKey(uj3Var2.d().toLowerCase());
            uj3Var2.X = collationKey2;
        }
        boolean z = false;
        boolean z2 = !oag.t(uj3Var.d()) && Character.isLetter(uj3Var.d().charAt(0));
        if (!oag.t(uj3Var2.d()) && Character.isLetter(uj3Var2.d().charAt(0))) {
            z = true;
        }
        return (!(z2 && z) && (z2 || z)) ? z2 ? -1 : 1 : collationKey.compareTo(collationKey2);
    }

    public final void b(List list) {
        es8 es8Var;
        synchronized (this) {
            try {
                if (this.e.d() && ((jbd) this.f).h == 3) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.g.keySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.c.i(((Long) it.next()).longValue(), true));
                    }
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        uj3 uj3Var = (uj3) it2.next();
                        if (!this.g.containsKey(Long.valueOf(uj3Var.n()))) {
                            arrayList.add(uj3Var);
                        }
                    }
                    Collections.sort(arrayList, new nq3(this, this.b.d(), (Collator) this.a.e(), 0));
                    for (int i = 0; i < arrayList.size(); i++) {
                        this.g.put(Long.valueOf(((uj3) arrayList.get(i)).n()), Integer.valueOf(i));
                    }
                }
            } finally {
            }
        }
        ei9 ei9Var = new ei9(6);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            uj3 uj3Var2 = (uj3) it3.next();
            e52 e52VarF = this.d.F(uj3Var2.n());
            long jM = (e52VarF == null || (es8Var = e52VarF.c) == null || es8Var.a.x()) ? 0L : e52VarF.m();
            if (jM != 0) {
                ei9Var.d(uj3Var2.n(), -jM);
            } else {
                ei9Var.d(uj3Var2.n(), ((Integer) this.g.get(Long.valueOf(uj3Var2.n()))) != null ? r3.intValue() : 0L);
            }
        }
        list.sort(new ca3(1, ei9Var));
    }

    public final void c(ArrayList arrayList, m56 m56Var) {
        Collections.sort(arrayList, new nq3(this, m56Var, new HashMap(), 1));
    }
}
