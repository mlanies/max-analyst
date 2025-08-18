package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nq0 extends pab {
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final je7 k;
    public final sj4 l;

    public nq0(long j, sx3 sx3Var) {
        super(j);
        xcb xcbVar = xcb.a;
        je7 je7VarE = xcbVar.e();
        this.f = je7VarE;
        this.g = xcbVar.c();
        this.h = xcbVar.getAccessor().d(eyd.class);
        this.i = xcbVar.getAccessor().d(afe.class);
        je7 je7VarF = xcbVar.f();
        this.j = xcbVar.getAccessor().d(y7d.class);
        this.k = tu0.r(3, new m(22));
        sj4 sj4VarA = ((ecb) xcbVar.getAccessor().c(ecb.class)).a(j);
        this.l = sj4VarA;
        od2.L(od2.F(new zn5(new ac(new t03(((ds3) je7VarE.getValue()).c(j), 11), 5, this), new lq0(2, this, nq0.class, "emitState", "emitState(Lone/me/profile/viewmodel/logic/Profile$State;)V", 4, 0), 5), ((w9a) ((kke) je7VarF.getValue())).a()), sx3Var);
        od2.L(od2.F(new zn5(new v7c(sj4VarA.d), new lq0(2, this, nq0.class, "handleProfileEvent", "handleProfileEvent(Lone/me/profile/viewmodel/logic/DialogProfileEvent;)V", 4, 1), 5), ((w9a) ((kke) je7VarF.getValue())).a()), sx3Var);
    }

    @Override // defpackage.pab
    public final Object A(Continuation continuation) {
        Long lI = i();
        e5f e5fVar = e5f.a;
        if (lI != null) {
            Object objA = ((eyd) this.h.getValue()).a(lI.longValue(), null, continuation);
            if (objA == tx3.a) {
                return objA;
            }
        }
        return e5fVar;
    }

    @Override // defpackage.pab
    public final Object B(Continuation continuation) {
        Long lI = i();
        e5f e5fVar = e5f.a;
        if (lI != null) {
            Object objA = ((afe) this.i.getValue()).a(lI.longValue(), continuation);
            if (objA == tx3.a) {
                return objA;
            }
        }
        return e5fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0262  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mab D(defpackage.uj3 r27) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq0.D(uj3):mab");
    }

    public final e52 E() {
        return ((jz2) ((iy2) this.g.getValue())).q(this.a);
    }

    @Override // defpackage.pab
    public final void d() {
        sj4 sj4Var = this.l;
        sj4Var.b.f(sj4Var);
    }

    @Override // defpackage.pab
    public final String h() {
        uj3 uj3Var = (uj3) ((ds3) this.f.getValue()).c(this.a).a.getValue();
        if (uj3Var != null) {
            return uj3Var.g();
        }
        return null;
    }

    @Override // defpackage.pab
    public final Long i() {
        e52 e52VarE = E();
        if (e52VarE != null) {
            return Long.valueOf(e52VarE.a);
        }
        return null;
    }

    @Override // defpackage.pab
    public final Long j() {
        e52 e52VarE = E();
        if (e52VarE != null) {
            return Long.valueOf(e52VarE.b.a);
        }
        return null;
    }

    @Override // defpackage.pab
    public final int k() {
        return 2;
    }

    @Override // defpackage.pab
    public final hdb l() {
        return hdb.X;
    }

    @Override // defpackage.pab
    public final Object n(Continuation continuation) {
        return ((jz2) ((iy2) this.g.getValue())).u(this.a, continuation);
    }

    @Override // defpackage.pab
    public final c64 x() {
        dp3 dp3Var = hdb.b;
        ckb.c.getClass();
        return new c64(":profile/avatars?id=" + this.a + "&type=contact");
    }
}
