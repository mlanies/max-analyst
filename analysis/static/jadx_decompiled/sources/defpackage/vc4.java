package defpackage;

/* loaded from: classes.dex */
public final class vc4 implements o2a, p2a {
    public long X;
    public long Y;
    public long Z;
    public final /* synthetic */ int a = 0;
    public final long b;
    public final long c;
    public int o;
    public long s0;
    public long t0;
    public long u0;
    public long v0;
    public final Object w0;
    public final Object x0;

    public vc4(a9e a9eVar, long j, long j2, long j3, long j4, boolean z) {
        np8.d(j >= 0 && j2 > j);
        this.x0 = a9eVar;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.X = j4;
            this.o = 4;
        } else {
            this.o = 0;
        }
        this.w0 = new n2a(0);
    }

    @Override // defpackage.o2a
    public u1d f() {
        if (this.X != 0) {
            return new tc4(this);
        }
        return null;
    }

    @Override // defpackage.o2a
    public final void i(long j) {
        switch (this.a) {
            case 0:
                this.Z = maf.k(j, 0L, this.X - 1);
                this.o = 2;
                this.s0 = this.b;
                this.t0 = this.c;
                this.u0 = 0L;
                this.v0 = this.X;
                break;
            default:
                this.Z = oaf.k(j, 0L, this.X - 1);
                this.o = 2;
                this.s0 = this.b;
                this.t0 = this.c;
                this.u0 = 0L;
                this.v0 = this.X;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // defpackage.p2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long j(defpackage.sa4 r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vc4.j(sa4):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // defpackage.o2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long l(defpackage.ra4 r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vc4.l(ra4):long");
    }

    @Override // defpackage.p2a
    /* renamed from: f */
    public v1d mo47f() {
        if (this.X != 0) {
            return new uc4(this);
        }
        return null;
    }

    public vc4(a9e a9eVar, long j, long j2, long j3, long j4, boolean z, byte b) {
        fm9.f(j >= 0 && j2 > j);
        this.x0 = a9eVar;
        this.b = j;
        this.c = j2;
        if (j3 != j2 - j && !z) {
            this.o = 0;
        } else {
            this.X = j4;
            this.o = 4;
        }
        this.w0 = new n2a(1);
    }
}
