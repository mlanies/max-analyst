package defpackage;

/* loaded from: classes.dex */
public final class xd0 implements la5 {
    public boolean A0;
    public int X;
    public pa5 Y;
    public yd0 Z;
    public final wpa a;
    public final w3 b;
    public final boolean c;
    public final mbe o;
    public long s0;
    public n13[] t0;
    public long u0;
    public n13 v0;
    public int w0;
    public long x0;
    public long y0;
    public int z0;

    public xd0(int i, mbe mbeVar) {
        this.o = mbeVar;
        this.c = (i & 1) == 0;
        this.a = new wpa(12);
        this.b = new w3();
        this.Y = new c32(14, (byte) 0);
        this.t0 = new n13[0];
        this.x0 = -1L;
        this.y0 = -1L;
        this.w0 = -1;
        this.s0 = -9223372036854775807L;
    }

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        this.X = 0;
        if (this.c) {
            pa5Var = new k8g(pa5Var, this.o);
        }
        this.Y = pa5Var;
        this.u0 = -1L;
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        this.u0 = -1L;
        this.v0 = null;
        for (n13 n13Var : this.t0) {
            if (n13Var.j == 0) {
                n13Var.h = 0;
            } else {
                n13Var.h = n13Var.l[oaf.f(n13Var.k, j, true)];
            }
        }
        if (j != 0) {
            this.X = 6;
        } else if (this.t0.length == 0) {
            this.X = 0;
        } else {
            this.X = 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0108  */
    @Override // defpackage.la5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.na5 r29, defpackage.lh4 r30) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd0.g(na5, lh4):int");
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) {
        wpa wpaVar = this.a;
        ((sa4) na5Var).q(wpaVar.a, 0, 12, false);
        wpaVar.G(0);
        if (wpaVar.i() != 1179011410) {
            return false;
        }
        wpaVar.H(4);
        return wpaVar.i() == 541677121;
    }

    @Override // defpackage.la5
    public final void release() {
    }
}
