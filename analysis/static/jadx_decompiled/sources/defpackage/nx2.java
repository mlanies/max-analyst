package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class nx2 extends pnf {
    public static final /* synthetic */ bc7[] X0;
    public final je7 A0;
    public final je7 B0;
    public final je7 C0;
    public final je7 D0;
    public final je7 E0;
    public final je7 F0;
    public final q0e G0;
    public final w7c H0;
    public final q0e I0;
    public final q0e J0;
    public final w7c K0;
    public final w7c L0;
    public final q0e M0;
    public final w7c N0;
    public final s35 O0;
    public final s35 P0;
    public volatile gi9 Q0;
    public final fi9 R0;
    public final q0e S0;
    public final w4d T0;
    public final kld U0;
    public final mn5 V0;
    public vxd W0;
    public final pu2 X;
    public final kke Y;
    public final je7 Z;
    public final qn3 b;
    public final String c;
    public final rg1 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    static {
        oi9 oi9Var = new oi9(nx2.class, "unblockContactJob", "getUnblockContactJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        X0 = new bc7[]{oi9Var};
    }

    public nx2(qn3 qn3Var, String str, rg1 rg1Var) {
        khe kheVar;
        Object obj;
        i07 ey1Var;
        ys2 ys2Var = ys2.a;
        pu2 pu2VarA = ((rt2) ys2Var.getAccessor().c(rt2.class)).a(str);
        qf7 qf7Var = (qf7) ys2Var.getAccessor().c(qf7.class);
        kke kkeVar = (kke) ys2Var.getAccessor().c(kke.class);
        khe kheVarD = ys2Var.getAccessor().d(j52.class);
        khe kheVarD2 = ys2Var.getAccessor().d(zfc.class);
        khe kheVarD3 = ys2Var.getAccessor().d(iy2.class);
        khe kheVarD4 = ys2Var.getAccessor().d(p82.class);
        khe kheVarD5 = ys2Var.getAccessor().d(ck3.class);
        khe kheVarD6 = ys2Var.getAccessor().d(qq3.class);
        khe kheVarD7 = ys2Var.getAccessor().d(q33.class);
        khe kheVarD8 = ys2Var.getAccessor().d(y7d.class);
        khe kheVarD9 = ys2Var.getAccessor().d(p7c.class);
        j07 j07Var = (j07) ys2Var.getAccessor().c(j07.class);
        j07Var.getClass();
        if (str.equals("all.chat.folder")) {
            obj = "all.chat.folder";
            kheVar = kheVarD9;
            ey1Var = new ey1(2, (eca) j07Var.a.c(eca.class));
        } else {
            kheVar = kheVarD9;
            obj = "all.chat.folder";
            ey1Var = i07.L;
        }
        khe kheVarD10 = ys2Var.getAccessor().d(ta2.class);
        khe kheVarD11 = ys2Var.getAccessor().d(xb9.class);
        khe kheVarD12 = ys2Var.getAccessor().d(qu2.class);
        khe kheVarD13 = ys2Var.getAccessor().d(vj7.class);
        khe kheVarD14 = ys2Var.getAccessor().d(afe.class);
        khe kheVarD15 = ys2Var.getAccessor().d(s8g.class);
        khe kheVarD16 = ys2Var.getAccessor().d(oc6.class);
        this.b = qn3Var;
        this.c = str;
        this.o = rg1Var;
        this.X = pu2VarA;
        this.Y = kkeVar;
        this.Z = kheVarD2;
        this.s0 = kheVarD7;
        this.t0 = kheVarD8;
        this.u0 = kheVarD3;
        this.v0 = kheVarD4;
        this.w0 = kheVarD5;
        this.x0 = kheVarD6;
        this.y0 = kheVarD;
        this.z0 = kheVar;
        this.A0 = kheVarD10;
        this.B0 = kheVarD11;
        this.C0 = kheVarD13;
        this.D0 = kheVarD14;
        this.E0 = kheVarD15;
        this.F0 = kheVarD16;
        q0e q0eVarA = r0e.a(ey1Var.b());
        this.G0 = q0eVarA;
        this.H0 = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a(nz4.a);
        this.I0 = q0eVarA2;
        q0e q0eVarA3 = r0e.a(q0eVarA2.getValue());
        this.J0 = q0eVarA3;
        xk1 xk1Var = new xk1(q0eVarA3, 23);
        Object value = q0eVarA3.getValue();
        c32 c32Var = wld.a;
        this.K0 = od2.X(xk1Var, this.a, c32Var, value);
        this.L0 = od2.X(new xk1(q0eVarA3, 24), this.a, c32Var, q0eVarA3.getValue());
        q0e q0eVarA4 = r0e.a(Boolean.FALSE);
        this.M0 = q0eVarA4;
        this.N0 = new w7c(q0eVarA4);
        this.O0 = new s35(0);
        this.P0 = new s35(0);
        this.Q0 = vv7.a;
        fi9 fi9Var = rv7.a;
        this.R0 = new fi9();
        this.S0 = r0e.a(0L);
        this.T0 = mqd.D();
        this.U0 = lld.a(20, 20, 2);
        Continuation continuation = null;
        if (tpa.f(str, obj)) {
            wa9 wa9Var = (wa9) ((qu2) kheVarD12.getValue());
            vxd vxdVar = wa9Var.h;
            if (vxdVar != null) {
                vxdVar.cancel((CancellationException) null);
            }
            m58 m58Var = new m58(new jp5(pu2VarA.y0, 0), 11);
            int i = ft4.o;
            wa9Var.h = od2.L(od2.h(new ac(od2.F(new zn5(od2.F(new sa9(od2.w(new sa9(nu0.Q(m58Var, z7.R(3, kt4.SECONDS)), wa9Var, 0), new ai0(19)), wa9Var, 1), wa9Var.e), new ua9(wa9Var, null), 5), wa9Var.d), 18, new er2(3, continuation, 2))), wa9Var.f);
        }
        od2.L(od2.F(new zn5(new sw2(new j31(pu2VarA.y0, qf7Var.d, new c3(this, continuation, 7), 4), this, 0), new vw(2, q0eVarA, ti9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 11), 5), ((w9a) kkeVar).a()), this.a);
        qyc qycVar = (qyc) ((y7d) kheVarD8.getValue());
        qycVar.getClass();
        if (qycVar.n(PmsKey.f38fakechats, false)) {
            String strG = ((t33) ((q33) kheVarD7.getValue())).g("user.Phone", null);
            StringBuilder sb = new StringBuilder();
            int length = strG.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = strG.charAt(i2);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            Long lF0 = dae.f0(sb.toString());
            zn5 zn5Var = new zn5(od2.M(new sb1(new j31(this.b.a(), new zn5(new sw2(new sw2(this.S0, this, 1), this, 2), new zw2(2, null)), new ax2(3, continuation, 0), 4), new yw2(new fs4(15), 0), this, lF0, 1), new bx2(this, null)), new cx2(this, null));
            w9a w9aVar = (w9a) this.Y;
            mn5 mn5VarF = od2.F(zn5Var, w9aVar.a());
            ContextScope contextScope = this.a;
            od2.L(mn5VarF, contextScope);
            od2.L(od2.F(new zn5(this.H0, new dx2(this, null), 5), w9aVar.a()), contextScope);
        }
        j47.T(this.a, ((w9a) this.Y).a(), null, new iw2(this, null), 2);
        xk1 xk1Var2 = new xk1(od2.x(this.U0), 26);
        int i3 = ft4.o;
        od2.L(od2.F(new ac(new zn5(new xk1(new sw2(new m32(new vn5(z7.R(5, kt4.SECONDS), xk1Var2, null), hz4.a, -2, 1, 0), this, 4), 27), new kx2(this, null), 5), 18, new er2(3, continuation, 1)), ((w9a) this.Y).b().limitedParallelism(1, "missed")), this.a);
        int i4 = 3;
        this.V0 = od2.F(new xk1(od2.x(new sw2(new j31(this.G0, ((zb2) ((ta2) this.A0.getValue())).g(), new xh0(i4, continuation, 6), 4), this, i4)), 25), ((w9a) this.Y).a());
    }

    public static final boolean q(nx2 nx2Var, mt2 mt2Var) {
        nx2Var.getClass();
        return mt2Var.a.size() <= 10 && !mt2Var.b;
    }

    public static final iy2 r(nx2 nx2Var) {
        return (iy2) nx2Var.u0.getValue();
    }

    public static final void s(nx2 nx2Var, long j, long j2) {
        p82 p82VarT = nx2Var.t();
        long jE = ft4.e(j2) + ((hyc) ((q33) nx2Var.s0.getValue())).n();
        e52 e52VarC = p82VarT.C(j);
        if (e52VarC != null) {
            p82VarT.l(jE, e52VarC);
            ((k4a) ((pk) p82VarT.p.get())).r(e52VarC.a);
        }
    }

    public final p82 t() {
        return (p82) this.v0.getValue();
    }

    public final void u() {
        q0e q0eVar = this.S0;
        q0eVar.m(null, Long.valueOf(((Number) q0eVar.getValue()).longValue() + 1));
    }

    public final void v() {
        vxd vxdVar = this.W0;
        if (vxdVar == null || !vxdVar.isActive()) {
            this.W0 = pnf.n(this, ((w9a) this.Y).c(), null, new pw2(this, null), 2);
        }
    }
}
