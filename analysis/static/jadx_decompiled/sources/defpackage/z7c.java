package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class z7c implements Runnable {
    public volatile AtomicInteger a = new AtomicInteger(0);
    public final gq1 b;
    public final /* synthetic */ b8c c;

    public z7c(b8c b8cVar, gq1 gq1Var) {
        this.c = b8cVar;
        this.b = gq1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a8g a8gVar;
        String str = "OkHttp " + this.c.B0.b.g();
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            this.c.c.i();
            boolean z = false;
            try {
                try {
                } catch (Throwable th) {
                    this.c.A0.a.j(this);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.b.m(this.c, this.c.h());
                a8gVar = this.c.A0.a;
            } catch (IOException e2) {
                e = e2;
                z = true;
                if (z) {
                    q2b q2bVar = q2b.a;
                    q2b q2bVar2 = q2b.a;
                    String str2 = "Callback failure for " + b8c.a(this.c);
                    q2bVar2.getClass();
                    q2b.i(4, str2, e);
                } else {
                    this.b.q(this.c, e);
                }
                a8gVar = this.c.A0.a;
                a8gVar.j(this);
            } catch (Throwable th3) {
                th = th3;
                z = true;
                this.c.d();
                if (!z) {
                    IOException iOException = new IOException("canceled due to " + th);
                    j47.e(iOException, th);
                    this.b.q(this.c, iOException);
                }
                throw th;
            }
            a8gVar.j(this);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
