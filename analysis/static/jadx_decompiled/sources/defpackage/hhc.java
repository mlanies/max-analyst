package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class hhc extends lhc implements a24 {
    public final m2d Y;

    public hhc(long j, qy5 qy5Var, List list, m2d m2dVar, ArrayList arrayList) {
        super(qy5Var, list, m2dVar, arrayList);
        this.Y = m2dVar;
    }

    @Override // defpackage.a24
    public final boolean A() {
        return this.Y.j();
    }

    @Override // defpackage.a24
    public final long C() {
        return this.Y.d;
    }

    @Override // defpackage.a24
    public final long D(long j) {
        return this.Y.e(j);
    }

    @Override // defpackage.a24
    public final long E(long j, long j2) {
        return this.Y.c(j, j2);
    }

    @Override // defpackage.lhc
    public final String a() {
        return null;
    }

    @Override // defpackage.a24
    public final long b(long j) {
        return this.Y.h(j);
    }

    @Override // defpackage.lhc
    public final a24 c() {
        return this;
    }

    @Override // defpackage.lhc
    public final r4c d() {
        return null;
    }

    @Override // defpackage.a24
    public final long j(long j, long j2) {
        return this.Y.f(j, j2);
    }

    @Override // defpackage.a24
    public final long k(long j, long j2) {
        return this.Y.d(j, j2);
    }

    @Override // defpackage.a24
    public final long m(long j, long j2) {
        m2d m2dVar = this.Y;
        if (m2dVar.f != null) {
            return -9223372036854775807L;
        }
        long jC = m2dVar.c(j, j2) + m2dVar.d(j, j2);
        return (m2dVar.f(jC, j) + m2dVar.h(jC)) - m2dVar.i;
    }

    @Override // defpackage.a24
    /* renamed from: n */
    public final r4c mo7n(long j) {
        return this.Y.i(j, this);
    }

    @Override // defpackage.a24
    public final long v(long j, long j2) {
        return this.Y.g(j, j2);
    }
}
