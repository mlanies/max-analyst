package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class md5 {
    public final rm4 a;
    public final rm4 b;
    public final rm4 c;
    public final rm4 d;
    public final rm4 e;
    public final rm4 f;
    public final rm4 g;
    public final hc3 h = new hc3();
    public final xpb i = new xpb();
    public final ml0 j = ml0.z(Collections.emptyList());

    public md5(rm4 rm4Var, rm4 rm4Var2, rm4 rm4Var3, rm4 rm4Var4, rm4 rm4Var5, rm4 rm4Var6, rm4 rm4Var7) {
        this.a = rm4Var;
        this.b = rm4Var2;
        this.c = rm4Var3;
        this.d = rm4Var4;
        this.e = rm4Var5;
        this.f = rm4Var6;
        this.g = rm4Var7;
    }

    public final e0a a() {
        ml0 ml0Var = this.j;
        ml0Var.getClass();
        return new e0a(new mz9(ml0Var, 0), new nc5(23), 3);
    }

    public final void b(long j) {
        int i = 2;
        int i2 = 5;
        hm9.m("md5", "loadFromMarker: marker=%d", Long.valueOf(j));
        hd5 hd5Var = (hd5) this.g.get();
        hd5Var.getClass();
        drd drdVarK = ((k4a) hd5Var.a).K(new au(0, "FAVORITE_STICKERS", j, 50, (String) null), hd5Var.c);
        fme fmeVar = hd5Var.b;
        fmeVar.getClass();
        za3 za3VarK = new qa3(new rqd(drdVarK.j(new dme(fmeVar, 1, 0)).h(new gd1(12, gu.class)).h(new nc5(16)), new kd5(this, i2), i).h(new nc5(24)), i, new kd5(this, 6)).k((ztc) this.d.get());
        iq1 iq1Var = new iq1(new c10(j, 22), 0, new mc5(j, i2));
        za3VarK.i(iq1Var);
        this.h.a(iq1Var);
    }

    public final void c() {
        hm9.n("md5", "reloadFavoritesFromServer: ");
        ((hyc) ((q33) this.e.get())).l("user.favoritesLastSync", 0L);
        hd5 hd5Var = (hd5) this.g.get();
        hd5Var.getClass();
        hm9.m("hd5", "assetsUpdate: request, sync=%d", 0L);
        za3 za3VarK = new qa3(hd5Var.e.a(y53.M(iua.S0, iua.U0, iua.V0, iua.T0)), 0, new sa3(1, new i82(hd5Var))).k(hd5Var.c);
        iq1 iq1Var = new iq1(new c10(), 0, new mc5());
        za3VarK.i(iq1Var);
        hd5Var.g.a(iq1Var);
    }

    public final db3 d(List list) {
        hm9.m("md5", "removeFromFavorites: ids=%s", list);
        return new qa3(new qa3(((hc5) this.a.get()).a(), 2, new z72(8, list)), 0, e(nd7.j(list))).f(new ic5(3, list)).g(new z72(16, list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final za3 e(long[] jArr) {
        hm9.m("md5", "removeFromFavorites: stickerIds=%s", jArr);
        hd5 hd5Var = (hd5) this.g.get();
        hd5Var.getClass();
        return new qa3(new oqd(new bd5(hd5Var, jArr, 1), 0).h(new gd1(12, pu.class)), 2, new nc5(17)).k(hd5Var.d);
    }

    public final void f(long j) {
        hm9.m("md5", "setSectionUpdateTime: %d", Long.valueOf(j));
        ((hyc) ((q33) this.e.get())).l("user.favorites.stickers.updateTime", Long.valueOf(j));
    }
}
