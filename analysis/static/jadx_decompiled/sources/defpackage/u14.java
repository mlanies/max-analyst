package defpackage;

/* loaded from: classes.dex */
public final class u14 extends mue {
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final long i;
    public final long j;
    public final long k;
    public final i14 l;
    public final tb8 m;
    public final hb8 n;

    public u14(long j, long j2, long j3, int i, long j4, long j5, long j6, i14 i14Var, tb8 tb8Var, hb8 hb8Var) {
        fm9.k(i14Var.d == (hb8Var != null));
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = i;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = i14Var;
        this.m = tb8Var;
        this.n = hb8Var;
    }

    @Override // defpackage.mue
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.h) >= 0 && iIntValue < i()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // defpackage.mue
    public final hue g(int i, hue hueVar, boolean z) {
        fm9.g(i, i());
        i14 i14Var = this.l;
        String str = z ? i14Var.b(i).a : null;
        Integer numValueOf = z ? Integer.valueOf(this.h + i) : null;
        long jD = i14Var.d(i);
        long jS = oaf.S(i14Var.b(i).b - i14Var.b(0).b) - this.i;
        hueVar.getClass();
        hueVar.j(str, numValueOf, 0, jD, jS, s8.g, false);
        return hueVar;
    }

    @Override // defpackage.mue
    public final int i() {
        return this.l.m.size();
    }

    @Override // defpackage.mue
    public final Object m(int i) {
        fm9.g(i, i());
        return Integer.valueOf(this.h + i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[PHI: r7
      0x0027: PHI (r7v4 long) = (r7v0 long), (r7v1 long), (r7v1 long), (r7v1 long) binds: [B:11:0x0025, B:32:0x007c, B:35:0x0093, B:37:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d A[PHI: r7
      0x003d: PHI (r7v1 long) = (r7v0 long), (r7v2 long) binds: [B:14:0x002f, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.mue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.kue n(int r26, defpackage.kue r27, long r28) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u14.n(int, kue, long):kue");
    }

    @Override // defpackage.mue
    public final int p() {
        return 1;
    }
}
