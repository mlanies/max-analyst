package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class im5 implements nm0 {
    public final qm5 a;
    public final int b;
    public final lh4 c = new lh4();

    public im5(qm5 qm5Var, int i) {
        this.a = qm5Var;
        this.b = i;
    }

    public final long a(sa4 sa4Var) throws EOFException, InterruptedIOException {
        long j;
        lh4 lh4Var;
        qm5 qm5Var;
        boolean zB;
        int iD;
        while (true) {
            long jR = sa4Var.r();
            j = sa4Var.c;
            long j2 = j - 6;
            lh4Var = this.c;
            qm5Var = this.a;
            if (jR >= j2) {
                break;
            }
            long jR2 = sa4Var.r();
            byte[] bArr = new byte[2];
            sa4Var.q(bArr, 0, 2, false);
            int i = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i2 = this.b;
            if (i != i2) {
                sa4Var.Y = 0;
                sa4Var.b((int) (jR2 - sa4Var.o), false);
                zB = false;
            } else {
                wpa wpaVar = new wpa(16);
                System.arraycopy(bArr, 0, wpaVar.a, 0, 2);
                byte[] bArr2 = wpaVar.a;
                int i3 = 0;
                for (int i4 = 2; i3 < 14 && (iD = sa4Var.d(i4 + i3, bArr2, 14 - i3)) != -1; i4 = 2) {
                    i3 += iD;
                }
                wpaVar.F(i3);
                sa4Var.Y = 0;
                sa4Var.b((int) (jR2 - sa4Var.o), false);
                zB = z7.b(wpaVar, qm5Var, i2, lh4Var);
            }
            if (zB) {
                break;
            }
            sa4Var.b(1, false);
        }
        if (sa4Var.r() < j - 6) {
            return lh4Var.a;
        }
        sa4Var.b((int) (j - sa4Var.r()), false);
        return qm5Var.k;
    }

    @Override // defpackage.nm0
    public final lm0 g(sa4 sa4Var, long j) throws EOFException, InterruptedIOException {
        long j2 = sa4Var.o;
        long jA = a(sa4Var);
        long jR = sa4Var.r();
        sa4Var.b(Math.max(6, this.a.d), false);
        long jA2 = a(sa4Var);
        return (jA > j || jA2 <= j) ? jA2 <= j ? new lm0(-2, jA2, sa4Var.r()) : new lm0(-1, jA, j2) : new lm0(0, -9223372036854775807L, jR);
    }
}
