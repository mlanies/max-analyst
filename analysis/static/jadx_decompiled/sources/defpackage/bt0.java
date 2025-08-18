package defpackage;

import androidx.work.WorkRequest;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class bt0 implements fu0, eu0, Cloneable, ByteChannel {
    public k2d a;
    public long b;

    @Override // defpackage.eu0
    public final /* bridge */ /* synthetic */ eu0 A(int i) {
        x0(i);
        return this;
    }

    public final void A0(String str) {
        z0(0, str.length(), str);
    }

    @Override // defpackage.fu0
    public final boolean B() {
        return this.b == 0;
    }

    public final void B0(int i) {
        String str;
        int i2 = 0;
        if (i < 128) {
            u0(i);
            return;
        }
        if (i < 2048) {
            k2d k2dVarR0 = r0(2);
            int i3 = k2dVarR0.c;
            byte[] bArr = k2dVarR0.a;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[1 + i3] = (byte) ((i & 63) | 128);
            k2dVarR0.c = i3 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && 57343 >= i) {
            u0(63);
            return;
        }
        if (i < 65536) {
            k2d k2dVarR02 = r0(3);
            int i4 = k2dVarR02.c;
            byte[] bArr2 = k2dVarR02.a;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[1 + i4] = (byte) (((i >> 6) & 63) | 128);
            bArr2[2 + i4] = (byte) ((i & 63) | 128);
            k2dVarR02.c = i4 + 3;
            this.b += 3;
            return;
        }
        if (i <= 1114111) {
            k2d k2dVarR03 = r0(4);
            int i5 = k2dVarR03.c;
            byte[] bArr3 = k2dVarR03.a;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[1 + i5] = (byte) (((i >> 12) & 63) | 128);
            bArr3[2 + i5] = (byte) (((i >> 6) & 63) | 128);
            bArr3[3 + i5] = (byte) ((i & 63) | 128);
            k2dVarR03.c = i5 + 4;
            this.b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = z04.a;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i2 < 8 && cArr2[i2] == '0') {
                i2++;
            }
            str = new String(cArr2, i2, 8 - i2);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.eu0
    public final /* bridge */ /* synthetic */ eu0 C(int i) {
        u0(i);
        return this;
    }

    @Override // defpackage.eu0
    public final eu0 E() {
        return this;
    }

    @Override // defpackage.fu0
    public final String G(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(ey8.h(j, "limit < 0: ").toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        byte b = (byte) 10;
        long jU = U(b, 0L, j2);
        if (jU != -1) {
            return jt0.a(this, jU);
        }
        if (j2 < this.b && S(j2 - 1) == ((byte) 13) && S(j2) == b) {
            return jt0.a(this, j2);
        }
        bt0 bt0Var = new bt0();
        o(bt0Var, 0L, Math.min(32, this.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b, j) + " content=" + bt0Var.e(bt0Var.b).d() + (char) 8230);
    }

    @Override // defpackage.fu0
    public final long K(ux uxVar) {
        long j = this.b;
        if (j > 0) {
            uxVar.N(this, j);
        }
        return j;
    }

    @Override // defpackage.eu0
    public final /* bridge */ /* synthetic */ eu0 L(String str) {
        A0(str);
        return this;
    }

    @Override // defpackage.eu0
    public final /* bridge */ /* synthetic */ eu0 M(aw0 aw0Var) {
        s0(aw0Var);
        return this;
    }

    @Override // defpackage.ksd
    public final void N(bt0 bt0Var, long j) {
        k2d k2dVarB;
        if (bt0Var == this) {
            throw new IllegalArgumentException("source == this".toString());
        }
        hm9.g(bt0Var.b, 0L, j);
        while (j > 0) {
            k2d k2dVar = bt0Var.a;
            int i = k2dVar.c;
            int i2 = k2dVar.b;
            if (j < i - i2) {
                k2d k2dVar2 = this.a;
                k2d k2dVar3 = k2dVar2 != null ? k2dVar2.g : null;
                if (k2dVar3 != null && k2dVar3.e) {
                    if ((k2dVar3.c + j) - (k2dVar3.d ? 0 : k2dVar3.b) <= 8192) {
                        k2dVar.d(k2dVar3, (int) j);
                        bt0Var.b -= j;
                        this.b += j;
                        return;
                    }
                }
                int i3 = (int) j;
                if (i3 <= 0 || i3 > i - i2) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i3 >= 1024) {
                    k2dVarB = k2dVar.c();
                } else {
                    k2dVarB = b3d.b();
                    int i4 = k2dVar.b;
                    ys.Y(k2dVar.a, i4, k2dVarB.a, i4 + i3);
                }
                k2dVarB.c = k2dVarB.b + i3;
                k2dVar.b += i3;
                k2dVar.g.b(k2dVarB);
                bt0Var.a = k2dVarB;
            }
            k2d k2dVar4 = bt0Var.a;
            long j2 = k2dVar4.c - k2dVar4.b;
            bt0Var.a = k2dVar4.a();
            k2d k2dVar5 = this.a;
            if (k2dVar5 == null) {
                this.a = k2dVar4;
                k2dVar4.g = k2dVar4;
                k2dVar4.f = k2dVar4;
            } else {
                k2dVar5.g.b(k2dVar4);
                k2d k2dVar6 = k2dVar4.g;
                if (k2dVar6 == k2dVar4) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                if (k2dVar6.e) {
                    int i5 = k2dVar4.c - k2dVar4.b;
                    if (i5 <= (8192 - k2dVar6.c) + (k2dVar6.d ? 0 : k2dVar6.b)) {
                        k2dVar4.d(k2dVar6, i5);
                        k2dVar4.a();
                        b3d.a(k2dVar4);
                    }
                }
            }
            bt0Var.b -= j2;
            this.b += j2;
            j -= j2;
        }
    }

    @Override // defpackage.fu0
    public final String O(Charset charset) {
        return o0(this.b, charset);
    }

    @Override // defpackage.eu0
    public final /* bridge */ /* synthetic */ eu0 P(long j) {
        w0(j);
        return this;
    }

    @Override // defpackage.fu0
    public final void Q(bt0 bt0Var, long j) throws EOFException {
        long j2 = this.b;
        if (j2 >= j) {
            bt0Var.N(this, j);
        } else {
            bt0Var.N(this, j2);
            throw new EOFException();
        }
    }

    @Override // defpackage.fu0
    public final void R(long j) throws EOFException {
        while (j > 0) {
            k2d k2dVar = this.a;
            if (k2dVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, k2dVar.c - k2dVar.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = k2dVar.b + iMin;
            k2dVar.b = i;
            if (i == k2dVar.c) {
                this.a = k2dVar.a();
                b3d.a(k2dVar);
            }
        }
    }

    public final byte S(long j) {
        hm9.g(this.b, j, 1L);
        k2d k2dVar = this.a;
        k2dVar.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                k2dVar = k2dVar.g;
                j2 -= k2dVar.c - k2dVar.b;
            }
            return k2dVar.a[(int) ((k2dVar.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = k2dVar.c;
            int i2 = k2dVar.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return k2dVar.a[(int) ((i2 + j) - j3)];
            }
            k2dVar = k2dVar.f;
            j3 = j4;
        }
    }

    public final long U(byte b, long j, long j2) {
        k2d k2dVar;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (!(0 <= j3 && j4 >= j3)) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(this.b);
            au1.q(j3, " fromIndex=", " toIndex=", sb);
            sb.append(j4);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j6 = this.b;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 != j4 && (k2dVar = this.a) != null) {
            if (j6 - j3 < j3) {
                while (j6 > j3) {
                    k2dVar = k2dVar.g;
                    j6 -= k2dVar.c - k2dVar.b;
                }
                while (j6 < j4) {
                    byte[] bArr = k2dVar.a;
                    int iMin = (int) Math.min(k2dVar.c, (k2dVar.b + j4) - j6);
                    for (int i = (int) ((k2dVar.b + j3) - j6); i < iMin; i++) {
                        if (bArr[i] == b) {
                            return (i - k2dVar.b) + j6;
                        }
                    }
                    j6 += k2dVar.c - k2dVar.b;
                    k2dVar = k2dVar.f;
                    j3 = j6;
                }
            } else {
                while (true) {
                    long j7 = (k2dVar.c - k2dVar.b) + j5;
                    if (j7 > j3) {
                        break;
                    }
                    k2dVar = k2dVar.f;
                    j5 = j7;
                }
                while (j5 < j4) {
                    byte[] bArr2 = k2dVar.a;
                    int iMin2 = (int) Math.min(k2dVar.c, (k2dVar.b + j4) - j5);
                    for (int i2 = (int) ((k2dVar.b + j3) - j5); i2 < iMin2; i2++) {
                        if (bArr2[i2] == b) {
                            return (i2 - k2dVar.b) + j5;
                        }
                    }
                    j5 += k2dVar.c - k2dVar.b;
                    k2dVar = k2dVar.f;
                    j3 = j5;
                }
            }
        }
        return -1L;
    }

    @Override // defpackage.fu0
    public final String X() {
        return G(Long.MAX_VALUE);
    }

    @Override // defpackage.eu0
    public final /* bridge */ /* synthetic */ eu0 b0(int i, byte[] bArr, int i2) {
        write(bArr, i, i2);
        return this;
    }

    @Override // defpackage.yud
    public final long c(bt0 bt0Var, long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount < 0: ").toString());
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        bt0Var.N(this, j);
        return j;
    }

    public final Object clone() {
        bt0 bt0Var = new bt0();
        if (this.b != 0) {
            k2d k2dVar = this.a;
            k2d k2dVarC = k2dVar.c();
            bt0Var.a = k2dVarC;
            k2dVarC.g = k2dVarC;
            k2dVarC.f = k2dVarC;
            for (k2d k2dVar2 = k2dVar.f; k2dVar2 != k2dVar; k2dVar2 = k2dVar2.f) {
                k2dVarC.g.b(k2dVar2.c());
            }
            bt0Var.b = this.b;
        }
        return bt0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.ksd
    public final void close() {
    }

    @Override // defpackage.fu0
    public final int d0(vma vmaVar) throws EOFException {
        int iB = jt0.b(this, vmaVar, false);
        if (iB == -1) {
            return -1;
        }
        R(vmaVar.a[iB].c());
        return iB;
    }

    @Override // defpackage.fu0
    public final aw0 e(long j) throws EOFException {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount: ").toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new aw0(n0(j));
        }
        aw0 aw0VarQ0 = q0((int) j);
        R(j);
        return aw0VarQ0;
    }

    public final int e0(byte[] bArr, int i, int i2) {
        hm9.g(bArr.length, i, i2);
        k2d k2dVar = this.a;
        if (k2dVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, k2dVar.c - k2dVar.b);
        int i3 = k2dVar.b;
        System.arraycopy(k2dVar.a, i3, bArr, i, (i3 + iMin) - i3);
        int i4 = k2dVar.b + iMin;
        k2dVar.b = i4;
        this.b -= iMin;
        if (i4 != k2dVar.c) {
            return iMin;
        }
        this.a = k2dVar.a();
        b3d.a(k2dVar);
        return iMin;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bt0) {
                long j = this.b;
                bt0 bt0Var = (bt0) obj;
                if (j == bt0Var.b) {
                    if (j != 0) {
                        k2d k2dVar = this.a;
                        k2d k2dVar2 = bt0Var.a;
                        int i = k2dVar.b;
                        int i2 = k2dVar2.b;
                        long j2 = 0;
                        while (j2 < this.b) {
                            long jMin = Math.min(k2dVar.c - i, k2dVar2.c - i2);
                            long j3 = 0;
                            while (j3 < jMin) {
                                int i3 = i + 1;
                                byte b = k2dVar.a[i];
                                int i4 = i2 + 1;
                                if (b == k2dVar2.a[i2]) {
                                    j3++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == k2dVar.c) {
                                k2d k2dVar3 = k2dVar.f;
                                i = k2dVar3.b;
                                k2dVar = k2dVar3;
                            }
                            if (i2 == k2dVar2.c) {
                                k2dVar2 = k2dVar2.f;
                                i2 = k2dVar2.b;
                            }
                            j2 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.eu0, defpackage.ksd, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.fu0, defpackage.eu0
    public final bt0 getBuffer() {
        return this;
    }

    @Override // defpackage.fu0
    public final void h0(long j) throws EOFException {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    public final int hashCode() {
        k2d k2dVar = this.a;
        if (k2dVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = k2dVar.c;
            for (int i3 = k2dVar.b; i3 < i2; i3++) {
                i = (i * 31) + k2dVar.a[i3];
            }
            k2dVar = k2dVar.f;
        } while (k2dVar != this.a);
        return i;
    }

    @Override // defpackage.eu0
    public final /* bridge */ /* synthetic */ eu0 i0(long j) {
        v0(j);
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9 A[EDGE_INSN: B:44:0x00a9->B:38:0x00a9 BREAK  A[LOOP:0: B:5:0x000f->B:46:?], SYNTHETIC] */
    @Override // defpackage.fu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j0() throws java.io.EOFException {
        /*
            r18 = this;
            r0 = r18
            r1 = 4
            r3 = 1
            long r4 = r0.b
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto Lb0
            r4 = r6
            r8 = 0
            r9 = 0
        Lf:
            k2d r10 = r0.a
            byte[] r11 = r10.a
            int r12 = r10.b
            int r13 = r10.c
        L17:
            if (r12 >= r13) goto L6e
            r14 = r11[r12]
            r15 = 48
            byte r15 = (byte) r15
            if (r14 < r15) goto L28
            r2 = 57
            byte r2 = (byte) r2
            if (r14 > r2) goto L28
            int r2 = r14 - r15
            goto L42
        L28:
            r2 = 97
            byte r2 = (byte) r2
            if (r14 < r2) goto L37
            r15 = 102(0x66, float:1.43E-43)
            byte r15 = (byte) r15
            if (r14 > r15) goto L37
        L32:
            int r2 = r14 - r2
            int r2 = r2 + 10
            goto L42
        L37:
            r2 = 65
            byte r2 = (byte) r2
            if (r14 < r2) goto L6b
            r15 = 70
            byte r15 = (byte) r15
            if (r14 > r15) goto L6b
            goto L32
        L42:
            r16 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r16 = r4 & r16
            int r15 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r15 != 0) goto L50
            long r4 = r4 << r1
            long r14 = (long) r2
            long r4 = r4 | r14
            int r12 = r12 + r3
            int r8 = r8 + r3
            goto L17
        L50:
            bt0 r0 = new bt0
            r0.<init>()
            r0.w0(r4)
            r0.u0(r14)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.p0()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L6b:
            if (r8 == 0) goto L70
            r9 = r3
        L6e:
            r11 = 0
            goto L95
        L70:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            char[] r2 = defpackage.z04.a
            int r1 = r14 >> 4
            r1 = r1 & 15
            char r1 = r2[r1]
            r4 = r14 & 15
            char r2 = r2[r4]
            r4 = 2
            char[] r4 = new char[r4]
            r11 = 0
            r4[r11] = r1
            r4[r3] = r2
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L95:
            if (r12 != r13) goto La1
            k2d r2 = r10.a()
            r0.a = r2
            defpackage.b3d.a(r10)
            goto La3
        La1:
            r10.b = r12
        La3:
            if (r9 != 0) goto La9
            k2d r2 = r0.a
            if (r2 != 0) goto Lf
        La9:
            long r1 = r0.b
            long r6 = (long) r8
            long r1 = r1 - r6
            r0.b = r1
            return r4
        Lb0:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt0.j0():long");
    }

    @Override // defpackage.fu0
    public final InputStream l0() {
        return new us0(this, 0);
    }

    public final void m() throws EOFException {
        R(this.b);
    }

    public final void m0(ss0 ss0Var) {
        if (ss0Var.a != null) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        ss0Var.a = this;
        ss0Var.b = true;
    }

    public final long n() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        k2d k2dVar = this.a.g;
        if (k2dVar.c < 8192 && k2dVar.e) {
            j -= r2 - k2dVar.b;
        }
        return j;
    }

    public final byte[] n0(long j) throws EOFException {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount: ").toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    public final void o(bt0 bt0Var, long j, long j2) {
        hm9.g(this.b, j, j2);
        if (j2 == 0) {
            return;
        }
        bt0Var.b += j2;
        k2d k2dVar = this.a;
        while (true) {
            long j3 = k2dVar.c - k2dVar.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            k2dVar = k2dVar.f;
        }
        while (j2 > 0) {
            k2d k2dVarC = k2dVar.c();
            int i = k2dVarC.b + ((int) j);
            k2dVarC.b = i;
            k2dVarC.c = Math.min(i + ((int) j2), k2dVarC.c);
            k2d k2dVar2 = bt0Var.a;
            if (k2dVar2 == null) {
                k2dVarC.g = k2dVarC;
                k2dVarC.f = k2dVarC;
                bt0Var.a = k2dVarC;
            } else {
                k2dVar2.g.b(k2dVarC);
            }
            j2 -= k2dVarC.c - k2dVarC.b;
            k2dVar = k2dVar.f;
            j = 0;
        }
    }

    public final String o0(long j, Charset charset) throws EOFException {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount: ").toString());
        }
        if (this.b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        k2d k2dVar = this.a;
        int i = k2dVar.b;
        if (i + j > k2dVar.c) {
            return new String(n0(j), charset);
        }
        int i2 = (int) j;
        String str = new String(k2dVar.a, i, i2, charset);
        int i3 = k2dVar.b + i2;
        k2dVar.b = i3;
        this.b -= j;
        if (i3 == k2dVar.c) {
            this.a = k2dVar.a();
            b3d.a(k2dVar);
        }
        return str;
    }

    @Override // defpackage.yud, defpackage.ksd
    public final oue p() {
        return oue.d;
    }

    public final String p0() {
        return o0(this.b, a52.a);
    }

    public final aw0 q0(int i) {
        if (i == 0) {
            return aw0.o;
        }
        hm9.g(this.b, 0L, i);
        k2d k2dVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = k2dVar.c;
            int i6 = k2dVar.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            k2dVar = k2dVar.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        k2d k2dVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            bArr[i7] = k2dVar2.a;
            i2 += k2dVar2.c - k2dVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = k2dVar2.b;
            k2dVar2.d = true;
            i7++;
            k2dVar2 = k2dVar2.f;
        }
        return new c3d(bArr, iArr);
    }

    public final k2d r0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        k2d k2dVar = this.a;
        if (k2dVar == null) {
            k2d k2dVarB = b3d.b();
            this.a = k2dVarB;
            k2dVarB.g = k2dVarB;
            k2dVarB.f = k2dVarB;
            return k2dVarB;
        }
        k2d k2dVar2 = k2dVar.g;
        if (k2dVar2.c + i <= 8192 && k2dVar2.e) {
            return k2dVar2;
        }
        k2d k2dVarB2 = b3d.b();
        k2dVar2.b(k2dVarB2);
        return k2dVarB2;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        k2d k2dVar = this.a;
        if (k2dVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), k2dVar.c - k2dVar.b);
        byteBuffer.put(k2dVar.a, k2dVar.b, iMin);
        int i = k2dVar.b + iMin;
        k2dVar.b = i;
        this.b -= iMin;
        if (i == k2dVar.c) {
            this.a = k2dVar.a();
            b3d.a(k2dVar);
        }
        return iMin;
    }

    @Override // defpackage.fu0
    public final byte readByte() {
        long j = this.b;
        if (j == 0) {
            throw new EOFException();
        }
        k2d k2dVar = this.a;
        int i = k2dVar.b;
        int i2 = k2dVar.c;
        int i3 = i + 1;
        byte b = k2dVar.a[i];
        this.b = j - 1;
        if (i3 == i2) {
            this.a = k2dVar.a();
            b3d.a(k2dVar);
        } else {
            k2dVar.b = i3;
        }
        return b;
    }

    @Override // defpackage.fu0
    public final void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int iE0 = e0(bArr, i, bArr.length - i);
            if (iE0 == -1) {
                throw new EOFException();
            }
            i += iE0;
        }
    }

    @Override // defpackage.fu0
    public final int readInt() throws EOFException {
        long j = this.b;
        if (j < 4) {
            throw new EOFException();
        }
        k2d k2dVar = this.a;
        int i = k2dVar.b;
        int i2 = k2dVar.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = k2dVar.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = i4 | (bArr[i3] & 255);
        this.b = j - 4;
        if (i5 == i2) {
            this.a = k2dVar.a();
            b3d.a(k2dVar);
        } else {
            k2dVar.b = i5;
        }
        return i6;
    }

    @Override // defpackage.fu0
    public final long readLong() throws EOFException {
        long j = this.b;
        if (j < 8) {
            throw new EOFException();
        }
        k2d k2dVar = this.a;
        int i = k2dVar.b;
        int i2 = k2dVar.c;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = k2dVar.a;
        int i3 = i + 7;
        long j2 = ((bArr[i + 1] & 255) << 48) | ((bArr[i] & 255) << 56) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j3 = j2 | (bArr[i3] & 255);
        this.b = j - 8;
        if (i4 == i2) {
            this.a = k2dVar.a();
            b3d.a(k2dVar);
        } else {
            k2dVar.b = i4;
        }
        return j3;
    }

    @Override // defpackage.fu0
    public final short readShort() throws EOFException {
        long j = this.b;
        if (j < 2) {
            throw new EOFException();
        }
        k2d k2dVar = this.a;
        int i = k2dVar.b;
        int i2 = k2dVar.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        int i3 = i + 1;
        byte[] bArr = k2dVar.a;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.b = j - 2;
        if (i5 == i2) {
            this.a = k2dVar.a();
            b3d.a(k2dVar);
        } else {
            k2dVar.b = i5;
        }
        return (short) i6;
    }

    public final void s0(aw0 aw0Var) {
        aw0Var.k(this, aw0Var.c());
    }

    public final void t0(yud yudVar) {
        while (yudVar.c(this, 8192) != -1) {
        }
    }

    public final String toString() {
        long j = this.b;
        if (j <= Integer.MAX_VALUE) {
            return q0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    public final void u0(int i) {
        k2d k2dVarR0 = r0(1);
        int i2 = k2dVarR0.c;
        k2dVarR0.c = i2 + 1;
        k2dVarR0.a[i2] = (byte) i;
        this.b++;
    }

    public final void v0(long j) {
        int i;
        byte[] bArr;
        if (j == 0) {
            u0(48);
            return;
        }
        boolean z = false;
        int i2 = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                z0(0, 20, "-9223372036854775808");
                return;
            }
            z = true;
        }
        if (j < 100000000) {
            if (j >= WorkRequest.MIN_BACKOFF_MILLIS) {
                i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
            } else if (j >= 100) {
                i = j < 1000 ? 3 : 4;
            } else if (j >= 10) {
                i2 = 2;
            }
            i2 = i;
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                i2 = j < 1000000000 ? 9 : 10;
            } else {
                i = j < 100000000000L ? 11 : 12;
                i2 = i;
            }
        } else if (j >= 1000000000000000L) {
            i2 = j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j < 10000000000000L) {
            i2 = 13;
        } else {
            i = j < 100000000000000L ? 14 : 15;
            i2 = i;
        }
        if (z) {
            i2++;
        }
        k2d k2dVarR0 = r0(i2);
        int i3 = k2dVarR0.c + i2;
        while (true) {
            bArr = k2dVarR0.a;
            if (j == 0) {
                break;
            }
            long j2 = 10;
            i3--;
            bArr[i3] = jt0.a[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        k2dVarR0.c += i2;
        this.b += i2;
    }

    public final void w0(long j) {
        if (j == 0) {
            u0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        k2d k2dVarR0 = r0(i);
        int i2 = k2dVarR0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            k2dVarR0.a[i3] = jt0.a[(int) (15 & j)];
            j >>>= 4;
        }
        k2dVarR0.c += i;
        this.b += i;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            k2d k2dVarR0 = r0(1);
            int iMin = Math.min(i, 8192 - k2dVarR0.c);
            byteBuffer.get(k2dVarR0.a, k2dVarR0.c, iMin);
            i -= iMin;
            k2dVarR0.c += iMin;
        }
        this.b += iRemaining;
        return iRemaining;
    }

    @Override // defpackage.eu0
    public final eu0 x() {
        return this;
    }

    public final void x0(int i) {
        k2d k2dVarR0 = r0(4);
        int i2 = k2dVarR0.c;
        byte[] bArr = k2dVarR0.a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        k2dVarR0.c = i2 + 4;
        this.b += 4;
    }

    @Override // defpackage.eu0
    public final /* bridge */ /* synthetic */ eu0 y(int i) {
        y0(i);
        return this;
    }

    public final void y0(int i) {
        k2d k2dVarR0 = r0(2);
        int i2 = k2dVarR0.c;
        byte[] bArr = k2dVarR0.a;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        k2dVarR0.c = i2 + 2;
        this.b += 2;
    }

    public final void z0(int i, int i2, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(zr6.h(i, "beginIndex < 0: ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(rh4.h("endIndex < beginIndex: ", i2, i, " < ").toString());
        }
        if (i2 > str.length()) {
            StringBuilder sbN = rh4.n(i2, "endIndex > string.length: ", " > ");
            sbN.append(str.length());
            throw new IllegalArgumentException(sbN.toString().toString());
        }
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                k2d k2dVarR0 = r0(1);
                int i3 = k2dVarR0.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = k2dVarR0.a;
                bArr[i + i3] = (byte) cCharAt;
                while (i4 < iMin) {
                    char cCharAt2 = str.charAt(i4);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i4 + i3] = (byte) cCharAt2;
                    i4++;
                }
                int i5 = k2dVarR0.c;
                int i6 = (i3 + i4) - i5;
                k2dVarR0.c = i5 + i6;
                this.b += i6;
                i = i4;
            } else {
                if (cCharAt < 2048) {
                    k2d k2dVarR02 = r0(2);
                    int i7 = k2dVarR02.c;
                    byte[] bArr2 = k2dVarR02.a;
                    bArr2[i7] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt & '?') | 128);
                    k2dVarR02.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    k2d k2dVarR03 = r0(3);
                    int i8 = k2dVarR03.c;
                    byte[] bArr3 = k2dVarR03.a;
                    bArr3[i8] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt & '?') | 128);
                    k2dVarR03.c = i8 + 3;
                    this.b += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt > 56319 || 56320 > cCharAt3 || 57343 < cCharAt3) {
                        u0(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        k2d k2dVarR04 = r0(4);
                        int i11 = k2dVarR04.c;
                        byte[] bArr4 = k2dVarR04.a;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        k2dVarR04.c = i11 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // defpackage.eu0
    public final eu0 write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        return this;
    }

    public final void write(byte[] bArr, int i, int i2) {
        long j = i2;
        hm9.g(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            k2d k2dVarR0 = r0(1);
            int iMin = Math.min(i3 - i, 8192 - k2dVarR0.c);
            int i4 = i + iMin;
            System.arraycopy(bArr, i, k2dVarR0.a, k2dVarR0.c, i4 - i);
            k2dVarR0.c += iMin;
            i = i4;
        }
        this.b += j;
    }
}
