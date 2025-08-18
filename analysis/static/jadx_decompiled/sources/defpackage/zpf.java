package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class zpf implements ax1 {
    public final ax1 a;
    public final ejc b;
    public final bqf c;
    public final k9f o;

    public zpf(ax1 ax1Var, k9f k9fVar, bqc bqcVar) {
        this.a = ax1Var;
        this.o = k9fVar;
        this.b = new ejc(ax1Var.g(), bqcVar);
        this.c = new bqf(ax1Var.p());
    }

    @Override // defpackage.k9f
    public final void c(l9f l9fVar) {
        kq0.e();
        this.o.c(l9fVar);
    }

    @Override // defpackage.k9f
    public final void e(l9f l9fVar) {
        kq0.e();
        this.o.e(l9fVar);
    }

    @Override // defpackage.ax1
    public final ry9 f() {
        return this.a.f();
    }

    @Override // defpackage.ax1
    public final hw1 g() {
        return this.b;
    }

    @Override // defpackage.k9f
    public final void i(l9f l9fVar) {
        kq0.e();
        this.o.i(l9fVar);
    }

    @Override // defpackage.ax1
    public final void k(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.ax1
    public final void l(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.k9f
    public final void m(l9f l9fVar) {
        kq0.e();
        this.o.m(l9fVar);
    }

    @Override // defpackage.ax1
    public final boolean n() {
        return false;
    }

    @Override // defpackage.ax1
    public final yw1 p() {
        return this.c;
    }
}
