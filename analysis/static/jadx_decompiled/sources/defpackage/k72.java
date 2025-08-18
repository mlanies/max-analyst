package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class k72 extends z12 {
    public static final /* synthetic */ bc7[] x;
    public final qeb j;
    public final je7 k;
    public final je7 l;
    public final je7 m;
    public final je7 n;
    public final je7 o;
    public final mn5 p;
    public final kld q;
    public final v7c r;
    public final w4d s;
    public final AtomicLong t;
    public final AtomicLong u;
    public final AtomicLong v;
    public final AtomicBoolean w;

    static {
        oi9 oi9Var = new oi9(k72.class, "generateLinkJob", "getGenerateLinkJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        x = new bc7[]{oi9Var};
    }

    public k72(long j, sx3 sx3Var, qeb qebVar) {
        neb nebVar = neb.a;
        je7 je7VarD = nebVar.d();
        je7 je7VarC = nebVar.c();
        khe kheVarD = nebVar.getAccessor().d(fl7.class);
        khe kheVar = new khe(new m52(2));
        je7 je7VarB = nebVar.b();
        khe kheVar2 = new khe(new m52(3));
        khe kheVarD2 = nebVar.getAccessor().d(rh0.class);
        super(j, sx3Var);
        this.j = qebVar;
        this.k = je7VarD;
        this.l = je7VarC;
        this.m = kheVarD;
        this.n = kheVar;
        this.o = je7VarB;
        khe kheVar3 = (khe) je7VarD;
        this.p = od2.F(new j31(new t03(this.c, 11), this.d, f72.s0, 4), ((w9a) ((kke) kheVar3.getValue())).a());
        kld kldVarB = lld.b(0, 0, 0, 7);
        this.q = kldVarB;
        this.r = new v7c(kldVarB);
        this.s = mqd.D();
        this.t = new AtomicLong();
        this.u = new AtomicLong();
        this.v = new AtomicLong();
        this.w = new AtomicBoolean();
        od2.L(od2.F(new zn5(this.i, new p62(this, null), 5), ((w9a) ((kke) kheVar3.getValue())).a()), sx3Var);
        od2.L(od2.F(new zn5(new b72(new zn5(new mqc(new e72(new t03(((jz2) ((iy2) ((khe) je7VarC).getValue())).m(j), 11), null, this)), new q62(this, null), 5), this, 0), new r62(this, null), 5), ((w9a) ((kke) kheVar3.getValue())).b()), sx3Var);
        od2.L(new zn5(new b72(((rh0) kheVarD2.getValue()).b, this, 1), new vw(2, this, k72.class, "handleError", "handleError(Lone/me/profileedit/screens/changelink/ChangeLinkErrors;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2), 5), sx3Var);
        od2.L(new zn5(new v7c(((dfb) kheVar2.getValue()).a), new n62(this, j, null), 5), sx3Var);
    }

    public static final void m(k72 k72Var, e52 e52Var) {
        k72Var.getClass();
        o22 o22VarT = t(e52Var);
        k72Var.h.m(null, o22VarT);
        q0e q0eVar = k72Var.i;
        q0eVar.m(null, o22VarT);
        o22 o22Var = (o22) q0eVar.getValue();
        if ((o22Var != null ? o22Var.b : null) == n22.c) {
            q0eVar.m(null, o22VarT);
        }
        k72Var.d(k72Var.s());
    }

    public static o22 t(e52 e52Var) {
        String str;
        String lastPathSegment;
        Object next;
        Uri uri;
        qx7 qx7Var = n22.a;
        int i = e52Var.b.r0;
        if (i == 1) {
            str = "PUBLIC";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "PRIVATE";
        }
        qx7Var.getClass();
        Iterator it = n22.X.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            lastPathSegment = null;
            if (!u1Var.hasNext()) {
                next = null;
                break;
            }
            next = u1Var.next();
            if (tpa.f(((n22) next).name(), str)) {
                break;
            }
        }
        n22 n22Var = (n22) next;
        if (n22Var == null) {
            n22Var = n22.c;
        }
        n22 n22Var2 = n22.c;
        k92 k92Var = e52Var.b;
        if (n22Var == n22Var2) {
            lastPathSegment = k92Var.I;
        } else {
            String str2 = k92Var.I;
            if (str2 != null && (uri = Uri.parse(str2)) != null) {
                lastPathSegment = uri.getLastPathSegment();
            }
        }
        return new o22(n22Var, lastPathSegment);
    }

    @Override // defpackage.z12
    public final void a() {
        j47.T(this.b, ((w9a) p()).a(), null, new t62(this, null), 2);
    }

    @Override // defpackage.z12
    public final void b() {
        bc7[] bc7VarArr = x;
        bc7 bc7Var = bc7VarArr[0];
        w4d w4dVar = this.s;
        x77 x77Var = (x77) w4dVar.T0(this, bc7Var);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        w4dVar.o1(this, bc7VarArr[0], null);
    }

    @Override // defpackage.z12
    public final Object c(Continuation continuation) throws Throwable {
        Object objN = n(continuation);
        return objN == tx3.a ? objN : e5f.a;
    }

    @Override // defpackage.z12
    public final void e() {
        vxd vxdVarT = j47.T(this.b, ((w9a) p()).b(), null, new v62(this, true, null), 2);
        this.s.o1(this, x[0], vxdVarT);
    }

    @Override // defpackage.z12
    public final mn5 f() {
        return this.p;
    }

    @Override // defpackage.z12
    public final void g(int i) {
        j47.T(this.b, null, null, new w62(i, this, null), 3);
    }

    @Override // defpackage.z12
    public final void h(int i) {
        j47.T(this.b, ((w9a) p()).a(), null, new x62(i, this, null), 2);
    }

    @Override // defpackage.z12
    public final void i(int i) {
        j47.T(this.b, ((w9a) p()).a(), null, new y62(i, this, null), 2);
    }

    @Override // defpackage.z12
    public final Object j(Continuation continuation) throws Throwable {
        o22 o22Var;
        e52 e52VarO = o();
        e5f e5fVar = e5f.a;
        if (e52VarO == null || (o22Var = (o22) this.i.getValue()) == null) {
            return e5fVar;
        }
        qeb qebVar = qeb.c;
        kld kldVar = this.f;
        tx3 tx3Var = tx3.a;
        if (this.j == qebVar && e52VarO.I() && tpa.f(q(), Boolean.FALSE)) {
            Object objA = kldVar.a(new qcb(this.a), continuation);
            return objA == tx3Var ? objA : e5fVar;
        }
        Integer num = null;
        if (o22Var.f) {
            Object objA2 = kldVar.a(new ucb(o22Var.d, num, 14), continuation);
            return objA2 == tx3Var ? objA2 : e5fVar;
        }
        Object objT0 = j47.t0(((w9a) p()).b(), new g72(this, o22Var, e52VarO, null), continuation);
        return objT0 == tx3Var ? objT0 : e5fVar;
    }

    @Override // defpackage.z12
    public final void k(String str) {
        j47.T(this.b, ((w9a) p()).c().getImmediate(), null, new j72(this, str, null), 2);
    }

    @Override // defpackage.z12
    public final void l(int i) {
        int i2 = sea.i0;
        String str = null;
        q0e q0eVar = this.i;
        q0e q0eVar2 = this.h;
        if (i == i2) {
            o22 o22Var = (o22) q0eVar2.getValue();
            n22 n22Var = o22Var != null ? o22Var.b : null;
            n22 n22Var2 = n22.c;
            q0eVar.setValue(n22Var == n22Var2 ? (o22) q0eVar2.getValue() : new o22(n22Var2, str));
            return;
        }
        if (i == sea.j0) {
            o22 o22Var2 = (o22) q0eVar2.getValue();
            n22 n22Var3 = o22Var2 != null ? o22Var2.b : null;
            n22 n22Var4 = n22.b;
            q0eVar.setValue(n22Var3 == n22Var4 ? (o22) q0eVar2.getValue() : new o22(n22Var4, str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k72.n(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final e52 o() {
        return (e52) ((jz2) ((iy2) this.l.getValue())).m(this.a).a.getValue();
    }

    public final kke p() {
        return (kke) this.k.getValue();
    }

    public final Boolean q() {
        o22 o22Var = (o22) this.h.getValue();
        if (o22Var != null) {
            return Boolean.valueOf(o22Var.b((q22) this.i.getValue()));
        }
        return null;
    }

    public final Object r(e22 e22Var, Continuation continuation) {
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

    public final y12 s() {
        e52 e52VarO = o();
        return new y12(new m22((e52VarO == null || !e52VarO.I()) ? vea.d2 : vea.X1, false, true, false), ((f22) this.g.getValue()).a(this));
    }
}
