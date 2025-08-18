package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class x7c implements eu0 {
    public final bt0 a = new bt0();
    public boolean b;
    public final ksd c;

    public x7c(ksd ksdVar) {
        this.c = ksdVar;
    }

    @Override // defpackage.eu0
    public final eu0 A(int i) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.x0(i);
        E();
        return this;
    }

    @Override // defpackage.eu0
    public final eu0 C(int i) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.u0(i);
        E();
        return this;
    }

    @Override // defpackage.eu0
    public final eu0 E() {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        bt0 bt0Var = this.a;
        long jN = bt0Var.n();
        if (jN > 0) {
            this.c.N(bt0Var, jN);
        }
        return this;
    }

    @Override // defpackage.eu0
    public final eu0 L(String str) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.A0(str);
        E();
        return this;
    }

    @Override // defpackage.eu0
    public final eu0 M(aw0 aw0Var) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.s0(aw0Var);
        E();
        return this;
    }

    @Override // defpackage.ksd
    public final void N(bt0 bt0Var, long j) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.N(bt0Var, j);
        E();
    }

    @Override // defpackage.eu0
    public final eu0 P(long j) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.w0(j);
        E();
        return this;
    }

    @Override // defpackage.eu0
    public final eu0 b0(int i, byte[] bArr, int i2) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.write(bArr, i, i2);
        E();
        return this;
    }

    @Override // defpackage.ksd, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        ksd ksdVar = this.c;
        if (this.b) {
            return;
        }
        try {
            bt0 bt0Var = this.a;
            long j = bt0Var.b;
            if (j > 0) {
                ksdVar.N(bt0Var, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ksdVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.b = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.eu0, defpackage.ksd, java.io.Flushable
    public final void flush() {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        bt0 bt0Var = this.a;
        long j = bt0Var.b;
        ksd ksdVar = this.c;
        if (j > 0) {
            ksdVar.N(bt0Var, j);
        }
        ksdVar.flush();
    }

    @Override // defpackage.eu0
    public final bt0 getBuffer() {
        return this.a;
    }

    @Override // defpackage.eu0
    public final eu0 i0(long j) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.v0(j);
        E();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.b;
    }

    @Override // defpackage.ksd
    public final oue p() {
        return this.c.p();
    }

    public final String toString() {
        return "buffer(" + this.c + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.a.write(byteBuffer);
        E();
        return iWrite;
    }

    @Override // defpackage.eu0
    public final eu0 x() {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        bt0 bt0Var = this.a;
        long j = bt0Var.b;
        if (j > 0) {
            this.c.N(bt0Var, j);
        }
        return this;
    }

    @Override // defpackage.eu0
    public final eu0 y(int i) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.a.y0(i);
        E();
        return this;
    }

    @Override // defpackage.eu0
    public final eu0 write(byte[] bArr) {
        if (!this.b) {
            bt0 bt0Var = this.a;
            bt0Var.getClass();
            bt0Var.write(bArr, 0, bArr.length);
            E();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
