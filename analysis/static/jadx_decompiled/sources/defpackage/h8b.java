package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h8b extends l9f {
    public static final f8b x = new f8b();
    public static final zh6 y = ju0.D();
    public g8b p;
    public Executor q;
    public bad r;
    public xf4 s;
    public iee t;
    public see u;
    public nw4 v;
    public cad w;

    @Override // defpackage.l9f
    public final void C(Rect rect) {
        this.i = rect;
        ax1 ax1VarC = c();
        iee ieeVar = this.t;
        if (ax1VarC == null || ieeVar == null) {
            return;
        }
        kq0.H(new ft0(ieeVar, h(ax1VarC, n(ax1VarC)), b(), 5));
    }

    public final void F() {
        cad cadVar = this.w;
        if (cadVar != null) {
            cadVar.b();
            this.w = null;
        }
        xf4 xf4Var = this.s;
        if (xf4Var != null) {
            xf4Var.a();
            this.s = null;
        }
        nw4 nw4Var = this.v;
        if (nw4Var != null) {
            nw4Var.n();
            this.v = null;
        }
        iee ieeVar = this.t;
        if (ieeVar != null) {
            ieeVar.c();
            this.t = null;
        }
        this.u = null;
    }

    public final void G(g8b g8bVar) {
        kq0.e();
        if (g8bVar == null) {
            this.p = null;
            this.c = 2;
            r();
            return;
        }
        this.p = g8bVar;
        this.q = y;
        vb0 vb0Var = this.g;
        if ((vb0Var != null ? vb0Var.a : null) != null) {
            H((i8b) this.f, vb0Var);
            q();
        }
        p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(i8b i8bVar, vb0 vb0Var) {
        Rect rect;
        kq0.e();
        ax1 ax1VarC = c();
        Objects.requireNonNull(ax1VarC);
        F();
        c54.p(null, this.t == null);
        Matrix matrix = this.j;
        boolean zN = ax1VarC.n();
        Size size = vb0Var.a;
        Rect rect2 = this.i;
        if (rect2 != null) {
            rect = rect2;
        } else {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        iee ieeVar = new iee(1, 34, vb0Var, matrix, zN, rect, h(ax1VarC, n(ax1VarC)), b(), ax1VarC.n() && n(ax1VarC));
        this.t = ieeVar;
        zgf zgfVar = this.m;
        if (zgfVar != null) {
            this.v = new nw4(ax1VarC, new mee(zgfVar));
            this.t.a(new nn6(28, this));
            iee ieeVar2 = this.t;
            int i = ieeVar2.f;
            int i2 = ieeVar2.i;
            Rect rect3 = ieeVar2.d;
            cb0 cb0Var = new cb0(UUID.randomUUID(), i, ieeVar2.a, rect3, e1f.g(e1f.e(rect3), i2), ieeVar2.i, ieeVar2.e, false);
            iee ieeVar3 = (iee) this.v.r(new ac0(this.t, Collections.singletonList(cb0Var))).get(cb0Var);
            Objects.requireNonNull(ieeVar3);
            ieeVar3.a(new do9(this, 14, ax1VarC));
            this.u = ieeVar3.d(ax1VarC, true);
            iee ieeVar4 = this.t;
            ieeVar4.getClass();
            kq0.e();
            ieeVar4.b();
            c54.p("Consumer can only be linked once.", !ieeVar4.j);
            ieeVar4.j = true;
            this.s = ieeVar4.l;
        } else {
            ieeVar.a(new nn6(28, this));
            see seeVarD = this.t.d(ax1VarC, true);
            this.u = seeVarD;
            this.s = seeVarD.l;
        }
        if (this.p != null) {
            ax1 ax1VarC2 = c();
            iee ieeVar5 = this.t;
            if (ax1VarC2 != null && ieeVar5 != null) {
                kq0.H(new ft0(ieeVar5, h(ax1VarC2, n(ax1VarC2)), b(), 5));
            }
            g8b g8bVar = this.p;
            g8bVar.getClass();
            see seeVar = this.u;
            seeVar.getClass();
            this.q.execute(new do9(g8bVar, 15, seeVar));
        }
        bad badVarD = bad.d(i8bVar, vb0Var.a);
        u40 u40Var = badVarD.b;
        u40Var.getClass();
        ((mi9) u40Var.f).j(kz1.k, vb0Var.c);
        int iX = i8bVar.X();
        if (iX != 0) {
            u40Var.getClass();
            if (iX != 0) {
                ((mi9) u40Var.f).j(o9f.p0, Integer.valueOf(iX));
            }
        }
        ce3 ce3Var = vb0Var.d;
        if (ce3Var != null) {
            u40Var.c(ce3Var);
        }
        if (this.p != null) {
            badVarD.b(this.s, vb0Var.b, ((Integer) ((ev6) this.f).f(ev6.E, -1)).intValue());
        }
        cad cadVar = this.w;
        if (cadVar != null) {
            cadVar.b();
        }
        cad cadVar2 = new cad(new kt6(3, this));
        this.w = cadVar2;
        badVarD.f = cadVar2;
        this.r = badVarD;
        Object[] objArr = {badVarD.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
    }

    @Override // defpackage.l9f
    public final o9f f(boolean z, r9f r9fVar) {
        x.getClass();
        i8b i8bVar = f8b.a;
        ce3 ce3VarA = r9fVar.a(i8bVar.N(), 1);
        if (z) {
            ce3VarA = ce3.K(ce3VarA, i8bVar);
        }
        if (ce3VarA == null) {
            return null;
        }
        return new i8b(wma.a(((mt6) l(ce3VarA)).b));
    }

    @Override // defpackage.l9f
    public final Set j() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // defpackage.l9f
    public final n9f l(ce3 ce3Var) {
        return new mt6(mi9.c(ce3Var), 2);
    }

    public final String toString() {
        return "Preview:".concat(g());
    }

    @Override // defpackage.l9f
    public final o9f u(yw1 yw1Var, n9f n9fVar) {
        ((mi9) n9fVar.F()).j(tu6.z, 34);
        return n9fVar.J();
    }

    @Override // defpackage.l9f
    public final vb0 x(ce3 ce3Var) {
        this.r.a(ce3Var);
        Object[] objArr = {this.r.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        x3c x3cVarA = this.g.a();
        x3cVarA.X = ce3Var;
        return x3cVarA.c();
    }

    @Override // defpackage.l9f
    public final vb0 y(vb0 vb0Var, vb0 vb0Var2) {
        H((i8b) this.f, vb0Var);
        return vb0Var;
    }

    @Override // defpackage.l9f
    public final void z() {
        F();
    }
}
