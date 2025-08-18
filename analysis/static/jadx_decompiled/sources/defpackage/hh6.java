package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class hh6 implements yud {
    public final CRC32 X;
    public byte a;
    public final y7c b;
    public final Inflater c;
    public final c07 o;

    public hh6(yud yudVar) {
        y7c y7cVar = new y7c(yudVar);
        this.b = y7cVar;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.o = new c07(y7cVar, inflater);
        this.X = new CRC32();
    }

    public static void a(int i, int i2, String str) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // defpackage.yud
    public final long c(bt0 bt0Var, long j) throws DataFormatException, IOException {
        y7c y7cVar;
        bt0 bt0Var2;
        long j2;
        if (j < 0) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = this.a;
        CRC32 crc32 = this.X;
        y7c y7cVar2 = this.b;
        if (b == 0) {
            y7cVar2.h0(10L);
            bt0 bt0Var3 = y7cVar2.a;
            byte bS = bt0Var3.S(3L);
            boolean z = ((bS >> 1) & 1) == 1;
            if (z) {
                d(y7cVar2.a, 0L, 10L);
            }
            a(8075, y7cVar2.readShort(), "ID1ID2");
            y7cVar2.R(8L);
            if (((bS >> 2) & 1) == 1) {
                y7cVar2.h0(2L);
                if (z) {
                    d(y7cVar2.a, 0L, 2L);
                }
                short s = bt0Var3.readShort();
                long j3 = (short) (((s & 255) << 8) | ((s & 65280) >>> 8));
                y7cVar2.h0(j3);
                if (z) {
                    d(y7cVar2.a, 0L, j3);
                    j2 = j3;
                } else {
                    j2 = j3;
                }
                y7cVar2.R(j2);
            }
            if (((bS >> 3) & 1) == 1) {
                bt0Var2 = bt0Var3;
                long jA = y7cVar2.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA == -1) {
                    throw new EOFException();
                }
                if (z) {
                    y7cVar = y7cVar2;
                    d(y7cVar2.a, 0L, jA + 1);
                } else {
                    y7cVar = y7cVar2;
                }
                y7cVar.R(jA + 1);
            } else {
                bt0Var2 = bt0Var3;
                y7cVar = y7cVar2;
            }
            if (((bS >> 4) & 1) == 1) {
                long jA2 = y7cVar.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    d(y7cVar.a, 0L, jA2 + 1);
                }
                y7cVar.R(jA2 + 1);
            }
            if (z) {
                y7cVar.h0(2L);
                short s2 = bt0Var2.readShort();
                a((short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.a = (byte) 1;
        } else {
            y7cVar = y7cVar2;
        }
        if (this.a == 1) {
            long j4 = bt0Var.b;
            long jC = this.o.c(bt0Var, j);
            if (jC != -1) {
                d(bt0Var, j4, jC);
                return jC;
            }
            this.a = (byte) 2;
        }
        if (this.a != 2) {
            return -1L;
        }
        a(y7cVar.m(), (int) crc32.getValue(), "CRC");
        a(y7cVar.m(), (int) this.c.getBytesWritten(), "ISIZE");
        this.a = (byte) 3;
        if (y7cVar.B()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.o.close();
    }

    public final void d(bt0 bt0Var, long j, long j2) {
        k2d k2dVar = bt0Var.a;
        while (true) {
            int i = k2dVar.c;
            int i2 = k2dVar.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            k2dVar = k2dVar.f;
        }
        while (j2 > 0) {
            int iMin = (int) Math.min(k2dVar.c - r6, j2);
            this.X.update(k2dVar.a, (int) (k2dVar.b + j), iMin);
            j2 -= iMin;
            k2dVar = k2dVar.f;
            j = 0;
        }
    }

    @Override // defpackage.yud, defpackage.ksd
    public final oue p() {
        return this.b.c.p();
    }
}
