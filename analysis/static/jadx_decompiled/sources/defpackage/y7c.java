package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class y7c implements fu0 {
    public final bt0 a = new bt0();
    public boolean b;
    public final yud c;

    public y7c(yud yudVar) {
        this.c = yudVar;
    }

    @Override // defpackage.fu0
    public final boolean B() {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        bt0 bt0Var = this.a;
        if (bt0Var.B()) {
            if (this.c.c(bt0Var, 8192) == -1) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fu0
    public final String G(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(ey8.h(j, "limit < 0: ").toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        byte b = (byte) 10;
        long jA = a(b, 0L, j2);
        bt0 bt0Var = this.a;
        if (jA != -1) {
            return jt0.a(bt0Var, jA);
        }
        if (j2 < Long.MAX_VALUE && n(j2) && bt0Var.S(j2 - 1) == ((byte) 13) && n(1 + j2) && bt0Var.S(j2) == b) {
            return jt0.a(bt0Var, j2);
        }
        bt0 bt0Var2 = new bt0();
        bt0Var.o(bt0Var2, 0L, Math.min(32, bt0Var.b));
        throw new EOFException("\\n not found: limit=" + Math.min(bt0Var.b, j) + " content=" + bt0Var2.e(bt0Var2.b).d() + "…");
    }

    @Override // defpackage.fu0
    public final long K(ux uxVar) {
        bt0 bt0Var;
        long j = 0;
        while (true) {
            yud yudVar = this.c;
            bt0Var = this.a;
            if (yudVar.c(bt0Var, 8192) == -1) {
                break;
            }
            long jN = bt0Var.n();
            if (jN > 0) {
                j += jN;
                uxVar.N(bt0Var, jN);
            }
        }
        long j2 = bt0Var.b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        uxVar.N(bt0Var, j2);
        return j3;
    }

    @Override // defpackage.fu0
    public final String O(Charset charset) {
        bt0 bt0Var = this.a;
        bt0Var.t0(this.c);
        return bt0Var.o0(bt0Var.b, charset);
    }

    @Override // defpackage.fu0
    public final void Q(bt0 bt0Var, long j) throws EOFException {
        bt0 bt0Var2 = this.a;
        try {
            h0(j);
            bt0Var2.Q(bt0Var, j);
        } catch (EOFException e) {
            bt0Var.t0(bt0Var2);
            throw e;
        }
    }

    @Override // defpackage.fu0
    public final void R(long j) throws EOFException {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            bt0 bt0Var = this.a;
            if (bt0Var.b == 0) {
                if (this.c.c(bt0Var, 8192) == -1) {
                    throw new EOFException();
                }
            }
            long jMin = Math.min(j, bt0Var.b);
            bt0Var.R(jMin);
            j -= jMin;
        }
    }

    @Override // defpackage.fu0
    public final String X() {
        return G(Long.MAX_VALUE);
    }

    public final long a(byte b, long j, long j2) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        long jMax = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException(ey8.h(j2, "fromIndex=0 toIndex=").toString());
        }
        while (jMax < j2) {
            long jU = this.a.U(b, jMax, j2);
            if (jU != -1) {
                return jU;
            }
            bt0 bt0Var = this.a;
            long j3 = bt0Var.b;
            if (j3 >= j2) {
                return -1L;
            }
            if (this.c.c(bt0Var, 8192) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j3);
        }
        return -1L;
    }

    @Override // defpackage.yud
    public final long c(bt0 bt0Var, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount < 0: ").toString());
        }
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        bt0 bt0Var2 = this.a;
        if (bt0Var2.b == 0) {
            if (this.c.c(bt0Var2, 8192) == -1) {
                return -1L;
            }
        }
        return bt0Var2.c(bt0Var, Math.min(j, bt0Var2.b));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c.close();
        this.a.m();
    }

    @Override // defpackage.fu0
    public final int d0(vma vmaVar) throws EOFException {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            bt0 bt0Var = this.a;
            int iB = jt0.b(bt0Var, vmaVar, true);
            if (iB == -2) {
                if (this.c.c(bt0Var, 8192) == -1) {
                    break;
                }
            } else if (iB != -1) {
                bt0Var.R(vmaVar.a[iB].c());
                return iB;
            }
        }
        return -1;
    }

    @Override // defpackage.fu0
    public final aw0 e(long j) throws EOFException {
        h0(j);
        return this.a.e(j);
    }

    @Override // defpackage.fu0, defpackage.eu0
    public final bt0 getBuffer() {
        return this.a;
    }

    @Override // defpackage.fu0
    public final void h0(long j) throws EOFException {
        if (!n(j)) {
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.b;
    }

    @Override // defpackage.fu0
    public final long j0() throws EOFException {
        bt0 bt0Var;
        byte bS;
        h0(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zN = n(i2);
            bt0Var = this.a;
            if (!zN) {
                break;
            }
            bS = bt0Var.S(i);
            if ((bS < ((byte) 48) || bS > ((byte) 57)) && ((bS < ((byte) 97) || bS > ((byte) HttpStatus.SC_PROCESSING)) && (bS < ((byte) 65) || bS > ((byte) 70)))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            nd7.e(16);
            nd7.e(16);
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(Integer.toString(bS, 16)));
        }
        return bt0Var.j0();
    }

    @Override // defpackage.fu0
    public final InputStream l0() {
        return new us0(this, 1);
    }

    public final int m() throws EOFException {
        h0(4L);
        int i = this.a.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public final boolean n(long j) {
        bt0 bt0Var;
        if (j < 0) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount < 0: ").toString());
        }
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            bt0Var = this.a;
            if (bt0Var.b >= j) {
                return true;
            }
        } while (this.c.c(bt0Var, 8192) != -1);
        return false;
    }

    @Override // defpackage.yud, defpackage.ksd
    public final oue p() {
        return this.c.p();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        bt0 bt0Var = this.a;
        if (bt0Var.b == 0) {
            if (this.c.c(bt0Var, 8192) == -1) {
                return -1;
            }
        }
        return bt0Var.read(byteBuffer);
    }

    @Override // defpackage.fu0
    public final byte readByte() {
        h0(1L);
        return this.a.readByte();
    }

    @Override // defpackage.fu0
    public final void readFully(byte[] bArr) throws EOFException {
        bt0 bt0Var = this.a;
        try {
            h0(bArr.length);
            bt0Var.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = bt0Var.b;
                if (j <= 0) {
                    throw e;
                }
                int iE0 = bt0Var.e0(bArr, i, (int) j);
                if (iE0 == -1) {
                    throw new AssertionError();
                }
                i += iE0;
            }
        }
    }

    @Override // defpackage.fu0
    public final int readInt() throws EOFException {
        h0(4L);
        return this.a.readInt();
    }

    @Override // defpackage.fu0
    public final long readLong() throws EOFException {
        h0(8L);
        return this.a.readLong();
    }

    @Override // defpackage.fu0
    public final short readShort() throws EOFException {
        h0(2L);
        return this.a.readShort();
    }

    public final String toString() {
        return "buffer(" + this.c + ')';
    }
}
