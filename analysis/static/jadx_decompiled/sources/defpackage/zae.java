package defpackage;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zae implements xae {
    public static final zae a;
    public static final /* synthetic */ zae[] b;

    static {
        zae zaeVar = new zae("CANCELLED", 0);
        a = zaeVar;
        b = new zae[]{zaeVar};
    }

    public static void a(AtomicReference atomicReference) {
        xae xaeVar;
        xae xaeVar2 = (xae) atomicReference.get();
        zae zaeVar = a;
        if (xaeVar2 == zaeVar || (xaeVar = (xae) atomicReference.getAndSet(zaeVar)) == zaeVar || xaeVar == null) {
            return;
        }
        xaeVar.cancel();
    }

    public static void b(AtomicReference atomicReference, AtomicLong atomicLong, long j) {
        xae xaeVar = (xae) atomicReference.get();
        if (xaeVar != null) {
            xaeVar.j(j);
            return;
        }
        if (d(j)) {
            ngg.b(atomicLong, j);
            xae xaeVar2 = (xae) atomicReference.get();
            if (xaeVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    xaeVar2.j(andSet);
                }
            }
        }
    }

    public static boolean c(AtomicReference atomicReference, xae xaeVar) {
        Objects.requireNonNull(xaeVar, "s is null");
        while (!atomicReference.compareAndSet(null, xaeVar)) {
            if (atomicReference.get() != null) {
                xaeVar.cancel();
                if (atomicReference.get() == a) {
                    return false;
                }
                j47.Z(new ProtocolViolationException("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean d(long j) {
        if (j > 0) {
            return true;
        }
        j47.Z(new IllegalArgumentException(ey8.h(j, "n > 0 required but it was ")));
        return false;
    }

    public static boolean e(xae xaeVar, xae xaeVar2) {
        if (xaeVar2 == null) {
            j47.Z(new NullPointerException("next is null"));
            return false;
        }
        if (xaeVar == null) {
            return true;
        }
        xaeVar2.cancel();
        j47.Z(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static zae valueOf(String str) {
        return (zae) Enum.valueOf(zae.class, str);
    }

    public static zae[] values() {
        return (zae[]) b.clone();
    }

    @Override // defpackage.xae
    public final void cancel() {
    }

    @Override // defpackage.xae
    public final void j(long j) {
    }
}
