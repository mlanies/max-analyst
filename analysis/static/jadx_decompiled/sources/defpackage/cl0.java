package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class cl0 {
    public final va8[] a;

    public cl0(va8[] va8VarArr) {
        this.a = va8VarArr;
    }

    public final Object a(sk0 sk0Var) {
        for (va8 va8Var : this.a) {
            if (va8Var.c == sk0Var) {
                Object obj = va8Var.b;
                if (obj instanceof jl) {
                    return null;
                }
                return obj;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
