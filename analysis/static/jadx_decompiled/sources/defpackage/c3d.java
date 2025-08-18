package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class c3d extends aw0 {
    public final transient byte[][] X;
    public final transient int[] Y;

    public c3d(byte[][] bArr, int[] iArr) {
        super(aw0.o.c);
        this.X = bArr;
        this.Y = iArr;
    }

    @Override // defpackage.aw0
    public final String a() {
        throw null;
    }

    @Override // defpackage.aw0
    public final aw0 b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.X;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.Y;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        return new aw0(messageDigest.digest());
    }

    @Override // defpackage.aw0
    public final int c() {
        return this.Y[this.X.length - 1];
    }

    @Override // defpackage.aw0
    public final String d() {
        byte[] bArrL = l();
        char[] cArr = new char[bArrL.length * 2];
        int i = 0;
        for (byte b : bArrL) {
            int i2 = i + 1;
            char[] cArr2 = z04.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @Override // defpackage.aw0
    public final byte[] e() {
        return l();
    }

    @Override // defpackage.aw0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aw0) {
            aw0 aw0Var = (aw0) obj;
            if (aw0Var.c() == c() && h(c(), aw0Var)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aw0
    public final byte f(int i) {
        byte[][] bArr = this.X;
        int length = bArr.length - 1;
        int[] iArr = this.Y;
        hm9.g(iArr[length], i, 1L);
        int iZ = f8.z(this, i);
        return bArr[iZ][(i - (iZ == 0 ? 0 : iArr[iZ - 1])) + iArr[bArr.length + iZ]];
    }

    @Override // defpackage.aw0
    public final boolean g(int i, int i2, int i3, byte[] bArr) {
        if (i < 0 || i > c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iZ = f8.z(this, i);
        while (i < i4) {
            int[] iArr = this.Y;
            int i5 = iZ == 0 ? 0 : iArr[iZ - 1];
            int i6 = iArr[iZ] - i5;
            byte[][] bArr2 = this.X;
            int i7 = iArr[bArr2.length + iZ];
            int iMin = Math.min(i4, i6 + i5) - i;
            int i8 = (i - i5) + i7;
            byte[] bArr3 = bArr2[iZ];
            for (int i9 = 0; i9 < iMin; i9++) {
                if (bArr3[i9 + i8] != bArr[i9 + i2]) {
                    return false;
                }
            }
            i2 += iMin;
            i += iMin;
            iZ++;
        }
        return true;
    }

    @Override // defpackage.aw0
    public final boolean h(int i, aw0 aw0Var) {
        if (c() - i < 0) {
            return false;
        }
        int iZ = f8.z(this, 0);
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int[] iArr = this.Y;
            int i4 = iZ == 0 ? 0 : iArr[iZ - 1];
            int i5 = iArr[iZ] - i4;
            byte[][] bArr = this.X;
            int i6 = iArr[bArr.length + iZ];
            int iMin = Math.min(i, i5 + i4) - i2;
            if (!aw0Var.g(i3, (i2 - i4) + i6, iMin, bArr[iZ])) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iZ++;
        }
        return true;
    }

    @Override // defpackage.aw0
    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.X;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.Y;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.a = i3;
        return i3;
    }

    @Override // defpackage.aw0
    public final aw0 i() {
        return new aw0(l()).i();
    }

    @Override // defpackage.aw0
    public final void k(bt0 bt0Var, int i) {
        int iZ = f8.z(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.Y;
            int i3 = iZ == 0 ? 0 : iArr[iZ - 1];
            int i4 = iArr[iZ] - i3;
            byte[][] bArr = this.X;
            int i5 = iArr[bArr.length + iZ];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            k2d k2dVar = new k2d(bArr[iZ], i6, i6 + iMin, true, false);
            k2d k2dVar2 = bt0Var.a;
            if (k2dVar2 == null) {
                k2dVar.g = k2dVar;
                k2dVar.f = k2dVar;
                bt0Var.a = k2dVar;
            } else {
                k2dVar2.g.b(k2dVar);
            }
            i2 += iMin;
            iZ++;
        }
        bt0Var.b += c();
    }

    public final byte[] l() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.X;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.Y;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            System.arraycopy(bArr2[i], i4, bArr, i3, (i4 + i6) - i4);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.aw0
    public final String toString() {
        return new aw0(l()).toString();
    }
}
