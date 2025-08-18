package defpackage;

/* loaded from: classes.dex */
public final class qy implements o2a, p2a, z66 {
    public Object X;
    public final /* synthetic */ int a;
    public long b;
    public long c;
    public Object o;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        if (defpackage.np8.H(r9, r6.t, 0, r6.b, r6.j, r6.s) != false) goto L28;
     */
    @Override // defpackage.z66
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy.a(java.lang.Object):void");
    }

    @Override // defpackage.z66
    public void d(Throwable th) {
        h1f h1fVar = (h1f) this.X;
        h1fVar.q.p = 5;
        h1f.a(h1fVar);
    }

    @Override // defpackage.o2a
    public u1d f() {
        np8.f(this.b != -1);
        return new pm5((qm5) this.o, this.b);
    }

    @Override // defpackage.o2a
    public void i(long j) {
        switch (this.a) {
            case 2:
                long[] jArr = (long[]) ((va8) this.X).b;
                this.c = jArr[maf.f(jArr, j, true)];
                break;
            default:
                long[] jArr2 = (long[]) ((h7b) this.X).b;
                this.c = jArr2[oaf.f(jArr2, j, true)];
                break;
        }
    }

    @Override // defpackage.p2a
    public long j(sa4 sa4Var) {
        long j = this.c;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.c = -1L;
        return j2;
    }

    @Override // defpackage.o2a
    public long l(ra4 ra4Var) {
        long j = this.c;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.c = -1L;
        return j2;
    }

    public qy(er7 er7Var) {
        this.a = 1;
        this.X = er7Var;
    }

    @Override // defpackage.p2a
    /* renamed from: f, reason: collision with other method in class */
    public v1d mo47f() {
        fm9.k(this.b != -1);
        return new wd0((qm5) this.o, this.b, 1);
    }

    public qy(int i, int i2, long j) {
        this.a = i2;
        switch (i2) {
            case 5:
                fm9.k(((wc) this.o) == null);
                this.b = j;
                this.c = j + i;
                break;
            default:
                np8.f(((vc) this.o) == null);
                this.b = j;
                this.c = j + i;
                break;
        }
    }

    public qy(h1f h1fVar, long j, long j2, lv4 lv4Var) {
        this.a = 6;
        this.X = h1fVar;
        this.b = j;
        this.c = j2;
        this.o = lv4Var;
    }

    public qy(String str, byte[] bArr, long j, long j2) {
        this.a = 0;
        this.o = str;
        this.X = bArr;
        this.b = j;
        this.c = j2;
    }
}
