package defpackage;

import android.content.Intent;
import android.graphics.Point;
import androidx.recyclerview.widget.b;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.video.CameraManager;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class el1 extends pnf {
    public final khe A0;
    public final khe B0;
    public final w7c C0;
    public final q0e D0;
    public final q0e E0;
    public final q0e F0;
    public final w7c G0;
    public final q0e H0;
    public final q0e I0;
    public final q0e J0;
    public final w7c K0;
    public final khe L0;
    public final s35 M0;
    public final w7c N0;
    public final w7c O0;
    public final je7 P0;
    public final je7 Q0;
    public final ty2 X;
    public final bn1 Y;
    public final eo1 Z;
    public final tta b;
    public final ir1 c;
    public final c11 o;
    public final z21 s0;
    public final ivc t0;
    public final je7 u0;
    public final je7 v0;
    public final w7c w0;
    public final q0e x0;
    public final khe y0;
    public final khe z0;

    public el1(je7 je7Var, tta ttaVar, ir1 ir1Var, c11 c11Var, ty2 ty2Var, bn1 bn1Var, eo1 eo1Var, z21 z21Var, ivc ivcVar, je7 je7Var2) {
        final int i = 3;
        final int i2 = 2;
        final int i3 = 1;
        final int i4 = 0;
        je7 je7Var3 = iyc.l;
        this.b = ttaVar;
        this.c = ir1Var;
        this.o = c11Var;
        this.X = ty2Var;
        this.Y = bn1Var;
        this.Z = eo1Var;
        this.s0 = z21Var;
        this.t0 = ivcVar;
        this.u0 = je7Var2;
        this.v0 = je7Var;
        w7c w7cVar = ir1Var.o;
        this.w0 = w7cVar;
        q0e q0eVarA = r0e.a(new la1());
        this.x0 = q0eVarA;
        this.y0 = new khe(new k56(this) { // from class: ck1
            public final /* synthetic */ el1 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return Boolean.valueOf(((se5) ((qe5) this.b.u0.getValue())).s());
                    case 1:
                        se5 se5Var = (se5) ((qe5) this.b.u0.getValue());
                        se5Var.getClass();
                        return Boolean.valueOf(se5Var.n(PmsKey.gsse, false));
                    case 2:
                        se5 se5Var2 = (se5) ((qe5) this.b.u0.getValue());
                        se5Var2.getClass();
                        return Boolean.valueOf(se5Var2.n(PmsKey.sse, false));
                    case 3:
                        se5 se5Var3 = (se5) ((qe5) this.b.u0.getValue());
                        se5Var3.getClass();
                        return Boolean.valueOf(se5Var3.n(PmsKey.grse, false));
                    default:
                        int i5 = this.b.t0.e ? 6 : 8;
                        b bVar = new b();
                        bVar.setMaxRecycledViews(1, i5);
                        return bVar;
                }
            }
        });
        this.z0 = new khe(new k56(this) { // from class: ck1
            public final /* synthetic */ el1 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(((se5) ((qe5) this.b.u0.getValue())).s());
                    case 1:
                        se5 se5Var = (se5) ((qe5) this.b.u0.getValue());
                        se5Var.getClass();
                        return Boolean.valueOf(se5Var.n(PmsKey.gsse, false));
                    case 2:
                        se5 se5Var2 = (se5) ((qe5) this.b.u0.getValue());
                        se5Var2.getClass();
                        return Boolean.valueOf(se5Var2.n(PmsKey.sse, false));
                    case 3:
                        se5 se5Var3 = (se5) ((qe5) this.b.u0.getValue());
                        se5Var3.getClass();
                        return Boolean.valueOf(se5Var3.n(PmsKey.grse, false));
                    default:
                        int i5 = this.b.t0.e ? 6 : 8;
                        b bVar = new b();
                        bVar.setMaxRecycledViews(1, i5);
                        return bVar;
                }
            }
        });
        this.A0 = new khe(new k56(this) { // from class: ck1
            public final /* synthetic */ el1 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(((se5) ((qe5) this.b.u0.getValue())).s());
                    case 1:
                        se5 se5Var = (se5) ((qe5) this.b.u0.getValue());
                        se5Var.getClass();
                        return Boolean.valueOf(se5Var.n(PmsKey.gsse, false));
                    case 2:
                        se5 se5Var2 = (se5) ((qe5) this.b.u0.getValue());
                        se5Var2.getClass();
                        return Boolean.valueOf(se5Var2.n(PmsKey.sse, false));
                    case 3:
                        se5 se5Var3 = (se5) ((qe5) this.b.u0.getValue());
                        se5Var3.getClass();
                        return Boolean.valueOf(se5Var3.n(PmsKey.grse, false));
                    default:
                        int i5 = this.b.t0.e ? 6 : 8;
                        b bVar = new b();
                        bVar.setMaxRecycledViews(1, i5);
                        return bVar;
                }
            }
        });
        this.B0 = new khe(new k56(this) { // from class: ck1
            public final /* synthetic */ el1 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return Boolean.valueOf(((se5) ((qe5) this.b.u0.getValue())).s());
                    case 1:
                        se5 se5Var = (se5) ((qe5) this.b.u0.getValue());
                        se5Var.getClass();
                        return Boolean.valueOf(se5Var.n(PmsKey.gsse, false));
                    case 2:
                        se5 se5Var2 = (se5) ((qe5) this.b.u0.getValue());
                        se5Var2.getClass();
                        return Boolean.valueOf(se5Var2.n(PmsKey.sse, false));
                    case 3:
                        se5 se5Var3 = (se5) ((qe5) this.b.u0.getValue());
                        se5Var3.getClass();
                        return Boolean.valueOf(se5Var3.n(PmsKey.grse, false));
                    default:
                        int i5 = this.b.t0.e ? 6 : 8;
                        b bVar = new b();
                        bVar.setMaxRecycledViews(1, i5);
                        return bVar;
                }
            }
        });
        w7c w7cVar2 = new w7c(q0eVarA);
        this.C0 = w7cVar2;
        this.D0 = r0e.a(oz4.a);
        nnf nnfVar = nnf.a;
        q0e q0eVarA2 = r0e.a(new h41(new jp1(nnfVar, nz4.a, null, null, false, null, false)));
        this.E0 = q0eVarA2;
        this.F0 = q0eVarA2;
        Continuation continuation = null;
        j31 j31Var = new j31(w7cVar, q0eVarA, new c3(this, continuation, 5), 4);
        u9f u9fVar = u9f.o;
        c32 c32Var = wld.a;
        this.G0 = od2.X(j31Var, this.a, c32Var, u9fVar);
        Boolean bool = Boolean.FALSE;
        this.H0 = r0e.a(bool);
        this.I0 = r0e.a(bool);
        q0e q0eVarA3 = r0e.a(cn1.d);
        this.J0 = q0eVarA3;
        this.K0 = new w7c(q0eVarA3);
        khe kheVar = new khe(new dk1(0));
        this.L0 = kheVar;
        this.M0 = new s35(0);
        this.N0 = od2.X(new xk1(w7cVar, i4), this.a, c32Var, nnfVar);
        xk1 xk1Var = new xk1(w7cVar, i3);
        ez0 ez0Var = ir1Var.l;
        this.O0 = od2.X(od2.s(xk1Var, new xk1(((yz0) ez0Var).F0, i2), new xk1(ir1Var.b(), 3), ((yz0) ez0Var).t0, new vk1(5, null)), this.a, c32Var, bool);
        final int i5 = 4;
        this.P0 = tu0.r(3, new k56(this) { // from class: ck1
            public final /* synthetic */ el1 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return Boolean.valueOf(((se5) ((qe5) this.b.u0.getValue())).s());
                    case 1:
                        se5 se5Var = (se5) ((qe5) this.b.u0.getValue());
                        se5Var.getClass();
                        return Boolean.valueOf(se5Var.n(PmsKey.gsse, false));
                    case 2:
                        se5 se5Var2 = (se5) ((qe5) this.b.u0.getValue());
                        se5Var2.getClass();
                        return Boolean.valueOf(se5Var2.n(PmsKey.sse, false));
                    case 3:
                        se5 se5Var3 = (se5) ((qe5) this.b.u0.getValue());
                        se5Var3.getClass();
                        return Boolean.valueOf(se5Var3.n(PmsKey.grse, false));
                    default:
                        int i52 = this.b.t0.e ? 6 : 8;
                        b bVar = new b();
                        bVar.setMaxRecycledViews(1, i52);
                        return bVar;
                }
            }
        });
        this.Q0 = tu0.r(3, new dk1(1));
        od2.L(new zn5(((ugf) kheVar.getValue()).d, new gk1(2, null), 5), this.a);
        od2.L(new zn5(eo1Var.j, new hk1(this, null), 5), this.a);
        od2.L(od2.s(ir1Var.c.e, w7cVar2, new xk1(ir1Var.e(), 4), new ac(ir1Var.e(), 9, this), new ik1(this, continuation, 0)), this.a);
        od2.L(new zn5(new xk1(ir1Var.f(), 5), new jk1(this, null), 5), this.a);
        j47.T(this.a, ((w9a) ((kke) je7Var3.getValue())).a(), null, new lk1(this, null), 2);
        j47.T(this.a, ((w9a) ((kke) je7Var3.getValue())).a(), null, new nk1(this, null), 2);
        od2.L(new ac(new mn5[]{ir1Var.e(), new qw(w7cVar, 26), new qw(w7cVar2, 27), new qw(w7cVar2, 28), new qw(w7cVar2, 29)}, 22, new uk1(this, null)), this.a);
        od2.L(new zn5(((yz0) ez0Var).D0, new ok1(this, null), 5), this.a);
    }

    public final boolean q(boolean z) {
        return !(s().g || z) || s().g || s().t;
    }

    public final void r() {
        Object value;
        q0e q0eVar = this.c.n;
        do {
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, to1.a((to1) value, null, null, null, null, false, null, 0L, 247)));
    }

    public final la1 s() {
        return (la1) this.C0.a.getValue();
    }

    public final void t(boolean z) {
        q0e q0eVar;
        Object value;
        do {
            q0eVar = this.H0;
            value = q0eVar.getValue();
            ((Boolean) value).getClass();
        } while (!q0eVar.c(value, Boolean.valueOf(z)));
    }

    public final boolean u() {
        return ((Boolean) this.y0.getValue()).booleanValue();
    }

    public final void v(gg1 gg1Var) {
        fqa fqaVarD = this.c.d();
        if (gg1Var.equals(fqaVarD.a.getId()) || fqaVarD.a.m()) {
            pnf.o(this.M0, new lj1(gg1Var));
        }
    }

    public final void w(boolean z, Intent intent) {
        Conversation conversationA;
        ir1 ir1Var = this.c;
        xuc xucVar = ir1Var.h;
        if (!z || !xucVar.c()) {
            if (z && (conversationA = ((fw3) xucVar.a.getValue()).a()) != null && !conversationA.isDestroyed() && intent != null) {
                CameraManager cameraManagerA = ir1Var.e.a();
                if (cameraManagerA != null) {
                    cameraManagerA.setCameraEnabled(false);
                }
                ir1Var.g.a = intent;
                xucVar.b(true);
            } else if (!z && xucVar.c()) {
                xucVar.b(false);
            }
        }
        bt1 bt1Var = (bt1) this.v0.getValue();
        boolean z2 = ((la1) this.C0.a.getValue()).g;
        bt1Var.getClass();
        bt1.c(bt1Var, "SCREEN_SHARE", null, null, Long.valueOf(z ? 1L : 0L), null, null, z2, 54);
    }

    public final void x(gg1 gg1Var, Point point) {
        v31 v31VarA = this.Z.a(gg1Var, point);
        if (v31VarA == null) {
            return;
        }
        ((bt1) this.v0.getValue()).a(gg1Var.a, (LinkedHashMap) v31VarA.c);
        pnf.o(this.M0, new tj1(v31VarA));
    }
}
