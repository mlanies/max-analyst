package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public interface hc9 {
    @pm4
    default long now() {
        return TimeUnit.NANOSECONDS.toMillis(nowNanos());
    }

    @pm4
    long nowNanos();
}
