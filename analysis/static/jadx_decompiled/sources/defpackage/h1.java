package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class h1 extends tpa {
    public static final Unsafe c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new g1());
        }
        try {
            e = unsafe.objectFieldOffset(k1.class.getDeclaredField("c"));
            d = unsafe.objectFieldOffset(k1.class.getDeclaredField("b"));
            f = unsafe.objectFieldOffset(k1.class.getDeclaredField("a"));
            g = unsafe.objectFieldOffset(i1.class.getDeclaredField("a"));
            h = unsafe.objectFieldOffset(i1.class.getDeclaredField("b"));
            c = unsafe;
        } catch (NoSuchFieldException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // defpackage.tpa
    public final void C(i1 i1Var, i1 i1Var2) {
        c.putObject(i1Var, h, i1Var2);
    }

    @Override // defpackage.tpa
    public final void D(i1 i1Var, Thread thread) {
        c.putObject(i1Var, g, thread);
    }

    @Override // defpackage.tpa
    public final boolean i(k1 k1Var, v0 v0Var, v0 v0Var2) {
        return f1.a(c, k1Var, d, v0Var, v0Var2);
    }

    @Override // defpackage.tpa
    public final boolean j(k1 k1Var, Object obj, Object obj2) {
        return f1.a(c, k1Var, f, obj, obj2);
    }

    @Override // defpackage.tpa
    public final boolean k(k1 k1Var, i1 i1Var, i1 i1Var2) {
        return f1.a(c, k1Var, e, i1Var, i1Var2);
    }

    @Override // defpackage.tpa
    public final v0 p(k1 k1Var) {
        v0 v0Var;
        v0 v0Var2 = v0.d;
        do {
            v0Var = k1Var.b;
            if (v0Var2 == v0Var) {
                return v0Var;
            }
        } while (!i(k1Var, v0Var, v0Var2));
        return v0Var;
    }

    @Override // defpackage.tpa
    public final i1 q(k1 k1Var) {
        i1 i1Var;
        i1 i1Var2 = i1.c;
        do {
            i1Var = k1Var.c;
            if (i1Var2 == i1Var) {
                return i1Var;
            }
        } while (!k(k1Var, i1Var, i1Var2));
        return i1Var;
    }
}
