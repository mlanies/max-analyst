package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class vb1 extends pnf {
    public static final /* synthetic */ bc7[] B0;
    public static final kpa C0;
    public final s35 A0;
    public final tta X;
    public final je7 Y;
    public final je7 Z;
    public final String b;
    public final wva c;
    public final l5g o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0 = tu0.r(3, new x5(29, this));
    public final q0e w0;
    public final q0e x0;
    public final w4d y0;
    public volatile Long z0;

    static {
        oi9 oi9Var = new oi9(vb1.class, "requestParticipantsJob", "getRequestParticipantsJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        B0 = new bc7[]{oi9Var};
        C0 = new kpa(oag.a("", Long.MIN_VALUE), e9f.c(x7a.J0).toString());
    }

    public vb1(String str, wva wvaVar, l5g l5gVar, tta ttaVar, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6) {
        this.b = str;
        this.c = wvaVar;
        this.o = l5gVar;
        this.X = ttaVar;
        this.Y = je7Var;
        this.Z = je7Var4;
        this.s0 = je7Var5;
        this.t0 = je7Var6;
        this.u0 = je7Var3;
        m38 m38Var = m38.a;
        q0e q0eVarA = r0e.a(new nb1(null, m38Var, m38Var, true, new iqe(""), null, null));
        this.w0 = q0eVarA;
        this.x0 = q0eVarA;
        this.y0 = mqd.D();
        this.A0 = new s35(0);
        j47.T(this.a, ((w9a) ((kke) je7Var3.getValue())).b(), null, new lb1(this, null), 2);
        od2.L(new zn5(new qw(new v7c(((cs1) je7Var2.getValue()).a), 21), new mb1(this, null), 5), this.a);
        if (this.z0 != null) {
            return;
        }
        j47.T(this.a, null, null, new ob1(this, null), 3);
    }

    public static final jqe q(vb1 vb1Var, List list, int i) {
        List listI;
        jl3 jl3Var;
        vb1Var.getClass();
        if (i == 0) {
            return new eqe(b8a.j2);
        }
        String strA = null;
        if (i == 1) {
            uj3 uj3Var = (uj3) x53.i0(list);
            if (uj3Var != null && (listI = uj3Var.i()) != null && (jl3Var = (jl3) x53.i0(listI)) != null) {
                strA = jl3Var.a();
            }
            if (strA == null) {
                strA = "";
            }
            return new iqe(strA);
        }
        if (i != 2) {
            return new aqe(a8a.b, i);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jl3 jl3Var2 = (jl3) x53.i0(((uj3) it.next()).i());
            String str = jl3Var2 != null ? jl3Var2.a : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return new iqe(x53.n0(arrayList, null, null, null, null, 63));
    }

    public final void r(boolean z) {
        q0e q0eVar;
        Object value;
        tta ttaVar = this.X;
        eua euaVarA = ttaVar.a();
        String[] strArr = eua.h;
        if (euaVarA.b(strArr)) {
            bt1 bt1Var = (bt1) this.Z.getValue();
            long j = z ? 1L : 0L;
            bt1Var.getClass();
            bt1.c(bt1Var, "AUDIO_ENABLED", null, null, Long.valueOf(j), null, null, true, 52);
            do {
                q0eVar = this.w0;
                value = q0eVar.getValue();
            } while (!q0eVar.c(value, nb1.a((nb1) value, null, !ttaVar.a().b(eua.h) ? m38.X : z ? m38.b : m38.a, null, false, null, null, null, 125)));
            return;
        }
        eua euaVarA2 = ttaVar.a();
        int i = b8a.E;
        euaVarA2.getClass();
        int i2 = j1c.permissions_audio_title;
        int i3 = oga.g;
        l5g l5gVar = this.o;
        if (eua.i(l5gVar, strArr)) {
            l5gVar.c(strArr, 160, i2, i, i3);
        } else {
            euaVarA2.f(l5gVar, strArr, 160);
        }
    }

    public final void s(boolean z) {
        q0e q0eVar;
        Object value;
        tta ttaVar = this.X;
        if (!ttaVar.a().b(eua.l)) {
            ttaVar.a().h(this.o);
            return;
        }
        bt1 bt1Var = (bt1) this.Z.getValue();
        long j = z ? 1L : 0L;
        bt1Var.getClass();
        bt1.c(bt1Var, "VIDEO_ENABLED", null, null, Long.valueOf(j), null, null, true, 52);
        do {
            q0eVar = this.w0;
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, nb1.a((nb1) value, null, null, !ttaVar.a().b(eua.l) ? m38.X : z ? m38.b : m38.a, false, null, null, null, 123)));
    }
}
