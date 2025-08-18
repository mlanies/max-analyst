package defpackage;

import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* loaded from: classes.dex */
public final class jd4 extends duc {
    public static final jd4 b = new jd4(joe.c, joe.d, joe.e);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.nx3
    public final nx3 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return i >= joe.c ? LimitedDispatcherKt.namedOrThis(this, str) : super.limitedParallelism(i, str);
    }

    @Override // defpackage.nx3
    public final String toString() {
        return "Dispatchers.Default";
    }
}
