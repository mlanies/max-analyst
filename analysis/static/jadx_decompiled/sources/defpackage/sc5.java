package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class sc5 implements qu7 {
    public final je7 X;
    public final je7 Y;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final xpb Z = new xpb();
    public final ml0 s0 = ml0.z(Collections.emptyList());
    public final hc3 t0 = new hc3();

    public sc5(je7 je7Var, je7 je7Var2, je7 je7Var3, khe kheVar, khe kheVar2, je7 je7Var4) {
        this.a = je7Var;
        this.b = je7Var2;
        this.Y = je7Var3;
        this.c = kheVar;
        this.o = kheVar2;
        this.X = je7Var4;
    }

    @Override // defpackage.qu7
    public final void a() throws InterruptedException {
        int i = 2;
        hm9.n("sc5", "clear: ");
        dd5 dd5Var = (dd5) this.Y.getValue();
        dd5Var.getClass();
        hm9.n("dd5", "cancelRequests: ");
        dd5Var.f.clear();
        dd5Var.g.d();
        this.t0.d();
        nd7.U(new qa3(b(), i, new nc5(4)).l(), ft.e, new nc5(5), new fa4(i));
        this.s0.e(Collections.emptyList());
    }

    public final q1a b() {
        je7 je7Var = this.a;
        Objects.requireNonNull(je7Var);
        return new q1a(2, new l5(4, je7Var));
    }

    public final void c(long j) {
        int i = 2;
        int i2 = 12;
        int i3 = 1;
        hm9.m("sc5", "loadFromMarker: marker=%d", Long.valueOf(j));
        dd5 dd5Var = (dd5) this.Y.getValue();
        dd5Var.getClass();
        drd drdVarK = ((k4a) dd5Var.a).K(new au(0, "FAVORITE_STICKER_SETS", j, 50, (String) null), dd5Var.c);
        fme fmeVar = dd5Var.b;
        fmeVar.getClass();
        rqd rqdVar = new rqd(drdVarK.j(new dme(fmeVar, i3, 0)).h(new gd1(i2, gu.class)).h(new nc5(i2)), new kc5(this, 5), i);
        int i4 = 6;
        za3 za3VarK = new qa3(rqdVar.h(new nc5(i4)), i, new kc5(this, i4)).k((ztc) this.o.getValue());
        iq1 iq1Var = new iq1(new c10(j, 17), 0, new mc5(j, i3));
        za3VarK.i(iq1Var);
        this.t0.a(iq1Var);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Serializable, long[]] */
    public final db3 d(long j, boolean z) {
        za3 za3VarK;
        int i = 12;
        int i2 = 1;
        int i3 = 2;
        int i4 = 0;
        hm9.m("sc5", "markAsFavorite: setId=%d, favorite=%b", Long.valueOf(j), Boolean.valueOf(z));
        qa3 qa3Var = new qa3(z ? new qa3(new uqd(b(), new nc5(3), 0), i3, new kc5(this, 4)) : wa3.a, i4, new qa3(b(), i3, new bc5(i2, j, z)));
        je7 je7Var = this.Y;
        if (z) {
            dd5 dd5Var = (dd5) je7Var.getValue();
            dd5Var.getClass();
            za3VarK = new qa3(new oqd(new zc5(dd5Var, j, i4), i4).h(new gd1(i, cu.class)), i3, new nc5(13)).k(dd5Var.d);
        } else {
            dd5 dd5Var2 = (dd5) je7Var.getValue();
            dd5Var2.getClass();
            za3VarK = new qa3(new oqd(new bd5(dd5Var2, new long[]{j}, i4), i4).h(new gd1(i, pu.class)), i3, new nc5(15)).k(dd5Var2.d);
        }
        return new qa3(qa3Var, i4, za3VarK).f(new oc5(i4, j, z)).g(new bc5(i3, j, z));
    }

    public final void e(ArrayList arrayList) {
        List listEmptyList;
        RuntimeException runtimeException;
        List list = (List) this.s0.A();
        if (nd7.D(list)) {
            return;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                try {
                    if (arrayList.contains(Long.valueOf(((m3e) obj).a))) {
                        arrayList2.add(obj);
                    }
                } finally {
                }
            }
            listEmptyList = arrayList2;
        }
        if (!listEmptyList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    arrayList3.add(Long.valueOf(((m3e) it.next()).a));
                } finally {
                }
            }
            this.Z.e(arrayList3);
        }
    }

    public final void f() {
        hm9.n("sc5", "reloadFavoritesFromServer: ");
        ((hyc) ((zle) this.X.getValue()).a).l("user.favoritesLastSync", 0L);
        h(0L);
    }

    public final void g(long j) {
        hm9.m("sc5", "setSectionUpdateTime: %d", Long.valueOf(j));
        ((hyc) ((zle) this.X.getValue()).a).l("user.favorites.stickerSets.updateTime", Long.valueOf(j));
    }

    public final void h(long j) {
        int i = 2;
        dd5 dd5Var = (dd5) this.Y.getValue();
        dd5Var.getClass();
        hm9.m("dd5", "assetsUpdate: request, sync=%d", Long.valueOf(j));
        za3 za3VarK = new qa3(dd5Var.e.a(y53.M(iua.S0, iua.U0, iua.V0, iua.T0)), 0, new sa3(1, new i82(dd5Var, j, i))).k(dd5Var.c);
        iq1 iq1Var = new iq1(new c10(j, 18), 0, new mc5(j, i));
        za3VarK.i(iq1Var);
        dd5Var.g.a(iq1Var);
    }

    public final void i() {
        long j = ((hyc) ((zle) this.X.getValue()).a).g.getLong("user.favoritesLastSync", 0L);
        hm9.m("sc5", "updateFavoritesFromServerFromLastSync: last sync =%d", Long.valueOf(j));
        h(j);
    }
}
