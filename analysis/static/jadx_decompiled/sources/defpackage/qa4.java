package defpackage;

import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.internal.MainDispatchersKt;
import kotlinx.coroutines.internal.SystemPropsKt;

/* loaded from: classes.dex */
public abstract class qa4 {
    public static final hg4 a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        hg4 hg4Var;
        if (SystemPropsKt.systemProp("kotlinx.coroutines.main.delay", false)) {
            jd4 jd4Var = ql4.a;
            cx7 cx7Var = MainDispatcherLoader.dispatcher;
            hg4Var = (MainDispatchersKt.isMissing(cx7Var) || !(cx7Var instanceof hg4)) ? pa4.s0 : (hg4) cx7Var;
        } else {
            hg4Var = pa4.s0;
        }
        a = hg4Var;
    }
}
