package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class w0a extends AtomicReference implements Runnable, qj3 {
    public final y0a a;
    public long b;
    public boolean c;
    public boolean o;

    public w0a(y0a y0aVar) {
        this.a = y0aVar;
    }

    @Override // defpackage.qj3
    public final void accept(Object obj) {
        dm4.c(this, (zl4) obj);
        synchronized (this.a) {
            try {
                if (this.o) {
                    this.a.a.y();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.y(this);
    }
}
