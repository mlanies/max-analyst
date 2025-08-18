package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class y26 implements wn0 {
    public int a;
    public o43 b;

    public y26(int i, o43 o43Var) {
        this.b = o43Var;
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    @Override // defpackage.wn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean a(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.a     // Catch: java.lang.Throwable -> Lf
            if (r2 != r0) goto L11
            o43 r2 = r1.b     // Catch: java.lang.Throwable -> Lf
            boolean r2 = defpackage.o43.n0(r2)     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            r2 = 1
            goto L12
        Lf:
            r2 = move-exception
            goto L14
        L11:
            r2 = 0
        L12:
            monitor-exit(r1)
            return r2
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y26.a(int):boolean");
    }

    @Override // defpackage.wn0
    public synchronized o43 b() {
        return o43.o(this.b);
    }

    @Override // defpackage.wn0
    public synchronized void c(int i, o43 o43Var) {
        try {
            if (this.b != null) {
                Object objE0 = o43Var.e0();
                o43 o43Var2 = this.b;
                if (objE0.equals(o43Var2 != null ? (Bitmap) o43Var2.e0() : null)) {
                    return;
                }
            }
            o43.S(this.b);
            this.b = o43.o(o43Var);
            this.a = i;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.wn0
    public synchronized void clear() {
        g();
    }

    @Override // defpackage.wn0
    public void d(int i, o43 o43Var) {
    }

    @Override // defpackage.wn0
    public synchronized o43 e() {
        try {
        } finally {
            g();
        }
        return o43.o(this.b);
    }

    @Override // defpackage.wn0
    public synchronized o43 f(int i) {
        return this.a == i ? o43.o(this.b) : null;
    }

    public synchronized void g() {
        o43.S(this.b);
        this.b = null;
        this.a = -1;
    }
}
