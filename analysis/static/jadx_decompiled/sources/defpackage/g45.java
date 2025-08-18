package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class g45 implements grc {
    public k45 X;
    public boolean Y;
    public int Z;
    public final qy5 a;
    public long[] c;
    public boolean o;
    public final ph4 b = new ph4(18);
    public long s0 = -9223372036854775807L;

    public g45(k45 k45Var, qy5 qy5Var, boolean z) {
        this.a = qy5Var;
        this.X = k45Var;
        this.c = k45Var.b;
        a(k45Var, z);
    }

    public final void a(k45 k45Var, boolean z) {
        int i = this.Z;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.o = z;
        this.X = k45Var;
        long[] jArr = k45Var.b;
        this.c = jArr;
        long j3 = this.s0;
        if (j3 == -9223372036854775807L) {
            if (j2 != -9223372036854775807L) {
                this.Z = oaf.b(jArr, j2, false);
            }
        } else {
            int iB = oaf.b(jArr, j3, true);
            this.Z = iB;
            if (this.o && iB == this.c.length) {
                j = j3;
            }
            this.s0 = j;
        }
    }

    @Override // defpackage.grc
    public final void c() {
    }

    @Override // defpackage.grc
    public final boolean d() {
        return true;
    }

    @Override // defpackage.grc
    public final int e(long j) {
        int iMax = Math.max(this.Z, oaf.b(this.c, j, true));
        int i = iMax - this.Z;
        this.Z = iMax;
        return i;
    }

    @Override // defpackage.grc
    public final int j(y7g y7gVar, p54 p54Var, int i) throws IOException {
        int i2 = this.Z;
        boolean z = i2 == this.c.length;
        if (z && !this.o) {
            p54Var.b = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.Y) {
            y7gVar.c = this.a;
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
            byte[] bArrJ = this.b.j(this.X.a[i2]);
            p54Var.x(bArrJ.length);
            p54Var.X.put(bArrJ);
        }
        p54Var.Z = this.c[i2];
        p54Var.b = 1;
        return -4;
    }
}
