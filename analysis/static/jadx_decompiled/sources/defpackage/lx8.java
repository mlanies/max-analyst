package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class lx8 {
    public static final ye4 e = new ye4(8);
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public lx8(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = je7Var3;
        this.b = je7Var2;
        this.c = je7Var;
        this.d = je7Var4;
    }

    public static Set a(ix8 ix8Var, ix8 ix8Var2) {
        wz4 wz4Var = wz4.a;
        if (ix8Var2 == null) {
            return wz4Var;
        }
        List list = ix8Var2.a;
        if (ix8Var != null) {
            List list2 = ix8Var.a;
            if (!list2.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (((hx8) obj).a.a == d6c.c) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = l6d.Z(l6d.Z(new at(2, list), new g27(20)), new kl6(1, arrayList)).iterator();
                if (!it.hasNext()) {
                    return wz4Var;
                }
                v5c v5cVar = ((hx8) it.next()).a.b;
                if (!it.hasNext()) {
                    return Collections.singleton(v5cVar);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(v5cVar);
                while (it.hasNext()) {
                    linkedHashSet.add(((hx8) it.next()).a.b);
                }
                return linkedHashSet;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((hx8) obj2).a.a == d6c.c) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(z53.S(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((hx8) it2.next()).a.b);
        }
        return x53.H0(arrayList3);
    }

    public static void c(ArrayList arrayList, c6c c6cVar) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (tpa.f(((hx8) it.next()).a, c6cVar)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        hx8 hx8Var = (hx8) arrayList.get(i);
        int i2 = hx8Var.b;
        if (i2 == 1) {
            arrayList.remove(i);
        } else {
            arrayList.set(i, new hx8(hx8Var.a, i2 - 1));
        }
    }

    public final au8 b() {
        return (au8) this.a.getValue();
    }

    public final void d(Long l, cu8 cu8Var, Set set, boolean z) {
        hm9.m("lx8", ey8.j("reactions, offline, messageServerId = %d,  reactionsDiff = %s, reactionsChanged = ", z), Long.valueOf(cu8Var.b), set);
        ((av0) this.c.getValue()).c(new l6f(l.longValue(), cu8Var.b, set, z));
    }

    public final e5f e(long j, long j2, c6c c6cVar) {
        cu8 cu8VarQ;
        List list;
        e52 e52Var = (e52) ((jz2) ((iy2) this.b.getValue())).m(j).a.getValue();
        e5f e5fVar = e5f.a;
        if (e52Var == null || (cu8VarQ = b().q(j2)) == null) {
            return e5fVar;
        }
        if (cu8VarQ.v0 == vx8.DELETED) {
            return e5fVar;
        }
        ix8 ix8Var = cu8VarQ.S0;
        int i = ix8Var != null ? ix8Var.b : 0;
        c6c c6cVar2 = ix8Var != null ? ix8Var.c : null;
        ArrayList arrayList = (ix8Var == null || (list = ix8Var.a) == null) ? new ArrayList() : new ArrayList(list);
        hm9.m("lx8", "reactions, offline, updateMessageYourReaction, current: totalCount = %d, yourReaction = %s, reactions = %s", new Integer(i), c6cVar2, arrayList);
        if (tpa.f(c6cVar2, c6cVar)) {
            hm9.n("lx8", "reactions, offline, cancel case");
            c(arrayList, c6cVar2);
            int i2 = i - 1;
            i = i2 >= 0 ? i2 : 0;
            c6cVar = null;
        } else {
            hm9.n("lx8", "reactions, offline, add case");
            if (c6cVar2 != null) {
                c(arrayList, c6cVar2);
                i--;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (tpa.f(((hx8) it.next()).a, c6cVar)) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                arrayList.add(new hx8(c6cVar, 1));
            } else {
                hx8 hx8Var = (hx8) arrayList.get(i);
                arrayList.set(i, new hx8(hx8Var.a, hx8Var.b + 1));
            }
            i = i + 1;
        }
        c63.U(arrayList, e);
        ix8 ix8Var2 = new ix8(arrayList, i, c6cVar);
        hm9.n("lx8", "reactions, offline, newReactionsData = " + ix8Var2);
        b().h(Collections.singletonMap(new Long(cu8VarQ.c), ix8Var2));
        d(new Long(e52Var.a), cu8VarQ, a(ix8Var, ix8Var2), tpa.f(ix8Var2, ix8Var) ^ true);
        return e5fVar;
    }

    public final void f(long j, Map map) {
        je7 je7Var;
        List listE0 = x53.e0(b().k(j, map.keySet()));
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) listE0).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((cu8) next).v0 != vx8.DELETED) {
                arrayList.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            je7Var = this.d;
            if (!zHasNext) {
                break;
            }
            cu8 cu8Var = (cu8) it2.next();
            jx8 jx8Var = (jx8) je7Var.getValue();
            fx8 fx8Var = (fx8) map.get(Long.valueOf(cu8Var.c));
            jx8Var.getClass();
            ix8 ix8Var = null;
            if (fx8Var != null) {
                List<cx8> list = fx8Var.a;
                ArrayList arrayList2 = new ArrayList(z53.S(list, 10));
                for (cx8 cx8Var : list) {
                    arrayList2.add(new hx8(jx8Var.d(cx8Var.a), cx8Var.b));
                }
                bx8 bx8Var = fx8Var.c;
                ix8Var = new ix8(arrayList2, fx8Var.b, bx8Var != null ? jx8Var.d(bx8Var) : null);
            }
            ix8 ix8Var2 = cu8Var.S0;
            if (!tpa.f(ix8Var2, ix8Var)) {
                linkedHashMap.put(Long.valueOf(cu8Var.b), a(ix8Var2, ix8Var));
            }
        }
        b().h(((jx8) je7Var.getValue()).c(map));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            cu8 cu8Var2 = (cu8) it3.next();
            Set set = (Set) linkedHashMap.get(Long.valueOf(cu8Var2.b));
            if (set != null) {
                d(Long.valueOf(j), cu8Var2, set, false);
                g(Long.valueOf(j), cu8Var2, set, false);
            }
        }
    }

    public final void g(Long l, cu8 cu8Var, Set set, boolean z) {
        hm9.m("lx8", "reactions, offline, messageServerId = %d,  reactionsDiff = %s", Long.valueOf(cu8Var.b), set);
        ((av0) this.c.getValue()).c(new xp9(l.longValue(), z, cu8Var.b, cu8Var.o, set));
    }
}
