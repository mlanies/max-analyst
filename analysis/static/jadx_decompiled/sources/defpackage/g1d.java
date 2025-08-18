package defpackage;

/* loaded from: classes.dex */
public final class g1d implements m3f {
    public final e1d a;
    public final yaf b = new yaf(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public g1d(e1d e1dVar) {
        this.a = e1dVar;
    }

    @Override // defpackage.m3f
    public final void a() {
        this.f = true;
    }

    @Override // defpackage.m3f
    public final void b(int i, yaf yafVar) {
        boolean z = (i & 1) != 0;
        int iV = z ? yafVar.b + yafVar.v() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            yafVar.H(iV);
            this.d = 0;
        }
        while (yafVar.c() > 0) {
            int i2 = this.d;
            yaf yafVar2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iV2 = yafVar.v();
                    yafVar.H(yafVar.b - 1);
                    if (iV2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(yafVar.c(), 3 - this.d);
                yafVar.g(this.d, yafVar2.a, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    yafVar2.H(0);
                    yafVar2.G(3);
                    yafVar2.I(1);
                    int iV3 = yafVar2.v();
                    int iV4 = yafVar2.v();
                    this.e = (iV3 & 128) != 0;
                    int i4 = (((iV3 & 15) << 8) | iV4) + 3;
                    this.c = i4;
                    byte[] bArr = yafVar2.a;
                    if (bArr.length < i4) {
                        yafVar2.d(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(yafVar.c(), this.c - this.d);
                yafVar.g(this.d, yafVar2.a, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.e) {
                        byte[] bArr2 = yafVar2.a;
                        int i7 = maf.a;
                        int i8 = -1;
                        for (int i9 = 0; i9 < i6; i9++) {
                            i8 = maf.m[((i8 >>> 24) ^ (bArr2[i9] & 255)) & 255] ^ (i8 << 8);
                        }
                        if (i8 != 0) {
                            this.f = true;
                            return;
                        }
                        yafVar2.G(this.c - 4);
                    } else {
                        yafVar2.G(i6);
                    }
                    yafVar2.H(0);
                    this.a.f(yafVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.m3f
    public final void e(sue sueVar, oa5 oa5Var, l3f l3fVar) {
        this.a.e(sueVar, oa5Var, l3fVar);
        this.f = true;
    }
}
