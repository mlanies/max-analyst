package defpackage;

import android.database.Cursor;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class el3 implements ava {
    public static final EnumSet r;
    public static final Set s;
    public static final xs t;
    public static final Set u;
    public static final Set v;
    public final rm4 f;
    public final av0 g;
    public final m7b h;
    public final rm4 i;
    public final rm4 j;
    public final rm4 k;
    public final rm4 l;
    public final ztc m;
    public final iye n;
    public final rm4 o;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    public final Object d = new Object();
    public volatile boolean e = false;
    public final CopyOnWriteArraySet p = new CopyOnWriteArraySet();
    public ds3 q = null;

    static {
        ol3 ol3Var = ol3.b;
        ol3 ol3Var2 = ol3.a;
        r = EnumSet.of(ol3Var, ol3Var2);
        s = Collections.singleton(ol3Var2);
        nl3 nl3Var = nl3.b;
        nl3 nl3Var2 = nl3.a;
        t = ay7.d(null, nl3Var, nl3Var2);
        u = Collections.singleton(nl3Var2);
        v = Collections.singleton(nl3Var);
    }

    public el3(rm4 rm4Var, av0 av0Var, m7b m7bVar, rm4 rm4Var2, rm4 rm4Var3, rm4 rm4Var4, rm4 rm4Var5, ztc ztcVar, iye iyeVar, rm4 rm4Var6) {
        this.f = rm4Var;
        this.g = av0Var;
        this.h = m7bVar;
        this.i = rm4Var2;
        this.j = rm4Var3;
        this.k = rm4Var4;
        this.l = rm4Var5;
        this.m = ztcVar;
        this.n = iyeVar;
        this.o = rm4Var6;
    }

    @Override // defpackage.ava
    public final void a(ArrayList arrayList) {
        hm9.n("ContactController", "onPhonebookUpdated");
        y(arrayList);
    }

    public final void b() {
        if (this.e) {
            return;
        }
        synchronized (this.d) {
            try {
                if (!this.e) {
                    n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final uj3 c(long j, qj3 qj3Var) {
        b();
        uj3 uj3VarI = i(j, false);
        if (uj3VarI == null) {
            ((cba) ((o45) this.i.get())).c(new HandledException("contact is null"), true);
            return null;
        }
        ql3 ql3Var = uj3VarI.a;
        hl3 hl3VarC = ql3Var.c.c();
        try {
            qj3Var.accept(hl3VarC);
            pl3 pl3VarA = hl3VarC.a();
            uj3 uj3Var = new uj3(new ql3(ql3Var.b, pl3VarA), pl3VarA.a == ((p7b) this.h).a.t(), (ida) this.j.get());
            q(j, uj3Var, false, true);
            wv7 wv7Var = new wv7(1);
            wv7Var.f(j, uj3Var);
            f(wv7Var);
            return uj3Var;
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public final void d(long j, String str, String str2) {
        p7b p7bVar = (p7b) this.h;
        p7bVar.a.m("user.deviceAvatarPath", null);
        long jT = p7bVar.a.t();
        c(jT, new x72(str, str2, j, 3));
        this.g.c(new ps3(jT));
    }

    public final void e() {
        if (this.e && !this.a.isEmpty()) {
            for (uj3 uj3Var : this.a.values()) {
                uj3Var.b = null;
                uj3Var.c = null;
                uj3Var.o = null;
            }
            this.g.c(new ps3(this.a.keySet()));
        }
    }

    public final void f(wv7 wv7Var) {
        ds3 ds3Var = this.q;
        if (ds3Var == null || wv7Var.h() == 0) {
            return;
        }
        int iH = wv7Var.h();
        for (int i = 0; i < iH; i++) {
            long jE = wv7Var.e(i);
            uj3 uj3Var = (uj3) wv7Var.i(i);
            if (jE > 0) {
                ((ti9) ds3Var.e.computeIfAbsent(Long.valueOf(jE), new di(8, new nq2(ds3Var, jE, 1)))).setValue(uj3Var);
            }
        }
    }

    public final boolean g(long j) {
        uj3 uj3VarI = i(j, false);
        return uj3VarI != null && uj3VarI.c();
    }

    public final uj3 h(long j, boolean z) {
        uj3 uj3Var = (uj3) this.a.get(Long.valueOf(j));
        if (uj3Var != null || !z) {
            return uj3Var;
        }
        uj3 uj3VarB = uj3.b(j, ((p7b) this.h).a.n(), (ida) this.j.get());
        q(j, uj3VarB, true, true);
        return uj3VarB;
    }

    public final uj3 i(long j, boolean z) {
        uj3 uj3Var;
        if (j > 0 && ((uj3Var = (uj3) this.a.get(Long.valueOf(j))) == null || uj3Var.a.b == 0 || uj3Var.w())) {
            b();
        }
        return h(j, z);
    }

    public final List j(Set set, Set set2) {
        uj3 uj3VarI = i(((p7b) this.h).a.t(), false);
        ArrayList arrayList = null;
        for (uj3 uj3Var : this.a.values()) {
            if (uj3VarI != null && uj3Var != uj3VarI && set.contains(uj3Var.a.c.k) && (set2 == null || set2.contains(uj3Var.a.c.i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(uj3Var);
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public final List k() {
        return j(s, null);
    }

    public final void l() {
        b();
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap.isEmpty()) {
            return;
        }
        for (uj3 uj3Var : concurrentHashMap.values()) {
            ida idaVar = (ida) this.j.get();
            boolean z = uj3Var.b != null;
            boolean z2 = uj3Var.c != null;
            boolean z3 = uj3Var.o != null;
            uj3Var.b = null;
            uj3Var.c = null;
            uj3Var.o = null;
            if (z) {
                uj3Var.b = idaVar.j.b(0, uj3Var.d());
            }
            if (z2) {
                uj3Var.l(idaVar);
            }
            if (z3) {
                uj3Var.m();
            }
        }
        this.g.c(new ps3(concurrentHashMap.keySet()));
    }

    public final boolean m(long j) {
        b();
        if (j <= 0 || j == -1) {
            return false;
        }
        m7b m7bVar = this.h;
        if (j == ((p7b) m7bVar).a.t()) {
            return false;
        }
        uj3 uj3VarH = h(j, false);
        if (i24.r(uj3VarH)) {
            return true;
        }
        if (uj3VarH.c()) {
            return false;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        p7b p7bVar = (p7b) m7bVar;
        z7d z7dVar = p7bVar.b;
        z7dVar.getClass();
        return p7bVar.a.n() - timeUnit.toMillis(z7dVar.q(PmsKey.f98noncontactsynctime, TimeUnit.HOURS.toSeconds(24L))) >= uj3VarH.a.c.s;
    }

    public final void n() {
        if (this.e) {
            return;
        }
        this.n.getClass();
        iye.a("ContactController.load()");
        hm9.n("ContactController", "contacts loading started");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.n.getClass();
        iye.a("ContactController.selectContacts()");
        wv7 wv7Var = new wv7(32);
        glc glcVar = ((k24) ((c34) this.f.get())).d;
        ir3 ir3VarH = glcVar.h();
        ir3VarH.getClass();
        xlc xlcVarA = xlc.a(0, "SELECT * FROM contacts ORDER BY presence ASC");
        ilc ilcVar = ir3VarH.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            int iN = tfg.n(cursorO, "id");
            int iN2 = tfg.n(cursorO, "server_id");
            int iN3 = tfg.n(cursorO, "presence");
            int iN4 = tfg.n(cursorO, "presence_type");
            int iN5 = tfg.n(cursorO, "data");
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                arrayList.add(new km3(cursorO.getLong(iN), cursorO.getLong(iN2), cursorO.getInt(iN3), cursorO.getInt(iN4), pl3.b(cursorO.isNull(iN5) ? null : cursorO.getBlob(iN5))));
            }
            cursorO.close();
            xlcVarA.n();
            ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                km3 km3Var = (km3) it.next();
                ConcurrentHashMap concurrentHashMap = ((d56) ((khe) glcVar.o).getValue()).a;
                long j = km3Var.a;
                pl3 pl3Var = km3Var.e;
                concurrentHashMap.put(Long.valueOf(j), Integer.valueOf(pl3Var.f.hashCode()));
                arrayList2.add(new ql3(km3Var.a, pl3Var, new r7b(km3Var.d, km3Var.c)));
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                boolean z = true;
                if (!it2.hasNext()) {
                    break;
                }
                ql3 ql3Var = (ql3) it2.next();
                long j2 = ql3Var.c.a;
                if (j2 != ((p7b) this.h).a.t()) {
                    z = false;
                }
                uj3 uj3Var = new uj3(ql3Var, z, (ida) this.j.get());
                wv7Var.f(j2, uj3Var);
                q(uj3Var.n(), uj3Var, false, false);
                w7b w7bVar = (w7b) this.k.get();
                w7bVar.getClass();
                w7bVar.d().f(uj3Var.n(), ql3Var.o);
            }
            Trace.endSection();
            this.e = true;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, "ContactController", "contacts loaded in " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms", null);
            }
            this.n.getClass();
            Trace.endSection();
            f(wv7Var);
        } catch (Throwable th) {
            cursorO.close();
            xlcVarA.n();
            throw th;
        }
    }

    public final void o(long j) {
        hm9.n("ContactController", "markAsNotFoundContact, id = " + j);
        c(j, new un0(25));
        rp3 rp3Var = new rp3(Collections.singletonList(Long.valueOf(j)));
        av0 av0Var = this.g;
        av0Var.c(rp3Var);
        av0Var.c(new ps3(j));
    }

    public final void p(ArrayList arrayList) {
        hm9.n("ContactController", "onLogin start");
        u(arrayList);
        hm9.n("ContactController", "onLogin finished");
    }

    public final void q(long j, uj3 uj3Var, boolean z, boolean z2) {
        rm4 rm4Var = this.f;
        if (z && j != 0) {
            b();
        }
        this.a.put(Long.valueOf(j), uj3Var);
        boolean zT = oag.t(uj3Var.a.c.p);
        ConcurrentHashMap concurrentHashMap = this.b;
        if (zT) {
            concurrentHashMap.remove(Long.valueOf(j));
        } else {
            concurrentHashMap.put(Long.valueOf(j), uj3Var);
        }
        if (z2 && !uj3Var.w()) {
            try {
                ((k24) ((c34) rm4Var.get())).a();
                x(uj3Var.a.b, uj3Var);
                ((k24) ((c34) rm4Var.get())).c();
            } finally {
                ((k24) ((c34) rm4Var.get())).b();
            }
        }
        Iterator it = this.p.iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
    }

    public final void r(long j, boolean z) {
        hm9.n("ContactController", "setShowBlockPanel, id = " + j + ", show = " + z);
        c(j, new cl3(z ^ true));
    }

    public final void s(List list, long[] jArr) {
        List listEmptyList;
        rm4 rm4Var = this.j;
        rm4 rm4Var2 = this.f;
        if (jArr == null || jArr.length == 0) {
            listEmptyList = Collections.emptyList();
        } else {
            xs xsVar = new xs(jArr.length);
            for (long j : jArr) {
                xsVar.add(Long.valueOf(j));
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                xsVar.remove(Long.valueOf(((wm3) it.next()).a));
            }
            listEmptyList = new ArrayList(xsVar);
        }
        List<Long> list2 = listEmptyList;
        if (!list2.isEmpty()) {
            long jN = ((p7b) this.h).a.n();
            try {
                ((k24) ((c34) rm4Var2.get())).a();
                for (Long l : list2) {
                    uj3 uj3VarI = i(l.longValue(), false);
                    if (uj3VarI == null || uj3VarI.a.b == 0) {
                        ql3 ql3Var = uj3.a(l.longValue(), jN, (ida) rm4Var.get()).a;
                        q(l.longValue(), new uj3(new ql3(((k24) ((c34) rm4Var2.get())).d.k(ql3Var.c), ql3Var.c), false, (ida) rm4Var.get()), true, true);
                    } else {
                        c(l.longValue(), new c10(jN, 13));
                    }
                    uj3 uj3VarI2 = i(l.longValue(), false);
                    if (uj3VarI2 != null) {
                        uj3VarI2.b = null;
                        uj3VarI2.c = null;
                        uj3VarI2.o = null;
                    }
                }
                ((k24) ((c34) rm4Var2.get())).c();
                ((k24) ((c34) rm4Var2.get())).b();
                rp3 rp3Var = new rp3(list2);
                av0 av0Var = this.g;
                av0Var.c(rp3Var);
                av0Var.c(new ps3(list2));
            } catch (Throwable th) {
                ((k24) ((c34) rm4Var2.get())).b();
                throw th;
            }
        }
        if (jArr == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            wm3 wm3Var = (wm3) it2.next();
            if (g(wm3Var.a)) {
                arrayList.add(wm3Var);
            } else {
                arrayList2.add(wm3Var);
            }
        }
        t(arrayList, ol3.a);
        t(arrayList2, ol3.b);
    }

    public final List t(List list, ol3 ol3Var) {
        uj3 uj3Var;
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        b();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "ContactController", "storeContactsFromServer, size = " + list.size() + ", type = " + ol3Var, null);
        }
        ((k24) ((c34) this.f.get())).a();
        long jN = ((p7b) this.h).a.n();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            z7d z7dVar = ((p7b) this.h).b;
            z7dVar.getClass();
            List<pl3> listC = s36.C(list, new v02(17, this), new v02(17, this), ol3Var, timeUnit.toMillis(z7dVar.q(PmsKey.f98noncontactsynctime, TimeUnit.HOURS.toSeconds(24L))), jN);
            wv7 wv7Var = new wv7(listC.size());
            ArrayList arrayList = new ArrayList(listC.size());
            for (pl3 pl3Var : listC) {
                uj3 uj3VarI = i(pl3Var.a, false);
                boolean z = pl3Var.a == ((p7b) this.h).a.t();
                if (uj3VarI != null) {
                    long j = uj3VarI.a.b;
                    uj3Var = j == 0 ? new uj3(new ql3(((k24) ((c34) this.f.get())).d.k(pl3Var), pl3Var), z, (ida) this.j.get()) : new uj3(new ql3(j, pl3Var), z, (ida) this.j.get());
                }
                uj3 uj3Var2 = uj3Var;
                q(uj3Var2.n(), uj3Var2, true, true);
                wv7Var.f(uj3Var2.n(), uj3Var2);
                arrayList.add(Long.valueOf(pl3Var.a));
            }
            if (ol3Var == ol3.a) {
                w(list);
            }
            ((k24) ((c34) this.f.get())).c();
            f(wv7Var);
            ((k24) ((c34) this.f.get())).b();
            return arrayList;
        } catch (Throwable th) {
            ((k24) ((c34) this.f.get())).b();
            throw th;
        }
    }

    public final void u(List list) {
        if (list.isEmpty()) {
            return;
        }
        List listT = t(list, ol3.a);
        rm4 rm4Var = this.o;
        if (rm4Var.get() != null) {
            zb2 zb2Var = (zb2) ((ta2) rm4Var.get());
            vxd vxdVar = zb2Var.H0;
            if (vxdVar != null) {
                vxdVar.cancel((CancellationException) null);
            }
            wb2 wb2Var = new wb2(zb2Var, null);
            zb2Var.H0 = j47.T(zb2Var.Z, zb2Var.Y, null, wb2Var, 2);
        }
        this.g.c(new ps3(listT));
    }

    public final void v(List list) {
        if (list.isEmpty()) {
            return;
        }
        List listT = t(list, ol3.b);
        rm4 rm4Var = this.o;
        if (rm4Var.get() != null) {
            zb2 zb2Var = (zb2) ((ta2) rm4Var.get());
            vxd vxdVar = zb2Var.H0;
            if (vxdVar != null) {
                vxdVar.cancel((CancellationException) null);
            }
            wb2 wb2Var = new wb2(zb2Var, null);
            zb2Var.H0 = j47.T(zb2Var.Z, zb2Var.Y, null, wb2Var, 2);
        }
        this.g.c(new ps3(listT));
    }

    public final void w(List list) {
        p7b p7bVar = (p7b) this.h;
        long jMax = p7bVar.a.g.getLong("user.contactsLastSync", 0L);
        int i = s36.f;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jMax = Math.max(jMax, ((wm3) it.next()).b);
        }
        p7bVar.a.l("user.contactsLastSync", Long.valueOf(jMax));
    }

    public final void x(long j, uj3 uj3Var) {
        glc glcVar = ((k24) ((c34) this.f.get())).d;
        pl3 pl3Var = uj3Var.a.c;
        ir3 ir3VarH = glcVar.h();
        ConcurrentHashMap concurrentHashMap = ((d56) ((khe) glcVar.o).getValue()).a;
        ir3VarH.getClass();
        if (pl3Var.a() && pl3Var.j == 0) {
            return;
        }
        ilc ilcVar = ir3VarH.a;
        ilcVar.b();
        th thVar = ir3VarH.c;
        q36 q36VarF = thVar.f();
        q36VarF.j(1, pl3Var.a);
        q36VarF.k(2, pl3Var.d());
        q36VarF.j(3, j);
        try {
            ilcVar.c();
            try {
                q36VarF.n();
                ilcVar.r();
                thVar.t(q36VarF);
                ir3VarH.c(pl3Var, concurrentHashMap);
            } finally {
                ilcVar.l();
            }
        } catch (Throwable th) {
            thVar.t(q36VarF);
            throw th;
        }
    }

    public final Set y(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return Collections.emptySet();
        }
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "ContactController", "updateWithPhoneBookData = " + arrayList.size(), null);
        }
        List listJ = j(r, t);
        int i = s36.f;
        HashMap map = new HashMap();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                wua wuaVar = (wua) it.next();
                Iterator it2 = listJ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        uj3 uj3Var = (uj3) it2.next();
                        if (uj3Var.o() > 0 && wuaVar.Y > 0 && uj3Var.o() == wuaVar.Y) {
                            map.put(Long.valueOf(uj3Var.n()), wuaVar);
                            break;
                        }
                    }
                }
            }
        }
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                c(((Long) entry.getKey()).longValue(), new v02(19, (wua) entry.getValue()));
            }
            this.g.c(new ps3(map.keySet()));
        }
        return map.keySet();
    }
}
