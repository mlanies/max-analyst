package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class zzf extends pnf {
    public static final /* synthetic */ bc7[] T0;
    public final je7 A0;
    public wsf B0;
    public final w4d C0;
    public final c8d D0;
    public final q0e E0;
    public final q0e F0;
    public final q0e G0;
    public final q0e H0;
    public boolean I0;
    public boolean J0;
    public volatile String K0;
    public final w7c L0;
    public final s35 M0;
    public final khe N0;
    public final je7 O0;
    public w97 P0;
    public owf Q0;
    public final ConcurrentHashMap R0;
    public vxd S0;
    public final String X;
    public final r10 Y;
    public final q33 Z;
    public final long b;
    public final osf c;
    public final Long o;
    public final ty3 s0;
    public final gc6 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    static {
        oi9 oi9Var = new oi9(zzf.class, "reloadWebAppJob", "getReloadWebAppJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        T0 = new bc7[]{oi9Var};
    }

    public zzf(long j, osf osfVar, Long l, String str) {
        final int i = 1;
        final int i2 = 0;
        jwf jwfVar = jwf.a;
        long jT = ((hyc) ((q33) jwfVar.getAccessor().c(q33.class))).t();
        Context context = (Context) jwfVar.getAccessor().c(Context.class);
        final y7d y7dVar = (y7d) jwfVar.getAccessor().c(y7d.class);
        final r10 r10Var = new r10();
        r10Var.a = j;
        r10Var.b = jT;
        r10Var.c = context;
        r10Var.d = new khe(new k56() { // from class: p3g
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        r10 r10Var2 = r10Var;
                        return new h3g(r10Var2.a, r10Var2.b, (Context) r10Var2.c, y7dVar);
                    default:
                        r10 r10Var3 = r10Var;
                        return new i3g(r10Var3.a, r10Var3.b, (Context) r10Var3.c, y7dVar);
                }
            }
        });
        r10Var.e = new khe(new k56() { // from class: p3g
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        r10 r10Var2 = r10Var;
                        return new h3g(r10Var2.a, r10Var2.b, (Context) r10Var2.c, y7dVar);
                    default:
                        r10 r10Var3 = r10Var;
                        return new i3g(r10Var3.a, r10Var3.b, (Context) r10Var3.c, y7dVar);
                }
            }
        });
        q33 q33Var = (q33) jwfVar.getAccessor().c(q33.class);
        ty3 ty3Var = (ty3) jwfVar.getAccessor().c(ty3.class);
        gc6 gc6Var = (gc6) jwfVar.getAccessor().c(gc6.class);
        aa7 aa7Var = (aa7) jwfVar.getAccessor().c(aa7.class);
        khe kheVarD = jwfVar.getAccessor().d(kke.class);
        khe kheVarD2 = jwfVar.getAccessor().d(iy2.class);
        khe kheVarD3 = jwfVar.getAccessor().d(ds3.class);
        khe kheVarD4 = jwfVar.getAccessor().d(vsf.class);
        khe kheVarD5 = jwfVar.getAccessor().d(rf5.class);
        khe kheVarD6 = jwfVar.getAccessor().d(ysf.class);
        khe kheVarD7 = jwfVar.getAccessor().d(blb.class);
        khe kheVarD8 = jwfVar.getAccessor().d(hp.class);
        this.b = j;
        this.c = osfVar;
        this.o = l;
        this.X = str;
        this.Y = r10Var;
        this.Z = q33Var;
        this.s0 = ty3Var;
        this.t0 = gc6Var;
        this.u0 = kheVarD;
        this.v0 = kheVarD2;
        this.w0 = kheVarD4;
        this.x0 = kheVarD5;
        this.y0 = kheVarD7;
        this.z0 = kheVarD8;
        int i3 = 3;
        this.A0 = tu0.r(3, new ile(8, kheVarD6));
        this.C0 = mqd.D();
        ContextScope contextScope = this.a;
        kke kkeVar = (kke) aa7Var.a.getValue();
        List list = aa7Var.b;
        c8d c8dVar = new c8d();
        c8dVar.a = contextScope;
        c8dVar.b = kkeVar;
        c8dVar.c = list;
        c8dVar.o = c37.a(0, 0, 7);
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(od2.R(((ia7) it.next()).b()));
        }
        int i4 = wp5.a;
        od2.L(od2.F(new zn5(new m32(arrayList, hz4.a, -2, 1, 1), new ba7(c8dVar, null), 5), ((w9a) ((kke) c8dVar.b)).b()), (sx3) c8dVar.a);
        this.D0 = c8dVar;
        q0e q0eVarA = r0e.a(cpa.a);
        this.E0 = q0eVarA;
        Boolean bool = Boolean.FALSE;
        q0e q0eVarA2 = r0e.a(bool);
        this.F0 = q0eVarA2;
        this.G0 = r0e.a(bool);
        mn5 mn5VarX = od2.x(new j31(od2.M(q0eVarA, new ozf(2, null)), q0eVarA2, new xi1(i3, null, 7), 4));
        ovc ovcVar = new ovc(new t03(((ds3) kheVarD3.getValue()).c(j), 11), 10);
        q0e q0eVarA3 = r0e.a("");
        this.H0 = q0eVarA3;
        this.J0 = true;
        mn5 mn5VarX2 = od2.x(od2.t(q0eVarA3, ovcVar, mn5VarX, new yzf(4, null)));
        e0g e0gVar = new e0g("", false, c0g.a);
        this.L0 = od2.X(mn5VarX2, this.a, wld.a, e0gVar);
        this.M0 = new s35(0);
        this.N0 = new khe(new khf(this, 4, kheVarD));
        this.O0 = tu0.r(3, new rzd(15, this));
        this.R0 = new ConcurrentHashMap();
        pnf.n(this, null, null, new lzf(this, null), 3);
        pnf.n(this, ((w9a) ((kke) kheVarD.getValue())).a(), null, new tzf(this, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.zzf r9, defpackage.q8e r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zzf.q(zzf, q8e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.zzf r4, defpackage.w97 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof defpackage.vzf
            if (r0 == 0) goto L16
            r0 = r6
            vzf r0 = (defpackage.vzf) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.Z = r1
            goto L1b
        L16:
            vzf r0 = new vzf
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            zzf r4 = r0.o
            defpackage.od2.a0(r6)
            goto L52
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            defpackage.od2.a0(r6)
            w97 r6 = r4.P0
            if (r6 == 0) goto L43
            s0 r2 = new s0
            r2.<init>()
            r6.b(r2)
        L43:
            r4.P0 = r5
            r0.o = r4
            r0.Z = r3
            q0e r5 = r4.H0
            java.lang.Object r6 = defpackage.od2.A(r5, r0)
            if (r6 != r1) goto L52
            goto L60
        L52:
            java.lang.String r6 = (java.lang.String) r6
            s35 r4 = r4.M0
            hzf r5 = new hzf
            r5.<init>(r6)
            defpackage.pnf.o(r4, r5)
            e5f r1 = defpackage.e5f.a
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zzf.r(zzf, w97, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.pnf
    public final void p() {
        qxf qxfVar = (qxf) this.A0.getValue();
        ((av0) qxfVar.a.getValue()).f(qxfVar);
        this.B0 = null;
        Iterator it = ((List) this.D0.c).iterator();
        while (it.hasNext()) {
            ((ia7) it.next()).d(null);
        }
    }

    public final ouf s() {
        return (ouf) this.N0.getValue();
    }

    public final void t(boolean z) {
        ouf oufVarS = s();
        oufVarS.getClass();
        j47.T(oufVarS.c, null, null, new utf(oufVarS, null, z), 3);
    }

    public final void u(boolean z) {
        if (z) {
            owf owfVar = this.Q0;
            if (owfVar != null) {
                owfVar.a(e5f.a);
            }
        } else {
            owf owfVar2 = this.Q0;
            if (owfVar2 != null) {
                owfVar2.b(new pwf());
            }
        }
        this.Q0 = null;
    }

    public final void v(boolean z) {
        w97 w97Var = this.P0;
        if (w97Var == null) {
            return;
        }
        if (!z) {
            w97Var.b(new gyf());
            return;
        }
        j47.T(this.a, ((w9a) ((kke) this.u0.getValue())).b(), null, new rzf(this, w97Var, null), 2);
    }
}
