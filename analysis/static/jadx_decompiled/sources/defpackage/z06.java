package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.a;
import androidx.fragment.app.b;

/* loaded from: classes.dex */
public final class z06 extends br7 implements m3a, a4a, r3a, s3a, ynf, j3a, i8, isc, p16, yq8 {
    public final Activity t0;
    public final Context u0;
    public final Handler v0;
    public final n16 w0;
    public final /* synthetic */ b x0;

    public z06(b bVar) {
        this.x0 = bVar;
        Handler handler = new Handler();
        this.t0 = bVar;
        this.u0 = bVar;
        this.v0 = handler;
        this.w0 = new n16();
    }

    @Override // defpackage.br7
    public final View J(int i) {
        return this.x0.findViewById(i);
    }

    @Override // defpackage.br7
    public final boolean K() {
        Window window = this.x0.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.eh7
    public final gh7 Q() {
        return this.x0.F0;
    }

    @Override // defpackage.p16
    public final void a(a aVar) {
        this.x0.getClass();
    }

    public final void i0(e16 e16Var) {
        this.x0.s(e16Var);
    }

    public final void j0(tj3 tj3Var) {
        this.x0.t(tj3Var);
    }

    public final void k0(d16 d16Var) {
        this.x0.A(d16Var);
    }

    public final void l0(d16 d16Var) {
        this.x0.B(d16Var);
    }

    public final void m0(d16 d16Var) {
        this.x0.C(d16Var);
    }

    public final void n0(e16 e16Var) {
        this.x0.J(e16Var);
    }

    public final void o0(d16 d16Var) {
        this.x0.K(d16Var);
    }

    public final void p0(d16 d16Var) {
        this.x0.L(d16Var);
    }

    public final void q0(d16 d16Var) {
        this.x0.N(d16Var);
    }

    public final void r0(d16 d16Var) {
        this.x0.P(d16Var);
    }

    @Override // defpackage.ynf
    public final xnf w() {
        return this.x0.w();
    }

    @Override // defpackage.isc
    public final mm y() {
        return (mm) this.x0.o.o;
    }
}
