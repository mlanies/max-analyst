package defpackage;

import android.os.Build;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class p58 extends pnf {
    public static final /* synthetic */ bc7[] I0 = {new oi9(p58.class, "fillByEditMessagesAttachmentsJob", "getFillByEditMessagesAttachmentsJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, p58.class, "finalActionJob", "getFinalActionJob()Lkotlinx/coroutines/Job;")};
    public final w7c A0;
    public final j31 B0;
    public final t03 C0;
    public final w7c D0;
    public final w7c E0;
    public final w7c F0;
    public final w4d G0;
    public final w4d H0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final k56 b;
    public final je7 c;
    public final je7 o;
    public final q0e s0;
    public final zt0 t0;
    public volatile List u0;
    public final h7b v0;
    public final s35 w0;
    public final q0e x0;
    public final dua y0;
    public final dua z0;

    public p58(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, fn2 fn2Var) {
        je7 je7Var5 = so2.a;
        this.b = fn2Var;
        this.c = je7Var;
        this.o = je7Var2;
        this.X = je7Var5;
        this.Y = je7Var3;
        this.Z = je7Var4;
        this.s0 = r0e.a(n00.a);
        this.t0 = c37.a(-2, 0, 6);
        this.v0 = new h7b(17);
        this.w0 = new s35(0);
        q0e q0eVarA = r0e.a(nz4.a);
        this.x0 = q0eVarA;
        String[] strArr = eua.m;
        dua duaVar = new dua(strArr);
        this.y0 = duaVar;
        dua duaVar2 = new dua(Build.VERSION.SDK_INT >= 34 ? new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"} : strArr);
        this.z0 = duaVar2;
        int i = 3;
        Continuation continuation = null;
        j31 j31Var = new j31(duaVar, duaVar2, new i58(i, continuation, 0), 4);
        v8b v8bVar = v8b.a;
        c32 c32Var = wld.a;
        w7c w7cVarX = od2.X(j31Var, this.a, c32Var, v8bVar);
        this.A0 = w7cVarX;
        this.B0 = new j31(duaVar, duaVar2, new i58(i, continuation, 1), 4);
        this.C0 = new t03(w7cVarX, 29);
        m58 m58Var = new m58(q0eVarA, 0);
        Boolean bool = Boolean.FALSE;
        this.D0 = od2.X(m58Var, this.a, c32Var, bool);
        m58 m58Var2 = new m58(q0eVarA, 1);
        q0e q0eVar = vc7.f;
        this.E0 = od2.X(new j31(m58Var2, q0eVar, new t11(i, continuation, 1), 4), this.a, c32Var, bool);
        this.F0 = od2.X(new ac(new j31(q0eVar, q0eVarA, g58.s0, 4), 28, this), this.a, c32Var, i5d.b);
        this.G0 = mqd.D();
        this.H0 = mqd.D();
        pnf.n(this, null, null, new h58(this, null), 3);
    }

    public static final xp7 q(p58 p58Var) {
        return (xp7) p58Var.o.getValue();
    }

    public final p4d r() {
        return (p4d) this.X.getValue();
    }

    public final boolean s() {
        return this.b.invoke() != null;
    }

    public final void t(boolean z) {
        zt0 zt0Var = this.t0;
        if (!z) {
            int i = vc7.a;
            if (vc7.b(vc7.c)) {
                zt0Var.n(b48.a);
                return;
            }
        }
        Long l = (Long) this.b.invoke();
        vx3 vx3Var = vx3.b;
        w4d w4dVar = this.H0;
        bc7[] bc7VarArr = I0;
        if (l == null) {
            w4dVar.o1(this, bc7VarArr[1], pnf.n(this, null, vx3Var, new j58(this, null), 1));
            pnf.o(this.w0, y48.a);
            return;
        }
        long jLongValue = l.longValue();
        qyc qycVar = (qyc) ((y7d) this.Z.getValue());
        qycVar.getClass();
        int iQ = (int) qycVar.q(PmsKey.f62maxattachcount, 12);
        if (r().b() > iQ) {
            zt0Var.n(new i48(iQ));
            return;
        }
        w4dVar.o1(this, bc7VarArr[1], j47.S(this.a, ((w9a) ((kke) this.Y.getValue())).b(), vx3Var, new e58(this, jLongValue, null)));
    }

    public final boolean u() {
        if ((!(!((Collection) this.x0.getValue()).isEmpty()) || s()) && (this.u0 == null || tpa.f(this.x0.getValue(), this.u0))) {
            return true;
        }
        this.t0.n(e48.a);
        return false;
    }
}
