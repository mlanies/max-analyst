package defpackage;

import kotlinx.coroutines.internal.LimitedDispatcherKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* loaded from: classes.dex */
public abstract class cx7 extends nx3 {
    public abstract cx7 getImmediate();

    @Override // defpackage.nx3
    public nx3 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return LimitedDispatcherKt.namedOrThis(this, str);
    }

    @Override // defpackage.nx3
    public String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl != null) {
            return stringInternalImpl;
        }
        return getClass().getSimpleName() + '@' + c54.u(this);
    }

    public final String toStringInternalImpl() {
        cx7 immediate;
        jd4 jd4Var = ql4.a;
        cx7 cx7Var = MainDispatcherLoader.dispatcher;
        if (this == cx7Var) {
            return "Dispatchers.Main";
        }
        try {
            immediate = cx7Var.getImmediate();
        } catch (UnsupportedOperationException unused) {
            immediate = null;
        }
        if (this == immediate) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
