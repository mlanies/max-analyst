package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class xo6 extends uo6 {
    public final /* synthetic */ x8 X;
    public long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo6(x8 x8Var, long j) {
        super(x8Var);
        this.X = x8Var;
        this.o = j;
        if (j == 0) {
            m();
        }
    }

    @Override // defpackage.uo6, defpackage.yud
    public final long c(bt0 bt0Var, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount < 0: ").toString());
        }
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        long j2 = this.o;
        if (j2 == 0) {
            return -1L;
        }
        long jC = super.c(bt0Var, Math.min(j2, j));
        if (jC == -1) {
            ((f8c) this.X.o).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m();
            throw protocolException;
        }
        long j3 = this.o - jC;
        this.o = j3;
        if (j3 == 0) {
            m();
        }
        return jC;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zT;
        if (this.b) {
            return;
        }
        if (this.o != 0) {
            try {
                zT = naf.t(this, 100, TimeUnit.MILLISECONDS);
            } catch (IOException unused) {
                zT = false;
            }
            if (!zT) {
                ((f8c) this.X.o).k();
                m();
            }
        }
        this.b = true;
    }
}
