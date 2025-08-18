package defpackage;

/* loaded from: classes2.dex */
public final class wc7 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public volatile boolean e;

    public wc7(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        o2e o2eVar = (o2e) this.a.getValue();
        o2eVar.getClass();
        cqc.a(new j2e(o2eVar, 1), o2eVar.h, null, new m2e(8), null);
        md5 md5Var = (md5) this.b.getValue();
        md5Var.getClass();
        s1a s1aVarR = new iz9(new ld5(0, md5Var), 0).r((ztc) md5Var.d.get());
        rm4 rm4Var = md5Var.c;
        r0a r0aVarN = s1aVarR.n((ztc) rm4Var.get());
        kd5 kd5Var = new kd5(md5Var, 1);
        nc5 nc5Var = new nc5(19);
        r66 r66Var = ft.d;
        r0aVarN.a(new sd7(kd5Var, nc5Var, r66Var));
        r0a r0aVarN2 = md5Var.i.n((ztc) rm4Var.get());
        nc5 nc5Var2 = new nc5(20);
        kj6 kj6Var = ft.e;
        new oz9(r0aVarN2, nc5Var2, kj6Var, r66Var).f(new kd5(md5Var, 2)).a(new sd7(new kd5(md5Var, 3), new nc5(21), r66Var));
        sc5 sc5Var = (sc5) this.c.getValue();
        q28 q28Var = new q28(sc5Var.b(), new ta4(27), 3);
        je7 je7Var = sc5Var.o;
        q28Var.r((ztc) je7Var.getValue()).n((ztc) je7Var.getValue()).a(new sd7(new kc5(sc5Var, 1), new ta4(28), r66Var));
        new oz9(sc5Var.Z.n((ztc) je7Var.getValue()), new ta4(29), kj6Var, r66Var).f(new kc5(sc5Var, 2)).a(new sd7(new kc5(sc5Var, 3), new nc5(0), r66Var));
    }
}
