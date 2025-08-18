package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class jib extends pnf {
    public static final /* synthetic */ bc7[] D0;
    public final w7c A0;
    public final s35 B0;
    public final s35 C0;
    public final je7 X;
    public final kld Y;
    public final je7 Z;
    public final long b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final je7 t0;
    public final ehb u0;
    public final w4d v0;
    public final AtomicLong w0;
    public final AtomicLong x0;
    public final AtomicBoolean y0;
    public final q0e z0;

    static {
        oi9 oi9Var = new oi9(jib.class, "getChatLinkJob", "getGetChatLinkJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        D0 = new bc7[]{oi9Var};
    }

    public jib(long j, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7) {
        int i = 11;
        int i2 = 5;
        this.b = j;
        this.c = je7Var2;
        this.o = je7Var3;
        this.X = je7Var4;
        kld kldVarB = lld.b(0, 0, 0, 7);
        this.Y = kldVarB;
        this.Z = je7Var;
        this.s0 = je7Var6;
        this.t0 = je7Var7;
        ehb ehbVar = (ehb) xcb.a.getAccessor().c(ehb.class);
        this.u0 = ehbVar;
        m32 m32VarN = od2.N(new t03(kldVarB, i), new fib(((rh0) je7Var5.getValue()).b, this, 1));
        this.v0 = mqd.D();
        this.w0 = new AtomicLong();
        this.x0 = new AtomicLong(-9223372036854775807L);
        this.y0 = new AtomicBoolean(false);
        q0e q0eVarA = r0e.a(nz4.a);
        this.z0 = q0eVarA;
        this.A0 = new w7c(q0eVarA);
        this.B0 = new s35(0);
        this.C0 = new s35(0);
        od2.L(od2.F(new fib(new zn5(new mqc(new iib(new t03(((jz2) ((iy2) je7Var2.getValue())).m(j), i), null, this)), new zhb(this, null), i2), this, 0), ((w9a) ((kke) je7Var3.getValue())).a()), this.a);
        od2.L(od2.F(new zn5(m32VarN, new shb(2, this, jib.class, "handleApiError", "handleApiError(Lone/me/profile/screens/invite/CreateLinkErrors;)V", 4, 1), i2), ((w9a) ((kke) je7Var3.getValue())).a()), this.a);
        od2.L(new zn5(new v7c(ehbVar.b), new aib(this, null), i2), this.a);
    }

    @Override // defpackage.pnf
    public final void p() {
        ehb ehbVar = this.u0;
        ehbVar.a.f(ehbVar);
        bc7[] bc7VarArr = D0;
        bc7 bc7Var = bc7VarArr[0];
        w4d w4dVar = this.v0;
        x77 x77Var = (x77) w4dVar.T0(this, bc7Var);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        w4dVar.o1(this, bc7VarArr[0], null);
    }

    public final void q(e52 e52Var) {
        boolean z;
        boolean z2;
        jqe eqeVar;
        kl7 kl7VarL = j1e.l();
        kl7VarL.add(new mib(e52Var.b.r0 == 2 ? yea.g1 : e52Var.J() ? yea.T0 : yea.Q0, null, 6));
        String str = e52Var.b.I;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String strG = e52Var.g(kk0.c, jk0.a);
        long j = e52Var.b.a;
        e52Var.l0();
        kl7VarL.add(new rib(new nc2(strG, j, e52Var.x0, e52Var.q(), str2, !this.y0.get() && str2.length() == 0, e52Var.Z(), oag.s(e52Var.e(((hyc) ((q33) this.t0.getValue())).t()), 128))));
        kl7VarL.add(new mib(yea.U0, i4f.p, 2));
        int i = e52Var.I() ? yea.R0 : yea.h1;
        int i2 = wea.O;
        vfd vfdVar = new vfd(i2, 0, new eqe(i), null, null, Integer.valueOf(woc.Z1), null, null, null, 0, null, 2008);
        String strS = s();
        if (strS == null || strS.length() == 0) {
            z = true;
            z2 = true;
        } else {
            z = true;
            z2 = false;
        }
        kl7VarL.add(new yib(i2, vfdVar, !z2, 536879104));
        int i3 = wea.P;
        vfd vfdVar2 = new vfd(i3, 0, new eqe(yea.a), null, null, Integer.valueOf(gpc.h0), null, null, null, 0, null, 2008);
        String strS2 = s();
        kl7VarL.add(new yib(i3, vfdVar2, !((strS2 == null || strS2.length() == 0) ? z : false), -2147475456));
        if (e52Var.J() && e52Var.d0()) {
            se5 se5Var = (se5) ((qe5) this.s0.getValue());
            se5Var.getClass();
            if (se5Var.n(PmsKey.f34editchattypescreenenabled, false)) {
                int i4 = e52Var.b.r0;
                int i5 = i4 == 0 ? -1 : bib.$EnumSwitchMapping$0[au1.s(i4)];
                if (i5 == -1) {
                    eqeVar = jqe.a;
                } else if (i5 == z) {
                    eqeVar = new eqe(yea.n);
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eqeVar = new eqe(yea.m);
                }
                int i6 = wea.M;
                kl7VarL.add(new yib(i6, new vfd(i6, 0, new eqe(yea.b1), null, null, Integer.valueOf(woc.f2), new dfd(eqeVar, null), null, null, 0, null, 1944), z, 8192));
            }
        }
        this.z0.setValue(j1e.d(kl7VarL));
    }

    public final e52 r() {
        return (e52) ((jz2) ((iy2) this.c.getValue())).m(this.b).a.getValue();
    }

    public final String s() {
        k92 k92Var;
        String str;
        e52 e52VarR = r();
        if (e52VarR == null || (k92Var = e52VarR.b) == null || (str = k92Var.I) == null || str.length() == 0) {
            return null;
        }
        return str;
    }
}
