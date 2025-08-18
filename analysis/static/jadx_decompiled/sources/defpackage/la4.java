package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class la4 implements ide {
    public static final long a = TimeUnit.MINUTES.toMillis(5);

    @Override // defpackage.ide
    public final Object get() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i = iMin < 16777216 ? 1048576 : iMin < 33554432 ? 2097152 : 4194304;
        return new mq8(i, Integer.MAX_VALUE, i, a, i / 8);
    }
}
