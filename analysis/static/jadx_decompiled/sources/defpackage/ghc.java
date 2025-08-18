package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ghc extends khc implements z14 {
    public final l2d Y;

    public ghc(long j, oy5 oy5Var, List list, l2d l2dVar, ArrayList arrayList) {
        super(oy5Var, list, l2dVar, arrayList);
        this.Y = l2dVar;
    }

    @Override // defpackage.z14, defpackage.a24
    public final boolean A() {
        return this.Y.j();
    }

    @Override // defpackage.z14, defpackage.a24
    public final long C() {
        return this.Y.d;
    }

    @Override // defpackage.z14, defpackage.a24
    public final long D(long j) {
        return this.Y.e(j);
    }

    @Override // defpackage.z14, defpackage.a24
    public final long E(long j, long j2) {
        return this.Y.c(j, j2);
    }

    @Override // defpackage.khc
    public final String a() {
        return null;
    }

    @Override // defpackage.z14, defpackage.a24
    public final long b(long j) {
        return this.Y.h(j);
    }

    @Override // defpackage.khc
    public final z14 c() {
        return this;
    }

    @Override // defpackage.khc
    public final q4c d() {
        return null;
    }

    @Override // defpackage.z14, defpackage.a24
    public final long j(long j, long j2) {
        return this.Y.f(j, j2);
    }

    @Override // defpackage.z14, defpackage.a24
    public final long k(long j, long j2) {
        return this.Y.d(j, j2);
    }

    @Override // defpackage.z14, defpackage.a24
    public final long m(long j, long j2) {
        l2d l2dVar = this.Y;
        if (l2dVar.f != null) {
            return -9223372036854775807L;
        }
        long jC = l2dVar.c(j, j2) + l2dVar.d(j, j2);
        return (l2dVar.f(jC, j) + l2dVar.h(jC)) - l2dVar.i;
    }

    @Override // defpackage.z14
    public final q4c n(long j) {
        return this.Y.i(j, this);
    }

    @Override // defpackage.z14, defpackage.a24
    public final long v(long j, long j2) {
        return this.Y.g(j, j2);
    }
}
