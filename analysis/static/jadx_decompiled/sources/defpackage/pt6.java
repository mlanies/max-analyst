package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pt6 extends l9f {
    public static final nt6 u = new nt6();
    public final qt6 p;
    public final Object q;
    public bad r;
    public fw6 s;
    public cad t;

    public pt6(st6 st6Var) {
        super(st6Var);
        this.q = new Object();
        if (((Integer) ((st6) this.f).f(st6.b, 0)).intValue() == 1) {
            this.p = new rt6();
        } else {
            this.p = new vt6((Executor) st6Var.f(ose.f0, ju0.w()));
        }
        this.p.b = G();
        this.p.c = ((Boolean) ((st6) this.f).f(st6.Z, Boolean.FALSE)).booleanValue();
    }

    @Override // defpackage.l9f
    public final void A(Matrix matrix) {
        super.A(matrix);
        qt6 qt6Var = this.p;
        synchronized (qt6Var.w0) {
            qt6Var.Z = matrix;
            new Matrix(qt6Var.Z);
            qt6Var.getClass();
        }
    }

    @Override // defpackage.l9f
    public final void C(Rect rect) {
        this.i = rect;
        qt6 qt6Var = this.p;
        synchronized (qt6Var.w0) {
            qt6Var.Y = rect;
            new Rect(qt6Var.Y);
            qt6Var.getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bad F(defpackage.st6 r14, defpackage.vb0 r15) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt6.F(st6, vb0):bad");
    }

    public final int G() {
        return ((Integer) ((st6) this.f).f(st6.X, 1)).intValue();
    }

    @Override // defpackage.l9f
    public final o9f f(boolean z, r9f r9fVar) {
        u.getClass();
        st6 st6Var = nt6.a;
        ce3 ce3VarA = r9fVar.a(st6Var.N(), 1);
        if (z) {
            ce3VarA = ce3.K(ce3VarA, st6Var);
        }
        if (ce3VarA == null) {
            return null;
        }
        return new st6(wma.a(((mt6) l(ce3VarA)).b));
    }

    @Override // defpackage.l9f
    public final n9f l(ce3 ce3Var) {
        return new mt6(mi9.c(ce3Var), 0);
    }

    @Override // defpackage.l9f
    public final void s() {
        this.p.x0 = true;
    }

    public final String toString() {
        return "ImageAnalysis:".concat(g());
    }

    @Override // defpackage.l9f
    public final o9f u(yw1 yw1Var, n9f n9fVar) {
        Boolean bool = (Boolean) ((st6) this.f).f(st6.Y, null);
        yw1Var.p().d(OnePixelShiftQuirk.class);
        qt6 qt6Var = this.p;
        if (bool != null) {
            bool.booleanValue();
        }
        qt6Var.getClass();
        synchronized (this.q) {
        }
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
        st6 st6Var = (st6) this.f;
        e();
        bad badVarF = F(st6Var, vb0Var);
        this.r = badVarF;
        Object[] objArr = {badVarF.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        return vb0Var;
    }

    @Override // defpackage.l9f
    public final void z() {
        kq0.e();
        cad cadVar = this.t;
        if (cadVar != null) {
            cadVar.b();
            this.t = null;
        }
        fw6 fw6Var = this.s;
        if (fw6Var != null) {
            fw6Var.a();
            this.s = null;
        }
        qt6 qt6Var = this.p;
        qt6Var.x0 = false;
        qt6Var.c();
    }
}
