package defpackage;

import android.graphics.Bitmap;
import com.facebook.common.references.SharedReference$NullReferenceException;
import java.io.Closeable;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class o43 implements Cloneable, Closeable {
    public static final hx9 X = new hx9();
    public static final buc Y = new buc();
    public boolean a = false;
    public final tld b;
    public final n43 c;
    public final Throwable o;

    public o43(tld tldVar, n43 n43Var, Throwable th) {
        int i;
        boolean z;
        tldVar.getClass();
        this.b = tldVar;
        synchronized (tldVar) {
            synchronized (tldVar) {
                i = tldVar.b;
                z = i > 0;
            }
            this.c = n43Var;
            this.o = th;
        }
        if (!z) {
            throw new SharedReference$NullReferenceException();
        }
        tldVar.b = i + 1;
        this.c = n43Var;
        this.o = th;
    }

    public static void S(o43 o43Var) {
        if (o43Var != null) {
            o43Var.close();
        }
    }

    public static void U(Iterable iterable) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                S((o43) it.next());
            }
        }
    }

    public static boolean n0(o43 o43Var) {
        return o43Var != null && o43Var.m0();
    }

    public static o43 o(o43 o43Var) {
        if (o43Var != null) {
            return o43Var.n();
        }
        return null;
    }

    public static v84 o0(Closeable closeable) {
        return p0(closeable, X, Y);
    }

    public static v84 p0(Object obj, pic picVar, n43 n43Var) {
        if (obj == null) {
            return null;
        }
        n43Var.f();
        if (!(obj instanceof Bitmap)) {
            boolean z = obj instanceof l43;
        }
        return new v84(obj, picVar, n43Var, null, true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.b.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Object e0() {
        Object objB;
        od2.p(!this.a);
        objB = this.b.b();
        objB.getClass();
        return objB;
    }

    /* renamed from: m */
    public abstract o43 clone();

    public synchronized boolean m0() {
        return !this.a;
    }

    public synchronized o43 n() {
        if (!m0()) {
            return null;
        }
        return clone();
    }

    public o43(Object obj, pic picVar, n43 n43Var, Throwable th, boolean z) {
        this.b = new tld(obj, picVar, z);
        this.c = n43Var;
        this.o = th;
    }
}
