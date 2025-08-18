package defpackage;

/* loaded from: classes.dex */
public final class dc implements ka5 {
    public final yaf d;
    public final s02 e;
    public oa5 f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final int a = 0;
    public final fc b = new fc(null, true);
    public final yaf c = new yaf(2048);
    public int i = -1;
    public long h = -1;

    public dc() {
        yaf yafVar = new yaf(10);
        this.d = yafVar;
        byte[] bArr = yafVar.a;
        this.e = new s02(bArr, bArr.length, 1, (byte) 0);
    }

    public final int a(ra4 ra4Var) {
        int i = 0;
        while (true) {
            yaf yafVar = this.d;
            ra4Var.q(yafVar.a, 0, 10, false);
            yafVar.H(0);
            if (yafVar.x() != 4801587) {
                break;
            }
            yafVar.I(3);
            int iU = yafVar.u();
            i += iU + 10;
            ra4Var.b(iU, false);
        }
        ra4Var.Y = 0;
        ra4Var.b(i, false);
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    @Override // defpackage.ka5
    public final void d(long j, long j2) {
        this.k = false;
        this.b.a();
        this.g = j2;
    }

    @Override // defpackage.ka5
    public final void g(oa5 oa5Var) {
        this.f = oa5Var;
        this.b.j(oa5Var, new l3f(0, 1, 0, (byte) 0));
        oa5Var.w();
    }

    @Override // defpackage.ka5
    public final boolean h(ma5 ma5Var) {
        ra4 ra4Var = (ra4) ma5Var;
        int iA = a(ra4Var);
        int i = iA;
        int i2 = 0;
        int i3 = 0;
        do {
            yaf yafVar = this.d;
            ra4Var.q(yafVar.a, 0, 2, false);
            yafVar.H(0);
            if ((yafVar.A() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                ra4Var.q(yafVar.a, 0, 4, false);
                s02 s02Var = this.e;
                s02Var.q(14);
                int i4 = s02Var.i(13);
                if (i4 <= 6) {
                    i++;
                    ra4Var.Y = 0;
                    ra4Var.b(i, false);
                } else {
                    ra4Var.b(i4 - 6, false);
                    i3 += i4;
                }
            } else {
                i++;
                ra4Var.Y = 0;
                ra4Var.b(i, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iA < 8192);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // defpackage.ka5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.ma5 r19, defpackage.lh4 r20) throws com.google.android.exoplayer2.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc.i(ma5, lh4):int");
    }

    @Override // defpackage.ka5
    public final void release() {
    }
}
