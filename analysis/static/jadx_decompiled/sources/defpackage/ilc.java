package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public abstract class ilc {
    public volatile k36 a;
    public Executor b;
    public qm c;
    public xde d;
    public boolean f;
    public List g;
    public final v47 e = e();
    public final LinkedHashMap h = new LinkedHashMap();
    public final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
    public final ThreadLocal j = new ThreadLocal();
    public final Map k = Collections.synchronizedMap(new LinkedHashMap());
    public final LinkedHashMap l = new LinkedHashMap();

    public static Object s(Class cls, xde xdeVar) {
        if (cls.isInstance(xdeVar)) {
            return xdeVar;
        }
        if (xdeVar instanceof ug4) {
            return s(cls, ((ug4) xdeVar).getDelegate());
        }
        return null;
    }

    public void a() {
        if (this.f) {
            return;
        }
        if (!(!(Looper.getMainLooper().getThread() == Thread.currentThread()))) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    public final void b() {
        if (!k() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public final void c() {
        a();
        a();
        k36 writableDatabase = h().getWritableDatabase();
        this.e.f(writableDatabase);
        if (writableDatabase.n0()) {
            writableDatabase.n();
        } else {
            writableDatabase.m();
        }
    }

    public final q36 d(String str) {
        a();
        b();
        return h().getWritableDatabase().o(str);
    }

    public abstract v47 e();

    public abstract xde f(d34 d34Var);

    public List g() {
        return nz4.a;
    }

    public final xde h() {
        xde xdeVar = this.d;
        if (xdeVar == null) {
            return null;
        }
        return xdeVar;
    }

    public Set i() {
        return wz4.a;
    }

    public Map j() {
        return oz4.a;
    }

    public final boolean k() {
        return h().getWritableDatabase().m0();
    }

    public final void l() {
        h().getWritableDatabase().S();
        if (k()) {
            return;
        }
        v47 v47Var = this.e;
        if (v47Var.f.compareAndSet(false, true)) {
            Executor executor = v47Var.a.b;
            if (executor == null) {
                executor = null;
            }
            executor.execute(v47Var.n);
        }
    }

    public final void m(k36 k36Var) {
        v47 v47Var = this.e;
        synchronized (v47Var.m) {
            if (v47Var.g) {
                return;
            }
            k36Var.U("PRAGMA temp_store = MEMORY;");
            k36Var.U("PRAGMA recursive_triggers='ON';");
            k36Var.U("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            v47Var.f(k36Var);
            v47Var.h = k36Var.o("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            v47Var.g = true;
        }
    }

    public final boolean n() {
        k36 k36Var = this.a;
        return k36Var != null && k36Var.isOpen();
    }

    public final Cursor o(zde zdeVar, CancellationSignal cancellationSignal) {
        a();
        b();
        return cancellationSignal != null ? h().getWritableDatabase().p0(zdeVar, cancellationSignal) : h().getWritableDatabase().o0(zdeVar);
    }

    public final Object p(Callable callable) {
        c();
        try {
            Object objCall = callable.call();
            r();
            return objCall;
        } finally {
            l();
        }
    }

    public final void q(Runnable runnable) {
        c();
        try {
            runnable.run();
            r();
        } finally {
            l();
        }
    }

    public final void r() {
        h().getWritableDatabase().r0();
    }
}
