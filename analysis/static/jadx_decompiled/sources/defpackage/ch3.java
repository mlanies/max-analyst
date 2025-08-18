package defpackage;

/* loaded from: classes2.dex */
public final class ch3 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public ch3(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
    }

    public final gh3 a() {
        return (gh3) this.c.getValue();
    }

    public final ri4 b() {
        return (ri4) this.b.getValue();
    }

    public final boolean c() {
        boolean z = !a().a() && !(e() && b().d() && b().c()) && d();
        hm9.m("ch3", "isBackgroundDataDisabledAndOnMobileNetwork: %b, isOnline=%b, appIsVisible=%b, hasForegroundServicesAlive=%b, isOnMobileNetwork=%b", Boolean.valueOf(z), Boolean.valueOf(e()), Boolean.valueOf(b().d()), Boolean.valueOf(b().c()), Boolean.valueOf(d()));
        return z;
    }

    public final boolean d() {
        return (a().b() == zh3.c || a().b() == zh3.b) ? false : true;
    }

    public final boolean e() {
        return ((jbd) ((hbd) this.d.getValue())).h == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch3.f():boolean");
    }
}
