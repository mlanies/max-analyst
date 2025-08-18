package defpackage;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zk3 extends z12 {
    public final je7 j;
    public final je7 k;
    public final je7 l;
    public final mn5 m;
    public final kld n;
    public final v7c o;
    public final AtomicLong p;

    public zk3(long j, sx3 sx3Var) {
        neb nebVar = neb.a;
        je7 je7VarD = nebVar.d();
        khe kheVarD = nebVar.getAccessor().d(ds3.class);
        khe kheVar = new khe(new zf3(2));
        je7 je7VarB = nebVar.b();
        khe kheVar2 = new khe(new zf3(3));
        khe kheVarD2 = nebVar.getAccessor().d(rh0.class);
        super(j, sx3Var);
        this.j = je7VarD;
        this.k = kheVar;
        this.l = je7VarB;
        khe kheVar3 = (khe) je7VarD;
        this.m = od2.F(new j31(new t03(this.c, 11), this.d, uk3.s0, 4), ((w9a) ((kke) kheVar3.getValue())).a());
        kld kldVarB = lld.b(0, 0, 0, 7);
        this.n = kldVarB;
        this.o = new v7c(kldVarB);
        this.p = new AtomicLong();
        od2.L(od2.F(new zn5(this.i, new mk3(this, null), 5), ((w9a) ((kke) kheVar3.getValue())).a()), sx3Var);
        od2.L(od2.F(new zn5(new qk3(new mqc(new tk3(new t03(((ds3) kheVarD.getValue()).c(j), 11), null, this)), this, 0), new lq0(2, this, zk3.class, "emitState", "emitState(Lone/me/profileedit/screens/changelink/ChangeLink$State;)V", 4, 12), 5), ((w9a) ((kke) kheVar3.getValue())).b()), sx3Var);
        od2.L(new zn5(new qk3(((rh0) kheVarD2.getValue()).b, this, 1), new vw(2, this, zk3.class, "handleError", "handleError(Lone/me/profileedit/screens/changelink/ChangeLinkErrors;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 16), 5), sx3Var);
        od2.L(new zn5(new v7c(((dfb) kheVar2.getValue()).a), new nk3(this, null), 5), sx3Var);
    }

    public static final p22 m(zk3 zk3Var, uj3 uj3Var) {
        Uri uri;
        zk3Var.getClass();
        String str = uj3Var.a.c.p;
        return new p22(vea.f2, (str == null || (uri = Uri.parse(str)) == null) ? null : uri.getLastPathSegment(), null, null, false);
    }

    @Override // defpackage.z12
    public final void b() {
    }

    @Override // defpackage.z12
    public final mn5 f() {
        return this.m;
    }

    @Override // defpackage.z12
    public final Object j(Continuation continuation) throws Throwable {
        p22 p22Var = (p22) this.i.getValue();
        e5f e5fVar = e5f.a;
        if (p22Var == null) {
            return e5fVar;
        }
        tx3 tx3Var = tx3.a;
        Integer num = null;
        if (p22Var.e) {
            Object objA = this.f.a(new ucb(p22Var.c, num, 14), continuation);
            return objA == tx3Var ? objA : e5fVar;
        }
        String str = p22Var.b;
        String string = str != null ? w9e.b1(str).toString() : null;
        if (string == null || string.length() == 0) {
            str = "$REMOVE$";
        }
        Object objT0 = j47.t0(((w9a) ((kke) this.j.getValue())).b(), new vk3(this, str, null), continuation);
        return objT0 == tx3Var ? objT0 : e5fVar;
    }

    @Override // defpackage.z12
    public final void k(String str) {
        j47.T(this.b, ((w9a) ((kke) this.j.getValue())).c().getImmediate(), null, new yk3(this, str, null), 2);
    }

    public final Object n(e22 e22Var, Continuation continuation) {
        boolean zF = tpa.f(e22Var, b22.a);
        e5f e5fVar = e5f.a;
        tx3 tx3Var = tx3.a;
        kld kldVar = this.f;
        if (zF) {
            Object objA = kldVar.a(new ucb(new eqe(vea.i2), new eqe(vea.g2), true, new Integer(woc.I)), continuation);
            return objA == tx3Var ? objA : e5fVar;
        }
        if (tpa.f(e22Var, c22.a)) {
            Object objA2 = kldVar.a(new ucb(new eqe(vea.j2), new eqe(vea.h2), true, new Integer(woc.I)), continuation);
            return objA2 == tx3Var ? objA2 : e5fVar;
        }
        Integer num = null;
        int i = 14;
        if (e22Var instanceof a22) {
            Object objA3 = kldVar.a(new ucb(((a22) e22Var).a, num, i), continuation);
            return objA3 == tx3Var ? objA3 : e5fVar;
        }
        if (!(e22Var instanceof d22)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objA4 = kldVar.a(new ucb(((d22) e22Var).a, num, i), continuation);
        return objA4 == tx3Var ? objA4 : e5fVar;
    }
}
