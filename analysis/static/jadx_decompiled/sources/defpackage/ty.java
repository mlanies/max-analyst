package defpackage;

/* loaded from: classes.dex */
public final class ty implements mm0 {
    public int a;
    public int b;
    public Object c;
    public Object o;

    public ty(int i, int i2, lx3 lx3Var, mn5 mn5Var) {
        this.c = mn5Var;
        this.a = i;
        this.b = i2;
        this.o = lx3Var;
    }

    public f1f a() {
        int i = this.a;
        return new f1f((String) this.c, i, this.b, (String) this.o);
    }

    public void b(String str) {
        String strL = ia9.l(str);
        fm9.e("Not an audio MIME type: " + strL, strL == null || ia9.h(strL));
        this.c = strL;
    }

    public void c(String str) {
        String strL = ia9.l(str);
        fm9.e("Not a video MIME type: " + strL, strL == null || ia9.k(strL));
        this.o = strL;
    }

    @Override // defpackage.mm0
    public void f() {
        byte[] bArr = maf.f;
        yaf yafVar = (yaf) this.o;
        yafVar.getClass();
        yafVar.F(bArr.length, bArr);
    }

    @Override // defpackage.mm0
    public lm0 h(ra4 ra4Var, long j) {
        long j2 = ra4Var.o;
        int iMin = (int) Math.min(this.b, ra4Var.c - j2);
        yaf yafVar = (yaf) this.o;
        yafVar.E(iMin);
        ra4Var.q(yafVar.a, 0, iMin, false);
        int i = yafVar.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (yafVar.c() >= 188) {
            byte[] bArr = yafVar.a;
            int i2 = yafVar.b;
            while (i2 < i && bArr[i2] != 71) {
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long jX = s5c.X(yafVar, i2, this.a);
            if (jX != -9223372036854775807L) {
                long jB = ((sue) this.c).b(jX);
                if (jB > j) {
                    return j5 == -9223372036854775807L ? new lm0(-1, jB, j2) : new lm0(0, -9223372036854775807L, j2 + j4);
                }
                if (100000 + jB > j) {
                    return new lm0(0, -9223372036854775807L, j2 + i2);
                }
                j5 = jB;
                j4 = i2;
            }
            yafVar.H(i3);
            j3 = i3;
        }
        return j5 != -9223372036854775807L ? new lm0(-2, j5, j2 + j3) : lm0.d;
    }

    public ty(int i, int i2, float[] fArr, float[] fArr2) {
        this.a = i;
        np8.d(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.c = fArr;
        this.o = fArr2;
        this.b = i2;
    }
}
