package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;

/* loaded from: classes.dex */
public final class n3g implements Closeable {
    public final eu0 Z;
    public final bt0 b;
    public boolean c;
    public eu8 o;
    public final Random s0;
    public final boolean t0;
    public final boolean u0;
    public final long v0;
    public final bt0 a = new bt0();
    public final byte[] X = new byte[4];
    public final ss0 Y = new ss0();

    public n3g(x7c x7cVar, Random random, boolean z, boolean z2, long j) {
        this.Z = x7cVar;
        this.s0 = random;
        this.t0 = z;
        this.u0 = z2;
        this.v0 = j;
        this.b = x7cVar.a;
    }

    public final void a(int i, aw0 aw0Var) {
        if (this.c) {
            throw new IOException("closed");
        }
        int iC = aw0Var.c();
        if (iC > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        bt0 bt0Var = this.b;
        bt0Var.u0(i | 128);
        bt0Var.u0(iC | 128);
        Random random = this.s0;
        byte[] bArr = this.X;
        random.nextBytes(bArr);
        bt0Var.write(bArr, 0, bArr.length);
        if (iC > 0) {
            long j = bt0Var.b;
            aw0Var.k(bt0Var, aw0Var.c());
            ss0 ss0Var = this.Y;
            bt0Var.m0(ss0Var);
            ss0Var.d(j);
            xfg.D(ss0Var, bArr);
            ss0Var.close();
        }
        this.Z.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        eu8 eu8Var = this.o;
        if (eu8Var != null) {
            eu8Var.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.aw0 r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n3g.d(aw0):void");
    }
}
