package defpackage;

/* loaded from: classes.dex */
public final class f3f implements nm0 {
    public final tue a;
    public final int c;
    public final int o = 112800;
    public final wpa b = new wpa();

    public f3f(int i, tue tueVar) {
        this.c = i;
        this.a = tueVar;
    }

    @Override // defpackage.nm0
    public final void f() {
        byte[] bArr = oaf.f;
        wpa wpaVar = this.b;
        wpaVar.getClass();
        wpaVar.E(bArr.length, bArr);
    }

    @Override // defpackage.nm0
    public final lm0 g(sa4 sa4Var, long j) {
        long j2 = sa4Var.o;
        int iMin = (int) Math.min(this.o, sa4Var.c - j2);
        wpa wpaVar = this.b;
        wpaVar.D(iMin);
        sa4Var.q(wpaVar.a, 0, iMin, false);
        int i = wpaVar.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (wpaVar.a() >= 188) {
            byte[] bArr = wpaVar.a;
            int i2 = wpaVar.b;
            while (i2 < i && bArr[i2] != 71) {
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long jC = wmd.C(wpaVar, i2, this.c);
            if (jC != -9223372036854775807L) {
                long jB = this.a.b(jC);
                if (jB > j) {
                    return j5 == -9223372036854775807L ? new lm0(-1, jB, j2) : new lm0(0, -9223372036854775807L, j2 + j4);
                }
                if (100000 + jB > j) {
                    return new lm0(0, -9223372036854775807L, j2 + i2);
                }
                j5 = jB;
                j4 = i2;
            }
            wpaVar.G(i3);
            j3 = i3;
        }
        return j5 != -9223372036854775807L ? new lm0(-2, j5, j2 + j3) : lm0.e;
    }
}
