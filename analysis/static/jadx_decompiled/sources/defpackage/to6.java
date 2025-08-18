package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class to6 extends InputStream {
    public static final /* synthetic */ int w0 = 0;
    public final DataInputStream a;
    public boolean b;
    public int u0;
    public int c = 0;
    public int o = 4;
    public int X = 0;
    public int Y = 0;
    public byte[] Z = new byte[65536];
    public int s0 = 0;
    public int t0 = 0;
    public final int v0 = 2;

    public to6(DataInputStream dataInputStream) {
        this.a = dataInputStream;
    }

    public final void S(int i) {
        if (this.t0 + i > this.Z.length) {
            byte[] bArr = new byte[(int) (r5.length * 1.5d)];
            byte[] bArr2 = this.Z;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            this.Z = bArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean U() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.to6.U():boolean");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final int e0(int i, byte[] bArr, int i2) {
        int iMin = Math.min(i2, this.t0 - this.s0);
        System.arraycopy(this.Z, this.s0, bArr, i, iMin);
        this.s0 += iMin;
        return iMin;
    }

    public final int m() throws IOException {
        int i = this.a.read();
        S(1);
        byte[] bArr = this.Z;
        int i2 = this.t0;
        this.t0 = i2 + 1;
        bArr[i2] = (byte) i;
        this.X--;
        this.c++;
        return i;
    }

    public final void m0() throws IOException {
        byte b;
        DataInputStream dataInputStream = this.a;
        this.b = dataInputStream.readByte() == 67;
        if (this.v0 == 2) {
            byte[] bArr = this.Z;
            int i = this.t0;
            this.t0 = i + 1;
            bArr[i] = 67;
        } else {
            byte[] bArr2 = this.Z;
            int i2 = this.t0;
            this.t0 = i2 + 1;
            bArr2[i2] = 74;
        }
        do {
            b = dataInputStream.readByte();
            byte[] bArr3 = this.Z;
            int i3 = this.t0;
            this.t0 = i3 + 1;
            bArr3[i3] = b;
        } while (b != 0);
        this.u0 = n0();
        dataInputStream.readFully(this.Z, this.t0, 8);
        int i4 = this.t0 + 8;
        this.t0 = i4;
        this.c = i4;
        this.o = i4;
    }

    public final int n() {
        this.X -= 4;
        return n0();
    }

    public final int n0() throws IOException {
        S(4);
        this.a.readFully(this.Z, this.t0, 4);
        byte[] bArr = this.Z;
        int i = this.t0;
        int i2 = i + 1;
        this.t0 = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.t0 = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.t0 = i6;
        int i7 = bArr[i4] & 255;
        this.t0 = i + 4;
        int i8 = bArr[i6] & 255;
        this.c += 4;
        return (i3 << 24) | (i5 << 16) | (i7 << 8) | i8;
    }

    public final int o() throws IOException {
        DataInputStream dataInputStream = this.a;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        S(2);
        byte[] bArr = this.Z;
        int i3 = this.t0;
        int i4 = i3 + 1;
        this.t0 = i4;
        bArr[i3] = (byte) i;
        this.t0 = i3 + 2;
        bArr[i4] = (byte) i2;
        this.X -= 2;
        this.c += 2;
        return (i << 8) | i2;
    }

    public final void o0(int i) throws IOException {
        S(i);
        this.a.readFully(this.Z, this.t0, i);
        this.t0 += i;
        this.c += i;
        this.X -= i;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.c;
        if (i == 0) {
            m0();
            byte[] bArr = this.Z;
            int i2 = this.s0;
            this.s0 = i2 + 1;
            return bArr[i2];
        }
        int i3 = this.t0;
        int i4 = this.s0;
        if (i3 > i4) {
            byte[] bArr2 = this.Z;
            this.s0 = i4 + 1;
            return bArr2[i4];
        }
        int i5 = this.Y;
        if (i5 > 0) {
            this.Y = i5 - 1;
            return -2;
        }
        if (this.o > i) {
            int i6 = this.a.read();
            if (i6 != -1) {
                this.c++;
            }
            return i6;
        }
        if (!U()) {
            return -1;
        }
        byte[] bArr3 = this.Z;
        int i7 = this.s0;
        this.s0 = i7 + 1;
        return bArr3[i7];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z() throws java.io.IOException {
        /*
            r3 = this;
            int r0 = r3.m()
            r1 = 2
            if (r0 == r1) goto L3e
            r2 = 70
            if (r0 == r2) goto L3c
            r2 = 76
            if (r0 == r2) goto L3e
            r2 = 83
            if (r0 == r2) goto L40
            r2 = 73
            if (r0 == r2) goto L3c
            r2 = 74
            if (r0 == r2) goto L39
            r2 = 90
            if (r0 == r2) goto L37
            r2 = 91
            if (r0 == r2) goto L3e
            switch(r0) {
                case 4: goto L37;
                case 5: goto L40;
                case 6: goto L3c;
                case 7: goto L39;
                case 8: goto L37;
                case 9: goto L40;
                case 10: goto L3c;
                case 11: goto L39;
                default: goto L26;
            }
        L26:
            switch(r0) {
                case 66: goto L37;
                case 67: goto L40;
                case 68: goto L39;
                default: goto L29;
            }
        L29:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Signature type "
            java.lang.String r2 = " is not supported"
            java.lang.String r0 = defpackage.wg0.g(r0, r1, r2)
            r3.<init>(r0)
            throw r3
        L37:
            r1 = 1
            goto L40
        L39:
            r1 = 8
            goto L40
        L3c:
            r1 = 4
            goto L40
        L3e:
            int r1 = r3.u0
        L40:
            r3.o0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.to6.z():void");
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.c;
        if (i3 == 0) {
            m0();
            return e0(i, bArr, i2);
        }
        if (this.t0 > this.s0) {
            return e0(i, bArr, i2);
        }
        int i4 = this.Y;
        if (i4 > 0) {
            int iMin = Math.min(i2, i4);
            Arrays.fill(bArr, i, i + iMin, (byte) -2);
            this.Y -= iMin;
            return iMin;
        }
        int i5 = this.o;
        if (i5 > i3) {
            int i6 = this.a.read(bArr, i, Math.min(i2, i5 - i3));
            if (i6 != -1) {
                this.c += i6;
            }
            return i6;
        }
        if (U()) {
            return e0(i, bArr, i2);
        }
        return -1;
    }
}
