package defpackage;

import one.me.stickerssettings.StickersSettingsScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class m6e implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersSettingsScreen b;

    public /* synthetic */ m6e(StickersSettingsScreen stickersSettingsScreen, int i) {
        this.a = i;
        this.b = stickersSettingsScreen;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = StickersSettingsScreen.Y;
                this.b.getRouter().C();
                break;
            case 1:
                StickersSettingsScreen stickersSettingsScreen = this.b;
                bc7[] bc7VarArr2 = StickersSettingsScreen.Y;
                w6e w6eVarM0 = stickersSettingsScreen.m0();
                int iG = ((dec) obj).g();
                String name = w6e.class.getName();
                ir6 ir6Var = hm9.m;
                if (ir6Var != null) {
                    w6eVarM0.getClass();
                    if (ir6Var.c()) {
                        ir6Var.d(us7.X, name, "Move finish. moved:" + w6eVarM0.t0 + ", target:" + w6eVarM0.v0, null);
                    }
                }
                Long l = w6eVarM0.t0;
                Long l2 = w6eVarM0.v0;
                if (l == null || l2 == null || w6eVarM0.u0 == -1 || w6eVarM0.u0 == iG) {
                    w6eVarM0.u0 = -1;
                    w6eVarM0.t0 = null;
                    w6eVarM0.v0 = null;
                } else {
                    w6eVarM0.u0 = -1;
                    w6eVarM0.t0 = null;
                    w6eVarM0.v0 = null;
                    w6eVarM0.w0.o1(w6eVarM0, w6e.B0[0], j47.S(w6eVarM0.a, ((w9a) w6eVarM0.c).b(), vx3.b, new u6e(w6eVarM0, l, l2, null)));
                }
                break;
            case 2:
                y0d y0dVar = (y0d) obj;
                bc7[] bc7VarArr3 = StickersSettingsScreen.Y;
                w6e w6eVarM02 = this.b.m0();
                w6eVarM02.getClass();
                boolean z = y0dVar instanceof w0d;
                s35 s35Var = w6eVarM02.s0;
                if (z) {
                    l6e.c.getClass();
                    wg0.k(":stickers/set?set_id=" + ((w0d) y0dVar).a, s35Var);
                } else if (y0dVar instanceof x0d) {
                    pnf.o(s35Var, ((x0d) y0dVar).b);
                }
                break;
            case 3:
                y0d y0dVar2 = (y0d) obj;
                bc7[] bc7VarArr4 = StickersSettingsScreen.Y;
                w6e w6eVarM03 = this.b.m0();
                w6eVarM03.getClass();
                if (y0dVar2 instanceof w0d) {
                    kl7 kl7VarL = j1e.l();
                    int i = gja.k;
                    eqe eqeVar = new eqe(hja.n);
                    Integer numValueOf = Integer.valueOf(woc.Z1);
                    int i2 = wfa.S;
                    kl7VarL.add(new tt3(i, eqeVar, numValueOf, Integer.valueOf(i2), 4));
                    kl7VarL.add(new tt3(gja.l, new eqe(hja.o), Integer.valueOf(yfa.y), Integer.valueOf(i2), 4));
                    kl7VarL.add(new tt3(gja.i, new eqe(hja.f), Integer.valueOf(woc.t), Integer.valueOf(i2), 4));
                    kl7VarL.add(new tt3(gja.j, new eqe(hja.m), Integer.valueOf(woc.w), Integer.valueOf(wfa.P), 4));
                    kl7 kl7VarD = j1e.d(kl7VarL);
                    w6eVarM03.x0 = Long.valueOf(((w0d) y0dVar2).a);
                    pnf.o(w6eVarM03.Z, new ted(kl7VarD));
                }
                break;
            default:
                dec decVar = (dec) obj;
                bc7[] bc7VarArr5 = StickersSettingsScreen.Y;
                pag.F(decVar.a, ni6.LONG_PRESS);
                f77 f77Var = this.b.o;
                if (f77Var != null) {
                    f77Var.t(decVar);
                }
                break;
        }
        return e5f.a;
    }
}
