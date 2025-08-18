package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class s45 implements ksd {
    public final long X;
    public final /* synthetic */ od Y;
    public final ksd a;
    public boolean b;
    public long c;
    public boolean o;

    public s45(od odVar, ksd ksdVar, long j) {
        this.Y = odVar;
        this.a = ksdVar;
        this.X = j;
    }

    @Override // defpackage.ksd
    public final void N(bt0 bt0Var, long j) throws IOException {
        if (!(!this.o)) {
            throw new IllegalStateException("closed".toString());
        }
        long j2 = this.X;
        if (j2 != -1 && this.c + j > j2) {
            StringBuilder sbK = au1.k(j2, "expected ", " bytes but received ");
            sbK.append(this.c + j);
            throw new ProtocolException(sbK.toString());
        }
        try {
            this.a.N(bt0Var, j);
            this.c += j;
        } catch (IOException e) {
            throw n(e);
        }
    }

    @Override // defpackage.ksd, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.o) {
            return;
        }
        this.o = true;
        long j = this.X;
        if (j != -1 && this.c != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            m();
            n(null);
        } catch (IOException e) {
            throw n(e);
        }
    }

    @Override // defpackage.ksd, java.io.Flushable
    public final void flush() throws IOException {
        try {
            o();
        } catch (IOException e) {
            throw n(e);
        }
    }

    public final void m() {
        this.a.close();
    }

    public final IOException n(IOException iOException) {
        if (this.b) {
            return iOException;
        }
        this.b = true;
        return this.Y.a(false, true, iOException);
    }

    public final void o() {
        this.a.flush();
    }

    @Override // defpackage.ksd
    public final oue p() {
        return this.a.p();
    }

    public final String toString() {
        return s45.class.getSimpleName() + '(' + this.a + ')';
    }
}
