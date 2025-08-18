package defpackage;

/* loaded from: classes.dex */
public final class t14 extends lue {
    public final int X;
    public final long Y;
    public final long Z;
    public final long b;
    public final long c;
    public final long o;
    public final long s0;
    public final h14 t0;
    public final rb8 u0;
    public final gb8 v0;

    public t14(long j, long j2, long j3, int i, long j4, long j5, long j6, h14 h14Var, rb8 rb8Var, gb8 gb8Var) {
        np8.f(h14Var.d == (gb8Var != null));
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.X = i;
        this.Y = j4;
        this.Z = j5;
        this.s0 = j6;
        this.t0 = h14Var;
        this.u0 = rb8Var;
        this.v0 = gb8Var;
    }

    @Override // defpackage.lue
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.X) >= 0 && iIntValue < i()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // defpackage.lue
    public final gue g(int i, gue gueVar, boolean z) {
        np8.e(i, i());
        h14 h14Var = this.t0;
        String str = z ? h14Var.b(i).a : null;
        Integer numValueOf = z ? Integer.valueOf(this.X + i) : null;
        long jD = h14Var.d(i);
        long jD2 = maf.D(h14Var.b(i).b - h14Var.b(0).b) - this.Y;
        gueVar.getClass();
        gueVar.h(str, numValueOf, 0, jD, jD2, r8.Y, false);
        return gueVar;
    }

    @Override // defpackage.lue
    public final int i() {
        return this.t0.m.size();
    }

    @Override // defpackage.lue
    public final Object m(int i) {
        np8.e(i, i());
        return Integer.valueOf(this.X + i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[PHI: r7
      0x0027: PHI (r7v4 long) = (r7v0 long), (r7v1 long), (r7v1 long), (r7v1 long) binds: [B:11:0x0025, B:32:0x007c, B:35:0x0093, B:37:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d A[PHI: r7
      0x003d: PHI (r7v1 long) = (r7v0 long), (r7v2 long) binds: [B:14:0x002f, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.lue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jue n(int r26, defpackage.jue r27, long r28) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t14.n(int, jue, long):jue");
    }

    @Override // defpackage.lue
    public final int p() {
        return 1;
    }
}
