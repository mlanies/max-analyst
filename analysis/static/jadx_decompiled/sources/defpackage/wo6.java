package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class wo6 extends uo6 {
    public boolean X;
    public final vq6 Y;
    public final /* synthetic */ x8 Z;
    public long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo6(x8 x8Var, vq6 vq6Var) {
        super(x8Var);
        this.Z = x8Var;
        this.Y = vq6Var;
        this.o = -1L;
        this.X = true;
    }

    @Override // defpackage.uo6, defpackage.yud
    public final long c(bt0 bt0Var, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount < 0: ").toString());
        }
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!this.X) {
            return -1L;
        }
        long j2 = this.o;
        x8 x8Var = this.Z;
        if (j2 == 0 || j2 == -1) {
            if (j2 != -1) {
                ((fu0) x8Var.X).X();
            }
            try {
                this.o = ((fu0) x8Var.X).j0();
                String string = w9e.b1(((fu0) x8Var.X).X()).toString();
                if (this.o < 0 || (string.length() > 0 && !eae.o0(string, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.o + string + '\"');
                }
                if (this.o == 0) {
                    this.X = false;
                    mq6.b(((u2a) x8Var.c).u0, this.Y, ((g03) x8Var.b).Y());
                    m();
                }
                if (!this.X) {
                    return -1L;
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }
        long jC = super.c(bt0Var, Math.min(j, this.o));
        if (jC != -1) {
            this.o -= jC;
            return jC;
        }
        ((f8c) x8Var.o).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        m();
        throw protocolException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zT;
        if (this.b) {
            return;
        }
        if (this.X) {
            try {
                zT = naf.t(this, 100, TimeUnit.MILLISECONDS);
            } catch (IOException unused) {
                zT = false;
            }
            if (!zT) {
                ((f8c) this.Z.o).k();
                m();
            }
        }
        this.b = true;
    }
}
