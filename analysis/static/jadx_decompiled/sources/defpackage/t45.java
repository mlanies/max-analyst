package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class t45 implements yud {
    public boolean X;
    public final long Y;
    public final /* synthetic */ od Z;
    public final yud a;
    public long b;
    public boolean c = true;
    public boolean o;

    public t45(od odVar, yud yudVar, long j) {
        this.Z = odVar;
        this.a = yudVar;
        this.Y = j;
        if (j == 0) {
            n(null);
        }
    }

    @Override // defpackage.yud
    public final long c(bt0 bt0Var, long j) throws IOException {
        if (!(!this.X)) {
            throw new IllegalStateException("closed".toString());
        }
        try {
            long jC = this.a.c(bt0Var, j);
            if (this.c) {
                this.c = false;
                ((dp3) this.Z.o).getClass();
            }
            if (jC == -1) {
                n(null);
                return -1L;
            }
            long j2 = this.b + jC;
            long j3 = this.Y;
            if (j3 == -1 || j2 <= j3) {
                this.b = j2;
                if (j2 == j3) {
                    n(null);
                }
                return jC;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw n(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.X) {
            return;
        }
        this.X = true;
        try {
            m();
            n(null);
        } catch (IOException e) {
            throw n(e);
        }
    }

    public final void m() throws IOException {
        this.a.close();
    }

    public final IOException n(IOException iOException) {
        if (this.o) {
            return iOException;
        }
        this.o = true;
        od odVar = this.Z;
        if (iOException == null && this.c) {
            this.c = false;
            ((dp3) odVar.o).getClass();
        }
        return odVar.a(true, false, iOException);
    }

    @Override // defpackage.yud, defpackage.ksd
    public final oue p() {
        return this.a.p();
    }

    public final String toString() {
        return t45.class.getSimpleName() + '(' + this.a + ')';
    }
}
