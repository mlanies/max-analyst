package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class f45 implements frc {
    public j45 X;
    public boolean Y;
    public int Z;
    public final oy5 a;
    public long[] c;
    public boolean o;
    public final y7g b = new y7g(16);
    public long s0 = -9223372036854775807L;

    public f45(j45 j45Var, oy5 oy5Var, boolean z) {
        this.a = oy5Var;
        this.X = j45Var;
        this.c = j45Var.b;
        a(j45Var, z);
    }

    public final void a(j45 j45Var, boolean z) {
        int i = this.Z;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.o = z;
        this.X = j45Var;
        long[] jArr = j45Var.b;
        this.c = jArr;
        long j3 = this.s0;
        if (j3 == -9223372036854775807L) {
            if (j2 != -9223372036854775807L) {
                this.Z = maf.b(jArr, j2, false);
            }
        } else {
            int iB = maf.b(jArr, j3, true);
            this.Z = iB;
            if (this.o && iB == this.c.length) {
                j = j3;
            }
            this.s0 = j;
        }
    }

    @Override // defpackage.frc
    public final void c() {
    }

    @Override // defpackage.frc
    public final boolean d() {
        return true;
    }

    @Override // defpackage.frc
    public final int e(long j) {
        int iMax = Math.max(this.Z, maf.b(this.c, j, true));
        int i = iMax - this.Z;
        this.Z = iMax;
        return i;
    }

    @Override // defpackage.frc
    public final int g(imc imcVar, o54 o54Var, int i) throws IOException {
        int i2 = this.Z;
        boolean z = i2 == this.c.length;
        if (z && !this.o) {
            o54Var.b = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.Y) {
            imcVar.c = this.a;
            this.Y = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.Z = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrW = this.b.w(this.X.a[i2]);
            o54Var.x(bArrW.length);
            o54Var.o.put(bArrW);
        }
        o54Var.Y = this.c[i2];
        o54Var.b = 1;
        return -4;
    }
}
