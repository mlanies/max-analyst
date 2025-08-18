package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class wr8 implements n85 {
    public final n85 a;
    public final rze b;

    public wr8(n85 n85Var, rze rzeVar) {
        this.a = n85Var;
        this.b = rzeVar;
    }

    @Override // defpackage.n85
    public final rze a() {
        return this.b;
    }

    @Override // defpackage.n85
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.n85
    public final void c(boolean z) {
        this.a.c(z);
    }

    @Override // defpackage.n85
    public final qy5 d(int i) {
        return this.b.d[this.a.f(i)];
    }

    @Override // defpackage.n85
    public final void e() {
        this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr8)) {
            return false;
        }
        wr8 wr8Var = (wr8) obj;
        return this.a.equals(wr8Var.a) && this.b.equals(wr8Var.b);
    }

    @Override // defpackage.n85
    public final int f(int i) {
        return this.a.f(i);
    }

    @Override // defpackage.n85
    public final int g(long j, List list) {
        return this.a.g(j, list);
    }

    @Override // defpackage.n85
    public final void h() {
        this.a.h();
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + 527) * 31);
    }

    @Override // defpackage.n85
    public final int i() {
        return this.a.i();
    }

    @Override // defpackage.n85
    public final qy5 j() {
        return this.b.d[this.a.i()];
    }

    @Override // defpackage.n85
    public final int k() {
        return this.a.k();
    }

    @Override // defpackage.n85
    public final void l(float f) {
        this.a.l(f);
    }

    @Override // defpackage.n85
    public final int length() {
        return this.a.length();
    }

    @Override // defpackage.n85
    public final Object m() {
        return this.a.m();
    }

    @Override // defpackage.n85
    public final void n() {
        this.a.n();
    }

    @Override // defpackage.n85
    public final void o() {
        this.a.o();
    }

    @Override // defpackage.n85
    public final int p(int i) {
        return this.a.p(i);
    }

    @Override // defpackage.n85
    public final boolean q(int i, long j) {
        return this.a.q(i, j);
    }

    @Override // defpackage.n85
    public final void r(long j, long j2, long j3, List list, i78[] i78VarArr) {
        this.a.r(j, j2, j3, list, i78VarArr);
    }

    @Override // defpackage.n85
    public final int s(qy5 qy5Var) {
        return this.a.p(this.b.d(qy5Var));
    }

    @Override // defpackage.n85
    public final boolean t(long j, j13 j13Var, List list) {
        return this.a.t(j, j13Var, list);
    }

    @Override // defpackage.n85
    public final boolean u(int i, long j) {
        return this.a.u(i, j);
    }
}
