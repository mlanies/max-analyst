package defpackage;

/* loaded from: classes2.dex */
public final class i3e extends pnf {
    public static final /* synthetic */ bc7[] H0 = {new oi9(i3e.class, "loadStickerJob", "getLoadStickerJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, i3e.class, "loadChatTitleJob", "getLoadChatTitleJob()Lkotlinx/coroutines/Job;"), new oi9(i3e.class, "markFavoriteJob", "getMarkFavoriteJob()Lkotlinx/coroutines/Job;"), new oi9(i3e.class, "markStickerSetFavoriteJob", "getMarkStickerSetFavoriteJob()Lkotlinx/coroutines/Job;")};
    public final w7c A0;
    public final q0e B0;
    public final w7c C0;
    public final w4d D0;
    public final w4d E0;
    public final w4d F0;
    public final w4d G0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final long b;
    public final kke c;
    public final je7 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final s35 v0 = new s35(0);
    public final s35 w0 = new s35(0);
    public final q0e x0;
    public final w7c y0;
    public final q0e z0;

    public i3e(long j, kke kkeVar, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7) {
        this.b = j;
        this.c = kkeVar;
        this.o = je7Var;
        this.X = je7Var2;
        this.Y = je7Var3;
        this.Z = je7Var4;
        this.s0 = je7Var5;
        this.t0 = je7Var6;
        this.u0 = je7Var7;
        q0e q0eVarA = r0e.a(null);
        this.x0 = q0eVarA;
        this.y0 = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a("");
        this.z0 = q0eVarA2;
        this.A0 = new w7c(q0eVarA2);
        q0e q0eVarA3 = r0e.a(null);
        this.B0 = q0eVarA3;
        this.C0 = new w7c(q0eVarA3);
        this.D0 = mqd.D();
        this.E0 = mqd.D();
        this.F0 = mqd.D();
        this.G0 = mqd.D();
    }

    public final void q(Long l) {
        z2e z2eVar = (z2e) this.x0.getValue();
        if (z2eVar != null) {
            long j = z2eVar.b;
            if (j != 0) {
                kq1 kq1VarC = c37.c(((a4e) this.X.getValue()).b(j));
                sc5 sc5Var = (sc5) this.Z.getValue();
                sc5Var.getClass();
                c10 c10Var = new c10(j, 15);
                ml0 ml0Var = sc5Var.s0;
                ml0Var.getClass();
                od2.L(od2.F(new zn5(new j31(kq1VarC, c37.c(new e0a(ml0Var, c10Var, 1)), d3e.s0, 4), new e3e(this, l, null), 5), ((w9a) this.c).b()), this.a);
                return;
            }
        }
        hm9.n(i3e.class.getName(), "Can't load sticker set because we haven't selected sticker or setId");
    }

    public final z2e r(d2e d2eVar, boolean z, Long l) {
        String str = d2eVar.s0;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            str = d2eVar.o;
        }
        String str2 = str;
        boolean z2 = l != null && l.longValue() == d2eVar.a;
        String str3 = ((se5) ((qe5) this.u0.getValue())).w() ? d2eVar.z0 : null;
        int i = d2eVar.c;
        long j = d2eVar.a;
        long j2 = d2eVar.v0;
        return new z2e(j, j2, j2, str2, d2eVar.w0, str3, d2eVar.b, i, z, z2, 0L, 4672);
    }

    public final void s(long j) {
        z2e z2eVar = (z2e) this.y0.a.getValue();
        if (z2eVar == null || z2eVar.a != j) {
            vxd vxdVarS = j47.S(this.a, ((w9a) this.c).b(), vx3.b, new f3e(this, j, null));
            this.D0.o1(this, H0[0], vxdVarS);
        }
    }
}
