package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class zb2 implements ta2, qu7 {
    public static final String K0 = nec.a(zb2.class).b();
    public sd7 A0;
    public final khe B0;
    public final aj9 C0;
    public volatile at5 D0;
    public final AtomicBoolean E0;
    public final ConcurrentHashMap F0;
    public final khe G0;
    public vxd H0;
    public x77 I0;
    public final AtomicBoolean J0;
    public final q0e X;
    public final lx3 Y;
    public final ContextScope Z;
    public final je7 a;
    public final khe b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public ConcurrentHashMap t0;
    public final HashMap u0;
    public final je7 v0;
    public final je7 w0;
    public final xpb x0;
    public vxd y0;
    public vxd z0;

    public zb2(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, av0 av0Var, je7 je7Var6, je7 je7Var7, o45 o45Var, je7 je7Var8) {
        this.a = je7Var6;
        khe kheVar = new khe(new z30(8, je7Var3));
        this.b = kheVar;
        this.c = je7Var2;
        this.o = je7Var8;
        q0e q0eVarA = r0e.a(null);
        this.X = q0eVarA;
        lx3 lx3VarPlus = ((nx3) kheVar.getValue()).plus(xq9.a);
        this.Y = lx3VarPlus;
        ContextScope contextScopeA = j1e.a(lx3VarPlus.plus(new qj(o45Var)));
        this.Z = contextScopeA;
        this.s0 = tu0.r(2, new z30(9, je7Var));
        this.t0 = new ConcurrentHashMap();
        this.u0 = new HashMap();
        this.v0 = je7Var4;
        this.w0 = je7Var5;
        this.x0 = new xpb();
        final int i = 0;
        this.B0 = new khe(new k56(this) { // from class: ua2
            public final /* synthetic */ zb2 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new nkc("all.chat.folder", ((rba) this.b.c.getValue()).a.getString(jpc.f0), (String) null, 0, (Set) wz4.a, false, false, (List) null, (Long) null, (Map) null, (List) null, (Set) null, 8064);
                    default:
                        String string = UUID.randomUUID().toString();
                        zb2 zb2Var = this.b;
                        return y53.N(new nkc(string, ((rba) zb2Var.c.getValue()).a.getString(jpc.i0), "👤", 0, Collections.singleton(pa2.y0), false, false, (List) null, (Long) null, (Map) null, (List) null, (Set) null, 8064), new nkc(UUID.randomUUID().toString(), ((rba) zb2Var.c.getValue()).a.getString(jpc.j0), "✉️", 1, bcd.a0(pa2.Z, pa2.s0), false, false, (List) null, (Long) null, (Map) null, (List) null, (Set) null, 8064));
                }
            }
        });
        this.C0 = bj9.a();
        this.E0 = new AtomicBoolean(false);
        this.F0 = new ConcurrentHashMap();
        final int i2 = 1;
        this.G0 = new khe(new k56(this) { // from class: ua2
            public final /* synthetic */ zb2 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new nkc("all.chat.folder", ((rba) this.b.c.getValue()).a.getString(jpc.f0), (String) null, 0, (Set) wz4.a, false, false, (List) null, (Long) null, (Map) null, (List) null, (Set) null, 8064);
                    default:
                        String string = UUID.randomUUID().toString();
                        zb2 zb2Var = this.b;
                        return y53.N(new nkc(string, ((rba) zb2Var.c.getValue()).a.getString(jpc.i0), "👤", 0, Collections.singleton(pa2.y0), false, false, (List) null, (Long) null, (Map) null, (List) null, (Set) null, 8064), new nkc(UUID.randomUUID().toString(), ((rba) zb2Var.c.getValue()).a.getString(jpc.j0), "✉️", 1, bcd.a0(pa2.Z, pa2.s0), false, false, (List) null, (Long) null, (Map) null, (List) null, (Set) null, 8064));
                }
            }
        });
        this.J0 = new AtomicBoolean(false);
        i();
        h();
        av0Var.d(new va2(this));
        od2.L(new zn5(new t03(q0eVarA, 11), new wa2(je7Var7, null), 5), contextScopeA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0088 -> B:12:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.zb2 r7, java.util.ArrayList r8, boolean r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof defpackage.qb2
            if (r0 == 0) goto L16
            r0 = r10
            qb2 r0 = (defpackage.qb2) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.u0 = r1
            goto L1b
        L16:
            qb2 r0 = new qb2
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.s0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.u0
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.util.Iterator r7 = r0.Z
            java.util.Collection r8 = r0.Y
            java.util.Comparator r9 = r0.X
            zb2 r2 = r0.o
            defpackage.od2.a0(r10)
            r6 = r0
            r0 = r8
            r8 = r2
        L34:
            r2 = r6
            goto L8c
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            defpackage.od2.a0(r10)
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto L4a
            nz4 r1 = defpackage.nz4.a
            goto L9c
        L4a:
            if (r9 == 0) goto L4f
            v00 r9 = defpackage.p82.J
            goto L51
        L4f:
            v00 r9 = defpackage.p82.I
        L51:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r8 = r8.iterator()
            r6 = r8
            r8 = r7
            r7 = r6
        L5d:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r7.next()
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            je7 r2 = r8.v0
            java.lang.Object r2 = r2.getValue()
            iy2 r2 = (defpackage.iy2) r2
            r0.o = r8
            r0.X = r9
            r0.Y = r10
            r0.Z = r7
            r0.u0 = r3
            jz2 r2 = (defpackage.jz2) r2
            java.lang.Object r2 = r2.k(r4, r0)
            if (r2 != r1) goto L88
            goto L9c
        L88:
            r6 = r0
            r0 = r10
            r10 = r2
            goto L34
        L8c:
            e52 r10 = (defpackage.e52) r10
            if (r10 == 0) goto L93
            r0.add(r10)
        L93:
            r10 = r0
            r0 = r2
            goto L5d
        L96:
            java.util.List r10 = (java.util.List) r10
            java.util.List r1 = defpackage.x53.x0(r10, r9)
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb2.b(zb2, java.util.ArrayList, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static Object j(zb2 zb2Var, List list, boolean z, Continuation continuation) {
        zb2Var.getClass();
        Object objK = j1e.k(new rb2(zb2Var, list, z, null, null), continuation);
        return objK == tx3.a ? objK : e5f.a;
    }

    @Override // defpackage.qu7
    public final void a() throws Throwable {
        hm9.n(K0, "onLogout");
        this.X.m(null, nz4.a);
        vxd vxdVar = this.H0;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
        vxd vxdVar2 = this.y0;
        if (vxdVar2 != null) {
            vxdVar2.cancel((CancellationException) null);
        }
        vxd vxdVar3 = this.z0;
        if (vxdVar3 != null) {
            vxdVar3.cancel((CancellationException) null);
        }
        sd7 sd7Var = this.A0;
        if (sd7Var != null) {
            dm4.a(sd7Var);
        }
        this.t0.clear();
        this.u0.clear();
        j47.f0(hz4.a, new lb2(this, null));
    }

    public final Object c(String str, Continuation continuation) throws Throwable {
        Object objT0 = j47.t0(this.Y, new ab2(this, str, null), continuation);
        return objT0 == tx3.a ? objT0 : e5f.a;
    }

    public final Object d(String str, Continuation continuation) {
        boolean zF = tpa.f(str, "all.chat.folder");
        lx3 lx3Var = this.Y;
        return zF ? j47.t0(lx3Var, new db2(this, null), continuation) : j47.t0(lx3Var, new eb2(this, str, null), continuation);
    }

    public final alc e() {
        return (alc) this.s0.getValue();
    }

    public final void f(List list, Set set) {
        x77 x77Var = this.I0;
        if (x77Var == null || (x77Var.isCompleted() && !this.J0.get())) {
            this.z0 = j47.T(this.Z, null, null, new ib2(this, list, set, null), 3);
        }
    }

    public final t03 g() {
        return new t03(new w7c(this.X), 11);
    }

    public final void h() {
        sd7 sd7Var = this.A0;
        if (sd7Var != null) {
            dm4.a(sd7Var);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        xpb xpbVar = this.x0;
        xpbVar.getClass();
        ztc ztcVarA = muc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(ztcVarA, "scheduler is null");
        o1a o1aVar = new o1a(xpbVar, 1L, timeUnit, ztcVarA, true);
        sd7 sd7Var2 = new sd7(new wd6(8, this), ft.f, ft.d);
        o1aVar.a(sd7Var2);
        this.A0 = sd7Var2;
    }

    public final void i() {
        vxd vxdVar = this.y0;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
        alc alcVarE = e();
        alcVarE.getClass();
        ykc ykcVar = new ykc(alcVarE, xlc.a(0, "SELECT * FROM chat_folder"), 0);
        this.y0 = od2.L(new zn5(new xk1(od2.F(new mqc(new cy3(alcVarE.a, new String[]{"chat_folder"}, ykcVar, null)), (nx3) this.b.getValue()), 12), new pb2(this, null), 5), this.Z);
    }

    public final void k(long j, e52 e52Var) {
        vxd vxdVar = this.H0;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
        ub2 ub2Var = new ub2(this, j, e52Var, null);
        this.H0 = j47.T(this.Z, this.Y, null, ub2Var, 2);
    }
}
