package defpackage;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ukg extends Task {
    public final Object a = new Object();
    public final td b = new td();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // com.google.android.gms.tasks.Task
    public final ukg a(Executor executor, k3a k3aVar) {
        this.b.y(new gig(executor, k3aVar));
        q();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final ukg b(Executor executor, l3a l3aVar) {
        this.b.y(new gig(executor, l3aVar));
        q();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final ukg c(Executor executor, o3a o3aVar) {
        this.b.y(new gig(executor, o3aVar));
        q();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final ukg d(Executor executor, x3a x3aVar) {
        this.b.y(new gig(executor, x3aVar));
        q();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception e() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object f() {
        Object obj;
        synchronized (this.a) {
            try {
                fp3.p("Task is not yet complete", this.c);
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final ukg i(l3a l3aVar) {
        this.b.y(new gig(xne.a, l3aVar));
        q();
        return this;
    }

    public final ukg j(Executor executor, fu3 fu3Var) {
        ukg ukgVar = new ukg();
        this.b.y(new ogg(executor, fu3Var, ukgVar, 0));
        q();
        return ukgVar;
    }

    public final ukg k(Executor executor, fu3 fu3Var) {
        ukg ukgVar = new ukg();
        this.b.y(new ogg(executor, fu3Var, ukgVar, 1));
        q();
        return ukgVar;
    }

    public final ukg l(Executor executor, sbe sbeVar) {
        ukg ukgVar = new ukg();
        this.b.y(new gig(executor, sbeVar, ukgVar));
        q();
        return ukgVar;
    }

    public final void m(Exception exc) {
        fp3.o(exc, "Exception must not be null");
        synchronized (this.a) {
            p();
            this.c = true;
            this.f = exc;
        }
        this.b.z(this);
    }

    public final void n(Object obj) {
        synchronized (this.a) {
            p();
            this.c = true;
            this.e = obj;
        }
        this.b.z(this);
    }

    public final void o() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.z(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p() {
        if (this.c) {
            int i = DuplicateTaskCompletionException.a;
            if (!g()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excE = e();
        }
    }

    public final void q() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.z(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
