package defpackage;

/* loaded from: classes2.dex */
public final class wgf implements zcf {
    public final long a;
    public final String b;
    public final wcf c;
    public final j0e d;
    public final b00 e;
    public final gld f;

    public wgf(long j, String str, wcf wcfVar, w7c w7cVar, b00 b00Var, v7c v7cVar) {
        this.a = j;
        this.b = str;
        this.c = wcfVar;
        this.d = w7cVar;
        this.e = b00Var;
        this.f = v7cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    @Override // defpackage.zcf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r7 = this;
            ijf r0 = r7.d()
            r1 = 0
            r2 = 1
            long r3 = r7.a
            if (r0 == 0) goto L1f
            long r5 = r0.a
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L1f
            ijf r0 = r7.d()
            if (r0 == 0) goto L19
            int r0 = r0.X
            goto L1a
        L19:
            r0 = r1
        L1a:
            r5 = 5
            if (r0 != r5) goto L1f
            r0 = r2
            goto L20
        L1f:
            r0 = r1
        L20:
            b00 r5 = r7.e
            boolean r5 = r5 instanceof defpackage.zz
            if (r5 == 0) goto L2e
            boolean r5 = r7.e()
            if (r5 != 0) goto L2e
            r5 = r2
            goto L2f
        L2e:
            r5 = r1
        L2f:
            if (r5 == 0) goto L40
            ijf r7 = r7.d()
            if (r7 == 0) goto L3f
            long r5 = r7.a
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L3f
            if (r0 == 0) goto L40
        L3f:
            r1 = r2
        L40:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgf.a():boolean");
    }

    @Override // defpackage.zcf
    public final wcf b() {
        return this.c;
    }

    public final ijf d() {
        return (ijf) x53.i0(this.f.b());
    }

    public final boolean e() {
        j0e j0eVar = this.d;
        return (j0eVar.getValue() instanceof xz) || (j0eVar.getValue() instanceof a00);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgf)) {
            return false;
        }
        wgf wgfVar = (wgf) obj;
        if (this.a != wgfVar.a) {
            return false;
        }
        if (tpa.f(this.b, wgfVar.b)) {
            return tpa.f(this.c, wgfVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + rh4.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    @Override // defpackage.zcf
    public final String i() {
        return this.b;
    }

    @Override // defpackage.zcf
    public final long j() {
        return this.a;
    }
}
