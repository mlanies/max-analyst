package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class lhe implements m60 {
    public final Object b;
    public final vud c = new vud();

    public lhe(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.m60
    public final ByteBuffer a() {
        ByteBuffer byteBufferA;
        synchronized (this.b) {
            byteBufferA = this.c.a();
        }
        return byteBufferA;
    }

    @Override // defpackage.m60
    public final void b(ByteBuffer byteBuffer) {
        synchronized (this.b) {
            this.c.b(byteBuffer);
        }
    }

    @Override // defpackage.m60
    public final void c() {
        synchronized (this.b) {
            this.c.c();
        }
    }

    @Override // defpackage.m60
    public final boolean d() {
        boolean zD;
        synchronized (this.b) {
            zD = this.c.d();
        }
        return zD;
    }

    @Override // defpackage.m60
    public final j60 e(j60 j60Var) {
        j60 j60VarE;
        synchronized (this.b) {
            j60VarE = this.c.e(j60Var);
        }
        return j60VarE;
    }

    @Override // defpackage.m60
    public final long f(long j) {
        long jG;
        synchronized (this.b) {
            jG = this.c.g(j);
        }
        return jG;
    }

    @Override // defpackage.m60
    public final void flush() {
        synchronized (this.b) {
            this.c.flush();
        }
    }

    @Override // defpackage.m60
    public final boolean isActive() {
        boolean zIsActive;
        synchronized (this.b) {
            zIsActive = this.c.isActive();
        }
        return zIsActive;
    }

    @Override // defpackage.m60
    public final void reset() {
        synchronized (this.b) {
            this.c.reset();
        }
    }
}
