package defpackage;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class dm4 implements zl4 {
    public static final dm4 a;
    public static final /* synthetic */ dm4[] b;

    static {
        dm4 dm4Var = new dm4("DISPOSED", 0);
        a = dm4Var;
        b = new dm4[]{dm4Var};
    }

    public static boolean a(AtomicReference atomicReference) {
        zl4 zl4Var;
        zl4 zl4Var2 = (zl4) atomicReference.get();
        dm4 dm4Var = a;
        if (zl4Var2 == dm4Var || (zl4Var = (zl4) atomicReference.getAndSet(dm4Var)) == dm4Var) {
            return false;
        }
        if (zl4Var == null) {
            return true;
        }
        zl4Var.g();
        return true;
    }

    public static boolean b(zl4 zl4Var) {
        return zl4Var == a;
    }

    public static boolean c(AtomicReference atomicReference, zl4 zl4Var) {
        while (true) {
            zl4 zl4Var2 = (zl4) atomicReference.get();
            if (zl4Var2 == a) {
                if (zl4Var == null) {
                    return false;
                }
                zl4Var.g();
                return false;
            }
            while (!atomicReference.compareAndSet(zl4Var2, zl4Var)) {
                if (atomicReference.get() != zl4Var2) {
                    break;
                }
            }
            return true;
        }
    }

    public static void d(AtomicReference atomicReference, zl4 zl4Var) {
        while (true) {
            zl4 zl4Var2 = (zl4) atomicReference.get();
            if (zl4Var2 == a) {
                zl4Var.g();
                return;
            }
            while (!atomicReference.compareAndSet(zl4Var2, zl4Var)) {
                if (atomicReference.get() != zl4Var2) {
                    break;
                }
            }
            if (zl4Var2 != null) {
                zl4Var2.g();
                return;
            }
            return;
        }
    }

    public static boolean e(AtomicReference atomicReference, zl4 zl4Var) {
        Objects.requireNonNull(zl4Var, "d is null");
        while (!atomicReference.compareAndSet(null, zl4Var)) {
            if (atomicReference.get() != null) {
                zl4Var.g();
                if (atomicReference.get() == a) {
                    return false;
                }
                j47.Z(new ProtocolViolationException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean f(zl4 zl4Var, zl4 zl4Var2) {
        if (zl4Var2 == null) {
            j47.Z(new NullPointerException("next is null"));
            return false;
        }
        if (zl4Var == null) {
            return true;
        }
        zl4Var2.g();
        j47.Z(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    public static dm4 valueOf(String str) {
        return (dm4) Enum.valueOf(dm4.class, str);
    }

    public static dm4[] values() {
        return (dm4[]) b.clone();
    }

    @Override // defpackage.zl4
    public final void g() {
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return true;
    }
}
