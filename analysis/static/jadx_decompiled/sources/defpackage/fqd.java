package defpackage;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public abstract class fqd implements cbe, l54 {
    public final jbe[] Y;
    public final hka a;
    public int s0;
    public o54 t0;
    public SubtitleDecoderException u0;
    public boolean v0;
    public boolean w0;
    public final Object b = new Object();
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque o = new ArrayDeque();
    public final o54[] X = new hbe[2];
    public int Z = 2;

    public fqd() {
        jbe[] jbeVarArr = new jbe[2];
        int i = 0;
        while (true) {
            if (i >= this.Z) {
                break;
            }
            this.X[i] = new hbe(1);
            i++;
        }
        this.Y = jbeVarArr;
        this.s0 = 2;
        for (int i2 = 0; i2 < this.s0; i2++) {
            this.Y[i2] = new y02(this, 2);
        }
        hka hkaVar = new hka(1, this);
        this.a = hkaVar;
        hkaVar.start();
        int i3 = this.Z;
        o54[] o54VarArr = this.X;
        np8.f(i3 == o54VarArr.length);
        for (o54 o54Var : o54VarArr) {
            o54Var.x(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        }
    }

    public abstract abe a(int i, byte[] bArr, boolean z);

    @Override // defpackage.cbe
    public final void b(long j) {
    }

    @Override // defpackage.l54
    public final jbe c() {
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.u0;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                if (this.o.isEmpty()) {
                    return null;
                }
                return (jbe) this.o.removeFirst();
            } finally {
            }
        }
    }

    public final SubtitleDecoderException d(o54 o54Var, jbe jbeVar, boolean z) {
        hbe hbeVar = (hbe) o54Var;
        try {
            ByteBuffer byteBuffer = hbeVar.o;
            byteBuffer.getClass();
            jbeVar.w(hbeVar.Y, a(byteBuffer.limit(), byteBuffer.array(), z), hbeVar.u0);
            jbeVar.b &= Integer.MAX_VALUE;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            monitor-enter(r0)
        L3:
            boolean r1 = r8.w0     // Catch: java.lang.Throwable -> L20
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L23
            java.util.ArrayDeque r1 = r8.c     // Catch: java.lang.Throwable -> L20
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L17
            int r1 = r8.s0     // Catch: java.lang.Throwable -> L20
            if (r1 <= 0) goto L17
            r1 = r3
            goto L18
        L17:
            r1 = r2
        L18:
            if (r1 != 0) goto L23
            java.lang.Object r1 = r8.b     // Catch: java.lang.Throwable -> L20
            r1.wait()     // Catch: java.lang.Throwable -> L20
            goto L3
        L20:
            r8 = move-exception
            goto La6
        L23:
            boolean r1 = r8.w0     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r2
        L29:
            java.util.ArrayDeque r1 = r8.c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L20
            o54 r1 = (defpackage.o54) r1     // Catch: java.lang.Throwable -> L20
            jbe[] r4 = r8.Y     // Catch: java.lang.Throwable -> L20
            int r5 = r8.s0     // Catch: java.lang.Throwable -> L20
            int r5 = r5 - r3
            r8.s0 = r5     // Catch: java.lang.Throwable -> L20
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L20
            boolean r5 = r8.v0     // Catch: java.lang.Throwable -> L20
            r8.v0 = r2     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            r0 = 4
            boolean r6 = r1.f(r0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == 0) goto L4c
            r4.a(r0)
            goto L79
        L4c:
            boolean r0 = r1.f(r7)
            if (r0 == 0) goto L55
            r4.a(r7)
        L55:
            com.google.android.exoplayer2.text.SubtitleDecoderException r0 = r8.d(r1, r4, r5)     // Catch: java.lang.OutOfMemoryError -> L5a java.lang.RuntimeException -> L64
            goto L6d
        L5a:
            r0 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r5 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L62:
            r0 = r5
            goto L6d
        L64:
            r0 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r5 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L62
        L6d:
            if (r0 == 0) goto L79
            java.lang.Object r5 = r8.b
            monitor-enter(r5)
            r8.u0 = r0     // Catch: java.lang.Throwable -> L76
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L76
            return r2
        L76:
            r8 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L76
            throw r8
        L79:
            java.lang.Object r2 = r8.b
            monitor-enter(r2)
            boolean r0 = r8.v0     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L86
            r4.v()     // Catch: java.lang.Throwable -> L84
            goto L95
        L84:
            r8 = move-exception
            goto La4
        L86:
            boolean r0 = r4.f(r7)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L90
            r4.v()     // Catch: java.lang.Throwable -> L84
            goto L95
        L90:
            java.util.ArrayDeque r0 = r8.o     // Catch: java.lang.Throwable -> L84
            r0.addLast(r4)     // Catch: java.lang.Throwable -> L84
        L95:
            r1.v()     // Catch: java.lang.Throwable -> L84
            int r0 = r8.Z     // Catch: java.lang.Throwable -> L84
            int r4 = r0 + 1
            r8.Z = r4     // Catch: java.lang.Throwable -> L84
            o54[] r8 = r8.X     // Catch: java.lang.Throwable -> L84
            r8[r0] = r1     // Catch: java.lang.Throwable -> L84
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L84
            return r3
        La4:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L84
            throw r8
        La6:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqd.e():boolean");
    }

    @Override // defpackage.l54
    public final Object f() {
        o54 o54Var;
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.u0;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                np8.f(this.t0 == null);
                int i = this.Z;
                if (i == 0) {
                    o54Var = null;
                } else {
                    o54[] o54VarArr = this.X;
                    int i2 = i - 1;
                    this.Z = i2;
                    o54Var = o54VarArr[i2];
                }
                this.t0 = o54Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o54Var;
    }

    @Override // defpackage.l54
    public final void flush() {
        synchronized (this.b) {
            try {
                this.v0 = true;
                o54 o54Var = this.t0;
                if (o54Var != null) {
                    o54Var.v();
                    int i = this.Z;
                    this.Z = i + 1;
                    this.X[i] = o54Var;
                    this.t0 = null;
                }
                while (!this.c.isEmpty()) {
                    o54 o54Var2 = (o54) this.c.removeFirst();
                    o54Var2.v();
                    int i2 = this.Z;
                    this.Z = i2 + 1;
                    this.X[i2] = o54Var2;
                }
                while (!this.o.isEmpty()) {
                    ((jbe) this.o.removeFirst()).v();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l54
    public final void l(hbe hbeVar) {
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.u0;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                np8.d(hbeVar == this.t0);
                this.c.addLast(hbeVar);
                if (!this.c.isEmpty() && this.s0 > 0) {
                    this.b.notify();
                }
                this.t0 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l54
    public final void release() throws InterruptedException {
        synchronized (this.b) {
            this.w0 = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
