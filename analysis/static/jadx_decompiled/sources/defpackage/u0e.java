package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u0e implements Runnable {
    public static final Object s0 = new Object();
    public final Executor a;
    public final py9 b;
    public final AtomicReference o;
    public final AtomicBoolean c = new AtomicBoolean(true);
    public Object X = s0;
    public int Y = -1;
    public boolean Z = false;

    public u0e(AtomicReference atomicReference, Executor executor, py9 py9Var) {
        this.o = atomicReference;
        this.a = executor;
        this.b = py9Var;
    }

    public final void a(int i) {
        synchronized (this) {
            try {
                if (!this.c.get()) {
                    return;
                }
                if (i <= this.Y) {
                    return;
                }
                this.Y = i;
                if (this.Z) {
                    return;
                }
                this.Z = true;
                try {
                    this.a.execute(this);
                } finally {
                    synchronized (this) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            try {
                if (!this.c.get()) {
                    this.Z = false;
                    return;
                }
                Object obj = this.o.get();
                int i = this.Y;
                while (true) {
                    if (!Objects.equals(this.X, obj)) {
                        this.X = obj;
                        if (obj instanceof tb0) {
                            this.b.onError(((tb0) obj).a);
                        } else {
                            this.b.a(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i == this.Y || !this.c.get()) {
                                break;
                            }
                            obj = this.o.get();
                            i = this.Y;
                        } finally {
                        }
                    }
                }
                this.Z = false;
            } finally {
            }
        }
    }
}
