package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class o2e implements e4e {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final rm4 c;
    public final m7b d;
    public final rm4 e;
    public final rm4 f;
    public final ztc g;
    public final ztc h;
    public final rm4 i;
    public final rm4 j;
    public iq1 k;
    public final ml0 l;

    public o2e(rm4 rm4Var, m7b m7bVar, rm4 rm4Var2, rm4 rm4Var3, ztc ztcVar, ztc ztcVar2, rm4 rm4Var4, rm4 rm4Var5) {
        new ConcurrentHashMap();
        this.l = ml0.z(Collections.emptyList());
        this.c = rm4Var;
        this.d = m7bVar;
        this.e = rm4Var2;
        this.f = rm4Var3;
        this.g = ztcVar;
        this.h = ztcVar2;
        this.i = rm4Var4;
        this.j = rm4Var5;
    }

    public final e0a a() {
        return new e0a(((x9c) this.j.get()).b().a(Collections.singletonList(t9c.STICKER)), new k2e(this, 0), 3);
    }

    public final uqd b(List list) {
        int i = 0;
        int i2 = 3;
        hm9.m("o2e", "getStickersByIds: ids count=%d", Integer.valueOf(list.size()));
        return new q28(new uqd(new e0a(new ty9(qy9.j(this.a.entrySet()), new z72(24, list), 1), new p4c(28), i2).v(), new l2e(this, list, i), i), new jj9(2), i2).w(new eme(list, new p4c(26)));
    }

    public final ArrayList c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            l.getClass();
            if (((d2e) this.a.get(l)) == null) {
                arrayList.add(l);
            }
        }
        return arrayList;
    }

    public final drd d(List list) {
        hm9.m("o2e", "loadNetworkStickers: %s", list);
        nd7.O(list);
        q28 q28VarF = qy9.j(nd7.T(list)).f(new k2e(this, 1));
        ArrayList arrayList = new ArrayList();
        return new yy9(q28VarF, new t66(arrayList), new m2e(0)).m(this.g);
    }

    public final synchronized void e(List list) {
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d2e d2eVar = (d2e) it.next();
                this.a.put(Long.valueOf(d2eVar.a), d2eVar);
            }
            cqc.a(new p00(this, 12, list), this.h, null, new m2e(4), null);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f() {
        if (!pag.K(((kk5) ((zi5) this.e.get())).p(), this.b)) {
            hm9.n("o2e", "Failed to store initial showcase");
        }
    }

    public final void g(List list) {
        ConcurrentHashMap concurrentHashMap;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            concurrentHashMap = this.b;
            if (!zHasNext) {
                break;
            }
            r0d r0dVar = (r0d) it.next();
            Iterator it2 = concurrentHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                if (((String) ((Map.Entry) it2.next()).getKey()).equals(r0dVar.b)) {
                    it2.remove();
                }
            }
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            r0d r0dVar2 = (r0d) it3.next();
            int i = r0dVar2.a;
            String str = r0dVar2.b;
            if (i == 3) {
                if (!((d4e) r0dVar2).c.isEmpty()) {
                    concurrentHashMap.put(str, r0dVar2);
                }
            } else if (i == 2 && !((r5e) r0dVar2).c.isEmpty()) {
                concurrentHashMap.put(str, r0dVar2);
            }
        }
        this.l.e(concurrentHashMap.values());
    }

    public final void h(List list) {
        int i = 0;
        hm9.n("o2e", "Update recent section");
        for (int i2 = 0; i2 < list.size(); i2++) {
            r0d r0dVar = (r0d) list.get(i2);
            if ("RECENT".equals(r0dVar.b) && r0dVar.a == 4) {
                cqc.b(this.k);
                x9c x9cVar = (x9c) this.j.get();
                x9cVar.getClass();
                List list2 = ((y9c) r0dVar).c;
                hm9.m("x9c", "Replace recents. New size = %d", Integer.valueOf(list2.size()));
                p9c p9cVarB = x9cVar.b();
                za3 za3VarK = new qa3(p9cVarB.b(), 2, new o9c(p9cVarB, (ArrayList) list2, i)).k(this.h);
                iq1 iq1Var = new iq1(new m2e(7), 0, new fa4(9));
                za3VarK.i(iq1Var);
                this.k = iq1Var;
                return;
            }
        }
    }
}
