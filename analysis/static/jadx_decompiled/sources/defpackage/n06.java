package defpackage;

import androidx.media3.common.PlaybackException;
import java.util.List;

/* loaded from: classes.dex */
public final class n06 implements n3b {
    public final x4b a;
    public final n3b b;

    public n06(x4b x4bVar, n3b n3bVar) {
        this.a = x4bVar;
        this.b = n3bVar;
    }

    @Override // defpackage.n3b
    public final void G(int i, tb8 tb8Var) {
        this.b.G(i, tb8Var);
    }

    @Override // defpackage.n3b
    public final void O(boolean z) {
        this.b.O(z);
    }

    @Override // defpackage.n3b
    public final void S(zz3 zz3Var) {
        this.b.S(zz3Var);
    }

    @Override // defpackage.n3b
    public final void X(p0f p0fVar) {
        this.b.X(p0fVar);
    }

    @Override // defpackage.n3b
    public final void Y(q3b q3bVar, l3b l3bVar) {
        this.b.Y(this.a, l3bVar);
    }

    @Override // defpackage.n3b
    public final void a(int i) {
        this.b.a(i);
    }

    @Override // defpackage.n3b
    public final void a0(long j) {
        this.b.a0(j);
    }

    @Override // defpackage.n3b
    public final void b0(gd8 gd8Var) {
        this.b.b0(gd8Var);
    }

    @Override // defpackage.n3b
    public final void c(boolean z) {
        this.b.c(z);
    }

    @Override // defpackage.n3b
    public final void c0(gd8 gd8Var) {
        this.b.c0(gd8Var);
    }

    @Override // defpackage.n3b
    public final void d(int i, boolean z) {
        this.b.d(i, z);
    }

    @Override // defpackage.n3b
    public final void d0(long j) {
        this.b.d0(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n06)) {
            return false;
        }
        n06 n06Var = (n06) obj;
        if (this.a.equals(n06Var.a)) {
            return this.b.equals(n06Var.b);
        }
        return false;
    }

    @Override // defpackage.n3b
    public final void f(float f) {
        this.b.f(f);
    }

    @Override // defpackage.n3b
    public final void f0(mue mueVar, int i) {
        this.b.f0(mueVar, i);
    }

    @Override // defpackage.n3b
    public final void h(int i) {
        this.b.h(i);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.n3b
    public final void i(int i, boolean z) {
        this.b.i(i, z);
    }

    @Override // defpackage.n3b
    public final void i0() {
        this.b.i0();
    }

    @Override // defpackage.n3b
    public final void j(boolean z) {
        this.b.j(z);
    }

    @Override // defpackage.n3b
    public final void k(List list) {
        this.b.k(list);
    }

    @Override // defpackage.n3b
    public final void l(int i, boolean z) {
        this.b.l(i, z);
    }

    @Override // defpackage.n3b
    public final void m(int i, int i2) {
        this.b.m(i, i2);
    }

    @Override // defpackage.n3b
    public final void n(boolean z) {
        this.b.n(z);
    }

    @Override // defpackage.n3b
    public final void o(boolean z) {
        this.b.c(z);
    }

    @Override // defpackage.n3b
    public final void onRepeatModeChanged(int i) {
        this.b.onRepeatModeChanged(i);
    }

    @Override // defpackage.n3b
    public final void p(int i) {
        this.b.p(i);
    }

    @Override // defpackage.n3b
    public final void p0(c3b c3bVar) {
        this.b.p0(c3bVar);
    }

    @Override // defpackage.n3b
    public final void q(p3b p3bVar, p3b p3bVar2, int i) {
        this.b.q(p3bVar, p3bVar2, i);
    }

    @Override // defpackage.n3b
    public final void q0(k3b k3bVar) {
        this.b.q0(k3bVar);
    }

    @Override // defpackage.n3b
    public final void r0(PlaybackException playbackException) {
        this.b.r0(playbackException);
    }

    @Override // defpackage.n3b
    public final void s0(f99 f99Var) {
        this.b.s0(f99Var);
    }

    @Override // defpackage.n3b
    public final void t0(ui4 ui4Var) {
        this.b.t0(ui4Var);
    }

    @Override // defpackage.n3b
    public final void u(h30 h30Var) {
        this.b.u(h30Var);
    }

    @Override // defpackage.n3b
    public final void u0(long j) {
        this.b.u0(j);
    }

    @Override // defpackage.n3b
    public final void v(jlf jlfVar) {
        this.b.v(jlfVar);
    }

    @Override // defpackage.n3b
    public final void x0(PlaybackException playbackException) {
        this.b.x0(playbackException);
    }

    @Override // defpackage.n3b
    public final void y(j0f j0fVar) {
        this.b.y(j0fVar);
    }
}
