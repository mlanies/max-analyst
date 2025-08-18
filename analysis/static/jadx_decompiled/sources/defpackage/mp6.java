package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class mp6 implements yud {
    public int X;
    public final fu0 Y;
    public int a;
    public int b;
    public int c;
    public int o;

    public mp6(fu0 fu0Var) {
        this.Y = fu0Var;
    }

    @Override // defpackage.yud
    public final long c(bt0 bt0Var, long j) throws IOException {
        int i;
        int i2;
        do {
            int i3 = this.o;
            fu0 fu0Var = this.Y;
            if (i3 != 0) {
                long jC = fu0Var.c(bt0Var, Math.min(j, i3));
                if (jC == -1) {
                    return -1L;
                }
                this.o -= (int) jC;
                return jC;
            }
            fu0Var.R(this.X);
            this.X = 0;
            if ((this.b & 4) != 0) {
                return -1L;
            }
            i = this.c;
            int iS = naf.s(fu0Var);
            this.o = iS;
            this.a = iS;
            int i4 = fu0Var.readByte() & 255;
            this.b = fu0Var.readByte() & 255;
            Logger logger = np6.X;
            if (logger.isLoggable(Level.FINE)) {
                aw0 aw0Var = zo6.a;
                logger.fine(zo6.a(true, this.c, this.a, i4, this.b));
            }
            i2 = fu0Var.readInt() & Integer.MAX_VALUE;
            this.c = i2;
            if (i4 != 9) {
                throw new IOException(i4 + " != TYPE_CONTINUATION");
            }
        } while (i2 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.yud, defpackage.ksd
    public final oue p() {
        return this.Y.p();
    }
}
