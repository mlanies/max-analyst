package kotlinx.coroutines.internal;

import defpackage.nx3;
import defpackage.zr6;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "Le5f;", "checkParallelism", "(I)V", "Lnx3;", "", "name", "namedOrThis", "(Lnx3;Ljava/lang/String;)Lnx3;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class LimitedDispatcherKt {
    public static final void checkParallelism(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(zr6.h(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final nx3 namedOrThis(nx3 nx3Var, String str) {
        return str != null ? new NamedDispatcher(nx3Var, str) : nx3Var;
    }
}
