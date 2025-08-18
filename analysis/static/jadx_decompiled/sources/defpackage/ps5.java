package defpackage;

/* loaded from: classes.dex */
public final class ps5 implements ka5 {
    public final yaf a = new yaf(4);
    public final yaf b = new yaf(9);
    public final yaf c = new yaf(11);
    public final yaf d = new yaf(3, false);
    public final gwc e;
    public oa5 f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public i70 o;
    public mlf p;

    public ps5() {
        gwc gwcVar = new gwc(10, new dt4());
        gwcVar.c = -9223372036854775807L;
        gwcVar.o = new long[0];
        gwcVar.X = new long[0];
        this.e = gwcVar;
        this.g = 1;
    }

    public final yaf a(ra4 ra4Var) {
        int i = this.l;
        yaf yafVar = this.d;
        byte[] bArr = yafVar.a;
        if (i > bArr.length) {
            yafVar.F(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            yafVar.H(0);
        }
        yafVar.G(this.l);
        ra4Var.h(yafVar.a, 0, this.l, false);
        return yafVar;
    }

    @Override // defpackage.ka5
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.ka5
    public final void g(oa5 oa5Var) {
        this.f = oa5Var;
    }

    @Override // defpackage.ka5
    public final boolean h(ma5 ma5Var) {
        yaf yafVar = this.a;
        ra4 ra4Var = (ra4) ma5Var;
        ra4Var.q(yafVar.a, 0, 3, false);
        yafVar.H(0);
        if (yafVar.x() != 4607062) {
            return false;
        }
        ra4Var.q(yafVar.a, 0, 2, false);
        yafVar.H(0);
        if ((yafVar.A() & 250) != 0) {
            return false;
        }
        ra4Var.q(yafVar.a, 0, 4, false);
        yafVar.H(0);
        int iH = yafVar.h();
        ra4Var.Y = 0;
        ra4Var.b(iH, false);
        ra4Var.q(yafVar.a, 0, 4, false);
        yafVar.H(0);
        return yafVar.h() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0006 A[SYNTHETIC] */
    @Override // defpackage.ka5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.ma5 r16, defpackage.lh4 r17) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ps5.i(ma5, lh4):int");
    }

    @Override // defpackage.ka5
    public final void release() {
    }
}
