package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class q45 {
    public static final p45 a = new p45("No further exceptions");

    public static boolean a(AtomicReference atomicReference, Throwable th) {
        while (true) {
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 == a) {
                return false;
            }
            Throwable compositeException = th2 == null ? th : new CompositeException(th2, th);
            while (!atomicReference.compareAndSet(th2, compositeException)) {
                if (atomicReference.get() != th2) {
                    break;
                }
            }
            return true;
        }
    }

    public static NullPointerException b(String str) {
        return new NullPointerException(str.concat(" Null values are generally not allowed in 3.x operators and sources."));
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw b(str);
        }
    }

    public static Throwable d(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        p45 p45Var = a;
        return th != p45Var ? (Throwable) atomicReference.getAndSet(p45Var) : th;
    }

    public static String e(long j, TimeUnit timeUnit) {
        StringBuilder sbK = au1.k(j, "The source did not signal an event for ", " ");
        sbK.append(timeUnit.toString().toLowerCase());
        sbK.append(" and has been terminated.");
        return sbK.toString();
    }

    public static RuntimeException f(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
