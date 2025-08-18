package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class z96 extends pnf {
    public static final /* synthetic */ int R0 = 0;
    public final q0e A0;
    public final q0e B0;
    public final w7c C0;
    public final zt0 D0;
    public final f32 E0;
    public final p4d F0;
    public boolean G0;
    public x77 H0;
    public vxd I0;
    public final je7 J0;
    public final b96 K0;
    public vxd L0;
    public final c96 M0;
    public final q96 N0;
    public final q0e O0;
    public final khe P0;
    public final s35 Q0;
    public final hq7 X;
    public final s86 Y;
    public final je7 Z;
    public final d86 b;
    public final Context c;
    public final ox3 o;
    public final je7 s0;
    public final je7 t0;
    public final q0e u0;
    public final q0e v0;
    public final q0e w0;
    public final j96 x0;
    public w86 y0;
    public final q0e z0;

    /* JADX WARN: Type inference failed for: r13v7, types: [b96, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [c96, java.lang.Object] */
    public z96(d86 d86Var, Context context, qj qjVar, xp7 xp7Var, hq7 hq7Var, je7 je7Var, je7 je7Var2, s86 s86Var) {
        int i = 1;
        int i2 = 5;
        int i3 = 0;
        je7 je7Var3 = iyc.m;
        je7 je7Var4 = iyc.l;
        this.b = d86Var;
        this.c = context;
        this.o = qjVar;
        this.X = hq7Var;
        this.Y = s86Var;
        this.Z = je7Var4;
        this.s0 = je7Var;
        this.t0 = je7Var2;
        nz4 nz4Var = nz4.a;
        this.u0 = r0e.a(nz4Var);
        Boolean bool = Boolean.FALSE;
        this.v0 = r0e.a(bool);
        q0e q0eVarA = r0e.a(nz4Var);
        this.w0 = q0eVarA;
        this.x0 = new j96(q0eVarA, this, 2);
        this.y0 = tpa.a(context);
        q0e q0eVarA2 = r0e.a(bool);
        this.z0 = q0eVarA2;
        this.A0 = q0eVarA2;
        q0e q0eVarA3 = r0e.a(null);
        this.B0 = q0eVarA3;
        this.C0 = new w7c(q0eVarA3);
        zt0 zt0VarA = c37.a(-2, 0, 6);
        this.D0 = zt0VarA;
        this.E0 = od2.R(zt0VarA);
        p4d p4dVar = xp7Var.f;
        this.F0 = p4dVar;
        this.J0 = je7Var3;
        ?? r13 = new m4d() { // from class: b96
            @Override // defpackage.m4d
            public final void s1(r4d r4dVar) {
                z96 z96Var = this.a;
                pnf.n(z96Var, ((w9a) z96Var.s()).e().plus(z96Var.o), null, new r96(z96Var, r4dVar, null), 2);
            }
        };
        this.K0 = r13;
        ?? r14 = new n4d() { // from class: c96
            @Override // defpackage.n4d
            public final void B1(Set set) {
                Boolean boolValueOf = Boolean.valueOf(set.size() >= 100);
                z96 z96Var = this.a;
                z96Var.v0.m(null, boolValueOf);
                hm9.n("z96", "onSelectedMediasChangeListener(), selectedCount " + set.size());
                if (!set.isEmpty()) {
                    vxd vxdVar = z96Var.L0;
                    if (vxdVar != null) {
                        vxdVar.cancel((CancellationException) null);
                    }
                    z96Var.L0 = pnf.n(z96Var, z96Var.o, null, new t96(z96Var, set, null), 2);
                } else {
                    z96.r(z96Var, false, 1);
                }
                ArrayList arrayListX = dy7.x(z96Var.F0);
                s86 s86Var2 = z96Var.Y;
                s86Var2.getClass();
                pnf.o(s86Var2.c, new m86(arrayListX));
            }
        };
        this.M0 = r14;
        q96 q96Var = new q96(this);
        this.N0 = q96Var;
        this.O0 = r0e.a(null);
        khe kheVar = new khe(new es3(21, this));
        this.P0 = kheVar;
        s35 s35Var = new s35(0);
        this.Q0 = s35Var;
        fz6 fz6Var = (fz6) hq7Var;
        x77 x77Var = fz6Var.y0;
        if (x77Var == null || !x77Var.isCompleted()) {
            fz6Var.f();
        }
        hm9.n("z96", "init");
        mn5 mn5VarF = od2.F(new zn5(new j96(d86Var.b ? fz6Var.Z : fz6Var.u0, this, i3), new l96(this, null), i2), ((w9a) s()).e());
        ContextScope contextScope = this.a;
        od2.L(mn5VarF, j1e.F(contextScope, qjVar));
        od2.L(od2.F(new zn5(new j96(fz6Var.w0, this, i), new m96(this, null), i2), ((w9a) s()).a()), j1e.F(contextScope, qjVar));
        if (d86Var.c) {
            p4dVar.c.add(r14);
            p4dVar.e.add(q96Var);
            p4dVar.f.add(r13);
            p4dVar.m.add((d96) kheVar.getValue());
        }
        int i4 = ft4.o;
        od2.L(new zn5(m6d.O(s35Var, z7.S(300L, kt4.MILLISECONDS)), new n96(this, null), i2), j1e.F(contextScope, qjVar));
    }

    public static final Object q(z96 z96Var, List list, Continuation continuation) {
        return j47.t0(((w9a) z96Var.s()).e(), new x96(z96Var, list, null), continuation);
    }

    public static void r(z96 z96Var, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        z96Var.getClass();
        hm9.n("z96", "clearSelections()");
        if (z2) {
            p4d p4dVar = z96Var.F0;
            p4dVar.a.clear();
            p4dVar.n();
            p4dVar.b.clear();
            if (((jp) p4dVar.h).g.getBoolean("app.send.media.as.collage", true)) {
                p4dVar.l = 3;
            } else {
                p4dVar.l = 1;
            }
        }
        pnf.n(z96Var, ((w9a) z96Var.s()).e().plus(z96Var.o), null, new e96(z96Var, z, null), 2);
        nz4 nz4Var = nz4.a;
        s86 s86Var = z96Var.Y;
        s86Var.getClass();
        pnf.o(s86Var.c, new m86(nz4Var));
    }

    @Override // defpackage.pnf
    public final void p() {
        hm9.n("z96", "onCleared()");
        p4d p4dVar = this.F0;
        p4dVar.e.remove(this.N0);
        p4dVar.f.remove(this.K0);
        p4dVar.c.remove(this.M0);
        p4dVar.m.remove((d96) this.P0.getValue());
        ConcurrentHashMap concurrentHashMap = ((fz6) this.X).A0;
        for (a86 a86Var : concurrentHashMap.keySet()) {
            if (a86Var instanceof v76) {
                concurrentHashMap.put(a86Var, nz4.a);
            }
        }
    }

    public final kke s() {
        return (kke) this.Z.getValue();
    }

    public final int t(zp7 zp7Var) {
        return this.F0.g(ay7.H(zp7Var));
    }

    public final int u(zp7 zp7Var, boolean z) {
        hm9.n("z96", "onItemSelect: " + zp7Var);
        this.G0 = true;
        up7 up7VarH = ay7.H(zp7Var);
        p4d p4dVar = this.F0;
        int iG = p4dVar.g(up7VarH);
        if (iG == 0 && ((Boolean) this.v0.getValue()).booleanValue()) {
            return 0;
        }
        qyc qycVar = (qyc) ((y7d) this.t0.getValue());
        qycVar.getClass();
        int iQ = (int) qycVar.q(PmsKey.f62maxattachcount, 12);
        s86 s86Var = this.Y;
        if (((Boolean) s86Var.b.invoke()).booleanValue() && iG == 0 && p4dVar.b() >= iQ) {
            pnf.o(s86Var.c, new o86(iQ));
            return 0;
        }
        if (z) {
            p4dVar.r(up7VarH);
        }
        pnf.n(this, ((w9a) s()).e().plus(this.o), null, new p96(this, null), 2);
        this.G0 = false;
        return p4dVar.g(ay7.H(zp7Var));
    }
}
