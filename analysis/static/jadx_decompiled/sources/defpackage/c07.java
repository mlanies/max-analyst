package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class c07 implements yud {
    public int a;
    public boolean b;
    public final fu0 c;
    public final Inflater o;

    public c07(y7c y7cVar, Inflater inflater) {
        this.c = y7cVar;
        this.o = inflater;
    }

    public final long a(bt0 bt0Var, long j) throws DataFormatException, IOException {
        Inflater inflater = this.o;
        if (j < 0) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount < 0: ").toString());
        }
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j == 0) {
            return 0L;
        }
        try {
            k2d k2dVarR0 = bt0Var.r0(1);
            int iMin = (int) Math.min(j, 8192 - k2dVarR0.c);
            boolean zNeedsInput = inflater.needsInput();
            fu0 fu0Var = this.c;
            if (zNeedsInput && !fu0Var.B()) {
                k2d k2dVar = fu0Var.getBuffer().a;
                int i = k2dVar.c;
                int i2 = k2dVar.b;
                int i3 = i - i2;
                this.a = i3;
                inflater.setInput(k2dVar.a, i2, i3);
            }
            int iInflate = inflater.inflate(k2dVarR0.a, k2dVarR0.c, iMin);
            int i4 = this.a;
            if (i4 != 0) {
                int remaining = i4 - inflater.getRemaining();
                this.a -= remaining;
                fu0Var.R(remaining);
            }
            if (iInflate > 0) {
                k2dVarR0.c += iInflate;
                long j2 = iInflate;
                bt0Var.b += j2;
                return j2;
            }
            if (k2dVarR0.b == k2dVarR0.c) {
                bt0Var.a = k2dVarR0.a();
                b3d.a(k2dVarR0);
            }
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.yud
    public final long c(bt0 bt0Var, long j) throws DataFormatException, IOException {
        do {
            long jA = a(bt0Var, j);
            if (jA > 0) {
                return jA;
            }
            Inflater inflater = this.o;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.c.B());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.b) {
            return;
        }
        this.o.end();
        this.b = true;
        this.c.close();
    }

    @Override // defpackage.yud, defpackage.ksd
    public final oue p() {
        return this.c.p();
    }
}
