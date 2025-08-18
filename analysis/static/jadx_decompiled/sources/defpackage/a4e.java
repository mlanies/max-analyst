package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class a4e implements qu7 {
    public final ztc X;
    public final fme Y;
    public final c4e a;
    public final e4e b;
    public final pk c;
    public final ztc o;

    public a4e(c4e c4eVar, e4e e4eVar, pk pkVar, ztc ztcVar, ztc ztcVar2, fme fmeVar) {
        this.a = c4eVar;
        this.b = e4eVar;
        this.c = pkVar;
        this.o = ztcVar;
        this.X = ztcVar2;
        this.Y = fmeVar;
    }

    public static q3e e(n3e n3eVar) {
        long j = n3eVar.a;
        k3e k3eVar = new k3e();
        k3eVar.a = j;
        k3eVar.b = n3eVar.b;
        k3eVar.c = n3eVar.c;
        k3eVar.d = n3eVar.d;
        k3eVar.e = n3eVar.e;
        k3eVar.f = n3eVar.f;
        k3eVar.g = n3eVar.g;
        k3eVar.h = n3eVar.h;
        k3eVar.i = n3eVar.i;
        return new q3e(k3eVar);
    }

    @Override // defpackage.qu7
    public final void a() throws InterruptedException {
        hm9.n("a4e", "clear: ");
        nd7.U(new qa3(this.a.a.n().h(new m2e(21)), 2, new m2e(17)).l(), ft.e, new m2e(13), new fa4(11));
    }

    public final s1a b(long j) {
        i28 i28Var = new i28(new f38[]{new s28(this.a.a(new long[]{j}), new m2e(18), 0), new o28(d(Collections.singletonList(Long.valueOf(j))), 2, new m2e(15))}, 0);
        x3e x3eVar = new x3e(this, 2);
        hm9.j0(2, "prefetch");
        return new mz9(new hb3(5, new dr5(i28Var, x3eVar)), 0).r(this.X);
    }

    public final uqd c(List list) {
        int i = 2;
        int i2 = 1;
        return new q28(new uqd(new ib3(this.a.a(nd7.j(list)), i2, new q1a(2, new ae(1))), new y3e(this, list, i2), 0), new jj9(i), 3).f(new x3e(this, i)).w(new eme(list, new m2e(16)));
    }

    public final drd d(List list) {
        int i = 0;
        int i2 = 2;
        hm9.m("a4e", "getStickersSetsFromNetwork: %s", list);
        int i3 = 3;
        au auVar = new au(3, nd7.j(list));
        k4a k4aVar = (k4a) this.c;
        ztc ztcVar = this.o;
        rqd rqdVar = new rqd(new e0a(new q28(k4aVar.K(auVar, ztcVar).h(new gd1(12, eu.class)).h(new m2e(14)), new jj9(i2), i3), new x3e(this, i), i3).v(), new x3e(this, 1), i2);
        fme fmeVar = this.Y;
        fmeVar.getClass();
        return rqdVar.j(new dme(fmeVar, i2, i)).m(ztcVar);
    }
}
