package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class rk6 implements sk6 {
    public final long b;
    public final long c;
    public final List d;
    public final boolean e;

    public rk6(sk6 sk6Var) {
        this.b = sk6Var.g();
        this.c = sk6Var.h();
        this.d = x53.D0(sk6Var.i());
        sk6Var.b();
        this.e = sk6Var.a();
    }

    @Override // defpackage.sk6
    public final boolean a() {
        return this.e;
    }

    @Override // defpackage.sk6
    public final void b() {
    }

    @Override // defpackage.sk6
    public final long g() {
        return this.b;
    }

    @Override // defpackage.sk6
    public final long h() {
        return this.c;
    }

    @Override // defpackage.sk6
    public final List i() {
        return this.d;
    }
}
