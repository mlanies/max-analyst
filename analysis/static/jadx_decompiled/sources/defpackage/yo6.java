package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class yo6 extends uo6 {
    public boolean o;

    @Override // defpackage.uo6, defpackage.yud
    public final long c(bt0 bt0Var, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount < 0: ").toString());
        }
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.o) {
            return -1L;
        }
        long jC = super.c(bt0Var, j);
        if (jC != -1) {
            return jC;
        }
        this.o = true;
        m();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        if (!this.o) {
            m();
        }
        this.b = true;
    }
}
