package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class rgg {
    public int a;
    public mo7 b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final Executor g;
    public volatile sx h;
    public volatile sx i;
    public final Semaphore j;
    public final Set k;

    public rgg(Context context, Set set) {
        ThreadPoolExecutor threadPoolExecutor = sx.s0;
        this.c = false;
        this.d = false;
        this.e = true;
        this.f = false;
        context.getApplicationContext();
        this.g = threadPoolExecutor;
        this.j = new Semaphore(0);
        this.k = set;
    }

    public final void a() {
        if (this.h != null) {
            if (!this.c) {
                this.f = true;
            }
            if (this.i != null) {
                this.h.getClass();
                this.h = null;
                return;
            }
            this.h.getClass();
            sx sxVar = this.h;
            sxVar.o.set(true);
            if (sxVar.b.cancel(false)) {
                this.i = this.h;
            }
            this.h = null;
        }
    }

    public final void b() {
        if (this.i != null || this.h == null) {
            return;
        }
        this.h.getClass();
        sx sxVar = this.h;
        Executor executor = this.g;
        if (sxVar.c == 1) {
            sxVar.c = 2;
            sxVar.a.b = null;
            executor.execute(sxVar.b);
        } else {
            int iS = au1.s(sxVar.c);
            if (iS == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (iS == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        z04.g(sb, this);
        sb.append(" id=");
        return zr6.j(sb, this.a, "}");
    }
}
