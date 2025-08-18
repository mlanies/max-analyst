package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ra4 implements ma5 {
    public int Y;
    public int Z;
    public final l24 b;
    public final long c;
    public long o;
    public byte[] X = new byte[65536];
    public final byte[] a = new byte[4096];

    static {
        h85.a("goog.exo.extractor");
    }

    public ra4(l24 l24Var, long j, long j2) {
        this.b = l24Var;
        this.o = j;
        this.c = j2;
    }

    public final boolean b(int i, boolean z) {
        c(i);
        int iF = this.Z - this.Y;
        while (iF < i) {
            iF = f(this.X, this.Y, i, iF, z);
            if (iF == -1) {
                return false;
            }
            this.Z = this.Y + iF;
        }
        this.Y += i;
        return true;
    }

    public final void c(int i) {
        int i2 = this.Y + i;
        byte[] bArr = this.X;
        if (i2 > bArr.length) {
            this.X = Arrays.copyOf(this.X, maf.j(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int d(int i, byte[] bArr, int i2) throws EOFException, InterruptedIOException {
        int iMin;
        c(i2);
        int i3 = this.Z;
        int i4 = this.Y;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = f(this.X, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.Z += iMin;
        } else {
            iMin = Math.min(i2, i5);
        }
        System.arraycopy(this.X, this.Y, bArr, i, iMin);
        this.Y += iMin;
        return iMin;
    }

    @Override // defpackage.ma5, defpackage.na5
    public final long e() {
        return this.o;
    }

    public final int f(byte[] bArr, int i, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i4 = this.b.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final int g() throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.Z, 1);
        i(iMin);
        if (iMin == 0) {
            byte[] bArr = this.a;
            iMin = f(bArr, 0, Math.min(1, bArr.length), 0, true);
        }
        if (iMin != -1) {
            this.o += iMin;
        }
        return iMin;
    }

    @Override // defpackage.ma5, defpackage.na5
    public final boolean h(byte[] bArr, int i, int i2, boolean z) {
        int iMin;
        int i3 = this.Z;
        if (i3 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i3, i2);
            System.arraycopy(this.X, 0, bArr, i, iMin);
            i(iMin);
        }
        int iF = iMin;
        while (iF < i2 && iF != -1) {
            iF = f(bArr, i, i2, iF, z);
        }
        if (iF != -1) {
            this.o += iF;
        }
        return iF != -1;
    }

    public final void i(int i) {
        int i2 = this.Z - i;
        this.Z = i2;
        this.Y = 0;
        byte[] bArr = this.X;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.X = bArr2;
    }

    @Override // defpackage.ma5, defpackage.na5
    public final void l(int i, byte[] bArr, int i2) {
        q(bArr, i, i2, false);
    }

    @Override // defpackage.ma5, defpackage.na5
    public final boolean q(byte[] bArr, int i, int i2, boolean z) {
        if (!b(i2, z)) {
            return false;
        }
        System.arraycopy(this.X, this.Y - i2, bArr, i, i2);
        return true;
    }

    @Override // defpackage.ma5, defpackage.na5
    public final long r() {
        return this.o + this.Y;
    }

    @Override // defpackage.l24
    public final int read(byte[] bArr, int i, int i2) throws EOFException, InterruptedIOException {
        int i3 = this.Z;
        int iF = 0;
        if (i3 != 0) {
            int iMin = Math.min(i3, i2);
            System.arraycopy(this.X, 0, bArr, i, iMin);
            i(iMin);
            iF = iMin;
        }
        if (iF == 0) {
            iF = f(bArr, i, i2, 0, true);
        }
        if (iF != -1) {
            this.o += iF;
        }
        return iF;
    }

    @Override // defpackage.ma5, defpackage.na5
    public final void readFully(byte[] bArr, int i, int i2) {
        h(bArr, i, i2, false);
    }

    @Override // defpackage.ma5, defpackage.na5
    public final void s(int i) {
        b(i, false);
    }

    @Override // defpackage.ma5, defpackage.na5
    public final long x() {
        return this.c;
    }

    @Override // defpackage.ma5, defpackage.na5
    public final void y() {
        this.Y = 0;
    }

    @Override // defpackage.ma5, defpackage.na5
    public final void z(int i) {
        int iMin = Math.min(this.Z, i);
        i(iMin);
        int iF = iMin;
        while (iF < i && iF != -1) {
            iF = f(this.a, -iF, Math.min(i, this.a.length + iF), iF, false);
        }
        if (iF != -1) {
            this.o += iF;
        }
    }
}
